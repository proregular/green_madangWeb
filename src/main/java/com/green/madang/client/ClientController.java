package com.green.madang.client;

import com.green.madang.client.model.OrderGetReq;
import com.green.madang.client.model.OrderGetRes;
import com.green.madang.client.model.OrderPostReq;
import com.green.madang.common.model.MyResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@Tag(name = "회원", description = "회원 도서 구매 API")
@RequiredArgsConstructor
@RequestMapping("/client")
public class ClientController {
    private final ClientService service;

    @PostMapping("/order")
    @Operation(summary = "회원 정보 등록", description = "회원 정보 등록 API")
    public MyResponse<Integer> postOrder(@RequestBody OrderPostReq p) {
        return new MyResponse<Integer>("주문 등록 완료", service.postOrders(p));
    }

    // 본인이 주문한 책 리스트
    @GetMapping("/order")
    @Operation(summary = "회원 구매 정보 조회", description = "회원 구매 정보 조회 API")
    public MyResponse<List<OrderGetRes>> getOrders(@ParameterObject @ModelAttribute OrderGetReq p) {
        return  new MyResponse<List<OrderGetRes>>("주문 조회 완료", service.getOrderList(p));
    }
}
