package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

import flower.item.Flower;
import flower.item.FlowerPack;
import flower.item.FlowerBucket;

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        System.out.println(price);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        System.out.println(quantity);
        Flower flower = new Flower();
        flower.setPrice(10);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.add(flowerPack);
        Assertions.assertEquals(10 * quantity, flowerBucket.getPrice());
    }
}
