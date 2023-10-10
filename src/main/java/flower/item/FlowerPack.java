package flower.item;

import lombok.Getter;

public class FlowerPack {
    private Flower flower;
    @Getter
    private int amount;

    public FlowerPack(Flower flower) {
        this.flower = new Flower(flower);
        this.amount = 1;
    }

    public FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.setQuantity(amount);
    }

    public void setQuantity(int quantity) {
        this.amount = (quantity > 0)? quantity : 0;
    }

    double getPrice() {
        return flower.getPrice() * amount;
    }
}
