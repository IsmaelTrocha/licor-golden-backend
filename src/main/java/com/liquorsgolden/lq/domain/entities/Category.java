package com.liquorsgolden.lq.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class Category {
    private Long id;
    private String name;
    private String createBy;
    private LocalDateTime creationDate;

}
