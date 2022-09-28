package simkus;

public class Main {

	public static void main(String[] args) {
	   customerManager customerManager = new CustomerManager();
	   customerManager customerManager2 = new CustomerManager();
	   
	   customerManager = customerManager2;
	   
	   customerManager.Add();
	   customerManager.Remove();
	   customerManager.Update();
	}
}
