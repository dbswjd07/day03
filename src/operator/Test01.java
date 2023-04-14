package operator;

import java.util.Scanner;

public class Test01 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int num1, num2;
	String su;
	
	System.out.print("수 입력: ");
	num1 = input.nextInt();
	
	su = (num1%2==0)? "짝수" :"홀수";
	System.out.println(num1+" = "+su);
	su = (num1%3!=0) ? "3의 배수가 아니다":"3의 배수다";
	System.out.println(num1+" = "+su);
	
	System.out.print("두 수 입력: ");
	num1 = input.nextInt();
	num2 = input.nextInt();
	System.out.println("num1: "+num1+", num2: "+num2);
	
	su = (num1>num2)? "num1은 num2보다 크다":"num2는 num1보다 크다";
	System.out.println(su);
}
}
