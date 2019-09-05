package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot rob = new Robot();
	rob.setSpeed(100);
	rob.penDown();
	rob.turn(180);
	rob.move(50);
	rob.turn(90);
	rob.move(25);
}
}
