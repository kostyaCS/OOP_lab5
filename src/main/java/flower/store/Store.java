package flower.store;

import java.util.ArrayList;
import java.util.List;

import flower.filters.SearchFilter;
import flower.item.Item;

public class Store {

    private List<Item> items;  // Made this private for encapsulation

    // Adding a constructor to initialize the items list
    public Store() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    // Note: Renamed the parameter to avoid hiding the field
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
