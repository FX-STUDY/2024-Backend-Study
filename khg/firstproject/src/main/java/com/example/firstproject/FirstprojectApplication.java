package com.example.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// 화면을 담당하는 View Templates
// View Templates을 도와주는 Controller: 처리, Model: 데이터
// MVC패턴

// 스프링은 자바를 사용하고 DB는 SQL이라는 언어를 사용한다
// JPA가 자바 언어를 DB가 이해하고 관리하게 해 준다
// 핵심도구로 Entity와 Repository가 있다
// Entity는 DTO를 BD가 이해할 수 있게 규격화 시켜준다
// Repository는 Entity를 DB에게 전달하고 처리함

// SQL 문법
// insert Create
// select Read
// update Update
// delete Delete

// 롬복을 통해 Refactoring과 logging
// Refactoring은 코드의 구조 성능을 개선하는 작업
// logging은 프로그램의 수행 과정을 기록을 남기는 거


@SpringBootApplication
public class FirstprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
	}

}
