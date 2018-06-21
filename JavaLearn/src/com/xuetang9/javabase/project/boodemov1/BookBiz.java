package com.xuetang9.javabase.project.boodemov1;
/**
 * 图书的业务类
 * 包含对图书以及图书数组的基本操作
 */
public class BookBiz {

	//以下开始书写基本的业务方法
	
	/**
	 * 或侧图书仓库中 数组总图书对象的个数
	 * @return
	 */
	
	public int getBookCount(){
		int count = 0;
		for(Book book : Datas.BookStore){
			if(book == null) break;
			count++;
		}
		return count;
	}
    
    
    /**
     * 讲传入的图书对象放到图书仓库数组中
     * @param book
     */
	public boolean addBook(Book book){
		int bookCount = getBookCount();
		if(Datas.BookStore.length == bookCount){
			return false;
		}
		//如果仓库不满，就将传入的图书对象放置在数组的最后一个位置（第一个非null位置）
		Datas.BookStore[bookCount] = book;
		return true;
	}
    
    
    /**
     * 删除传入的图书对象
     * @param book
     * @return
     */
	public boolean delBook(Book book){
		int bookCount = getBookCount();
		int delIndex = -1;	//要删除元素的下标
		for(int i = 0; i < bookCount; i++){
			//if(book.getBookId().equals(Datas.BookStore[i].getBookId())){
			if(book.equals(Datas.BookStore[i])){
				delIndex = i;
				break;
			}
		}
		if(delIndex == -1){
			return false;//没有找到要删除的元素时，直接结束方法，返回false
		}
		//执行数组删除的套路
		for(int i = delIndex; i < bookCount - 1; i++){
			Datas.BookStore[i] = Datas.BookStore[i + 1];
		}
		//将最后一个元素置为null
		Datas.BookStore[bookCount - 1] = null;
		return true;		
	}
	/**通过图书id查找对应的图书对象
	 * 没有找到，返回null
	 * 
	 * @param bookId
	 * @return
	 */
	
	public Book findById(String bookId){
		int bookCount = getBookCount();
		for(int i = 0; i < bookCount; i++){
			if(bookId.equals(Datas.BookStore[i].getBookId())){
				return Datas.BookStore[i];
			}
		}
		return null;
	}
    	
	
	/**
	 * 入库：胃仓库中现有的图书增加库存
	 * @param bookId  要入库的图书id
	 * @param count   入库的数量
	 * @return   如果入库的bookId 不存在，入库失败
	 */
	public boolean inStore(String bookId, int count){
		Book book = findById(bookId);
		if(null == book){//如果入库的bookId不存在
			return false;//尽量在业务类中不要使用打印语句
		}
		//增加库存 - 注意，这里是引用传递
		book.setCount(book.getCount() + count);
		return true;
	}
    
	/**
	 * 出库：将仓库现有库存减少
	 * @param bookId   
	 * @param count
	 * @return   现有库存小于count时，出库失败
	 */
	
	public boolean outStore(String bookId,int count) {
		Book book=findById(bookId);
				if(null==book) {
					return false;
				}
		        if(book.getCount()<count) {
		        	return false;
		        }
		        book.setCount(book.getCount()-count);
		        return true;
		 
	}
    
}
