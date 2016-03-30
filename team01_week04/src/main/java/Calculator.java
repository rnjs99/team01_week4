package team01.week04;

import java.util.Scanner;

public class Calculator {
	String[] raw_type;
	int grade, time, line;
	public int money(){
		if(grade==1){//gold
		
		}
		else if(grade==2){//silver
			
		}
		return 0;
	}
	
	public String result(){
		if(money()==0)
			return "잘못된 값을 입력하셨습니다.";
		else
			return "금액은 $"+money()+" 입니다.";
	}
	public static void main(String[] args){
		Calculator cal = new Calculator();
		Scanner gradesc = new Scanner(System.in);
		Scanner timesc = new Scanner(System.in);
		System.out.print("등급을 입력하세요 : Gold(1), Silver(2) : ");
		cal.grade = gradesc.nextInt();
		System.out.print("통화 시간을 적어주세요(분) : ");
		cal.time = timesc.nextInt();
		System.out.print("통화 시간을 적어주세요(분) : ");
		cal.time = timesc.nextInt();
		cal.timesc = next. 
	}
}
