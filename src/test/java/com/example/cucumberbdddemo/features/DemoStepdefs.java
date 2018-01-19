package com.example.cucumberbdddemo.features;


import com.example.cucumberbdddemo.BeanDefine;
import com.example.cucumberbdddemo.CucumberBddDemoApplication;
import com.example.cucumberbdddemo.Welcome;
import com.example.cucumberbdddemo.bean.Postbox;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.spring.ScopeRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {CucumberBddDemoApplication.class, ScopeRegister.class, BeanDefine.class})
public class DemoStepdefs {
    @Autowired
    Welcome welcome;
    @Autowired
    Postbox postbox;

    String rec;

    @Given("^新加入同事邮箱'(?<recip>[^']+)'$")
    public void given(String recip) {
        this.rec = recip;
    }

    @When("^系统发送邮件'(?<title>[^']+)','(?<content>[^']+)'$")
    public void 系统发送邮件TitleContent(String title, String content) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        welcome.sayHello(rec, title, content);
    }

    @Then("^新加入同事收到邮件,内容为'(?<content>[^']+)'$")
    public void 新加入同事收到邮件内容为Content(String content) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assert postbox.hasEmail(rec);
        assert postbox.size() == 1;
    }
}
