package com.example.firstproject.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor // 디폴트 생성자를 추가해주는 @
@AllArgsConstructor
@ToString
@Entity // DB가 해당 객체를 인식 가능하게 하는 어노테이션
public class Article {

    @Id // 대표값을 지정 주민등록번호 처럼  entity는 대표값이 필요하다
    @GeneratedValue // 1, 2, 3, ... 자동 생성 어노테이션
    private Long  id;

    @Column // DB가 이해할수 있게 붙여줘야하는 어노테이션 테이블 단위 표시
    private String title;
    @Column private String content;


}
