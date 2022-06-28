import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class CallCentre {
    final static int PAUSE_BETWEEN_CALLS = 1000;
    final static int TIME_FOR_ANSWERING = 4000;
    final static int COUNT_OF_CALLS = 60;
    static int numberOfCall = 0;

    static Queue<Integer> phoneCalls = new ArrayBlockingQueue<>(COUNT_OF_CALLS, true);

    public static void makeACall() {
        for (int i = 0; i < COUNT_OF_CALLS; i++) {
            phoneCalls.offer(numberOfCall);
            try {
                Thread.sleep(PAUSE_BETWEEN_CALLS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Call " + numberOfCall);
            numberOfCall++;
        }
    }

    public static void answerTheCall() {
        while (!phoneCalls.isEmpty()) {
            try {
                Thread.sleep(TIME_FOR_ANSWERING);
                Integer callNumber = phoneCalls.poll();
                if (callNumber != null) {
                    System.out.println(Thread.currentThread().getName() + " answered on the call " + callNumber);
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
