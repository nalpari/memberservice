package net.nalpari.memberservice.repository;

import net.nalpari.memberservice.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    public Member findMemberByUserIdAndUserPw(String userid, String userPw);
}
