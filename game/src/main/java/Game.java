import java.util.Random;

public class Game {
    private int zoneStartX;
    private int zoneStartY;
    private int zoneEndX;
    private int zoneEndY;
    private Player winner;
    private Player[] players;
    private int steps = 0;

    public Game() {
    }

    public Game(int fieldWidth, int fieldHeigth, int zoneStartX, int zoneStartY, int zoneEndX, int zoneEndY) {
        this.zoneStartX = zoneStartX;
        this.zoneStartY = zoneStartY;
        this.zoneEndX = zoneEndX;
        this.zoneEndY = zoneEndY;
        Player.setFieldSize(fieldWidth, fieldHeigth);
        Random random = new Random();
        Ant ant = new Ant(0, 0);
        Turtle turtle = new Turtle(1, 0);
        Grasshopper grasshopper = new Grasshopper(2, 0);
        Bee bee = new Bee(3, 0);
        players = new Player[] {ant, turtle, grasshopper, bee};
    }

    public void start() {
        steps = 1;
        while (true) {
            for (Player player: players) {
                player.move();
                if (zoneStartX <= player.getPositionX() &&
                        player.getPositionX() <= zoneEndX &&
                        zoneStartY <= player.getPositionY() &&
                        player.getPositionY() <= zoneEndY) {
                    winner = player;
                    return;
                }
            }
            ++steps;
        }
    }

    public Player getWinner() {
        return winner;
    }

    public int getSteps() {
        return steps;
    }
}