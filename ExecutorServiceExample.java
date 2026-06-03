import java.util.concurrent.*;

public class ExecutorServiceExample {

    public static void main(String[] args)
            throws Exception {

        ExecutorService service =
                Executors.newFixedThreadPool(2);

        Callable<String> task =
                () -> "Task Completed";

        Future<String> result =
                service.submit(task);

        System.out.println(
                result.get()
        );

        service.shutdown();

    }
}