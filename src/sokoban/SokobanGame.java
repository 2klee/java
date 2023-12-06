package sokoban;

import java.util.Scanner;

public class SokobanGame {
  private static final char EMPTY = ' ';
  private static final char WALL = '#';
  private static final char BOX = '$';
  private static final char TARGET = '.';
  private static final char PLAYER = '@';

  private static final char[][] level = {
          {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
          {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
          {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
          {'#', ' ', ' ', '.', ' ', ' ', ' ', ' ', ' ', '#'},
          {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
          {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
          {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
          {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
          {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
          {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
  };

  private static int playerRow = 3;
  private static int playerCol = 3;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      printLevel();

      System.out.print("Enter move (WASD): ");
      String move = scanner.next().toUpperCase();

      if (move.equals("W")) {
        movePlayer(-1, 0);
      } else if (move.equals("A")) {
        movePlayer(0, -1);
      } else if (move.equals("S")) {
        movePlayer(1, 0);
      } else if (move.equals("D")) {
        movePlayer(0, 1);
      }

      if (isGameComplete()) {
        System.out.println("Congratulations! You completed the level.");
        break;
      }
    }
  }

  private static void printLevel() {
    for (char[] row : level) {
      for (char cell : row) {
        System.out.print(cell + " ");
      }
      System.out.println();
    }
  }

  private static void movePlayer(int rowChange, int colChange) {
    int newRow = playerRow + rowChange;
    int newCol = playerCol + colChange;

    if (level[newRow][newCol] == EMPTY || level[newRow][newCol] == TARGET) {
      level[playerRow][playerCol] = EMPTY;
      level[newRow][newCol] = PLAYER;
      playerRow = newRow;
      playerCol = newCol;
    } else if (level[newRow][newCol] == BOX) {
      int boxNewRow = newRow + rowChange;
      int boxNewCol = newCol + colChange;

      if (level[boxNewRow][boxNewCol] == EMPTY || level[boxNewRow][boxNewCol] == TARGET) {
        level[playerRow][playerCol] = EMPTY;
        level[newRow][newCol] = PLAYER;
        level[boxNewRow][boxNewCol] = BOX;
        playerRow = newRow;
        playerCol = newCol;
      }
    }
  }

  private static boolean isGameComplete() {
    for (char[] row : level) {
      for (char cell : row) {
        if (cell == TARGET) {
          return false;
        }
      }
    }
    return true;
  }
}
