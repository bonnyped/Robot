
public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(Robot.Direction.UP, 3, 4);
        System.out.println("Hi, Robot!" + robot.getX() + robot.getY());
    }
}