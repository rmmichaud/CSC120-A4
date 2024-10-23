import java.util.ArrayList;
// gets different attributes needed for the train and tests the methods
public class Train {
    // declares new engine and list of cars
    private final Engine engine;
    private ArrayList<Car> cars;
    /** constructor that establishes the fuel type, fuel capacity, number of cars, and passenger capacity
    * @param fuelType
    * @param fuelCapacity
    * @param nCars
    * @param passengerCapacity
    */
    public Train(FuelType fuelType, 
    double fuelCapacity, int nCars, 
    int passengerCapacity){
        this.engine = new Engine(fuelType, fuelCapacity);
        this.cars = new ArrayList<Car>(nCars);
        for (int i = 0; i < nCars; i++) {
            Car car = new Car(passengerCapacity);
            this.cars.add(car);
        }

    }
    /** returns the engine
    * @return engine
    */
    public Engine getEngine() {
        return this.engine;
    }
    /** returns the car 
     * @return car
     */
    public Car getCar(int i) {
        if (i > this.cars.size()) {
            System.out.println("The train doesn't have that many cars.");
        }
        return this.cars.get(i);
    }
    /** returns the capacity of the cars
     * @return total
     */

    public int getMaxCapacity() {
        int total = 0;
        for (int i = 0; i < cars.size(); i++) {
            total += cars.get(i).getCapacity();
        }
        return total;
    }
    /** checks how many seats are remaining in a car
     * @return seatsLeft
     */
    public int seatsRemaining() {
        int seatsLeft = 0;
        for (int i = 0; i < cars.size(); i++) {
            seatsLeft += cars.get(i).seatsRemaining();
        }
        return seatsLeft;

    }
    // prints the names of the passengers in each car
    public void printManifest() {
        for (int i = 0; i < this.cars.size(); i++) {
            this.cars.get(i).printManifest();
        }
    }
    // tests the different methods 
    public static void main(String[] args) {
        Train trainOne = new Train(FuelType.ELECTRIC, 100.0, 2, 10);
        while(trainOne.engine.go()){
            continue;
        }
        trainOne.engine.refuel();
        System.out.println(trainOne.engine.getCurrentFuel());
    
        Passenger oneP = new Passenger("Marybella");
        Passenger twoP = new Passenger("Rachel");
        Passenger threeP = new Passenger("Minty");
        Passenger fourP = new Passenger("Ang");
        trainOne.cars.get(0).addPassenger(oneP);
        trainOne.cars.get(1).addPassenger(twoP);
        trainOne.cars.get(0).addPassenger(threeP);
        trainOne.cars.get(1).addPassenger(fourP);
        trainOne.printManifest();
        trainOne.cars.get(0).removePassenger(oneP);
        System.out.println(trainOne.getMaxCapacity());
        System.out.println(trainOne.seatsRemaining());
        trainOne.printManifest();
    
        Car carOne = new Car(10);
        twoP.boardCar(carOne);
        twoP.boardCar(carOne);
        twoP.getOffCar(carOne);
        twoP.getOffCar(carOne); 
        carOne.addPassenger(twoP);
        carOne.printManifest();
        carOne.removePassenger(twoP);
        carOne.printManifest();
        }
    }

