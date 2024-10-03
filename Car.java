import java.util.ArrayList;
// deals with passenger placement throughout the cars, including capacity 
public class Car {
    // declares list to store passengers and max capacity of the train
    ArrayList<Passenger> passengersOnBoard;
    int maxCapacity;
    // declares a new array list with the length of the capacity
    public Car(int maxCapacity) {
        this.passengersOnBoard = new ArrayList<Passenger>(maxCapacity);
        this.maxCapacity = maxCapacity;

    }
    // returns the max capacity of the train
    public int getCapacity() {
        return this.maxCapacity;
    }
    // returns the seats remaining on the train
    public int seatsRemaining() {
        return this.maxCapacity - passengersOnBoard.size();
    }
    // adds passengers to the train, first checking if there is room or if the passenger has already boarded
    public Boolean addPassenger(Passenger p) {
        if (this.maxCapacity <= passengersOnBoard.size()) {
            System.out.println("Not enough room.");
            return false;
        }
        if (this.passengersOnBoard.contains(p)){
            System.out.println("This passenger has already boarded.");
            return false;
        }
        else {
            passengersOnBoard.add(p);
            return true;
        }
    }
    // removes passengers from the train, first checking if the passenger is on the train
    public Boolean removePassenger(Passenger p) {
        if (passengersOnBoard.contains(p)) {
            passengersOnBoard.remove(p);
            return true;
        }
        else {
            System.out.println("Passenger is not on board.");
            return false;
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