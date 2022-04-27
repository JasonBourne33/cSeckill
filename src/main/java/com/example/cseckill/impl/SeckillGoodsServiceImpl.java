package com.example.cseckill.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cseckill.entity.SeckillGoods;
import com.example.cseckill.mapper.SeckillGoodsMapper;
import com.example.cseckill.service.ISeckillGoodsService;
import org.springframework.stereotype.Service;

/**
 * 秒杀商品表
 *
 * @author chaos
 * @date 2022-04-27
 */
@Service
public class SeckillGoodsServiceImpl extends ServiceImpl<SeckillGoodsMapper, SeckillGoods> implements ISeckillGoodsService {

}
