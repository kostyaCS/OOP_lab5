package flower.item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@AllArgsConstructor
public class Flower extends Item {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower() { };

    public String getColor() {
        return color.toString();
    }

    public Flower(Flower fl) {
        this.sepalLength = fl.sepalLength;
        this.color = fl.color;
        this.price = fl.price;
        this.flowerType = fl.flowerType;
    }

    public boolean equals(Flower fl) {
        return (this.flowerType == fl.flowerType && this.color == fl.color &&
        this.price == fl.price && this.sepalLength == fl.sepalLength);
    }
}
