package org.board.controller;

import lombok.RequiredArgsConstructor;
import org.board.domain.Member;
import org.board.domain.Role;


import org.board.dto.MemberDto;
import org.board.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/join")
    public String join(){
        return "member/join";
    }
    @PostMapping("/join")
    @ResponseBody
    public String save () {
        MemberDto.join memberDto = MemberDto.join.builder()
                .userId("2")
                .password("2")
                .nickname("2")
                .build();
        Member member = Member.ByMemberJoinBuilder()
                .nickname(memberDto.getNickname())
                .userId(memberDto.getUserId())
                .password(memberDto.getPassword())
                .role(Role.USER)
                .build();
        memberService.save(member);
        return member.getUserId() + "가입 축하";
    }
}
