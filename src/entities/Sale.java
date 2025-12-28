package entities;
import java.util.ArrayList;
import java.util.List;

	public class Sale {
	private int id;
	private List<SaleItem> items;
	
	public Sale(int id) {
		this.id = id;
		this.items = new ArrayList<>();
	}
	 public void addItem(SaleItem item) {
	        items.add(item); 
	}
	 public double getTotal() {
		 double total = 0.0; 
		 for (SaleItem item : items) {
		     total += item.getSubTotal();
	}
	return total;

	}
	 public int getId() {
		 return id;
	 }
	
}
