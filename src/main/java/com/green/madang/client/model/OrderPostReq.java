package com.green.madang.client.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderPostReq {
    @Schema(title = "고객번호", description = "도서를 구매하는 고객의 번호", example = "4", requiredMode = Schema.RequiredMode.REQUIRED)
    private int custId;
    @Schema(title = "책번호", description = "고객이 구매하는 도서의 번호", example = "2", requiredMode = Schema.RequiredMode.REQUIRED)
    private int bookId;
}
