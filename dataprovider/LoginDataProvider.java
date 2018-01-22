package dataprovider;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {
	
@DataProvider (name="login")
public static Object [][] getDataFromDataProvider() {
	  
	  return new Object[][]{
		  {"raselualam","BlahBlah", "Md Rasel U Alam"},
		  {"raselulalam","BlahBlah", "Md Rasel U Alam"},
		  {"raselualam","BlahBlah", "Md Rasel U Alam"}
	  
	  };
  }
}