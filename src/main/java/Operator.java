public class Operator extends Thread {
    public Operator(String name) {
        super(name);
    }

    @Override
    public void run() {
        CallCentre.answerTheCall();
    }
}
