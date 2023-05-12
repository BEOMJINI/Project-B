package org.board.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {

    @Id
    private Long id; //멤버 pk

    private String userId;

    private int pw;

    private Enum Role;

}
