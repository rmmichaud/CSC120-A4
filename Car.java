import java.util.ArrayList;
// deals with passenger placement throughout the cars, including capacity 
public class Car {
    // declares list to store passengers and max capacity of the train
    private ArrayList<Passenger> passengersOnBoard;
    int maxCapacity;
    /** declares a new array list with the length of the capacity
     * @param int maxCapacity
     */
    public Car(int maxCapacity) {
        this.passengersOnBoard = new ArrayList<Passenger>(maxCapacity);
        this.maxCapacity = maxCapacity;

    }
    /** returns max capacity of the car 
     * @return int maxCapacity
     */
    public int getCapacity() {
        return this.maxCapacity;
    }
    /** returns seats remaining in the car 
     * @return int seatsRemaining
     */
    public int seatsRemaining() {
        return this.maxCapacity - passengersOnBoard.size();
    }
    /** adds passengers to the train, first checking if there 
     * is room or if the passenger has already boarded
     * @param Passenger p
     * @return boolean
     */
    public void addPassenger(Passenger p) {
        if (this.maxCapacity <= passengersOnBoard.size()) {
            throw new RuntimeException("Not enough room");
        }
        if (this.passengersOnBoard.contains(p)){
            throw new RuntimeException("This passenger has already boarded.");
        }
        else {
            passengersOnBoard.add(p);
        }
    }
    /** removes passengers from the train, first checking if the passenger is on the train
     * @param Passenger p
     * @return boolean
     */
    public void removePassenger(Passenger p) {
        if (passengersOnBoard.contains(p)) {
            passengersOnBoard.remove(p);
        } else {
            throw new RuntimeException("Passenger is not on board.");
        }
    }
    // prints out the list of passengers on board
    public void printManifest() {
        if (passengersOnBoard.size() > 0) {
            System.out.println("Passengers on board: ");
        }
        else {
            System.out.println("This car is empty!");
        }
        for (int i = 0; i < this.passengersOnBoard.size(); i++) {
            System.out.println(passengersOnBoard.get(i).passengerName());
        }
    }
}