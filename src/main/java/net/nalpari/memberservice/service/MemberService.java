package net.nalpari.memberservice.service;

import lombok.RequiredArgsConstructor;
import net.nalpari.memberservice.entity.Member;
import net.nalpari.memberservice.repository.MemberRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository repository;

    public Page<Member> getListAll(Pageable pageable) throws Exception {
        return repository.findAll(pageable);
    }

    public Member getMember(long id) throws Exception {
        return repository.getOne(id);
    }

    public Member getMember(String userId, String userPw) throws Exception {
        return repository.findMemberByUserIdAndUserPw(userId, userPw);
    }

    public Member insert(Member member) throws Exception {
        return repository.save(member);
    }
}
