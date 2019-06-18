class Student {
    private String name;
    private int roll;
    private String[] subject_name;
    private int total_subjects;

    public Student(){
        this.name = "default_name";
        this.roll = 0;
        subject_name = new String[5];
        for(int i=0; i<5; i++){
            subject_name[i] = "default_sub " + Integer.toString(i+1);
        }
        total_subjects = 5;
    }
    public Student(String name, int roll, String[] subject_name, int x){
        this.name = name;
        this.roll = roll;
        this.subject_name = new String[x];
        for(int i=0; i<x; i++){
            this.subject_name[i] = subject_name[i];
        }
        total_subjects = x;
    }
    public Student(final Student object){
        this(object.getName(), object.getRoll(), object.getSubject_name(), object.getTotal_subjects());
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public String getSubject_name(int x) {
        return subject_name[x];
    }
    public void setSubject_name(String subject_name, int x) {
        this.subject_name[x] = subject_name;
    }

    public String[] getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String[] subject_name) {
        this.subject_name = subject_name;
    }

    public int getTotal_subjects() {
        return total_subjects;
    }

    public void setTotal_subjects(int total_subjects) {
        this.total_subjects = total_subjects;
    }

    public void display(){
        System.out.printf("Name : %s\nRoll : %d\n", name, roll);
    }
}

