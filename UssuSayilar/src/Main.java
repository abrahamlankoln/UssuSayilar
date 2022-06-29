import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n,k,total=1;
		Scanner deger = new Scanner(System.in);
		
		System.out.print("ussu alinacak sayiyi giriniz: ");
		n=deger.nextInt();
		System.out.print("ussu kac olmali: ");
		k=deger.nextInt();
		for(int i=1;i<=k;i++) {
			total=n*total;
		}
		System.out.println("sonucunuz: "+total);
	}

}
