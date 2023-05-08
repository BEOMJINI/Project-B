package org.board.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Reply {

    @Id
    private Long id; //댓글 PK

    private String writer; //작성자

    private Long seq; //댓글 순번

    private int depth; //댓글 깊이 (대댓글 판단.)

    private String contents; //댓글내용

    @ManyToOne //하나의 게시글에 여러개의 답변
    @JoinColumn(name = "board_num")
    private Board board;

    }
