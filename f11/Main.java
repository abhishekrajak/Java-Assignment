class Main {
    public static void main(String[] args) {
        Book object1 = new Book("BookName_01", "Publisher_01", 100, 200);
        Book object2 = new Book("BookName_02", "Publisher_02", 300, 400);
        Book object3 = new Book("BookName_03", "Publisher_03", 500, 600);

        Journal object4 = new Journal("Journal_04", "Publisher_04", 700, 800);
        Journal object5 = new Journal("Journal_05", "Publisher_05", 900, 1000);

        Library libraryObject = new Library();

	Publication object[] = new Publication[5];

	object[0] = object1;
	object[1] = object2;
	object[2] = object3;
	
	object[3] = object4;
	object[4] = object5;

	for(int i=0; i<5; i++){
		libraryObject.add(object[i]);
	}
	
        libraryObject.display();

    }

}

