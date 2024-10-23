// deals with information pertaining to fuel and fuel type
public class Engine {
    // declares fuel type and fuel levels
    private FuelType f;
    private double currentLevel;
    private double maxFuel;
    // returns fuel type
    public FuelType getFuelType(){
        return f;
    }
    // returns current fuel level
    public double getCurrentFuel() {
        return currentLevel;
    }
    // returns max fuel level
    public double getMaxFuel() {
        return maxFuel;
    }
    /** constructor, sets values of above attributes
     * @param f stores the train's fuel type
     * @param maxFuel stores the max fuel level
     * @param currentLevel stores the current fuel level
    */
    public Engine (FuelType f, double maxFuel) {
        this.f = f;
        this.maxFuel = maxFuel;
        this.currentLevel = maxFuel;
    }
    // refills the train's fuel by setting currentlevel to maxfuel
    public void refuel() {
        this.currentLevel = this.maxFuel;
    }
    /** decreases the fuel level and returns information about the current level
     *  @return boolean
     */
    public Boolean go() {
        if (this.currentLevel == 0) {
            this.currentLevel = this.currentLevel - 10;
            System.out.println("The remaining fuel level is: " + this.currentLevel);    
            return true;
        } else {
            System.out.println("Out of fuel!");
            return false;
        }
    }
    
}