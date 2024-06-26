package com.example.jpql.jpql;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

//@NamedQuery(
//        name = "Member.findByUsername",
//        query = "SELECT m FROM Member m WHERE m.username = :username"
//)
//@ToString
@Setter
@Getter
@Entity
public class Member {
    @Id
    @GeneratedValue
    private Long id;

    private String username;

    private int age;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEAM_ID")
    private Team team;

    @Enumerated(EnumType.STRING)
    private MemberType type;

    public void changeTeam(Team team) {
        this.team = team;
        team.getMembers().add(this);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
