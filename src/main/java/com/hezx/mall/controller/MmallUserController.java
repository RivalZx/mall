package com.hezx.mall.controller;

import com.hezx.mall.common.Const;
import com.hezx.mall.common.ServerResponse;
import com.hezx.mall.entity.MmallUser;
import com.hezx.mall.service.MmallUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hezx
 * @since 2022-03-28 10:14:20
 */
@RestController
@RequestMapping("/mall/mmallUser")
public class MmallUserController {
	
	@Autowired
	private MmallUserService userService;
	
	/**
	 * 用户登录
	 * @param username
	 * @param password
	 * @param session
	 * @return
	 */
	@PostMapping("login.do")
	@ResponseBody
	public ServerResponse<MmallUser> login(String username, String password, HttpSession session){
		ServerResponse<MmallUser> response = userService.login(username,password);
		if(response.isSuccess()){
			session.setAttribute(Const.CURRENT_USER,response.getData());
		}
		return response;
	}
	
	//用户登出
	
	//用户注册
	@PostMapping("register.do")
	@ResponseBody
	public ServerResponse<String> register(MmallUser user){
		return userService.register(user);
	}
	
	//用户校验
	
	//获取用户信息
	
	//忘记密码 -- 提示问题
	
	//忘记密码 -- 忘记密码答案
	
	//重制密码
	
	//更新信息
}
