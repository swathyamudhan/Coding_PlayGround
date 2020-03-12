package com.codingbat.warmup;

@org.testng.annotations.Test
public class RegexFunctionTest {

	public void Test() {
		String str = "Hello world";
		Boolean flag = false;
		String[] sp = str.split("\\s+");
		for (int i = 0; i < sp.length; i++) {
			System.out.println(sp[i]);
			if (sp[0].equals("Hello")) {
				flag = true;
			} else {
				flag = false;
			}
		}
		System.out.println(flag);
	}
}
