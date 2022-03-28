package com.hezx.mall.mapper;

import com.hezx.mall.entity.MmallUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hezx
 * @since 2022-03-28 10:14:20
 */
@Mapper
public interface MmallUserMapper extends BaseMapper<MmallUser> {
	
	int checkUsername(String username);
	
	int checkEmail(String email);
	
	MmallUser selectLogin(@Param("username") String username, @Param("password")String password);
}
