package DriverFactory;

import org.testng.annotations.Test;

public class AppTest {
  @Test
  public void f() throws Exception {
	  DriverScript dr=new DriverScript();
	  dr.startTest();
  }
}
