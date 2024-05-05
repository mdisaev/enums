package enums.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import enums.WeekDay;

class WeekDayTest {

	@Test
	void testSwitchStatement() {
		String expected = "Weekend";
		assertEquals(expected, getDayDescriptionStatement(WeekDay.SAT));
	}
	
	@Test
	void testSwitchExpression() {
		String expected = "Working day";
		assertEquals(expected, getDayDescriptionSwitchExpression(WeekDay.MON));
	}

	
	private String getDayDescriptionStatement(WeekDay day) {
		String res  = "Working day";
		switch(day) {
		case SUN: res = "Weekend if you live not in Israel"; break;
		case FRI: res = "Weekend if you live in Israel"; break;
		case SAT: res = "Weekend"; break;
		default: break;
		}
		return res;
	}
	
	private String getDayDescriptionSwitchExpression(WeekDay day) {
		String res  = switch(day) {
		case SUN -> "Weekend if you live not in Israel";
		case SAT -> "Weekend if you live in Israel";
		case FRI -> "Weekend if you live in Israel";
		default -> "Working day"; 
		
		
		};
		return res;
	}


}
