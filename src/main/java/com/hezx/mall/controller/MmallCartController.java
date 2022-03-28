package com.hezx.mall.controller;

import com.hezx.mall.service.MmallCartService;
import com.hezx.mall.service.MmallUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hezx
 * @since 2022-03-28 10:14:19
 */
@RestController
@RequestMapping("/mall/mmallCart")
public class MmallCartController {
	@Autowired
	MmallUserService mmallUserService;
	
	@Autowired
	MmallCartService mmallCartService;
}
