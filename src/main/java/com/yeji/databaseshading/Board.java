package com.yeji.databaseshading;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Board {

    private Long id;

    private String title;

    private String content;

    private boolean isOpen;

    private boolean active;

    private LocalDateTime startedDate;

    private LocalDateTime expiredDate;

}
