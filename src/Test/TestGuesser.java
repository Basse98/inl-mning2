import Main.Guesser;


class TestGuesser {

    public static void main(String[] args) {
        Guesser guesser = new Guesser(0,100);

        if(guesser.toString().equals("low: 0 high: 100")){
            System.out.println("Test with 0, 100 successful!");
        }else {
            System.out.println("Test with 0, 100 failed!");
        }

    }



}