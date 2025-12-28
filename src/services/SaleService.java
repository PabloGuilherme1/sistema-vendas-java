package services;
import entities.Product;
import entities.Sale;

import java.util.ArrayList;
import java.util.List;

public class SaleService {
	private List<Product> products;
	private List<Sale> sales;
	
	public SaleService() {
		products = new ArrayList<>();
		sales = new ArrayList<>();
	}
	public void addProduct(Product p) {
		products.add(p);
	}
	public void listProducts() {
	    System.out.println("Produtos cadastrados:");
	    for (Product p : products) {
	        System.out.println("ID: " + p.getId() + ", Nome: " + p.getName() + ", Preço: " + p.getPrice());
	    }
	}
	public Sale createSale(int saleId) {
	    Sale sale = new Sale(saleId); 
	    sales.add(sale);             
	    return sale;                  
	}
	public void listSales() {
	    System.out.println("Vendas realizadas:");
	    for (Sale s : sales) {
	        System.out.println("Venda ID: " + s.getId() + ", Total: " + s.getTotal());
	    }
	}

}
