package tr.org.linux.kamp.karaklerler;


public class Stringler {
	
	public static void main(String[] args) {
		
		System.out.println(10);		//ekran çıktısı 10 ama string. sayısal anlamı yok.
		//String str1=123;		//elle integere çevirmek gerek. hata verir.
		String str= Integer.toString(123);	//integer 123 değerini string yaptık.
		System.out.println(str);
		String str2="hello world";
		System.out.println(str2.charAt(6));	//6. index yani 7. karakteri yazar.
	}

}
