package flower.item;

public enum FlowerColor {
    RED("#FF0000"), BLUE("#0000FF");
    private String str;

    FlowerColor(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }
}
