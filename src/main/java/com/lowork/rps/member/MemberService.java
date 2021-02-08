package com.lowork.rps.member;

import com.lowork.rps.message.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MemberService {

    @Autowired
    private MemberRepo memberRepo;

    public List<Member> getAllMembers() {
        return memberRepo.findAll();
    }

    public Member createMember(@RequestBody Member member) {
        return memberRepo.save(member);
    }

    public ResponseEntity<Member> getMemberById(@PathVariable Long id) {
        Member member = memberRepo.findById(id)
                .orElseThrow( () -> new ResourceNotFoundException("Member not exist with id :" + id));
        return ResponseEntity.ok(member);
    }

    public ResponseEntity<Member> updateMember(@PathVariable Long id, @RequestBody Member memberDetails) {
        Member member = memberRepo.findById(id)
                .orElseThrow( () -> new ResourceNotFoundException("Member not exist with id :" + id));

        member.setFirstName(memberDetails.getFirstName());
        member.setLastName(memberDetails.getLastName());
        member.setAddress(memberDetails.getAddress());

        Member updatedMember = memberRepo.save(member);
        return ResponseEntity.ok(updatedMember);
    }

    public ResponseEntity <Map<String, Boolean>> deleteMember(@PathVariable Long id) {
        Member member = memberRepo.findById(id)
                .orElseThrow( () -> new ResourceNotFoundException("Member not exist with id :" + id));

        memberRepo.delete(member);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}
