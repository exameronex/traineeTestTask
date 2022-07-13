package Robots.Robot.Refill;

public class ElectricRefill implements Refill {

    private int chargePercentage;

    public ElectricRefill(int charge) {
        chargePercentage = charge;
    }

    @Override
    public String refuel(String fuel) {
        if(fuel == "electricity") {
            if(chargePercentage < 20) {
                return "The electric refueling was successful";
            } else {
                return "Requires a charge percentage less than 20%";

            }
        } else {
            return "Unsuitable fuel type";
        }
    }
}
