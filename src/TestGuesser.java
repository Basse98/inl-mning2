public class TestGuesser {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        Guesser g1 = new Guesser(x,y);
        g1.start();
    }

}
