package test.java;

import org.junit.Test;

import main.java.FCMMain;

public class FCMTest {
	
	FCMMain main = new FCMMain();
	
	@Test
	public void TestFailureCauseMgmt() {
		main.addListElement();
		main.getList().get(2);
	}

}
