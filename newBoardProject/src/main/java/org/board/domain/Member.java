package org.board.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {

    @Id
    Long id; //멤버 pk

    String userId;

    int pw;

    Enum Role;

}
