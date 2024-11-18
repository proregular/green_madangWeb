package com.green.madang.manager.book.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookPostReq {
    @Schema(title="도서이름", description ="설명할거 있으면 여기서", requiredMode = Schema.RequiredMode.REQUIRED)
    private String bookName;
    @Schema(title="퍼블리셔", description ="")
    private String publisher;
    @Schema(title="가격", description ="")
    private int price;

}
