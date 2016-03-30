package team01.week04;

import static org.junit.Assert.*;
import org.junit.Test;
import team01_week04.Calculator;


public class Testing {
	@Before
	public void createCalculator(){
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
	}
	@Test
	public void testaddine(){
		//assertEquals(a,b)
	}
	@Test
	public void testcalline(){
		//assertEquals(a,b)
	}
	@Test
	public void testcal_minute(){
		//assertEquals(a,b)
	}

	@Test
	public void testmoney(){		
		//assertEquals(a,b)
	}
	@Test
	public void testresult(){		
		//assertEquals(a,b)
	}
}
