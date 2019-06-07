package com.java.learn;

import java.util.ArrayList;

public class ArrayListDemo {
     public static void main(String[] args) {
		ArrayList<Integer> array=new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		for(int i=0;i<array.size();i++){
			System.out.println(array.get(i));
		}
		
		/*
		 * 集合存储自定义的person类
		 */
		ArrayList<Person> arrayPer=new ArrayList<Person>();
		arrayPer.add(new Person("a",18));
		arrayPer.add(new Person("b",20));
		arrayPer.add(new Person("c",22));
		
		for(int i=0;i<arrayPer.size();i++){
			System.out.println(arrayPer.get(i).toString());
		}
	}
}
