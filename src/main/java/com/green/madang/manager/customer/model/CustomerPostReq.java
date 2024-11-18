package com.green.madang.manager.customer.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerPostReq {
    @Schema(title = "이름", description = "고객의 이름(40자 이내)", example = "홍길동", requiredMode = Schema.RequiredMode.REQUIRED)
    private String name;
    @Schema(title = "주소", description = "고객의 주소(50자 이내)", example = "대한민국 서울")
    private String address;
    @Schema(title = "번호", description = "고객의 전화번호(20자 이내) <br> Ex) ###-####-####", example = "010-1234-5678")
    private String phone;
}
