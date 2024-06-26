package com.example.springjdbc.service;

import com.example.springjdbc.domain.Member;
import com.example.springjdbc.repository.MemberRepositoryV2;
import com.example.springjdbc.repository.MemberRepositoryV3;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 트랜잭션 - 트랜잭션 매니저
 */
@Slf4j
@RequiredArgsConstructor
public class MemberServiceV3_1 {
    // private final DataSource dataSource;
    private final PlatformTransactionManager transactionManager;
    private final MemberRepositoryV3 memberRepository;

    public void accountTransfer(String fromId, String toId, int money) throws SQLException {
        // Connection con = dataSource.getConnection();
        TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition()); // 트랜잭션 시작

        try {
            // con.setAutoCommit(false);// 트랜잭션 시작

            // bizLogic(con, fromId, toId, money); // 비즈니스 로직
            bizLogic(fromId, toId, money); // 비즈니스 로직

            // con.commit(); // 성공 시 커밋
            transactionManager.commit(status); //성공시 커밋
        } catch (Exception e) {
            // con.rollback(); // 실패 시 롤백
            transactionManager.rollback(status); //실패시 롤백
            throw new IllegalStateException(e);
        }
        // finally {
        //     release(con);
        // }
    }

    private void bizLogic(String fromId, String toId, int money) throws SQLException {
        Member fromMember = memberRepository.findById(fromId);
        Member toMember = memberRepository.findById(toId);

        memberRepository.update(fromId, fromMember.getMoney() - money);
        validation(toMember);
        memberRepository.update(toId, toMember.getMoney() + money);
    }

    private void validation(Member toMember) {
        if (toMember.getMemberId().equals("ex")) {
            throw new IllegalStateException("이체중 예외 발생");
        }
    }

    // private void release(Connection con) {
    //     if (con != null) {
    //         try {
    //             con.setAutoCommit(true); // 커넥션 풀 고려
    //             con.close();
    //         } catch (Exception e) {
    //             log.info("error", e);
    //         }
    //     }
    // }
}
