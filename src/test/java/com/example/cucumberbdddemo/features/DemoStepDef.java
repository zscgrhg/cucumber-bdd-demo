package com.example.cucumberbdddemo.features;

import com.example.cucumberbdddemo.CucumberBddDemoApplication;
import cucumber.runtime.java.spring.ScopeRegister;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {CucumberBddDemoApplication.class, ScopeRegister.class})
public class DemoStepDef {
}
