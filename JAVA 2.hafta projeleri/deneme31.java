package simkus;

public class Customer extends person {
	String email;
}

public class employe extends person  {

	double salary;
}

public class person {
	int id;
	String firstName;
	String lastName;
	int age;
}

public class Main {
	Customer customer = new Customer();
	Employe employe = new Employe();
}
