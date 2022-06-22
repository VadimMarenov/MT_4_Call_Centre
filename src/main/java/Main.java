public class Main {
    public static int OPERATORS = 10;

    public static void main(String[] args) {

        Ate ate = new Ate();
        ate.start();


        for (int i = 0; i < OPERATORS; i++){
            new Operator("Operator " + i).start();
        }
    }

}

