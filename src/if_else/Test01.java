package if_else;

import java.util.Scanner;

public class Test01 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	String name, pass = null;
	int kor, math, eng, sum;
	float avg;
	
	System.out.print("이름: ");
	name= input.next();
	
	System.out.print("국어 점수: ");
	kor = input.nextInt();
	
	System.out.print("수학 점수: ");
	math = input.nextInt();
	
	System.out.print("영어 점수: ");
	eng = input.nextInt();
	
	sum = kor+math+eng;
	System.out.println("합계: "+sum);
	
	avg = sum / 3.0f;
	System.out.println("평균: "+avg);
	
	if (avg/10>=8)
		pass = "합격";
	if (avg/10<8)
		pass = "불합격";

	
	System.out.println("합격여부: " + pass);
}
}
