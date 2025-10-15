

public class RaceMain {
    public static void main(String[] args) {
        System.out.println("=== 🐇 Hare and 🐢 Tortoise Race Begins! ===");

        Hare hare = new Hare();
        Tortoise tortoise = new Tortoise();

        // Setting thread priorities
        hare.setPriority(Thread.MAX_PRIORITY);     // Faster
        tortoise.setPriority(Thread.MIN_PRIORITY); // Slower

        hare.start();
        tortoise.start();
    }
}
