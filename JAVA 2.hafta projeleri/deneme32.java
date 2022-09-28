package simkus;

public class CustomerManager extends PersonManager {

	public void List() {
		   System.out.println("listelendi");
	}
	public void add() {
		   System.out.println("eklendi");
	}
}
public class Manager extends PersonManager {

	public void List() {
		   System.out.println("listelendi");
	}
	public void add() {
		   System.out.println("eklendi");
	}
	public void BestRmploye() {
		   System.out.println("Ayın elemanı");
	}
}
public class Manager  {

	public void List() {
		   System.out.println("listelendi");
	}
	public void add() {
		   System.out.println("eklendi");
	}
	public void BestRmploye() {
		   System.out.println("Ayın elemanı");
	}s
}

public class Main {
	CustomerManager customerManager = new CustomerManager();
	EmployeManager employeManager = new EmployeManager();
		
}
