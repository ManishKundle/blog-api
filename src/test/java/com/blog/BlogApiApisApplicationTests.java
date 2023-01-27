package com.blog;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.blog.repositories.UserRepository;

@SpringBootTest
class BlogApiApisApplicationTests {

	@Autowired
	private UserRepository userRepository;

	private Calculator c = new Calculator();

	@Test
	@Disabled
	void contextLoads() {
	}

	@Test

	public void repoTest() {
		String className = this.userRepository.getClass().getName();
		String packageName = this.userRepository.getClass().getPackageName();
		System.out.println(packageName);
		System.out.println(className);
	}

	@Test
	void testSum() {

		// expected
		int expectedResult = 17;

		// actual
		int actualResult = c.doSum(12, 3, 2);

		assertThat(actualResult).isEqualTo(expectedResult);

	}

	@Test
	void testProduct() {
		// expected
		int expectedResult = 200;

		// actual
		int actualResult = c.doProduct(10, 20);

//		assertThat(actualResult).isEqualTo(expectedResult);
		assertEquals(expectedResult, actualResult);

	}

	@Test
	void testNums() {

		// actual
		Boolean actualResult = c.compareTwoNums(20, 20);

		assertThat(actualResult).isTrue();
	}

}
