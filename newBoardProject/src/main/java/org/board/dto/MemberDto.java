package org.board.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.board.domain.Role;

public class MemberDto {
    @Getter
    @Builder
    public static class join {
        private String userId;
        private String password;
        private String nickname;
    }
}
