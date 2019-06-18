public class Book extends Publication{
    private String bookName;

    public Book(){
        super();
        this.bookName = "default_bookName";
    }
    public Book(String bookName){
        super();
        this.bookName = bookName;
    }
    public Book(String bookName, String publicationName, int pages, float price){
        super(publicationName, pages, price);
        this.bookName = bookName;
    }
    public Book(final Book object){
        this(object.getBookName(), object.getPublicationName(), object.getPages(), object.getPrice());
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }


    @Override
    public void display(){
        System.out.println("Book Name : " + bookName);
        super.display();
    }
	
    public void displayPublication(){
	super.display();
    }

}

