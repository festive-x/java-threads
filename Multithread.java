    //made by Festive_#7710
    public class javathread {
        public static void main(String[] args) {
            int n = 58; // Number of threads
            for (int i = 0; i < n; i++) {
                MultithreadingDemo object = new MultithreadingDemo();
                object.start();
            }
        }
    }

    class MultithreadingDemo extends Thread {
        public void run() {
            try {
                // displaying the thread in terminal
                System.out.println(
                        "thread " + Thread.currentThread().getId()
                                + " is running");
            } catch (Exception e) {
                // Throwing an exception
                System.out.println("caught an exception");
            }
        }
    }
