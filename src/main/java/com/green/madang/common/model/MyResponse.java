package com.green.madang.common.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// 응답할 때 사용하는 객체
@Getter
@Setter
@AllArgsConstructor
public class MyResponse<T> {
    private String resultMessage;
    private T resultData;
}
