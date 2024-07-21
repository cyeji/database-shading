package com.yeji.databaseshading;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Table(name = "T_BOARD")
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    private boolean isOpen;

    private boolean active;

    private LocalDateTime startedDate;

    private LocalDateTime expiredDate;

    public BoardEntity(Board board) {
        this.title = board.getTitle();
        this.content = board.getContent();
        this.isOpen = board.isOpen();
        this.active = board.isActive();
        this.startedDate = board.getStartedDate();
        this.expiredDate = board.getExpiredDate();
    }

    public static BoardEntity from(Board board) {
        return new BoardEntity(board);
    }

}
