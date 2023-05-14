package p2;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int pos1 = sc.nextInt();
		int pos2 = sc.nextInt();
		int pos3 = sc.nextInt();
		int pos4 = sc.nextInt();
		
		System.out.println("pos1=" + pos1 + " pos2=" + pos2 + " pos3=" + pos3 + " pos4=" + pos4);
		
		//Left shift 
//		int temp = pos1;
//		pos1 = pos2 << 0;
//		pos2 = pos3 << 0;
//		pos3 = pos4 << 0;
//		pos4 = temp << 0;
//		System.out.println("pos1=" + pos1 + " pos2=" + pos2 + " pos3=" + pos3 + " pos4=" + pos4);
	
		
		//Right shift
		int temp1 = pos4;
		pos4 = pos3 >> 0;
		pos3 = pos2 >> 0;
		pos2 = pos1 >>0;
		pos1 = temp1 >> 0;
		
		
		
		System.out.println("pos1=" + pos1 + " pos2=" + pos2 + " pos3=" + pos3 + " pos4=" + pos4);
	}

}
