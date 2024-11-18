package com.green.madang.manager.book.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookGetReq {
    private int page;
    private int size;
    private String searchText;
    @JsonIgnore
    private int startIdx;
}

