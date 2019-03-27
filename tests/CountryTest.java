package tests;

import org.junit.Test;
import main.Country;
import static org.junit.Assert.*;



@Before
public class CountryTest {

@Test

public void setUp() {
	country countries[]=new countries[4];
        countries[0]=new Country("India",245654563,54555);
	countries[1]=new Country("UK",575624453,556463);
	countries[2]=new Country("Australia",48621489,245645);
	countries[3]=new Country("Pakistan",4245531549,54564);
}

@Test



public void testFindCountryWithLargestArea()
{

  Country expectedOutput=newCountry("UK",575624453,556463);
  Country actualOutput=new Country().countryWithThelargestArea(country)
  assertEquals(expectedOutput.getName(),actualOutput.getName());
  assertEquals(expectedOutput.getArea(),actualOutput.getArea());
assertEquals(expectedOutput.getPopulation(),actualOutput.getPopulation());




}
}

