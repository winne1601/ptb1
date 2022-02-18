import java.util.Scanner;
public class Ptbac1 {
public static void main(String[]args) {
  try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a");
		Double a=sc.nextDouble();
		System.out.println("Nhap b");
		Double b=sc.nexDouble();
	}catch (Exception e) {System.out.println("nhap khong dung");
}
  if (a==0) {
  if (b==0) {
		System.out.println("Pt vo so nghiem");
} else {
		System.out.println("Pt vo nghiem");
}
} else {
		x=-b/a 
		System.out.println("Phuongtrinh co nghiem:"+x);	
}
}