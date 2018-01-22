package dataprovider;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
  @Parameters({"suite-level-param"})	
  @Test
  public void firstTest(String param) {
	  System.out.println(param);
  }
  
  @Parameters({"test-level-param"})	
  @Test
  public void secondTest(String param) {
	  System.out.println(param);
  }
  
  @Parameters({"suite-level-param", "test-level-param1"})	
  @Test
  public void thirdTest(String suiteparam, String testParam) {
	  System.out.println(suiteparam+" **** "+testParam);
  }
  
  
}
