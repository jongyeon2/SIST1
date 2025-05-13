package am;

import java.util.Scanner;

public class Ex2_Main {

	public static void main(String[] args) {
//		Ex2_pet 객체 생성 
		Ex2_Pet p1 = new Ex2_Pet(); // pet 인스턴스 생성 
		
		String p1_name = p1.getName();
		int p1_age = p1.getAge();
		System.out.printf("Name:%s, Age:%d", p1_name, p1_age);
		
		p1.setName("포동이");
		p1.setAge(2);
		p1_name = p1.getName();
		p1_age = p1.getAge();
		
		System.out.printf("p1:Name:%s, Age:%2d ", p1_name, p1_age);
		
		Ex2_Pet p2 = new Ex2_Pet(); // 새로운 객체 생성 
		
		p2.setName("바둑이");
		p2.setAge(5);
		String name = p2.getName(); // 바둑이
		int age = p2.getAge();	// 5
		System.out.printf("p2:Name:%s, Age:%2d ", name, age);

	}

}
