class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Employee 1", 101, "Address 1", 10000);
        Employee emp2 = new Employee("Employee 2", 102, "Address 2", 20000);
        Employee emp3 = new Employee("Employee 3", 103, "Address 3", 30000);
        Employee emp4 = new Employee("Employee 4", 104, "Address 4", 40000);
        Employee emp5 = new Employee("Employee 5", 105, "Address 5", 50000);

        Dept department = new Dept("Information Tecnnology", "Salt Lake");
        department.add(emp1);
        department.add(emp2);
        department.add(emp3);
        department.add(emp4);
        department.add(emp5);
        department.display();

/*	
	department.add(emp1);
        department.add(emp2);
        department.add(emp3);
        department.add(emp4);
        department.add(emp5);
        department.display();
*/        
	System.out.println("The total annual expenditure is Rs." + department.getExpenditure());

    }
}

