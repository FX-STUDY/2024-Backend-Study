package com.example.firstproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


// Create: 쓰고
// Read: 보고
// Update: 바꾸고
// Delete: 삭제


// form 태그에 어디로보낼지 어떻게 보낼지 명시해야 한다
// Controller객체에 담아 받고 그 form 데이터의 객체를 DTO라고 부른다
// Database는 데이터를 관리하는 창고이다 줄여서 DB라고 한다 종류로는 MySQL,Oracle,Postgres,H2
// DB에 데이터 기록하려면
// DB는 자바를 모른다 스프링 부트는 자바를 사용하고 DB는 SQL이라는 언어를 사용
// JPA 자바언어를 DB가 이해하게 해주고 데이터 관리에 필요한 여러 기능도 해준다
// JPA 핵심도구로는 Entity와 Repository가 있다
// Entity는 자바객체를 DB가 이해할수 있게 잘 규격화 된 데이터
// Repository는 Entity를 DB에 전달, 또는 처리




@Controller // controller 선언 어노테이션
public class FirstController {

    // 화면을 당당하는 view Templates cnotroller, Model 활용해서 MVC패턴

    @GetMapping("/hi") // 접속할 url 주소
    public String niceToMeetYou(Model model){
        // model이라는 객체가 Key로 Value를전달
        model.addAttribute("username", "권호규11");
        return "greetings"; // templates/greetings.mustache -> 브라우저로 전송
    }
}



