package Robots.Robot;

import Robots.Robot.Refill.Refill;
//Наследование класса Robot
public class CookRobot extends Robot {

    public CookRobot(Refill refill, String typeMovement) {
        super(refill, typeMovement);
    }

    public String makeAction(String instrument) {
        if (instrument == "ladle") {
            return "The robot cook starts cooking";
        } else {
            return "The robot cook does not know how to use this tool";
        }
    }
}
