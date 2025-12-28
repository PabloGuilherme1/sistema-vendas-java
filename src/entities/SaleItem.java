package entities;

public class SaleItem {
	private Product product;
	private int quantity;
	
	public SaleItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public int getQuantity() {
		return quantity;
	}
	 public double getSubTotal() {
	     return product.getPrice() * quantity;
	}
	 public String toString() {
	     return product.getName() + " x" + quantity + " = " + getSubTotal();
	}

}
