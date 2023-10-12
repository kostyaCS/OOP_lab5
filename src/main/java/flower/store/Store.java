package flower.store;

import java.util.ArrayList;
import java.util.List;

import flower.filters.SearchFilter;
import flower.item.Item;

public class Store {

    private List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return new ArrayList<>(items); // Return a defensive copy to ensure immutability
    }

    public void setItems(List<Item> items) {
        this.items = new ArrayList<>(items); // Store a defensive copy to ensure immutability
    }

    public List<Item> search(SearchFilter searchFilter) {
        List<Item> foundItems = new ArrayList<>();
        for (Item item : items) {
            if (searchFilter.match(item)) {
                foundItems.add(item);
            }
        }
        return foundItems;
    }
}
