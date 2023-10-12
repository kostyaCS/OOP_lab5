package flower.item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.Objects;

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

    public Flower() { }

    public Flower(Flower fl) {
        this.sepalLength = fl.sepalLength;
        this.color = fl.color;
        this.price = fl.price;
        this.flowerType = fl.flowerType;
    }

    public String getColor() {
        return color.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Flower fl = (Flower) obj;
        return this.flowerType == fl.flowerType
                && this.color == fl.color
                && this.price == fl.price
                && this.sepalLength == fl.sepalLength;
    }
}
