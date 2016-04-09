package team01.week04;

import static org.junit.Assert.*;
import org.junit.Test;
import team01.week04.Calculator;

public class Testing {

	@Test
	public void testMoneyGold(){
		Calculator cal6 = new Calculator();//assertEquals(a,b)
		cal6.grade = 1;
		cal6.line = 1;
		cal6.time = 999;
		assertTrue(cal6.money() == 49.95);
	}
	
	@Test
	public void testMoneySilver(){
		Calculator cal6 = new Calculator();//assertEquals(a,b)
		cal6.grade = 2;
		cal6.line = 1;
		cal6.time = 499;
		assertTrue(cal6.money() == 29.95);
	}
	
	@Test
	public void testMoneyOthers(){
		Calculator cal6 = new Calculator();//assertEquals(a,b)
		cal6.grade = 3;
		cal6.line = 1;
		cal6.time = 878;
		assertTrue(cal6.money() == 0);
	}
	
	@Test
	public void testaddline(){
		Calculator cal1 = new Calculator(); //assertEquals(a,b)
		cal1.line = 5;
		assertEquals(cal1.addline(),2);
	}

	@Test
	public void testcalline(){ // 회선으로만 추가되는 요금 test
		Calculator cal2 = new Calculator();//assertEquals(a,b)
		cal2.grade = 1;
		cal2.line = 4;
		assertTrue(cal2.calline()==34);
	}
	
	@Test
	public void testcalminute(){
		Calculator cal3 = new Calculator();//assertEquals(a,b)
		cal3.grade = 1;
		cal3.time = 878;
		assertTrue((cal3.calminute()-49.95)<0.1&&(cal3.calminute()-49.95)>=0);
	}

	@Test
	public void testmoney(){		
		Calculator cal4 = new Calculator();//assertEquals(a,b)
		cal4.grade = 2;
		cal4.line = 2;
		cal4.time = 523;
		int temp = (int)cal4.money();
		assertTrue(temp==63);
	}
}
