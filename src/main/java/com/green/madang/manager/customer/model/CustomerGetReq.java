package com.green.madang.manager.customer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/*
    우리가 만드는 API는 응답 때 JSON형태로 응답한다.
    응답시 객체에 있는 특정 멤버필드의 값을 제외하고 싶을 때
    @JsonIgnore를 맴버필드에 붙이면 제외시킬 수 있다.
    (응답 때 JsonIgnore를 쓰는 경우는 거의 없다.)

    Swagger 문서상에 응답 Schema에서 안보이기도 한다.
*/
@Getter
@Setter
public class CustomerGetReq {
    // @Schema, @JsonIgnore 어노테이션은 Swagger을 어노테이션
    @Schema(description = "page값", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    private int page;
    @Schema(description = "페이지에 보이는 고객 정보의 수", example = "50", requiredMode = Schema.RequiredMode.REQUIRED)
    private int size;
    @Schema(description = "검색타입: {name, address, phone}중 한 값을 보낸다.", example = "name")
    private String searchType;
    @Schema(description = "검색내용", example = "ani")
    private String searchText;
    @JsonIgnore // @Schema(hidden = true) // Swagger 문서 상에 Parameters 부분에서 보이지 않게 하는 역할
    private int startIdx; // (page - 1) * size
}
