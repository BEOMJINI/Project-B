package org.board.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;


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

    @CreationTimestamp //값이 입력될때 혹은 업데이트될때 자동으로 시간이 들어간다.
    private Timestamp createDate;

    }
