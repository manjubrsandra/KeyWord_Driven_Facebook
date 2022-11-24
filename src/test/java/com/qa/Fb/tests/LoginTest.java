package com.qa.Fb.tests;

import org.testng.annotations.Test;

import com.qa.Fb.Keyword.engine.KeyWordEngine;

public class LoginTest {
	
	public KeyWordEngine keyWordEngine;
	
	
	@Test
	public void loginTest() {
		
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("Sheet1");
		
	}

}
