class BookObject extends Book{
	private int stockPosition;

	public BookObject(){
		super();
		stockPosition = 0;
	}
	
	public BookObject(String author, String title, String publisher, double cost){
		this(author, title, publisher, cost, 1);
	}

	public BookObject(String author, String title, String publisher, double cost, int stockPosition){
		super(author, title, publisher, cost);
		this.stockPosition = stockPosition;
	}
	
	public BookObject(Book object){
		this(object, 1);
	}

	public BookObject(Book object, int stockPosition){
                super(object.getAuthor(), object.getTitle(), object.getPublisher(), object.getCost());
                this.stockPosition = stockPosition;
        }
	
	public void setStockPosition(int StockPosition){
		this.stockPosition = StockPosition;
	}
	
	public int getStockPosition(){
		return stockPosition;
	}
	@Override
	public void details(){
		super.details();
		System.out.printf("The total # of copies in inventory : %d\n\n", stockPosition);
	}
}
