package net.nalpari.memberservice.controller;

import lombok.RequiredArgsConstructor;
import net.nalpari.memberservice.entity.Member;
import net.nalpari.memberservice.service.MemberService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService service;

    @PostMapping("/login")
    public HashMap<String, Object> login(Member param) throws Exception {
        Member member = service.getMember(param.getUserId(), param.getUserPw());
        HashMap<String, Object> result = new HashMap<>();
        result.put("userId", member.getUserId());

        return result;
    }

    @PostMapping("/regist")
    public Member regist(Member param) throws Exception {
        return service.insert(param);
    }
}
