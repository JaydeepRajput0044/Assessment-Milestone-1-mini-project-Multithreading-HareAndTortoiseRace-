

public class Tortoise extends Thread {
    private static boolean raceOver = false;

    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (raceOver) break; // Stop if Hare already won

            System.out.println("Tortoise ran " + i + " meters");

            try {
                Thread.sleep(50); // Tortoise runs slower (50 ms per meter)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (i == 100 && !raceOver) {
                raceOver = true;
                System.out.println("\n🏁 Tortoise wins the race!\n");
            }
        }
    }
}
