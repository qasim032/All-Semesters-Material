public class Product {

    protected boolean isEdible;
    protected int price;
    protected String name;

    public Product(boolean isEdible, int price, String name) {
        this.isEdible = isEdible;
        this.price = price;
        this.name = name;
    }

    public boolean isEdible() {
        return isEdible;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setEdible(boolean edible) {
        isEdible = edible;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
