package flower.store;

import java.util.ArrayList;
import java.util.List;

import flower.filters.SearchFilter;
import flower.item.Item;

public class Store {

    public List<Item> items;

    public List<Item> search(SearchFilter searchFilter) {
        List<Item> FoundItems = new ArrayList<>();
        for (Item item : items) {
            if (searchFilter.match(item))
                FoundItems.add(item);
        }
        return FoundItems;
    }
}
