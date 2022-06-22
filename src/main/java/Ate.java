public class Ate extends Thread{

    @Override
    public void run(){
        CallCentre.makeACall();
    }
}
