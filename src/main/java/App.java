public class App {

    public static void main(String[] args) {

        Player player1 = new Player();
        Game game = new Game();

        player1.setNameFromInput();
        player1.setCounterFromInput();
        Game.playGame(player1);

    }
}
