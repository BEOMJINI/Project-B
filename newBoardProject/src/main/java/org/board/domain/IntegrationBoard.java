package org.board.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class IntegrationBoard {
    //게시판 종류를 관리해주기 위한 클래스이다.
    //게시판 종류에 따라 추가/삭제 기능을 해주기 위한 클래스이다.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //PK

    private String categoryName; // 카테고리 이름

    private boolean check_Approval;


}
