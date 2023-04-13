public class Stopwatch {
    private long startTime;
    private long endTime;

    public Stopwatch() {
        // Initialize startTime and endTime to the current time
        startTime = System.currentTimeMillis();
        endTime = startTime;
    }

    public long read() {
        // If the stopwatch is running, calculate the elapsed time without stopping the stopwatch
        if (startTime > 0 && endTime == startTime) {
            return System.currentTimeMillis() - startTime;
        } else {
            return endTime - startTime;
        }
    }

    public void reset() {
        // Reset startTime and endTime to the current time
        startTime = System.currentTimeMillis();
        endTime = startTime;
    }

    public void start() {
        // Start the stopwatch by setting startTime to the current time
        startTime = System.currentTimeMillis();
        endTime = startTime;
    }

    public void stop() {
        // Stop the stopwatch by setting endTime to the current time
        endTime = System.currentTimeMillis();
    }

    public static void main(String[] args) {
        // Create an instance of Stopwatch and test its operations
        Stopwatch stopwatch = new Stopwatch();

        // Start the stopwatch
        stopwatch.start();
        // Pause for 3 seconds
        pauseFor(3000);
        // Stop the stopwatch
        stopwatch.stop();

        // Print the elapsed time
        System.out.println("Elapsed time (ms): " + stopwatch.read());

        // Reset and test the stopwatch again
        stopwatch.reset();
        stopwatch.start();
        pauseFor(2000);
        stopwatch.stop();

        // Print the elapsed time after resetting
        System.out.println("Elapsed time after resetting (ms): " + stopwatch.read());
    }

    public static void pauseFor(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException exc) {
            System.err.println("This should not happen in a single-threaded program.");
        }
    }
}
