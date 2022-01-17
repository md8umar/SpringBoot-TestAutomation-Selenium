package com.example.springbasic;

import com.example.springbasic.pages.HomePage;
import com.example.springbasic.pages.LoginPage;
import org.assertj.core.api.junit.jupiter.InjectSoftAssertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

@SpringBootTest
class SpringbasicApplicationTests {

	@Autowired
	private LoginPage loginpage;

	@Autowired
	private HomePage homePage;
	@Autowired WebDriver driver;
	@Value("${app.url}")
	private String env;
	@Value("chrome,firefox,edge")
	private List<String> browsers;
	@Test
	void performLoginTest() {
		System.out.println("Welcome to Spring world");
		driver.get(env);
		//System.out.println(env);
		loginpage.dologin();
		browsers.forEach(System.out::println);
	}

}
