package com.example.firstproject.controller;


import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
@Slf4j  // 로깅을 위한 골뱅이 @
public class ArticleController {

    @Autowired // 스프링 부트가 미리 생성해놓은 객체를 가져다가 연결 시켜주는 @
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create")  // post방식으로 폼데이터를 받는 @
    public String createArticle(ArticleForm form) { // form 에어 데이터를 받는 법 그 받은 객체는 dto
        log.info(form.toString());

        //System.out.println(form.toString());  -> 로깅기능으로 대체!




        // 1. DTO를 변화 Entity
        Article article = form.toEntity();
        //System.out.println(article.toString());
        log.info(article.toString());


        // 2. Repository에게 Entitiy를 DB안에 저장하게 함!
        Article saved = articleRepository.save(article);
        //System.out.println(saved.toString());
        log.info(saved.toString());

        return "";
    }

    @GetMapping("/articles/{id}") // id위치는 변하는 수다
    public String show(@PathVariable Long id, Model model){ // url주소로부터 데이터 받는 @
        log.info("id = " + id);

        // 1: id로 데이터를 가져옴
        Article articleEntity = articleRepository.findById(id).orElse(null); // repository를 통해 id값을 통해 데이터 조회


        // 2: 가져온 데이터를 모델에 등록!
        model.addAttribute("article", articleEntity);

        // 3: 보여줄 페이지를 설정!
        return "articles/show";
    }

    @GetMapping("/articles")
    public String index(Model model) {
        // 1: 모든 Article을 가져온다!
        List<Article> articleEntityList = articleRepository.findAll();
        // 2: 가져온 Article 묶을을 뷰로 전달!
        model.addAttribute("articleList", articleEntityList);
        // 3: 뷰 페이지를 설정!
        return "articles/index";  // articles/index.mustache
    }

}
