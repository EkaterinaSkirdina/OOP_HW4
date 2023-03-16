package SeminarsHW.HW4;

public class Product {
    String name;
    Integer price;
    Double volume;

    public Product() {
    }

    public Product(String name, Integer price, double volume) {
        this.name = name;
        this.price = price;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Double getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public String toString() {
        return "\"" + name + "\" стоит: " + price + " руб " + volume + " литр(а)";
    }
}
