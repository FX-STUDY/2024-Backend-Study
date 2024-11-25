package com.example.firstproject.controller;


import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @Autowired // 스프링 부트가 미리 생성해놓은 객체를 가져다가 연결 시켜주는 @
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create")  // post방식으로 폼데이터를 받는 @
    public String createArticle(ArticleForm form) { // form 에어 데이터를 받는 법 그 받은 객체는 dto

        System.out.println(form.toString());

        // 1. DTO를 변화 Entity
        Article article = form.toEntity();
        System.out.println(article.toString());



        // 2. Repository에게 Entitiy를 DB안에 저장하게 함!
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());

        return "";
    }

}
