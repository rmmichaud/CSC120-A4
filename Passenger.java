// deals with passenger placement throughout the cars
public class Passenger {
    private String name;
    // adds passenger names to the car passenger list. checks for space first
    public void boardCar(Car c) {
        c.addPassenger(this);
        if (c.addPassenger(this)) {
            System.out.println();
        }
        else {
            System.out.println("The selected car is full, find seating elsewhere.");
        }
    }
    // takes passengers off the car passenger list. checks to make sure they were on board first
    public void getOffCar(Car c) {
        c.removePassenger(this);
        if (c.removePassenger(this)) {
            System.out.println();
        }
        else {
            System.out.println("This passenger was not on board Car c.");
        }
    }
    // holds the names of all passengers
    // @ param is the name of the passenger
    public Passenger(String name) {
        this.name = name;
    }
    // returns passenger names
    public String passengerName() {
        return this.name;
    }
}
