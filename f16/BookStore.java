import java.util.Scanner;

class BookStore{
	private BookObject[] list;
	private boolean[] active;
	private int capacity;

	public BookStore(){
		this(10);
	}
	public BookStore(int x){
		list = new BookObject[x];
		active = new boolean[x];
		for(int i=0; i<x; i++){
			active[i] = false;
		}
		capacity = x;
	}
	public int addBook(Book object){
		boolean cond = false;
		int first_empty = -1;
		for(int i=0; i<capacity; i++){
			if(active[i]==false && cond==false){
				first_empty = i;
				cond = true;
			}
			else if(active[i]==true){
				if(list[i].getTitle()==object.getTitle() && list[i].getAuthor()==object.getAuthor()){
					list[i].setStockPosition(list[i].getStockPosition()+1);
					return 1;
				}
			}
		}
		if(cond==false){
			this.resize();
			this.addBook(object);
			return 2;
		}
		else{
			list[first_empty] = new BookObject(object, 1);
			active[first_empty] = true;
			return 3;
		}
	}

	public void resize(){
		BookObject[] newList = new BookObject[capacity+10];
		boolean[] newActive = new boolean[capacity+10];
		int newCapacity = capacity+10;
		for(int i=0; i<capacity; i++){
			newList[i] = list[i];
			newActive[i] = active[i];
		}
		for(int i=capacity; i<newCapacity; i++){
			newActive[i] = false;
		}
		list = newList;
		active = newActive;
		capacity = newCapacity;
	}

	public int search(String title, String author){	
		System.out.printf("Searching for title : %s author : %s\n", title, author);
		for(int i=0; i<capacity; i++){
			if(active[i]==true)
				if(list[i].getTitle().equals(title) && list[i].getAuthor().equals(author)){
					list[i].details();
					int demand;
					Scanner Scan = new Scanner(System.in);
					System.out.println("Enter the # of books that you want : ");
					demand = Scan.nextInt();
					Scan.close();
					if(demand>list[i].getStockPosition()){
						System.out.println("required copies not in stock");
						return 0;
					}
					else{
						System.out.printf("The total price is Rs.%.2f\n", list[i].getCost()*demand);
						return 1;
					}
				}
			}
			System.out.println("Book not found");
		return 0;
	}
	
	public int search(){
		Scanner Scan = new Scanner(System.in);
		System.out.printf("Enter the title of your book : ");
		String title = Scan.nextLine();
		System.out.printf("Enter the author of your book : ");
		String author = Scan.nextLine();
		return search(title, author);
	}

	public void details(){
		for(int i=0; i<capacity; i++){
			if(active[i]==true){
				list[i].details();
			}
		}
	}


}
