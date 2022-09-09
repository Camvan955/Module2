package ss4_class_object_in_java.exercise.stop_watch;


public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void end() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }


    public static void main(String[] args) {
        StopWatch sW = new StopWatch();

        sW.start();
        for (int i = 0; i < 100000; i++) {
            System.out.println();
        }
        sW.end();
        System.out.println("Thời gian chạy là: " + sW.getElapsedTime() + " miliseconds");
    }
}