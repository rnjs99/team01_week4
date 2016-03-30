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
		Loginfo.info("등급을 입력하세요 : Gold(1), Silver(2) : ");
		cal.grade = gradesc.nextInt();
		Loginfo.info("통화 시간을 적어주세요(분) : ");
		cal.time = timesc.nextInt();
		Loginfo.info("회선 개수를 적어주세요 : ");
		cal.line = linesc.nextInt();
		Loginfo.info(cal.result());
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
	public void testcalminute(){
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
