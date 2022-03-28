package com.hezx;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.fill.Column;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @program: MyBatis-plus 自动生成代码
 * @description:
 * @author: he-zx
 * @create: 2022-03-28 21:45
 **/
public class Main {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("=====================数据库配置=======================");
//		System.out.println("请输入 URL");
//		String url = scan.next();
//		System.out.println("请输入 username");
//		String username = scan.next();
//		System.out.println("请输入 password");
//		String password = scan.next();
		
		String url = "jdbc:mysql://localhost:3306/mall";
		String username = "root";
		String password = "Hzx199754,";
		String tables = "mmall_user,mmall_cart,mmall_category,mmall_order,mmall_order_item,mmall_pay_info,mmall_product,mmall_shipping,mmall_user";
		FastAutoGenerator.create(url, username, password)
				// 全局配置
				.globalConfig((scanner, builder) -> builder.author("hezx")
						.outputDir(System.getProperty("user.dir") + "/src/main/java")
						.commentDate("yyyy-MM-dd hh:mm:ss")
						.dateType(DateType.TIME_PACK)
						.enableSwagger()
						.fileOverride()
						.enableSwagger()
						.disableOpenDir()
				)
				// 包配置
				.packageConfig((scanner, builder) -> builder.parent("com.hezx")
						.moduleName("mall")
						.entity("entity")
						.service("service")
						.serviceImpl("serviceImpl")
						.mapper("mapper")
						.xml("mapper")
						.other("utils")
						.pathInfo(Collections.singletonMap(OutputFile.xml, System.getProperty("user.dir")+"/src/main/resources/mapper"))
				)
				// 策略配置
				.strategyConfig((scanner, builder) -> {
					builder.addInclude(getTables(tables))
							.serviceBuilder()
							.formatServiceFileName("%sService")
							.formatServiceImplFileName("%sServiceImpl")
							.entityBuilder()        //实体类策略配置
							.enableLombok()         //开启 Lombok
							.disableSerialVersionUID()
							.logicDeleteColumnName("deleted")        //逻辑删除字段
							.naming(NamingStrategy.underline_to_camel)
							.columnNaming(NamingStrategy.underline_to_camel)
							.addTableFills(new Column("create_time", FieldFill.INSERT), new Column("modify_time", FieldFill.INSERT_UPDATE))
							.enableTableFieldAnnotation()       // 开启生成实体时生成字段注解
							.controllerBuilder()
							.formatFileName("%sController")
							.enableRestStyle()
							.mapperBuilder()
							.superClass(BaseMapper.class)
							.formatMapperFileName("%sMapper")
							.enableMapperAnnotation()       //@mapper
							.formatXmlFileName("%sMapper");
				})
				/*
				模板引擎配置，默认 Velocity 可选模板引擎 Beetl 或 Freemarker
				.templateEngine(new BeetlTemplateEngine())
				.templateEngine(new FreemarkerTemplateEngine())
							 */
				.execute();
	}
	
	// 处理 all 情况
	protected static List<String> getTables(String tables) {
		return "all".equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(","));
	}
}
