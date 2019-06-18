class Journal extends Publication{
    private String journalName;

    public Journal(){
        super();
        this.journalName = "default_journalName";
    }
    public Journal(String journalName){
        super();
        this.journalName = journalName;
    }
    public Journal(String journalName, String publicationName, int pages, float price){
        super(publicationName, pages, price);
        this.journalName = journalName;
    }
    public Journal(final Journal object){
        this(object.getJournalName(), object.getPublicationName(), object.getPages(), object.getPrice());
    }
    public String getJournalName() {
        return journalName;
    }
    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    @Override
    public void display(){
        System.out.println("Book Name : " + journalName);
        super.display();
    }
	
    public void displayPublication(){
	super.display();
    }
}

