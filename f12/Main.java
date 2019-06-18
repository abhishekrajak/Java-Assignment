class Main {

    public static void main(String[] args) {
        SavingsAccount object1 = new SavingsAccount(1001, "Abhishek Rajak", 35000, 10);
        SavingsAccount object2 = new SavingsAccount(1002, "Ashok Rajak", 45000, 15);

        CurrentAccount object3 = new CurrentAccount(2001, "Manas Ghosh", 50000);
        CurrentAccount object4 = new CurrentAccount(2002, "Kavita Singh", 65000);
        CurrentAccount object5 = new CurrentAccount(2003, "Manasi Joshi", 75000);

        Manager managerObj = new Manager(10);
        managerObj.add(object1);
        managerObj.add(object2);
        managerObj.add(object3);
        managerObj.add(object4);
        managerObj.add(object5);

        managerObj.display();
    }
}
