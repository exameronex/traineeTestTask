package Robots.Robot.Refill;

public class AtomicRefill implements Refill {

    private int refuelingTime;

    public AtomicRefill(int year) {
        refuelingTime = year;
    }

    @Override
    public String refuel(String fuel) {
        if(fuel == "atomic") {
            if(refuelingTime >= 50) {
                return "The nuclear refueling was successful";
            } else {
                return "Less than 50 years have passed for nuclear refueling";

            }
        } else {
            return "Unsuitable fuel type";
        }
    }
}
