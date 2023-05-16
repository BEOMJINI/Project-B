package org.board.service;


import lombok.RequiredArgsConstructor;
import org.board.domain.Member;
import org.board.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void test (Member member){
        memberRepository.save(member);
    }

}
