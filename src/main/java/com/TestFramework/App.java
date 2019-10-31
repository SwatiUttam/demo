package com.TestFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App {
	@BeforeSuite
	public void setUp() {
		System.out.println("@BeforeSuite");
	}

	@BeforeTest
	public void login() {
		System.out.println("@BeforeTest");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("@BeforeClass");
	}

	@BeforeMethod
	public void enterURl() {
		System.out.println("@BeforeMethod");
	}

	@Test
	public void singletest() {
		System.out.println("singletest");
	}
		
	@AfterMethod
	public void checkURL() {
		System.out.println("@AfterMethod");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("@AfterClass");
	}

	@AfterTest
	public void logout() {
		System.out.println("@AfterTest");
	}

	@AfterSuite
	public void breakUp() {
		System.out.println("@AfterSuite");
	}

}
