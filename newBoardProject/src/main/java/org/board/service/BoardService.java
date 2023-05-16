package org.board.service;

import lombok.RequiredArgsConstructor;
import org.board.domain.Board;
import org.board.repository.BoardRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@RequiredArgsConstructor
@Transactional
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    @Transactional
    public void writeBoard(Board b){

    }


}
