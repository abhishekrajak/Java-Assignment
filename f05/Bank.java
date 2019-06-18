class Bank {

    public static void main(String[] args) {

        AccountManager manager = new AccountManager();
        manager.create(900001, 10000, "Abhishek Rajak");
	manager.create(900002, 20000, "Manas Ghosh");
        manager.create(900003, 30000, "Mansi Biswas");
        manager.create(900004, 40000, "Abhinav Bindra");
        manager.create(900005, 50000, "Abel Tesfaye");

/*
	manager.create(900001, 10000, "Abhishek Rajak");
        manager.create(900002, 20000, "Manas Ghosh");
        manager.create(900003, 30000, "Mansi Biswas");
        manager.create(900004, 40000, "Abhinav Bindra");
        manager.create(900005, 50000, "Abel Tesfaye");
*/        
	System.out.println("\nBank Account Details : \n");
	manager.display();
	
/*	
	manager.delete(900004);
	manager.display();
*/
    }
}

