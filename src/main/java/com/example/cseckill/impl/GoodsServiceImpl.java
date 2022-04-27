package com.example.cseckill.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cseckill.entity.Goods;
import com.example.cseckill.mapper.GoodsMapper;
import com.example.cseckill.service.IGoodsService;
import org.springframework.stereotype.Service;

/**
 * 
 *
 * @author chaos
 * @date 2022-04-27
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

}
