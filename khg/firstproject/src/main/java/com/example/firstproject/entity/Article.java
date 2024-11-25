package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity // DB가 해당 객체를 인식 가능 @
public class Article {

    @Id  // 대표값을 지정 주민등록번호 처럼 @
    @GeneratedValue  //  1,2,3, ... 자동 생성 @
    private Long id;

    @Column  // DB에서 관린 되는 테이블 단위 @
    private String title;

    @Column
    private String content;


    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
