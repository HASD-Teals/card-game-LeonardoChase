public class CardGameClient {
    public static void main(String[] args) throws Exception {
        Deck me= new Deck();
        Deck me2 = new Deck();
        System.out.println(me.getCard(5));
        System.out.println(me2.getCard(5));
        System.out.println(me.getCard(5).equal(me2.getCard(6)));
        System.out.println(me.getSize());
        System.out.println(me.shuffle());
    }
}
