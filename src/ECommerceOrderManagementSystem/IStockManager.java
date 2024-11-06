package ECommerceOrderManagementSystem;

public interface IStockManager {
    boolean checkStock(int quantity);
    void updateStock(int quantity);
}
