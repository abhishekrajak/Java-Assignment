class Main {

    public static void main(String[] args) {
        String[] author1 = new String[1];
        String[] author2 = new String[1];
        String[] author3 = new String[1];
        String[] author4 = new String[1];
        String[] author5 = new String[1];
        author1[0] = "Author 1";
        author2[0] = "Author 2";
        author3[0] = "Author 3";
        author4[0] = "Author 4";
        author5[0] = "Author 5";
        Book object1 = new Book("Book 1", author1, 1, 10, 100, "Publisher 1");
        Book object2 = new Book("Book 2", author1, 1, 10, 200, "Publisher 2");
        Book object3 = new Book("Book 3", author1, 1, 10, 300, "Publisher 3");
        Book object4 = new Book("Book 4", author1, 1, 10, 50, "Publisher 4");
        Book object5 = new Book("Book 5", author1, 1, 10, 10, "Publisher 5");

        Library library_object = new Library(5);
        library_object.add(object1);
        library_object.add(object2);
        library_object.add(object3);
        library_object.add(object4);
        library_object.add(object5);
        library_object.display();
/*
	library_object.add(object1);
        library_object.add(object2);
        library_object.add(object3);
        library_object.add(object4);
        library_object.add(object5);
*/

        System.out.println("The total price of all books in library is Rs." + library_object.total_Price()+ "\n");

    }
}

