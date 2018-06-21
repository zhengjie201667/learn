package com.xuetang9.javabase.project.boodemov1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Book newBook=new Book();
		newBook.setBookId("10");
		newBook.setBookName("ÌìÁú°Ë²¿");
		newBook.setCount(10);
		
		BookBiz bookBiz=new BookBiz();
		
        
        bookBiz.addBook(newBook);
        show();
        

  
        bookBiz.delBook(newBook);
        show();
   
      /**
       *   bookBiz.inStore("10", 10);
       *   show();
        bookBiz.outStore("10", 10);
        show();
       */
        
	}
	
	
	public static void show() {
		BookBiz bookBiz=new BookBiz();
		if (bookBiz.getBookCount()==0) {
			System.out.println("²Ö¿â¿Õ");
			
		}
		for(int i=0;i< bookBiz.getBookCount();i++) {
			System.out.println(Datas.BookStore[i].getBookId() + "\t" + Datas.BookStore[i].getBookName() + "\t" + Datas.BookStore[i].getCount());
		}
	}

}
