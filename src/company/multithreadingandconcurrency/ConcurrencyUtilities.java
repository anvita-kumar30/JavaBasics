package company.multithreadingandconcurrency;


import java.util.concurrent.ExecutorService;
        import java.util.concurrent.Executors;

public class ConcurrencyUtilities {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable task1 = () -> {
            System.out.println("Task 1");
        };

        Runnable task2 = () -> {
            System.out.println("Task 2");
        };

        // Submit tasks to the executor
        executor.submit(task1);
        executor.submit(task2);

        // Shut down the executor
        executor.shutdown();
    }
}