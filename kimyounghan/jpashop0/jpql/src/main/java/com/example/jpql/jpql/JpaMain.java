package com.example.jpql.jpql;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.Collection;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        try {
            Team team1 = new Team();
            team1.setName("팀1");

            em.persist(team1);

            em.persist(team);
            Team team2 = new Team();
            team2.setName("팀2");
            em.persist(team2);

            Member member1 = new Member();
            member1.setUsername("회원1");
            member1.setTeam(team1);

            em.persist(member1);

            Member member2 = new Member();
            member2.setUsername("회원2");
            member2.setTeam(team1);

            em.persist(member2);

            Member member3 = new Member();
            member3.setUsername("회원3");
            member3.setTeam(team2);

            em.persist(member3);

            em.flush();
            em.clear();

//            String query = "SELECT DISTINCT t FROM Team t JOIN FETCH t.members";
            String query = "SELECT DISTINCT t FROM Team t JOIN t.members m";
            List<Team> result = em.createQuery(query, Team.class).getResultList();
            for (Team team : result) {
                System.out.println("team.name = " + team.getName() + " | " + "member.size = " + team.getMembers().size());
                for (Member member : team.getMembers()) {
                    System.out.println("member = " + member);
                }
            }

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }

        emf.close();
    }
}
