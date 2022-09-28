package simkus;

public class Product {
    private int _id;
    private String _name; // sadece tanımlandığı blokta geçerlidir
    private String _description;
    private double _price;
    private int _stockAmount;
    //getter
    public int getId() {
    	return _id;
    }
    //setter
    public void setId(int id) {
    	_id= id;
    }
    
    public class Main{
    	   public static void main(String[] args) {
    		   Product product = new Product();
    		   product._name = "laptop";
    		   product._description = "Asus";
    		   product._price = 5000;
    		   product._stockAmount = 3;
    		   product.setId(1);
    		   
    		   ProductManager productManager = new ProductManager();
    		   productManager.Add(product);
    	   }
    	}
}

