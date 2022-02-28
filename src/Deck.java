public class Deck {
    // PROPERTIES
    private Card[] deck = new Card[52];
    private int size = deck.length;

   // CONSTRUCTORS
   Deck(){
    for (int i=0; i<13; i++) {
        String color="Black";
        int value = i+1;
        String rank = ""+i;
        char symbol = 'C';
        deck[i]= new Card(color, rank, symbol, value);
    }
    for (int i=13; i<26;i++) {
        String color="Black";
        int value= i+1-13;
        String rank = " "+(i-12);
        char symbol = 'S';
        deck[i]= new Card(color, rank, symbol, value);
    }
    for (int i=26; i<39;i++) {
        String color="Black";
        int value= i+1-26;
        String rank = " "+(i-25);
        char symbol = 'H';
        deck[i]= new Card(color, rank, symbol, value);
    }
    for (int i=39; i<52;i++) {
        String color="Black";
        int value= i+1-39;
        String rank = " "+(i-38);
        char symbol = 'D';
        deck[i]= new Card(color, rank, symbol, value);
    }
}

    // METHODS
    public String toString () {
        String report="";
        for(int i=0; i<deck.length;i++){
            report = report + deck[i].getColor()+" "+deck[i].getSymbol()+" "+deck[i].getValue()+"\n";
        }
        return report;
        // Shuffle this.cards in a random order
    }
    public Card getCard(int i){
        return deck[i];
    }
    public int getSize() {
        return deck.length;
    }
    public String shuffle(){
        String report = "";
        for (int i=0;i< 1000000;i++) {
            int index_a=(int) (Math.random()*(size));
            int index_b=(int) (Math.random()*(size));
            Card temp=deck[index_a];
            deck[index_a]=deck[index_b];
            deck[index_b]=temp;}
        for(int i=0; i<deck.length;i++){
            report = report + deck[i].getColor()+" "+deck[i].getSymbol()+" "+deck[i].getValue()+"\n";
        }
        return report;
    }
}
