package com.green.madang.manager.order;

import com.green.madang.manager.order.model.OrderGetReq;
import com.green.madang.manager.order.model.OrderGetRes;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderMapper mapper;

    public List<OrderGetRes> getOrderList(OrderGetReq p) {
        p.setStartIdx((p.getPage() - 1) * p.getSize());

        return mapper.selOrderList(p);
    }


}
