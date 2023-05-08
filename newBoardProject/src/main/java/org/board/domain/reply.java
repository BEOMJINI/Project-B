package org.board.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class reply {

    @Id
    private Long id;

    private String writer; //작성자
    private Long seq; //댓글 순번
    private int depth; //댓글 깊이 (대댓글 판단.)

    private String contents; //댓글내용
    }
