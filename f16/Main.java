class Main{
	public static void main(String args[]){
		int x = 5;
		Book[] object = new Book[x];
		double cost = 150;
		
		for(int i=0; i<x; i++){
			object[i] = new Book("author_0"+Integer.toString(i+1), "title_0"+Integer.toString(i+1), "publisher_0"+Integer.toString(i+1), cost);	
			cost+=25; 	
		}	

		BookStore storeObject = new BookStore(x+10);

		for(int i=0, j = x-1; i<x; i++, j--){
			storeObject.addBook(object[i]);
			storeObject.addBook(object[j]);
		}

		storeObject.details();
		
		storeObject.search();


	}
}
