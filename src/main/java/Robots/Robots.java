package Robots;

import Robots.Robot.CookRobot;
import Robots.Robot.MilitaryRobot;
import Robots.Robot.Refill.AtomicRefill;
import Robots.Robot.Refill.ElectricRefill;
import Robots.Robot.Refill.GasolineRefill;
import Robots.Robot.Robot;
import Robots.Robot.WelderRobot;

public class Robots {
    public static void main(String[] args) {
        //Реализация 9 роботов. Демонстрация работы кажого робота и заправки для каждого робота

        CookRobot cookAtomicRobot = new CookRobot(new AtomicRefill(55), "walk");
        System.out.println(cookAtomicRobot.makeAction("ladle"));
        System.out.println(cookAtomicRobot.refill("atomic"));

        CookRobot cookGasolineRobot = new CookRobot(new GasolineRefill(0), "fly");
        System.out.println(cookGasolineRobot.makeAction("ladle"));
        System.out.println(cookGasolineRobot.refill("gasoline"));

        CookRobot cookElectricRobot = new CookRobot(new ElectricRefill(14), "drive");
        System.out.println(cookElectricRobot.makeAction("ladle"));
        System.out.println(cookElectricRobot.refill("electricity"));

        MilitaryRobot militaryAtomicRobot = new MilitaryRobot(new AtomicRefill(45), "drive");
        System.out.println(militaryAtomicRobot.makeAction("weapon"));
        System.out.println(militaryAtomicRobot.refill("atomic"));

        MilitaryRobot militaryGasolineRobot = new MilitaryRobot(new GasolineRefill(12), "walk");
        System.out.println(militaryGasolineRobot.makeAction("weapon"));
        System.out.println(militaryGasolineRobot.refill("gasoline"));

        MilitaryRobot militaryElectricRobot = new MilitaryRobot(new ElectricRefill(45), "fly");
        System.out.println(militaryElectricRobot.makeAction("weapon"));
        System.out.println(militaryElectricRobot.refill("electricity"));

        WelderRobot WelderAtomicRobot = new WelderRobot(new AtomicRefill(15), "fly");
        System.out.println(WelderAtomicRobot.makeAction("welding machine"));
        System.out.println(WelderAtomicRobot.refill("atomic"));

        WelderRobot WelderGasolineRobot = new WelderRobot(new GasolineRefill(33), "drive");
        System.out.println(WelderGasolineRobot.makeAction("welding machine"));
        System.out.println(WelderGasolineRobot.refill("gasoline"));

        WelderRobot WelderElectricRobot = new WelderRobot(new ElectricRefill(43), "walk");
        System.out.println(WelderElectricRobot.makeAction("welding machine"));
        System.out.println(WelderElectricRobot.refill("electricity"));

        System.out.println();
        //инкаспуляция переменной typeMovement
        cookAtomicRobot.getMovement();
        cookAtomicRobot.setMovement("fly");
        cookAtomicRobot.getMovement();

        System.out.println();
        //реализация полиморфизма
        Robot robotPoly[] = new Robot[3];
        robotPoly[0] = new CookRobot(new AtomicRefill(45), "walk");
        robotPoly[1] = new MilitaryRobot(new AtomicRefill(45), "walk");
        robotPoly[2] = new WelderRobot(new AtomicRefill(45), "walk");

        for(int i = 0; i < 3; i++) {
            System.out.println(robotPoly[i].makeAction("ladle"));
        }
    }

}
