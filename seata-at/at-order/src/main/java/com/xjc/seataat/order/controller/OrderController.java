package com.xjc.seataat.order.controller;

import com.xjc.seataat.order.mapper.dataobject.OrderDO;
import com.xjc.seataat.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Version 1.0
 * @ClassName OrderController
 * @Author jiachenXu
 * @Date 2020/10/25
 * @Description
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 创建订单
     *
     * @param order
     * @return
     */
    @RequestMapping("/create")
    public boolean create(@RequestBody OrderDO order) {
        return orderService.create(order);
    }

}
