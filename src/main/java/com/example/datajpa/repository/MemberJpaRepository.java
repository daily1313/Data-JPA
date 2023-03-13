package com.example.datajpa.repository;

import com.example.datajpa.entity.Member;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberJpaRepository {

    // 스프링 컨테이너가 JPA에 있는 EntityManager를 만들어서 빈으로 등록해줌
    @PersistenceContext
    private EntityManager em;

    public Member save(Member member) {
        em.persist(member);
        return member;
    }

    public Member find(Long id) {
        return em.find(Member.class, id);
    }



}
