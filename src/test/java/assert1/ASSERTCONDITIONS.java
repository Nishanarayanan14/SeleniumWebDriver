package assert1;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class ASSERTCONDITIONS {
  @Test(priority =0)
  public void Nisha() {
	  AssertJUnit.assertEquals("Akash", "Akash");
	  System.out.println("this is first case");
	  
  }
  
  @Test(priority=1, dependsOnMethods = "Nisha")
  public void Rocky() {
	  System.out.println("this is second class");
  }
  
  @Test(priority =2, dependsOnMethods = "Nisha")
  public void Anvika()
  {
	System.out.println("this is third class");  
  }
  
}
