//import java.util.EnumMap;

class Employee extends Person {
    private float salary;
    private Date dateOfJoining;
    private float experience;

    public Employee(){
        super();
        setMembers(0, new Date(), 0);
    }
    public Employee(String name, int age, float weight, float height, Date dateOfBirth, String address, float salary, Date dateOfJoining, float experience){
        super(name, age, weight, height, dateOfBirth, address);
        setMembers(salary, dateOfJoining, experience);
    }
    public Employee(final Person object, float salary, Date dateOfJoining, float experience){
        super(object);
        setMembers(salary, dateOfJoining, experience);
    }
    public Employee(final Employee object){
        super(object.getName(), object.getAge(), object.getWeight(), object.getHeight(), object.getDateOfBirth(), object.getAddress());
        setMembers(object.getSalary(), object.getDateOfJoining(), object.getExperience());
    }

    public void setMembers(float salary, Date dateOfJoining, float experience){
        this.salary = salary;
        this.dateOfJoining = new Date(dateOfJoining);
        this.experience = experience;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Date getDateOfJoining() {
        return new Date(dateOfJoining);
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = new Date(dateOfJoining);
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public void display(){
        super.display();
        System.out.printf("Salary : Rs.%.2f\nDate of Joining : ", salary);
        dateOfJoining.display();
        System.out.printf("Experience : %.2f years\n", experience);
    }

}

