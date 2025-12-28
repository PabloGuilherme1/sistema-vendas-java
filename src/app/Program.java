package app;

import java.util.Locale;
import java.util.Scanner;

import services.SaleService;
import entities.Product;
import entities.Sale;
import entities.SaleItem;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SaleService service = new SaleService();

        System.out.print("Id do produto: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome do produto: ");
        String name = sc.nextLine();

        System.out.print("Preço do produto: ");
        double price = sc.nextDouble();

        Product product = new Product(id, name, price);
        service.addProduct(product);

        Sale sale = service.createSale(1);

        System.out.print("Quantidade vendida: ");
        int quantity = sc.nextInt();

        SaleItem item = new SaleItem(product, quantity);
        sale.addItem(item);

        System.out.println(item);
        System.out.printf("Total da venda: R$ %.2f%n", sale.getTotal());

        sc.close();
    }
}

