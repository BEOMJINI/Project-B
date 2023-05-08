package org.board.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //댓글 PK

    private String writer; //작성자

    private Long seq; //댓글 순번

    private int depth; //댓글 깊이 (대댓글 판단.)

    private String contents; //댓글내용

    @ManyToOne(fetch = FetchType.LAZY) //하나의 게시글에 여러개의 답변
    @JoinColumn(name = "board_num")
    @JsonIgnore //stackoverflow 방지
    private Board board;

    }
