class Employee {
    private String name;
    private int id;
    private String addresss;
    private float salary;

    public Employee(){
        this("default", 0, "default_address", 0);
    }

    public Employee(String name, int id, String address, float salary) {
        this.name = name;
        this.id = id;
        this.addresss = address;
        this.salary = salary;
    }
    public Employee(final Employee object){
        this(object.getName(), object.getId(), object.getAddresss(), object.getSalary());
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setAddresss(String addresss) {
        this.addresss = addresss;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getAddresss() {
        return addresss;
    }
    public float getSalary() {
        return salary;
    }

    public void display(){
        System.out.printf("Name : %s\nID : %d\nAddress : %s\nSalary : Rs.%f\n\n", name, id, addresss, salary);
    }
}

