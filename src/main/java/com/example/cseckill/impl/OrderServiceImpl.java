package com.example.cseckill.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cseckill.entity.Order;
import com.example.cseckill.mapper.OrderMapper;
import com.example.cseckill.service.IOrderService;
import org.springframework.stereotype.Service;

/**
 * 
 *
 * @author chaos
 * @date 2022-04-27
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
