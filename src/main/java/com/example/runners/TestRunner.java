package com.example.runners;

	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(tags="",features= {"src/newone.feature"},
	glue= {"stepdefination"},
	plugin= {"pretty","html:test/ganesh.html"},monochrome=true)

	public class TestRunner extends AbstractTestNGCucumberTests{



	}



