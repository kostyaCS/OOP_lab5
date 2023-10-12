package flower.item;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    private double price = 0;
    private List<FlowerPack> bucket = new ArrayList<>();

    public void add(FlowerPack flowerPack) {
        bucket.add(flowerPack);
    }

    public double getPrice() {
        for (FlowerPack b : bucket) {
            price += b.getPrice();
        }
        return price;
    }

    public List<FlowerPack> getBucket() {
        return new ArrayList<>(bucket); // Return a defensive copy to ensure immutability
    }
}
