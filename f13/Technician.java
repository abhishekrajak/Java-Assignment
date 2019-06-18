class Technician extends Employee {
    public Technician() {
        super();
    }

    public Technician(String name, int age, float weight, float height, Date dateOfBirth, String address, float salary, Date dateOfJoining, float experience) {
        super(name, age, weight, height, dateOfBirth, address, salary, dateOfJoining, experience);
    }
    public Technician(final Employee object){
        super(object);
    }
    public void display(){
        super.display();
        System.out.println("Job : Technician");
    }
}

