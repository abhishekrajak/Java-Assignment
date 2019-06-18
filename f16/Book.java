class Book{
	private String author;
	private String title;
	private String publisher;
	private double cost;
	
	public Book(){

	}
	public Book(String author, String title, String publisher, double cost){
		this.author = author;
		this.title = title;
		this.publisher = publisher;
		this.cost = cost;
	}

	public void setAuthor(String author){
		this.author = author;
	}

	public String getAuthor(){
		return author;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}
	
	public void setPublisher(String publisher){
		this.publisher = publisher;
	}
	
	public String getPublisher(){
		return publisher;
	}

	public void setCost(double cost){
		this.cost = cost;
	}

	public double getCost(){	
		return cost;
	}
	
	public void details(){
		System.out.printf("Author : %s\nTitle : %s\nPublisher : %s\nCost : %.2f\n", author, title, publisher, cost);
	}

}
