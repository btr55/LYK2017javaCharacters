package tr.org.linux.kamp.karaklerler;

import java.util.Random;

public class Karakterler {


	public static void main(String[] args) {
		char a=97;	//ASCII kod karşılığı a=97
		System.out.println(a);
		
		System.out.println(97); //direkt olarak 97 yazar. int değer.
		System.out.println((char)97); //char tipine casting yaptık. a yazar.
		System.out.println('a'+1); //98 yazar. çünkü karakteri int e cast etti.
		
		//Character sınıfı özellikleri
		System.out.println(Character.toUpperCase('a')); //Character sınıfından harfi büyüten metodu
		System.out.println(Character.isJavaLetter('b'));//true ya da false değer döndürür.
		
		Random rnd= new Random();		//random sınıfından rnd nesnesi oluşturduk.
		char x =(char)(rnd.nextInt(26)+'A');	//x isimli char değişken içine 0-26 arasından rastgele
												//int değer atadık. üstüne A nın ASCIIsini ekledik.
		System.out.println(x);			//ekrana S yazdı. her seferinde değişir.
		
		//random karakter yapmak için random generator ile integer türetip char a cast etmek gerek.
		
		
	}
}
