import java.util.Random;

public class Bee extends Player {

    public Bee() {
    }

    public Bee(int positionX, int positionY) {
        super("Bee", positionX, positionY);
    }

    public void move() {
        Random random = new Random();
        int direction = random.nextInt(4);

        switch (direction) {
            case 0:
                positionY -= (positionY > 0) ? 1 : 0;
                break;
            case 1:
                if (positionY < fieldHeigth - 2) {
                    positionY += 2;
                } else {
                    if (positionY == fieldHeigth - 2) {
                        positionY += 1;
                    }
                }
                break;
            case 2:
                if (positionX < fieldWidth - 2) {
                    positionX += 2;
                } else {
                    if (positionX == fieldWidth - 2) {
                        positionX += 1;
                    }
                }
                break;
            case 3:
                if (positionX > 1) {
                    positionX -= 2;
                } else {
                    if (positionX == 1) {
                        positionX -= 1;
                    }
                }
                break;
        }
    }
}