class Task implements Runnable {
    private String taskName;

    public Task(String name) {
        this.taskName = name;
    }
  @Override
    public void run() {
        System.out.println("Starting task: " + taskName + " in thread: " + Thread.currentThread().getName());
        // Simulate some work
        try {
            Thread.sleep((long) (Math.random() * 5000)); // Sleep for a random duration (up to 5 seconds)
        } catch (InterruptedException e) {
            System.out.println("Task: " + taskName + " interrupted.");
            Thread.currentThread().interrupt();
        }
        System.out.println("Finished task: " + taskName + " in thread: " + Thread.currentThread().getName());
    }
}
public class Exp9 {
    public static void main(String[] args) {
        // Create multiple tasks
        Task task1 = new Task("Data Processing");
        Task task2 = new Task("File Upload");
        Task task3 = new Task("Report Generation");

        // Create threads for each task
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        // Start the threads
        System.out.println("Starting parallel tasks...");
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("Main thread continues to execute...");
    }
}
