package ro.fasttrackit.curs18.homework;

import java.util.List;

public class Shop<T extends ShopItem> {
    private final List<T> items;


    public Shop(List<T> items) {
        this.items = items;
    }

    public List<T> getItems() {
        return items;
    }
}
