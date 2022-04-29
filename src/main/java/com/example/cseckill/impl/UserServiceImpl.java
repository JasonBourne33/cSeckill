package com.example.cseckill.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cseckill.entity.User;
import com.example.cseckill.mapper.UserMapper;
import com.example.cseckill.service.IUserService;
import com.example.cseckill.vo.LoginVo;
import com.example.cseckill.vo.RespBean;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户表
 *
 * @author chaos
 * @date 2022-04-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

//    RespBean doLongin(LoginVo loginVo, HttpServletRequest request, HttpServletResponse response);
}
