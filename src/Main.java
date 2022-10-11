import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner intscanner = new Scanner(System.in);
	int sayi,nsayi,kalan,sum=0;
	System.out.println("Sayıyı giriniz: ");
	sayi = intscanner.nextInt();

	while(sayi!=0){
	    nsayi = sayi/10;
	    kalan = sayi%10;
	    sayi=nsayi;
	    sum = sum + kalan;
    }
	if(sum<0){sum=sum*-1;}
	System.out.println("Girilen sayının basamakları toplamı: "+sum);

    }
}
