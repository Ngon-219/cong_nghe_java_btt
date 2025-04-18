package checkedException;

public class Product {
    private String code;
    private String name;
    private int stockQuantity;

    public Product(String code, String name, int stockQuantity) {
        this.code = code;
        this.name = name;
        this.stockQuantity = stockQuantity;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
