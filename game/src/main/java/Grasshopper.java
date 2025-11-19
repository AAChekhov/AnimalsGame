import java.util.Random;

public class Grasshopper extends Player {

    public Grasshopper() {
    }

    public Grasshopper(int positionX, int positionY) {
        super("Grasshopper", positionX, positionY);
    }

    public void move() {
        Random random = new Random();
        int direction = random.nextInt(3);

        switch (direction) {
            case 0:
                if (positionY < fieldHeigth - 2) {
                    positionY += 2;
                } else {
                    if (positionY == fieldHeigth - 2) {
                        positionY += 1;
                    }
                }
                break;
            case 1:
                positionX += (positionX < fieldWidth - 1) ? 1 : 0;
                break;
            case 3:
                positionX -= (positionX > 0) ? 1 : 0;
                break;
        }
    }
}