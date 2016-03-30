package team01.week04;

import java.util.Scanner;

public class Calculator {
	String[] RawType;
	int grade;
	int time;
	int line;

	public double money() {
		if (grade == 1) {// gold
			return cal_line() + cal_minute();
		} else if (grade == 2) {// silver
			return cal_line() + cal_minute();
		}
		return 0;
	}

	public int AddMinute() {
		if (grade == 1) { // gold
			return (time - 1000 >= 0 ? time - 1000 : -1);
		} else if (grade == 2) { // silver
			return (time - 500 >= 0 ? time - 500 : -1);
		} else {
			return -100;
		}
	}

	public double cal_minute() {
		if (AddMinute() == -1 && grade == 1) // gold, 珥덇낵�븯吏� �븡�쓬
			return 49.95;
		else if (AddMinute() == -1 && grade == 2) // silver, 珥덇낵�븯吏� �븡�쓬
			return 29.95;
		else if (grade == 1) { // gold
			return 49.95 + AddMinute() * 0.45;
		} else if (grade == 2) {
			return 29.95 + AddMinute() * 0.54;
		} else {
			return -1;
		}
	}

	public int add_line() {
		if (line - 3 < 0) {
			return -1;
		} else {
			return line - 3;
		}
	}

	public double cal_line() {
		if (line == 1) {
			return 0;
		} else if (add_line() < 0 && grade == 1) { // gold 洹몃깷 異붽��슂湲�
			return 14.5 * (line - 1);
		} else if (add_line() < 0 && grade == 2) { // silver 洹몃깷 異붽��슂湲�
			return 21.5 * (line - 1);
		}
		if (add_line() >= 0 && grade == 1) { // gold & 媛�議깊븷�씤 0
			return 14.5 * 2 + add_line() * 5;
		}
		if (add_line() >= 0 && grade == 2) { // silver & 媛�議깊븷�씤 0
			return 21.5 * 2 + add_line() * 5;
		} else {
			return -1;
		}
	}

	public String result() {
		if (money() == 0)
			return "�옒紐삳맂 媛믪쓣 �엯�젰�븯�뀲�뒿�땲�떎.";
		else {
			String str = String.format("%.2f", money());
			return "湲덉븸�� $" + str + " �엯�땲�떎.";
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		while (true) {
			Calculator cal = new Calculator();
			Scanner gradesc = new Scanner(System.in);
			Scanner timesc = new Scanner(System.in);
			Scanner linesc = new Scanner(System.in);
			Scanner yn = new Scanner(System.in);
			String question;
			System.out.print("�벑湲됱쓣 �엯�젰�븯�꽭�슂 : Gold(1), Silver(2) : ");
			cal.grade = gradesc.nextInt();
			System.out.print("�넻�솕 �떆媛꾩쓣 �쟻�뼱二쇱꽭�슂(遺�) : ");
			cal.time = timesc.nextInt();
			System.out.print("�쉶�꽑 媛쒖닔瑜� �쟻�뼱二쇱꽭�슂 : ");
			cal.line = linesc.nextInt();
			System.out.println(cal.result());
			System.out.print("怨꾩냽 吏꾪뻾�븯�떆寃좎뒿�땲源�?(y/n) : ");
			question = yn.next();
			if (question.equals("n")) {
				break;
			} else {
				System.out.println();
				continue;
			}
		}
	}
}
