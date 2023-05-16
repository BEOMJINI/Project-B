package org.board.repository;

import lombok.RequiredArgsConstructor;
import org.board.domain.Board;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardRepository {

    private final EntityManager em;

    //카테고리(게시글 종류)별로 보드 리스트 가져오기.
    public List<Board> findByCategory(String category){
        return em.createQuery("select b from Board b where b.category = :category")
                .setParameter("category",category)
                .getResultList();
    }

    //글쓰기( 게시글 작성)
    public void writeBoard(Board b){
        em.persist(b);
    }



}
