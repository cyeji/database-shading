package com.yeji.databaseshading;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BoardEntityTest {

    @Autowired
    private BoardRepository boardRepository;

    @Test
    @DisplayName("ㄱㅔ시판 내용 생성")
    void test_case_1() throws Exception {
        // given
        Board board = new Board();
        board.setTitle("공지사항");
        board.setContent("공짓사항1");
        board.setOpen(true);
        BoardEntity boardEntity = BoardEntity.from(board);
        // when
        boardRepository.save(boardEntity);

        // then

    }

}