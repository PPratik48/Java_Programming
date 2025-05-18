package Threading;

import java.util.Random;

public class ThreeThread {
    public static void main(String[] args) {
        RandomNumberGeneratorThread generatorThread = new RandomNumberGeneratorThread();
        SquareCalculatorThread squareThread = new SquareCalculatorThread(generatorThread);
        CubeCalculatorThread cubeThread = new CubeCalculatorThread(generatorThread);

        generatorThread.start();
        squareThread.start();
        cubeThread.start();
    }
}

class RandomNumberGeneratorThread extends Thread {
    private volatile int randomNumber;

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            randomNumber = random.nextInt(1000); // Generating random number between 0 and 999
            System.out.println("Random Integer generated: " + randomNumber);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}

class SquareCalculatorThread extends Thread {
    private RandomNumberGeneratorThread generatorThread;

    public SquareCalculatorThread(RandomNumberGeneratorThread generatorThread) {
        this.generatorThread = generatorThread;
    }

    @Override
    public void run() {
        while (true) {
            int number = generatorThread.getRandomNumber();
            int square = number * number;
            System.out.println("Square of " + number + " = " + square);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class CubeCalculatorThread extends Thread {
    private RandomNumberGeneratorThread generatorThread;

    public CubeCalculatorThread(RandomNumberGeneratorThread generatorThread) {
        this.generatorThread = generatorThread;
    }

    @Override
    public void run() {
        while (true) {
            int number = generatorThread.getRandomNumber();
            int cube = number * number * number;
            System.out.println("Cube of " + number + " = " + cube);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
