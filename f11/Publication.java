abstract class Publication {
    private String publicationName;
    private int pages;
    private float price;

    public Publication(){
        this("default_publication", 0, 0);
    }
    public Publication(String publicationName) {
        this(publicationName, 0, 0);
    }
    public Publication(String publicationName, int pages, float price){
        this.publicationName = publicationName;
        this.pages = pages;
        this.price = price;
    }
    public Publication(final Publication object){
        this(object.getPublicationName(), object.getPages(), object.getPrice());
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
    public String getPublicationName() {
        return publicationName;
    }
    public void setPublicationName(String publicationName) {
        this.publicationName = publicationName;
    }
    public void display(){
        System.out.println("Publication Name : " + publicationName);
    }
}

