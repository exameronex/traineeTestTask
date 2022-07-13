import Robots.Robot.CookRobot;
import Robots.Robot.Refill.AtomicRefill;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NegativeTestRobot {
    //Классы для 5 задания находятся в main/java/Robots

    CookRobot cookAtomicRobotNegative = new CookRobot(new AtomicRefill(45), "walk");

    @Test
    public void negativeVerificationOperationRobot(){
        assertEquals("The robot cook does not know how to use this tool", cookAtomicRobotNegative.makeAction("weapon"));
    }

    @Test
    public void negativeVerificationRefuelingRobot(){
        assertEquals("Unsuitable fuel type", cookAtomicRobotNegative.refill("gasoline"));
    }





}
