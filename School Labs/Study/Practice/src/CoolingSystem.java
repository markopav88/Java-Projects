public class CoolingSystem {
    private Fan[] fans; //field to hold the Fans
    private int desiredSize; //desired size of the cooling system
    private int currentCapacity; //current operating capacity of the system
    private boolean isOn; //on/off status of the system

    //Constructor for CoolingSystem
    public CoolingSystem(int desiredSize) {
        this.desiredSize = desiredSize;
        //ensure that the desired size is within the desired limits (1 to 10)
        if (desiredSize > 10) {
            this.desiredSize = 10;
        }
        else if (desiredSize < 1) {
            this.desiredSize = 1;
        }
        //create the array of fans
        fans = new Fan[desiredSize];
        for (int i = 0; i < desiredSize; i++) {
            fans[i] = new Fan();
        }
        //set the current capacity to the minimum (1)
        currentCapacity = 1;
    }

    //Mutators
    //Turn the system on/off
    public void setOn(boolean on) {
        this.isOn = on;
    }
    //Set the overall fan speed, which applies to all Fans
    public void setSpeed(int speed) {
        for (int i = 0; i < desiredSize; i++) {
            fans[i].setSpeed(speed);
        }
    }
    //Set the operating capacity of the CoolingSystem to any value between 1 and the number of Fans in the system
    public void setCapacity(int capacity) {
        //set the capacity to the maximum if the desired capacity is above the maximum
        if (capacity > desiredSize) {
            currentCapacity = desiredSize;
        }
        //set the capacity to the minimum if the desired capacity is below the minimum
        else if (capacity < 1) {
            currentCapacity = 1;
        }
        //otherwise set the capacity to the desired capacity
        else {
            currentCapacity = capacity;
        }
    }
    //Increment the capacity (turn-up)
    public void incrementCapacity() {
        //do not increment if the capacity is already at the maximum
        if (currentCapacity < desiredSize) {
            currentCapacity++;
        }
    }
    //Decrement the capacity (turn-down)
    public void decrementCapacity() {
        //do not decrement if the capacity is already at the minimum
        if (currentCapacity > 1) {
            currentCapacity--;
        }
    }

    //Accessors
    //Returns whether the system is on or off
    public boolean getOn() {
        return isOn;
    }
    //Returns the current overall speed of the all system fans
    public int getSpeed() {
        return fans[0].setSpeed();
    }
    //Returns the current operating capacity of the system
    public int getCapacity() {
        return currentCapacity;
    }
    //Returns whether the system is operating at maximum or minimum capacity
    public boolean isMaxCapacity() {
        return currentCapacity == desiredSize;
    }
    public boolean isMinCapacity() {
        return currentCapacity == 1;
    }
}
//END!