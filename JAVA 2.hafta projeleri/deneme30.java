public class DortIslem{
	public int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	public int topla(int sayi1,int sayi2,int sayi3) {
		return sayi1+sayi2;
	}
}
public class Main{
	   public static void main(String[] args) {
		   DortIslem dortIslem= new DortIslem();
		   System.out.println(dortIslem.topla(2,3,4));
		   }  
	}
