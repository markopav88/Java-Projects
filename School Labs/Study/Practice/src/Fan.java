//Marko Pavic
//2/20/23
//Lab 4
public class Fan {

    /**
     Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 for the fan speed.
     */

    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;


//Sets the color of the fan.

    private String color;

    public void setColor(String color) {
        this.color = color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /**
     Sets the on/off status of the fan.
     @param on The new on/off status to set for the fan.
     */
    public void setOn(boolean on) {
        this.on = on;
    }
    /**
     Sets the color of the fan.
     set param color The new color to set for the fan.
     */

    /**
     Constructs a Fan object with default values.
     */
    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }
    /**
     Sets the speed of the fan.
     @param newSpeed The new speed to set for the fan.
     */

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public String toString() {
        if (on == true) {
            return "The fan's color is " + color + ", the fan's speed is " + speed + ", the radius is " + radius + " and the fan is on ";
        } else {
            return "The fan's color is " + color + ", the fan's speed is " + speed + ", the radius is " + radius + " and the fan is off ";
        }
    }
    /**
     Returns a string representation of the Fan object, including its color, speed, radius and on/off status.
     @return A string representation of the Fan object.
     */

    /**
     A main method that creates two Fan objects, sets their properties and prints their string representations.
     @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Fan Fan1 = new Fan();
        Fan1.setSpeed(FAST);
        Fan1.setOn(true);
        Fan1.setColor("Yellow");
        Fan1.setRadius(10);
        System.out.println(Fan1.toString());

        Fan Fan2 = new Fan();
        Fan2.setSpeed(MEDIUM);
        Fan2.setOn(false);
        Fan2.setColor("Blue");
        Fan2.setRadius(5);
        System.out.println(Fan2.toString());
    }

    public int setSpeed() {
        return 0;
    }
}
//END!