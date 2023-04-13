/**
 * Represents a cooling system that comprises a number of fans.
 */
public class CoolingSystem {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private Fan[] fans;
    private int operatingCapacity;
    private boolean on;


    /**
     * Create a cooling system with the desired number of fans.
     *
     * @param numberOfFans how many fans (must be between 1 and 10)
     */
    public CoolingSystem(int numberOfFans) { // Constructor
        if (numberOfFans <= 10 && numberOfFans > 0) { // The maximum number of fans is 10.
            speed = SLOW;
            fans = new Fan[numberOfFans];
            for (int i = 0; i < fans.length - 1; i++) {
                fans[i] = new Fan();
            }
            operatingCapacity = 0;
        } else {
            System.out.println(numberOfFans + " is a invalid number");
        }
    }

    public void turnUp() {
        if (speed != FAST) {
            speed += 1;
        }
    }

    public int getOperatingCapacity() {
        return operatingCapacity;
    }

    public boolean getMinMax() {
        return on && (operatingCapacity == 1 || operatingCapacity == 10);
    }

    public void setOperatingCapacity(int operatingCapacity) {

        if (operatingCapacity > fans.length) {
            operatingCapacity = fans.length;
            System.out.println("Maximum capacity reached! operating capacity is now 10");
        } else if (operatingCapacity < 1) {
            operatingCapacity = 1;
            System.out.println("Capacity is too low, operating capacity is now 1");
        }

        this.operatingCapacity = operatingCapacity;
    }

    public boolean isOn() {
        return on;
    }

    public void setFansOn(boolean on) {
        this.on = on;
        if (this.on) {
            for (int i = 0; i < operatingCapacity - 1; i++) {
                fans[i].setOn(true);
            }
        } else {
            for (int i = 0; i < operatingCapacity - 1; i++) {
                fans[i].setOn(false);
            }
        }
    }
    public void turnOn() {
        setFansOn(true);
    }

    public void turnOff() {
        setFansOn(false);
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        for (int i = fans.length - 1; i > 0; i--) {
            fans[i].setSpeed(speed);
        }
    }


}
