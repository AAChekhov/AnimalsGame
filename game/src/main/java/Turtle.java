import java.util.Random;

public class Turtle extends Player {

    public Turtle() {
    }

    public Turtle(int positionX, int positionY) {
        super("Turtle", positionX, positionY);
    }

    public void move() {
        Random random = new Random();
        int direction = random.nextInt(3);

        switch (direction) {
            case 0:
                positionY += (positionY < fieldHeigth - 1) ? 1 : 0;
                break;
            case 1:
                positionX += (positionX < fieldWidth - 1) ? 1 : 0;
                break;
            case 2:
                positionX -= (positionX > 0) ? 1 : 0;
                break;
        }
    }
}