package ro.fasttrackit.curs18.homework;

public class Fruits implements ShopItem {
    private final String name;
    private final int price;
    private final Category category;

    public Fruits(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public Category category() {
        return category;
    }
}
