public class Robot {
    public enum Direction {UP, DOWN, LEFT, RIGHT}

    private Direction currentDirection = UP;
    private int currentX = 0;
    private int currentY = 0;

    public Direction getDirection() {
        return currentDirection;
    } // текущее направление взгляда

    public int getX() {
        return currentX;
    } // текущая координата X

    public int getY() {
        return currentY;
    } // текущая координата Y

    public void turnLeft() {
        switch (currentDirection) {
            case UP:
                currentDirection = LEFT;
                break;
            case LEFT:
                currentDirection = DOWN;
                break;
            case DOWN:
                currentDirection = RIGHT;
                break;
            case RIGHT:
                currentDirection = UP;
                break;
        }
    } // повернуться на 90 градусов против часовой стрелки

    public void turnRight() {
        switch (currentDirection) {
            case UP:
                currentDirection = RIGHT;
                break;
            case LEFT:
                currentDirection = UP;
                break;
            case DOWN:
                currentDirection = LEFT;
                break;
            case RIGHT:
                currentDirection = DOWN;
                break;
        }
    } // повернуться на 90 градусов по часовой стрелке

    public void stepForward() {
        switch (currentDirection) {
            case UP:
                currentY += 1;
                break;
            case DOWN:
                currentY -= 1;
                break;
            case LEFT:
                currentX -= 1;
                break;
            case RIGHT:
                currentX += 1;
                break;
        }
    }   // шаг в направлении взгляда
    // за один шаг робот изменяет одну свою координату на единицу
}