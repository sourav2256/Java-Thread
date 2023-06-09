
class RunnerT1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runner1: "+i);
        }
    }
}

class RunnerT2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runner2: "+i);
        }
    }
}

public class AppThread {
    public static void main(String[] args) {

        // Not PARALLEL Execution
        // achieve multithreading
        Thread t1 = new RunnerT1();
        Thread t2 = new RunnerT2();

        t1.start();
        t2.start();
    }
}
