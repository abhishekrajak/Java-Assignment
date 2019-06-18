class Person {
    private String name;
    private int age;
    private float weight;
    private float height;
    Date dateOfBirth;
    String address;

    public Person(){
        this("default_name", 0, 0, 0, new Date(), "default_address");
    }
    public Person(String name, int age, float weight, float height, Date dateOfBirth, String address) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.dateOfBirth = new Date(dateOfBirth);
        this.address = address;
    }
    public Person(final Person object){
        this(object.getName(), object.getAge(), object.getWeight(), object.getHeight(), object.getDateOfBirth(), object.getAddress());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Date getDateOfBirth() {
        return new Date(dateOfBirth);
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = new Date(dateOfBirth);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void display(){
        System.out.printf("Name : %s\nage : %d\nweight : %.2f\nheight : %.2f\nDate of Birth : ", name, age, weight, height);
        dateOfBirth.display();
        System.out.printf("Address : %s\n", address);
    }


}

