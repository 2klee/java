//import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
//import javax.swing.table.TableRowSorter;
//import java.awt.*;
//import java.awt.event.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//public class ShoppingGui extends JFrame {
//  private List<String> shoppingMallTypes = Arrays.asList("브랜드몰", "종합쇼핑몰", "중고거래", "기타");
//  private List<String> productCategories = Arrays.asList("의류", "신발", "시계", "가방", "지갑", "기타");
//  private List<String> deliveryInfos = Arrays.asList("직거래", "택배", "반값택배", "퀵", "기타");
//  private List<String> shoppingInfoList = new ArrayList<>(); // 저장된 쇼핑 정보 목록
//  private JTable displayTable;
//
//  public ShoppingGui() {
//    setTitle("Shopping List");
//    createMenu();
//    createDisplayTable();
//    setSize(600, 600);
//    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    setLocationRelativeTo(null);
//    setVisible(true);
//  }
//
//  private void createDisplayTable() {
//    DefaultTableModel model = new DefaultTableModel();
//    model.addColumn("쇼핑몰 유형");
//    model.addColumn("제품 카테고리");
//    model.addColumn("배송 정보");
//    model.addColumn("제품명");
//
//    displayTable = new JTable(model);
//    JScrollPane scrollPane = new JScrollPane(displayTable);
//    add(scrollPane, BorderLayout.CENTER);
//
//    // Add right-click functionality to show selected item details and delete item
//    displayTable.addMouseListener(new MouseAdapter() {
//      @Override
//      public void mousePressed(MouseEvent e) {
//        if (SwingUtilities.isRightMouseButton(e)) {
//          showPopupMenu(e);
//        }
//      }
//    });
//  }
//  private void showPopupMenu(MouseEvent e) {
//    JPopupMenu popupMenu = new JPopupMenu();
//    JMenuItem deleteItem = new JMenuItem("Delete");
//    deleteItem.addActionListener(new ActionListener() {
//      @Override
//      public void actionPerformed(ActionEvent actionEvent) {
//        removeSelectedShoppingItem();
//      }
//    });
//    popupMenu.add(deleteItem);
//
//    // Show the popup menu at the location of the mouse event
//    popupMenu.show(e.getComponent(), e.getX(), e.getY());
//  }
//
//  private void removeSelectedShoppingItem() {
//    int selectedRow = displayTable.getSelectedRow();
//    if (selectedRow != -1) {
//      ((DefaultTableModel) displayTable.getModel()).removeRow(selectedRow);
//    }
//  }
//
//  private void createMenu() {
//    JMenuBar menuBar = new JMenuBar();
//
//    JMenu listMenu = new JMenu("List");
//
//    JMenuItem addListItem = new JMenuItem("AddList");
//    addListItem.addActionListener(new MouseActionListener("AddList"));
//    listMenu.add(addListItem);
//
//    listMenu.addSeparator();
//
//    JMenuItem exitItem = new JMenuItem("Exit");
//    exitItem.addActionListener(new MouseActionListener("Exit"));
//    listMenu.add(exitItem);
//
//    menuBar.add(listMenu);
//
//    JMenu sortMenu = new JMenu("Sort");
//
//    JMenuItem sortByMallType = new JMenuItem("Sort by Mall Type");
//    sortByMallType.addActionListener(new MouseActionListener("SortByMallType"));
//    sortMenu.add(sortByMallType);
//
//    JMenuItem sortByCategory = new JMenuItem("Sort by Category");
//    sortByCategory.addActionListener(new MouseActionListener("SortByCategory"));
//    sortMenu.add(sortByCategory);
//
//    JMenuItem sortByDeliveryInfo = new JMenuItem("Sort by Delivery Info");
//    sortByDeliveryInfo.addActionListener(new MouseActionListener("SortByDeliveryInfo"));
//    sortMenu.add(sortByDeliveryInfo);
//
//    JMenuItem sortByName = new JMenuItem("Sort by Name");
//    sortByName.addActionListener(new MouseActionListener("SortByName"));
//    sortMenu.add(sortByName);
//
//    menuBar.add(sortMenu);
//
//    setJMenuBar(menuBar);
//  }
//
//  private class MouseActionListener implements ActionListener {
//    private String menuItemValue;
//
//    public MouseActionListener(String menuItemValue) {
//      this.menuItemValue = menuItemValue;
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//      if ("AddList".equals(menuItemValue)) {
//        showAddListDialog();
//      } else if ("Exit".equals(menuItemValue)) {
//        System.exit(0);
//      } else if ("SortByMallType".equals(menuItemValue)) {
//        sortByMallType();
//      } else if ("SortByCategory".equals(menuItemValue)) {
//        sortByCategory();
//      } else if ("SortByDeliveryInfo".equals(menuItemValue)) {
//        sortByDeliveryInfo();
//      } else if ("SortByName".equals(menuItemValue)) {
//        sortByName();
//      }
//    }
//
//    private void showAddListDialog() {
//      JPanel panel = new JPanel(new GridLayout(0, 2));
//
//      JComboBox<String> mallTypeComboBox = new JComboBox<>(shoppingMallTypes.toArray(new String[0]));
//      JComboBox<String> categoryComboBox = new JComboBox<>(productCategories.toArray(new String[0]));
//      JComboBox<String> deliveryComboBox = new JComboBox<>(deliveryInfos.toArray(new String[0]));
//      JTextField productNameField = new JTextField();
//
//      panel.add(new JLabel("쇼핑몰 유형을 선택하세요:"));
//      panel.add(mallTypeComboBox);
//      panel.add(new JLabel("제품 카테고리를 선택하세요:"));
//      panel.add(categoryComboBox);
//      panel.add(new JLabel("배송 정보를 선택하세요:"));
//      panel.add(deliveryComboBox);
//      panel.add(new JLabel("제품명을 입력하세요:"));
//      panel.add(productNameField);
//
//      int result = JOptionPane.showConfirmDialog(
//              ShoppingGui.this,
//              panel,
//              "쇼핑 정보 입력",
//              JOptionPane.OK_CANCEL_OPTION,
//              JOptionPane.PLAIN_MESSAGE);
//
//      if (result == JOptionPane.OK_OPTION) {
//        // Get the selected values
//        String selectedMallType = (String) mallTypeComboBox.getSelectedItem();
//        String selectedCategory = (String) categoryComboBox.getSelectedItem();
//        String selectedDeliveryInfo = (String) deliveryComboBox.getSelectedItem();
//        String productName = productNameField.getText();
//
//        // Save and display the information
//        if (selectedMallType != null && selectedCategory != null && selectedDeliveryInfo != null &&
//                productName != null && !productName.isEmpty()) {
//          String[] rowData = {selectedMallType, selectedCategory, selectedDeliveryInfo, productName};
//          ((DefaultTableModel) displayTable.getModel()).addRow(rowData);
//        }
//      }
//    }
//
//    private void sortByMallType() {
//      sortTableByColumn(0);
//    }
//
//    private void sortByCategory() {
//      sortTableByColumn(1);
//    }
//
//    private void sortByDeliveryInfo() {
//      sortTableByColumn(2);
//    }
//
//    private void sortByName() {
//      sortTableByColumn(3);
//    }
//
//    private void sortTableByColumn(int columnIndex) {
//      TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>((DefaultTableModel) displayTable.getModel());
//      displayTable.setRowSorter(sorter);
//      List<RowSorter.SortKey> sortKeys = new ArrayList<>();
//      sortKeys.add(new RowSorter.SortKey(columnIndex, SortOrder.ASCENDING));
//      sorter.setSortKeys(sortKeys);
//      sorter.sort();
//    }
//  }
//
//
//  public static void main(String[] args) {
//    new ShoppingGui();
//  }
//}
