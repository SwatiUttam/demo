package com.Parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterCheck {

	@Test
	@Parameters({ "sUsername", "sPassword" })
	public void test(String sUsername, String sPassword) {
		System.out.println(sUsername);
		System.out.println(sPassword);
	}
}
