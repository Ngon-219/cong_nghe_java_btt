package checkedException;
import checkedException.Product;
import checkedException.InsufficientStockException;

import java.util.HashMap;
import java.util.Map;

public class CheckedException {
    private Map<String, Product> inventory = new HashMap<>();

    public CheckedException() {
        inventory.put("P001", new Product("P001", "Laptop", 10));
        inventory.put("P002", new Product("P002", "Smartphone", 20));
        inventory.put("P003", new Product("P003", "Tablet", 5));
    }

    public void processPurchase(String productCode, int quantity) throws InsufficientStockException {
        Product product = inventory.get(productCode);

        if (product == null) {
            System.out.println("checkedException.Product does not exist!");
            return;
        }

        if (product.getStockQuantity() >= quantity) {
            product.setStockQuantity(product.getStockQuantity() - quantity);
            System.out.println("Transaction successful! You have purchased " + quantity + " " + product.getName() + "(s).");
        } else {
            throw new InsufficientStockException("Not enough stock to complete the transaction!");
        }
    }

    public static void main(String[] args) {
        CheckedException manager = new CheckedException();

        try {
            manager.processPurchase("P002", 25);
        } catch (InsufficientStockException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
