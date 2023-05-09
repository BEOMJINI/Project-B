package org.board.domain;


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

    private String category_Name; // 카테고리 이름

    private boolean check_Approval; // 게시판 사용 승인

    public IntegrationBoard(String category_Name){
        this.category_Name = category_Name;
        check_Approval = false;
    }


}
