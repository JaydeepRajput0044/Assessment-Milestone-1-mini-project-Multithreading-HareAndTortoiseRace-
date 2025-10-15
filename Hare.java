

public class Hare extends Thread {
    private static boolean raceOver = false;

    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (raceOver) break; // Stop if Tortoise already won

            System.out.println("Hare ran " + i + " meters");

            if (i == 60) {
                try {
                    System.out.println("Hare is sleeping for 1000 milliseconds...");
                    Thread.sleep(1000); // sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Simulate running speed
            try {
                Thread.sleep(20); // Hare runs faster (20 ms per meter)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (i == 100 && !raceOver) {
                raceOver = true;
                System.out.println("\n🏁 Hare wins the race!\n");
            }
        }
    }
}
