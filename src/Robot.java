public class Robot {
    private Direction currentDirection = Direction.UP;
    private int currentX = 0;
    private int currentY = 0;

    public Robot(Direction direction, int x, int y) {
        currentDirection = direction;
        currentX = x;
        currentY = y;
    }

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
                currentDirection = Direction.LEFT;
                break;
            case LEFT:
                currentDirection = Direction.DOWN;
                break;
            case DOWN:
                currentDirection = Direction.RIGHT;
                break;
            case RIGHT:
                currentDirection = Direction.UP;
                break;
        }
    } // повернуться на 90 градусов против часовой стрелки

    public void turnRight() {
        switch (currentDirection) {
            case UP:
                currentDirection = Direction.RIGHT;
                break;
            case LEFT:
                currentDirection = Direction.UP;
                break;
            case DOWN:
                currentDirection = Direction.LEFT;
                break;
            case RIGHT:
                currentDirection = Direction.DOWN;
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

    public void moveRobot(Robot robot, int toX, int toY) {
        Direction purposeX = (robot.getX() - toX > 0 ? Direction.LEFT : Direction.RIGHT); // определяем направление движения по Х
        while (robot.getDirection() != purposeX) turnRight();  // вертим до целевого направления по Х
        while (robot.getX() != toX) stepForward(); // шагаем до точки по Х

        Direction purposeY = (robot.getY() - toY > 0 ? Direction.DOWN : Direction.UP); // те же шаги, только по Y
        while (robot.getDirection() != purposeY) turnRight();
        while (robot.getY() != toY) stepForward();
    }
    // за один шаг робот изменяет одну свою координату на единицу

    public enum Direction {UP, DOWN, LEFT, RIGHT}
}