package simkus;

public class DortIslem {

	public static int topla(int sayi1, int sayi2){
	  return sayi1+sayi2;
	}
	public static int cikar(int sayi1, int sayi2){
	  return sayi1-sayi2;
	}
	public static int carp(int sayi1, int sayi2){
      return sayi1*sayi2;
	}
	public static int bol(int sayi1, int sayi2){
	  return sayi1/sayi2;
    }
}
public class Main{
	public static void main(String[]args) {
		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.topla(0, 0);
		System.out.println(sonuc);
	}
}