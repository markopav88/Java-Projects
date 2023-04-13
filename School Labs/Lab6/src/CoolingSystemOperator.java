public class CoolingSystemOperator {
    public static void main(String[] args) {
        AdvancedCoolingSystem acs = new AdvancedCoolingSystem(4, 1.5f);

        runTest1(acs);
        System.out.println("Power consumption after test 1: " + acs.getPowerConsumption() + " kWh");

        runTest2(acs);
        System.out.println("Power consumption after test 2: " + acs.getPowerConsumption() + " kWh");
    }

    public static void runTest1(AdvancedCoolingSystem acs) {
        for (int i = 0; i < 5; i++) {
            acs.turnOn();
            Stopwatch.pauseFor(100);
            acs.turnOff();
            Stopwatch.pauseFor(100);
        }
    }

    public static void runTest2(AdvancedCoolingSystem acs) {
        for (int i = 0; i < 3; i++) {
            acs.turnOn();
            Stopwatch.pauseFor(200);
            acs.turnOff();
            Stopwatch.pauseFor(50);
        }
    }
}