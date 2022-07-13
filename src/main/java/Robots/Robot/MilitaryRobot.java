package Robots.Robot;

import Robots.Robot.Refill.Refill;
//Наследование класса Robot
public class MilitaryRobot extends Robot {

    public MilitaryRobot(Refill refill, String typeMovement) {
        super(refill, typeMovement);
    }

    public String makeAction(String instrument) {
        if (instrument == "weapon") {
            return "Robot warrior attacks";
        } else {
            return "The robot warrior does not know how to use this tool";
        }
    }
}
