public class Card {
    // PROPERTIES
    private String color;
    private String rank;
    private char symbol;
    private int value;

    // CONSTRUCTORS
    public Card() {
        this.color = " ";
        this.rank = "";
        this.symbol = ' ';
        this.value = 0;
    }

    public Card(String color, String rank, char symbol, int value) {
        this.color = color;
        this.rank = rank;
        this.symbol = symbol;
        this.value = value;
    }
    // ACCESSORS
    public String getColor() {
        return this.color;
    }

    public String getRank() {
        return this.rank;
    }
    public char getSymbol(){
        return this.symbol;
    }
    public int getValue(){
        return this.value;
    }

    public String getReport() {
        String report = "Color: "+ this.color + "\n" + "Rank: "+ this.rank + "\n" + "Symbol: "+ this.symbol + "\n" + "Value: "+ this.value + "\n" + "\n";
        return report;
    }

    // MUTATORS
    public void adjSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void adjColor(String color) {
        this.color = color;
    }
    // METHODS
    public boolean equal(Card card2) {
        if(this.color == card2.color && this.symbol == card2.getSymbol() && this.value == card2.getValue()) {
            return true;
        }
        return false;
    }
}
