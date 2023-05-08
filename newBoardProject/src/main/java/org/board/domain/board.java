package org.board.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_num")
    private Long id; //게시글 순번

    private String writer ; //작성자

    private String name; //작성자닉네임

    private String title; // 제목

    @Lob
    private String contents; // 내용

    private Date date;//작성날짜

    private int read; //조회수

}
