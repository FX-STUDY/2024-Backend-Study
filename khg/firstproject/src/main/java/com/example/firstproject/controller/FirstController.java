package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Controller 선언@
public class FirstController {


    @GetMapping("/hi") // url 요철 연결 @
    public String niecToMeetYou(Model model){
        model.addAttribute("username", "권호규12");  // model이 view 전단한다 키: username 값: 권호규12
        return "greetings"; // templates/greetings.mustache -> 브라우저로 전송
    }


}
