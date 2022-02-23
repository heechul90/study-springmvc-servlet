package study.springmvc.servlet.web.frontController.v4.controller;

import study.springmvc.servlet.domain.member.Member;
import study.springmvc.servlet.domain.member.MemberRepository;
import study.springmvc.servlet.web.frontController.v4.ControllerV4;

import java.util.Map;

public class MemberSaveControllerV4 implements ControllerV4 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {

        String username = paramMap.get("username");
        int age = Integer.parseInt(paramMap.get("age"));

        Member member = new Member(username, age);
        memberRepository.save(member);

        model.put("member", member);
        return "save-result";
    }
}
