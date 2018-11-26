public class TestGuesser {

    public static void main(String[] args) {
        Guesser g1 = new Guesser(0,1000);

        if(g1.toString().equals("low: 0 high: 1000")){
            System.out.println("Test with 0, 1000 passed!");
        }else{
            System.err.println("Test with 0, 1000 failed!");
        }
    }

}
