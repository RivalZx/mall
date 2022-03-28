package com.hezx.mall.serviceImpl;

import com.hezx.mall.common.Const;
import com.hezx.mall.common.ServerResponse;
import com.hezx.mall.entity.MmallUser;
import com.hezx.mall.mapper.MmallUserMapper;
import com.hezx.mall.service.MmallUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hezx.mall.utils.MD5Util;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hezx
 * @since 2022-03-28 10:14:20
 */
@Service
public class MmallUserServiceImpl extends ServiceImpl<MmallUserMapper, MmallUser> implements MmallUserService {
	
	@Autowired
	private MmallUserMapper userMapper;
	
	/**
	 * 用户登录
	 * @param username
	 * @param password
	 * @return
	 */
	@Override
	public ServerResponse<MmallUser> login(String username, String password) {
		int resultCount = userMapper.checkUsername(username);
		if(resultCount == 0 ){
			return ServerResponse.createByErrorMessage("用户名不存在");
		}
		
		String md5Password = MD5Util.MD5EncodeUtf8(password);
		MmallUser user  = userMapper.selectLogin(username,md5Password);
		if(user == null){
			return ServerResponse.createByErrorMessage("密码错误");
		}
		
		user.setPassword(StringUtils.EMPTY);
		return ServerResponse.createBySuccess("登录成功",user);
	}
	
	/**
	 * 校验
	 * @param str
	 * @param type
	 * @return
	 */
	public ServerResponse<String> checkValid(String str,String type){
		if(StringUtils.isNotBlank(type)){
			//开始校验
			if(Const.USERNAME.equals(type)){
				int resultCount = userMapper.checkUsername(str);
				if(resultCount > 0 ){
					return ServerResponse.createByErrorMessage("用户名已存在");
				}
			}
			if(Const.EMAIL.equals(type)){
				int resultCount = userMapper.checkEmail(str);
				if(resultCount > 0 ){
					return ServerResponse.createByErrorMessage("email已存在");
				}
			}
		}else{
			return ServerResponse.createByErrorMessage("参数错误");
		}
		return ServerResponse.createBySuccessMessage("校验成功");
	}
	
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	@Override
	public ServerResponse<String> register(MmallUser user) {
		ServerResponse validResponse = this.checkValid(user.getUsername(),Const.USERNAME);
		if(!validResponse.isSuccess()){
			return validResponse;
		}
		validResponse = this.checkValid(user.getEmail(),Const.EMAIL);
		if(!validResponse.isSuccess()){
			return validResponse;
		}
		user.setRole(Const.Role.ROLE_CUSTOMER);
		//MD5加密
		user.setPassword(MD5Util.MD5EncodeUtf8(user.getPassword()));
		user.setCreateTime(LocalDateTime.now());
		user.setUpdateTime(LocalDateTime.now());
		int resultCount = userMapper.insert(user);
		if(resultCount == 0){
			return ServerResponse.createByErrorMessage("注册失败");
		}
		return ServerResponse.createBySuccessMessage("注册成功");
	}
}
