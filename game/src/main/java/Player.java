public class Player {
    protected String name;   //доступно в потомках
    protected int positionX;
    protected int positionY;

    protected static int fieldWidth;
    protected static int fieldHeigth;

    public static void setFieldSize(int width, int heigth) {
        fieldWidth = width;
        fieldHeigth = heigth;
    }

    public void move() {
    }

    public Player() {
    }

    public Player(String name, int positionX, int positionY) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public String toString() {
        return "Name: " + name + ", " + "position: (" + positionX + ", " + positionY + ")";
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}