//CoolingSystemOperator class
public class CoolingSystemOperator {
    //Ramp-up test
    public static void rampUpTest(CoolingSystem system) {
        //set the capacity to 1
        system.setCapacity(1);
        //turn the system on
        system.setOn(true);
        //turn the capacity up one level at a time until maximum capacity is reached
        while (!system.isMaxCapacity()) {
            system.incrementCapacity();
        }
        //turn the capacity back down one level at a time until it returns to minimum capacity
        while (!system.isMinCapacity()) {
            system.decrementCapacity();
        }
        //turn the system off
        system.setOn(false);
    }
    //Range test
    public static void rangeTest(CoolingSystem system) {
        //turn the system on
        system.setOn(true);
        //attempt to set the capacity to values above and below the allowable range
        system.setCapacity(-1);
        system.setCapacity(system.getCapacity() + system.getCapacity() + 1);
        //turn the system off
        system.setOn(false);
    }
    //main method to drive all the tests one at a time
    public static void main(String[] args) {
        //create a CoolingSystem with multiple fans
        CoolingSystem system = new CoolingSystem(5);
        //call each of the test methods
        rampUpTest(system);
        rangeTest(system);
    }
}
//END!