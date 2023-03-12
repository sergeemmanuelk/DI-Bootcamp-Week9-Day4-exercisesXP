import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> jobs = new ArrayList<String>();
        jobs.add("Front-end Developer");
        jobs.add("Back-end Developer");
        jobs.add("Full-stack Developer");
        jobs.add("Mobile Developer");
        jobs.add("DevOps");

        // Using forEach() method with lambda expression to print elements
        jobs.forEach((job) -> System.out.println(job));
    }
}