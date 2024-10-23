// deals with passenger placement throughout the cars
public class Passenger {
    private String name;
    /** adds passenger names to the car passenger list. checks for space first
     * @param Car c
     */
    public void boardCar(Car c) {
        try {
            c.addPassenger(this);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    /** takes passengers off the car passenger list. checks to make sure they were on board first
     * @param Car c
     */
    public void getOffCar(Car c) {
        try {
            c.removePassenger(this);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    /** holds the names of all passengers
     * @ param is the name of the passenger
     */
    public Passenger(String name) {
        this.name = name;
    }
    /** returns passenger names
     * @return this.name
     */
    public String passengerName() {
        return this.name;
    }
}
