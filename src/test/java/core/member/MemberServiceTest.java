package core.member;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();

    @Test
    public void join() throws Exception {
        // given
        Member member = new Member(1L, "memberA", Grade.VIP);


        // when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        // then
        assertThat(member).isEqualTo(findMember);

    }
}
