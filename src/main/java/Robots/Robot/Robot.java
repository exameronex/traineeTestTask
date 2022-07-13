package Robots.Robot;

import Robots.Robot.Refill.Refill;
//Данный класс будут наследовать
public abstract class Robot {

    protected Refill refill;

    //инкаспуляция переменной typeMovement
    protected String typeMovement;

    public Robot(Refill refill, String typeMovement) {
        this.refill = refill;
        this.typeMovement = typeMovement;
    }

    public abstract String makeAction(String instrument);

    public String refill(String fuel) {
        return refill.refuel(fuel);
    }

    //инкаспуляция переменной typeMovement
    public void getMovement() {
        System.out.println("The robot can " + this.typeMovement);
    }

    public void setMovement(String typeMovement) {
        if(typeMovement != this.typeMovement && (typeMovement == "walk" || typeMovement == "fly" || typeMovement == "drive")) {
            this.typeMovement = typeMovement;
            System.out.println("Now the robot can " + this.typeMovement);
        } else {
            System.out.println("Invalid value or similar type");
        }


    }
}
