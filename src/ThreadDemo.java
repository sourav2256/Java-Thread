public class ThreadDemo { // current is main
    void show() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            System.out.println(Thread.currentThread().getName());
            thread.start(); // ==> run
        }
    }
}
