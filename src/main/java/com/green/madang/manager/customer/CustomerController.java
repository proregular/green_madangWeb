package com.green.madang.manager.customer;

import com.green.madang.common.model.MyResponse;
import com.green.madang.manager.customer.model.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/manager/customer")
@Tag(name = "고객", description = "고객 관리")
public class CustomerController {
    private final CustomerService service;

    @PostMapping
    @Operation(summary = "고객 정보 등록", description = "고객 정보 등록 API")
    public MyResponse<Integer> insCustomer(@RequestBody CustomerPostReq p) {
        return new MyResponse<Integer>("고객 등록 완료" , service.postCustomer(p));
    }

    @GetMapping
    @Operation(summary = "고객 전체 조회", description = "고객 전체 조회 API")
    public List<CustomerGetRes> selCustomerList(@ParameterObject @ModelAttribute CustomerGetReq p) {
        return service.selCustomerList(p);
    }

    @PutMapping
    @Operation(summary = "고객 정보 수정", description = "고객 정보 수정 API")
    public MyResponse<Integer> updCustomer(@RequestBody CustomerPutReq p) {
        return new MyResponse<Integer>("고객 수정 완료" , service.putCustomer(p));
    }

    @DeleteMapping
    @Operation(summary = "고객 정보 삭제", description = "고객 정보 삭제 API")
    public MyResponse<Integer> insCustomer(@ParameterObject @ModelAttribute CustomerDelReq p) {
        log.info("--0-------{}", p);
        return new MyResponse<Integer>("고객 삭제 완료" , service.delCustomer(p));
    }
}
