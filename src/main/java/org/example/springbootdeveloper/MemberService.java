package org.example.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    public void test() {
        // 생성 (Create)
        memberRepository.save(new Member(1L, "A"));

        // 조회 (Read)
        Optional<Member> member = memberRepository.findById(1L); // 단건 조회
        List<Member> allMembers = memberRepository.findAll();    // 전체 조회

        // 삭제 (Delete)
        memberRepository.deleteById(1L);
    }
}
