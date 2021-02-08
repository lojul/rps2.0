package com.lowork.rps.member;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="member")
@Getter @Setter @NoArgsConstructor
public class Member {

    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private String firstName;
    private String lastName;
    private String address;

    public Member(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
}
