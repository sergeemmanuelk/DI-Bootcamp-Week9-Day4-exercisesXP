public class Main {
    public static void main(String[] args) {
        // Using lambda expression to implement Runnable
        new Thread(() -> {
            System.out.println("Before Java8, too much code for too little to do");
        }).start();

    }
}