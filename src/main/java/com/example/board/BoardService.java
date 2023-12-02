package com.example.board;

import java.util.List;

public interface BoardService {

    List<BoardVO> getBoardList();

    BoardVO getBoardById(int id);

    int insertBoard(BoardVO vo);

    int updateBoard(BoardVO vo);

    int deleteBoard(int id);
}



