package com.hezx.mall.service;

import com.hezx.mall.common.ServerResponse;
import com.hezx.mall.entity.MmallUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hezx
 * @since 2022-03-28 10:14:20
 */
public interface MmallUserService extends IService<MmallUser> {
	
	ServerResponse<MmallUser> login(String username, String password);
	
	ServerResponse<String> register(MmallUser user);
}
