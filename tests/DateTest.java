package tests;

import org.junit.Test;
import main.Date;
import java.time.*;
import static org.junit.Assert.*;

public class DateTest {
	
	Date date=new Date(20,9,1996);

	@Test
	public void testDateAsString()
	{
		assertEquals(20/9/1996,date.dateAsString());

	}


}












