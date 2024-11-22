package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

// CrudRepository 2개의 매개변수가 필요 관리대상, 대표값의 타입
// Article의 crud동작을 확장받아 사용할 수 있다
public interface ArticleRepository extends CrudRepository<Article, Long> {

}
