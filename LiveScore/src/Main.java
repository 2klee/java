public class Main {
  public static void main(String[] args) {
    AsyncHttpClient client = new DefaultAsyncHttpClient();
    client.prepare("GET", "https://livescore6.p.rapidapi.com/matches/v2/list-live?Category=soccer&Timezone=-7")
            .setHeader("X-RapidAPI-Key", "SIGN-UP-FOR-KEY")
            .setHeader("X-RapidAPI-Host", "livescore6.p.rapidapi.com")
            .execute()
            .toCompletableFuture()
            .thenAccept(System.out::println)
            .join();

    client.close();
    ;
  }
}