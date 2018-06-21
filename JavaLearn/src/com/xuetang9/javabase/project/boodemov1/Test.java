package com.xuetang9.javabase.project.boodemov1;

class Person{
	String name;
	int age;
	public void moke(){
		
	}
}

class Person2{
	int age;
}

public class Test {
	
	   
	   public void te(Person person) {
		   person.age=2;
		   person.name="ÕÅÈý";
		   person.moke();
		   
		 
		   }
	   
	   public void tes() {
		   Test tk=new Test();
		   Person pe=new Person2();
		   tk.te(pe);
	   }
	   public  void se() {
		   BookBiz bookBiz=new BookBiz();
		   if (bookBiz.getBookCount()<0) {
				System.out.println("²Ö¿â¿Õ");
			}
			for(int i=0;i< bookBiz.getBookCount();i++) {
				System.out.println(Datas.BookStore[i].getBookId()+"\t"+Datas.BookStore[i].getBookName());
			}
	   }
	   public static void main(String[] args) { 
	}
	   
	
}
