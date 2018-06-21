package com.xuetang9.javabase.project.boodemov1;
/**
 * ͼ���ҵ����
 * ������ͼ���Լ�ͼ������Ļ�������
 */
public class BookBiz {

	//���¿�ʼ��д������ҵ�񷽷�
	
	/**
	 * ���ͼ��ֿ��� ������ͼ�����ĸ���
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
     * �������ͼ�����ŵ�ͼ��ֿ�������
     * @param book
     */
	public boolean addBook(Book book){
		int bookCount = getBookCount();
		if(Datas.BookStore.length == bookCount){
			return false;
		}
		//����ֿⲻ�����ͽ������ͼ������������������һ��λ�ã���һ����nullλ�ã�
		Datas.BookStore[bookCount] = book;
		return true;
	}
    
    
    /**
     * ɾ�������ͼ�����
     * @param book
     * @return
     */
	public boolean delBook(Book book){
		int bookCount = getBookCount();
		int delIndex = -1;	//Ҫɾ��Ԫ�ص��±�
		for(int i = 0; i < bookCount; i++){
			//if(book.getBookId().equals(Datas.BookStore[i].getBookId())){
			if(book.equals(Datas.BookStore[i])){
				delIndex = i;
				break;
			}
		}
		if(delIndex == -1){
			return false;//û���ҵ�Ҫɾ����Ԫ��ʱ��ֱ�ӽ�������������false
		}
		//ִ������ɾ������·
		for(int i = delIndex; i < bookCount - 1; i++){
			Datas.BookStore[i] = Datas.BookStore[i + 1];
		}
		//�����һ��Ԫ����Ϊnull
		Datas.BookStore[bookCount - 1] = null;
		return true;		
	}
	/**ͨ��ͼ��id���Ҷ�Ӧ��ͼ�����
	 * û���ҵ�������null
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
	 * ��⣺θ�ֿ������е�ͼ�����ӿ��
	 * @param bookId  Ҫ����ͼ��id
	 * @param count   ��������
	 * @return   �������bookId �����ڣ����ʧ��
	 */
	public boolean inStore(String bookId, int count){
		Book book = findById(bookId);
		if(null == book){//�������bookId������
			return false;//������ҵ�����в�Ҫʹ�ô�ӡ���
		}
		//���ӿ�� - ע�⣬���������ô���
		book.setCount(book.getCount() + count);
		return true;
	}
    
	/**
	 * ���⣺���ֿ����п�����
	 * @param bookId   
	 * @param count
	 * @return   ���п��С��countʱ������ʧ��
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
