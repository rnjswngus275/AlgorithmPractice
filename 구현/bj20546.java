import java.util.Scanner;
public class bj20546 {

	static int start;
	static int[] arr;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start = scan.nextInt();
		arr = new int[14];
		for(int i=0;i<14;i++) {
			arr[i]=scan.nextInt();
		}
		int jun = jun();
		int sung = sung();
//		System.out.println(jun+ "  "+sung);

		if(jun>sung) {
			System.out.println("BNP");
		}else if(sung>jun) {
			System.out.println("TIMING");
		}else {
			System.out.println("SAMESAME");
		}
		
	}
	public static int jun() {
		int nowCash = start;
		int nowStock = 0;
		for(int i=0;i<14;i++) {
			int price = arr[i];
			nowStock+=(nowCash/price);
			nowCash = nowCash%price;
		}
		return nowCash+(nowStock*arr[13]);
	}
	public static int sung() {
		int nowCash = start;
		int nowStock = 0;
		int prevPrice = arr[0];
		int up = 0;
		int down = 0;
		for(int i=0;i<14;i++) {
			int price = arr[i];
			if(prevPrice<price) {
				up++;
				down = 0;
			}else if(price<prevPrice) {
				down++;
				up = 0;
			}else {
				down = 0;
				up = 0;
			}
			prevPrice = price;
			
			if(up >= 3) {
				nowCash += (nowStock*price);
				nowStock =0;
			}
			if(down >= 3) {
				nowStock+=(nowCash/price);
				nowCash = nowCash%price;
			}
//			System.out.println(i+1+"일차 "+nowCash +" "+ nowStock);
		}
		return nowCash+(nowStock*arr[13]);
	}

}
