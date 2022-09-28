package simkus;

public class Main {

	public static void main(String[] args) {
	   customerManager customerManager = new CustomerManager();
	   customerManager customerManager2 = new CustomerManager();
	   
	   customerManager = customerManager2;
	   
	   customerManager.Add();
	   customerManager.Remove();
	   customerManager.Update();
	   int sayi1 = 10;
	   int sayi2 = 20;
	   sayi1 = 30;
	   
	   int[] sayilar1 = new int[][1, 2, 3];
	   int[] sayilar2 = new int[][4, 5, 6];
	   sayilar1[0] = 10;
  
	}
}
