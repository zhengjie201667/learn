package com.xuetang9.javabase.project.boodemov1;

import java.util.Scanner;

public class BookView {
   private Scanner input=null;
   private BookBiz bookBiz;
   public BookView() {
	   input = new Scanner(System.in);
		bookBiz = new BookBiz();
		
		System.out.println("*********************************");
		System.out.println("\t��ӭʹ��X9ͼ�����ϵͳ");
		System.out.println("\t1����¼\t\t2���˳�ϵͳ");
		System.out.println("*********************************");
		System.out.print("��ѡ��");
		String choice = input.next();
		if("1".equals(choice)) {
			//ִ�е�¼�����������֤�ɹ�����ʾ���˵�
		}
		System.out.println("X9ͼ��ϵͳ�ѳɹ��˳�");
   }
   
   public void showMainVIew() {
	   System.out.println("\nX9ͼ�����ϵͳ >> ���˵�");
		System.out.println("1������ͼ��\t2��ɾ��ͼ��\t3���鿴����ͼ��\t4������Ų�ѯ\t5�����\t6������\t7���˳�");
		System.out.print("��ѡ��");
		String choice = input.next();
		switch(choice) {
		case "1":
			break;
		
		}
   }	
}
