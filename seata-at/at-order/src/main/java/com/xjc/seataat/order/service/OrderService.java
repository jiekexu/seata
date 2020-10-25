package com.xjc.seataat.order.service;

import com.xjc.seataat.order.mapper.dataobject.OrderDO;

/**
 * @Version 1.0
 * @ClassName OrderService
 * @Author jiachenXu
 * @Date 2020/10/24
 * @Description
 */
public interface OrderService {

    /**
     * 创建订单
     *
     * @param order
     * @return
     */
    boolean create(OrderDO order);

}
