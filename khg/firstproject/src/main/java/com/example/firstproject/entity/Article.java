package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor   // 디폴트 생성자 추가
@Entity // DB가 해당 객체를 인식 가능 @
@AllArgsConstructor  // 생성자 @
@ToString  // ToString @
@Getter // 모든 Getter @
public class Article {

    @Id  // 대표값을 지정 주민등록번호 처럼 @
    @GeneratedValue  //  1,2,3, ... 자동 생성 @
    private Long id;

    @Column  // DB에서 관린 되는 테이블 단위 @
    private String title;

    @Column
    private String content;

}
