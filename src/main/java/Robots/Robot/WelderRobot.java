package Robots.Robot;

import Robots.Robot.Refill.Refill;
//Наследование класса Robot
public class WelderRobot extends Robot {

    public WelderRobot(Refill refill, String typeMovement) {
        super(refill, typeMovement);
    }
    public String makeAction(String instrument) {
        if (instrument == "welding machine") {
            return "Robot welder starts work";
        } else {
            return "The robot welder does not know how to use this tool";
        }
    }
}
