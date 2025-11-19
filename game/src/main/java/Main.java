public class Main {
    public static void main(String[] args) {
        Game game = new Game(1000, 1000, 400,
                400, 600, 600);
        game.start();
        Player winner = game.getWinner();
        int steps = game.getSteps();
        System.out.println(winner + ", steps: " + steps + ".");
    }
}