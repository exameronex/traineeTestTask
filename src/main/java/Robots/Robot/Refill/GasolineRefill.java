package Robots.Robot.Refill;

public class GasolineRefill implements Refill {

    private int dustinessTank;

    public GasolineRefill(int dustiness) {
        dustinessTank = dustiness;
    }

    @Override
    public String refuel(String fuel) {
        if(fuel == "gasoline") {
            if(dustinessTank == 0) {
                return "The gasoline refueling was successful";
            } else {
                return "An empty tank is required for gasoline refueling";

            }
        } else {
            return "Unsuitable fuel type";
        }
    }
}
