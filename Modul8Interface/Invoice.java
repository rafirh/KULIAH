public class Invoice implements Payable {
  private String productName;
  private Integer quantity;
  private Integer pricePerItem;

  public Invoice(String productName, Integer quantity, Integer pricePerItem) {
    this.productName = productName;
    this.quantity = quantity;
    this.pricePerItem = pricePerItem;
  }

  public String getProductName() {
    return productName;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public Integer getPricePerItem() {
    return pricePerItem;
  }

  @Override
  public Integer getPayableAmount() {
    return quantity * pricePerItem;
  }

  @Override
  public String toString() {
    return String.format("  %-20s | Qty: %2d | Harga/item: Rp%,8d | Subtotal: Rp%,10d",
        productName, quantity, pricePerItem, getPayableAmount());
  }
}
