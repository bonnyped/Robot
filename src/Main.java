public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(Robot.Direction.UP, 3, 4);
        System.out.println("Current direction: " + robot.getDirection());
        System.out.println("Current x: " + robot.getX());
        System.out.println("Current y: " + robot.getY());
        robot.moveRobot(robot, -22, 3);
        System.out.println("Changed direction: " + robot.getDirection());
        System.out.println("Changed x: " + robot.getX());
        System.out.println("Changed y: " + robot.getY());
    }
}