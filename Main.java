public class Main {
  public static void main(String[] args) {
    // コンフリクトマーカーを削除し、メッセージを出力
    System.out.println("SEMONSTER GAME");
    System.out.println("show draw monsters!");
    Player player = new Player();
    player.drawMonsters();
    player.showDeck();
  }
}
