package com.example.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// localhost: 현재 자신의 컴퓨터를 가리키는 특별한 이름입니다.
//	•	네트워크를 통해 외부 컴퓨터와 통신하는 대신, 자신의 컴퓨터에서 실행 중인 서비스를 직접 호출합니다.
// 8080 포트번호 서버는 여러 서비스(프로그램)를 동시에 실행할 수 있기 때문에 각 서비스는 고유한 포트 번호를 사용합니다.


@SpringBootApplication
public class FirstprojectApplication {

	public static void main(String[] args) {

		SpringApplication.run(FirstprojectApplication.class, args);
	}

}
