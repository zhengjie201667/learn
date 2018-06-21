package com.xuetang9.javabase.project.boodemov1;

import java.util.Scanner;

public class BookView {
   private Scanner input=null;
   private BookBiz bookBiz;
   public BookView() {
	   input = new Scanner(System.in);
		bookBiz = new BookBiz();
		
		System.out.println("*********************************");
		System.out.println("\t欢迎使用X9图书管理系统");
		System.out.println("\t1、登录\t\t2、退出系统");
		System.out.println("*********************************");
		System.out.print("请选择：");
		String choice = input.next();
		if("1".equals(choice)) {
			//执行登录操作，如果验证成功就显示主菜单
		}
		System.out.println("X9图书系统已成功退出");
   }
   
   public void showMainVIew() {
	   System.out.println("\nX9图书管理系统 >> 主菜单");
		System.out.println("1、新增图书\t2、删除图书\t3、查看所有图书\t4、按编号查询\t5、入库\t6、出库\t7、退出");
		System.out.print("请选择：");
		String choice = input.next();
		switch(choice) {
		case "1":
			break;
		
		}
   }	
}
