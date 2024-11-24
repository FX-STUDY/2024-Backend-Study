package com.example.firstproject.controller;


import com.example.firstproject.dto.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create")  // post방식으로 폼데이터를 받는 @
    public String createArticle(ArticleForm form) { // form 에어 데이터를 받는 법 그 받은 객체는 dto

        System.out.println(form.toString());

        return "";
    }

}
