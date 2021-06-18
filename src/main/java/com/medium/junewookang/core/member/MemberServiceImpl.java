package com.medium.junewookang.core.member;

public class MemberServiceImpl implements MemberService{ // 서비스와 리포지토리를 이어주는 클래스. 어떤 서비스에서 어떤 리포지토리 함수를 실행해라~

    private final MemberRepository memberRepository; // 리포지토리가 뭐가 들어오든 신경쓰지 않음. 뭐랄까.. 되게 잘 추상화된 느낌이다.

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
