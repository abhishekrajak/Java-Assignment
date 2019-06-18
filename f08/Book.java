class Book {
    private String title;
    private String[] authors;
    private int author_count;
    private int pages;
    private float price;
    private String publisher;

    public Book(){
	this.title = "default_title";
    	this.authors = new String[5];
	for(int i=0; i<5; i++){
		this.authors[i] = "default_author"+Integer.toString(i+1);
	}
	this.author_count = 5;
	this.pages = 0;
	this.price = 0;
	this.publisher = "default_publisher";
    }
    public Book(String title, String[] authors, int author_count, int pages, float price, String publisher) {
        this.title = title;
        this.authors = new String[author_count];
        for(int i=0; i<author_count; i++){
            this.authors[i] = authors[i];
        }
        this.author_count = author_count;
        this.pages = pages;
        this.price = price;
        this.publisher = publisher;
    }
    public Book(final Book object){
        this(object.getTitle(), object.getAuthors(), object.getAuthor_count(), object.getPages(), object.getPrice(), object.getPublisher());
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String[] getAuthors() {
        return authors;
    }
    public void setAuthors(String[] authors) {
        this.authors = new String[authors.length];
        author_count = authors.length;
        for(int i=0; i<author_count; i++){
            this.authors[i] = authors[i];
        }
    }
    public int getAuthor_count() {
        return author_count;
    }
    public void setAuthor_count(int author_count) {
        this.author_count = author_count;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void display(){
        System.out.printf("Title : %s\nAuthors : \n", title);
        for(int i=0; i<author_count; i++){
            System.out.printf("%d : %s\n", i+1, authors[i]);
        }
        System.out.printf("Publisher : %s\nPrice : Rs.%.2f\n", publisher, price);
    }
}
