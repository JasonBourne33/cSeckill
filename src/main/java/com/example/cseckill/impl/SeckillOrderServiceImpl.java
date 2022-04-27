package com.example.cseckill.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cseckill.entity.SeckillOrder;
import com.example.cseckill.mapper.SeckillOrderMapper;
import com.example.cseckill.service.ISeckillOrderService;
import org.springframework.stereotype.Service;

/**
 * 秒杀订单表
 *
 * @author chaos
 * @date 2022-04-27
 */
@Service
public class SeckillOrderServiceImpl extends ServiceImpl<SeckillOrderMapper, SeckillOrder> implements ISeckillOrderService {

}
