public class CoolingSystemOperator {
    public static void testRampUp(CoolingSystem sys) {
        for (int i = 1; i <= 10; i++) {
            sys.setOperatingCapacity(i);
            sys.setFansOn(true);
            sys.getOperatingCapacity();
        }
        for (int i = 10; i > 0; i--) {
            sys.setOperatingCapacity(i);
            sys.setFansOn(false);
        }


        System.out.println("testRampUp completed successfully.");
    }

    private static void rangeTest(CoolingSystem sys) {
        sys.setOperatingCapacity(11);
        sys.setOperatingCapacity(0);
    }

    public static void main(String args[]) {
        //Instantiates a CoolingSystem
        CoolingSystem CoolingSystem1 = new CoolingSystem(10);
        testRampUp(CoolingSystem1);
        //Runs the range test on this cooling system
        rangeTest(CoolingSystem1);
    }
}