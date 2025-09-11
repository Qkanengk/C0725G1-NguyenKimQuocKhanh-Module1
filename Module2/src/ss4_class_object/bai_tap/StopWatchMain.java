package class_object.bai_tap;

import java.util.Arrays;

class StopWatch {
    private final long startTime = System.currentTimeMillis();
    private long endTime;

    public void setEndTime() {
        this.endTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }


    public void stop() {
        this.setEndTime();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public void display() {
        System.out.println("Thoi gian da troi qua la: " + this.getElapsedTime() + "ms");
    }
}

public class StopWatchMain {
    public static void main(String[] args) {
        StopWatch newStopWatch = new StopWatch();

        System.out.println(newStopWatch.getStartTime());
        int[] arr = {100, 1231, 12312, 24234, 1231, 1, 2, 32, 3, 23, 42, 34, 345, 36, 4, 75, 67, 34};
        Arrays.sort(arr);
        newStopWatch.stop();
        System.out.println(newStopWatch.getEndTime());
        newStopWatch.display();
    }
}
