package kr.co.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyApplication {

	public static void main(String[] args) {
		System.out.println("시스템 스터디");
		SpringApplication.run(StudyApplication.class, args);
	}

}
