package org.board.dto;

import lombok.Data;
import org.board.domain.Role;

@Data
public class MemberDto {
    private Long id;
    private String userId;
    private String password;
    private String nickname;
    private Role role;
}
