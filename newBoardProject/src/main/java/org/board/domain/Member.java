package org.board.domain;

import lombok.*;
import org.springframework.util.Assert;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    private Long id; //멤버 pk
    @NotNull
    @Column(length = 20, unique = true)
    private String userId;
    @NotNull
    @Column(length = 20)
    private String password;
    @NotNull
    @Column(length = 10, unique = true)
    private String nickname;
    @NotNull
    private Role role;

    @Builder(builderClassName = "ByMemberJoinBuilder", builderMethodName = "ByMemberJoinBuilder")
    public Member(String userId, String password, String nickname, Role role){
        Assert.hasText(userId, "userId must not be empty");
        Assert.hasText(password,"password must not be empty");
        Assert.hasText(nickname, "nickname must not be empty");
        Assert.notNull(role,"role must not be null");
        Assert.notNull(role,"role must not be empty");

        this.userId = userId;
        this.password = password;
        this.nickname = nickname;
        this.role = role;
    }

}
