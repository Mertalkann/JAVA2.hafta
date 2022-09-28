package simkus;

public class Product {
    String name;
    String description;
    double price;
    int stockAmount;
}

public class Main{
   public static void main(String[] args) {
	   Product product = new Product();
	   product.name = "laptop";
	   product.description = "Asus";
	   product.price = 5000;
	   product.stockAmount = 3;
	   
	   ProductManager productManager = new ProductManager();
	   productManager.Add(product);
   }
}

public class ProductManager {
   public void Add(Product product) {
	   System.out.println("ürün eklendi " + product.name )
   }
}