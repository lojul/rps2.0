package com.lowork.rps.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class MemberController {

    @Autowired
    MemberService memberService;

    @GetMapping("members")
    private List<Member> GetAllMembers() {
        return memberService.getAllMembers();
    };

    @PostMapping("members")
    private Member CreateMember(@RequestBody Member member) {
        return memberService.createMember(member);
    }

    @GetMapping("members/{id}")
    private ResponseEntity<Member> getMemberById(@PathVariable Long id) {
        return memberService.getMemberById(id);
    }

    @PutMapping("members/{id}")
    private ResponseEntity<Member> updateMember(@PathVariable Long id, @RequestBody Member memberDetails) {
        return memberService.updateMember(id, memberDetails);
    }

    @DeleteMapping("members/{id}")
    private ResponseEntity<Map<String, Boolean>> deleteMember(@PathVariable Long id) {
        return memberService.deleteMember(id);
    }
}
