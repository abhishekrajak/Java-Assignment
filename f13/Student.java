class Student extends Person {
    private int roll;
    private String[] subject;
    private float[] marks;
    private int totalSubjects;

    public Student(){
        super();
        this.roll = 0;
        this.subject = new String[10];
        this.marks = new float[10];
        for(int i=0; i<10; i++){
            this.subject[i] = "default_subject_" + Integer.toString(i+1);
            this.marks[i] = -1;
        }
        this.totalSubjects = 10;
    }
    public Student(String name, int age, float weight, float height, Date dateOfBirth, String address, int roll, String[] subject, float[] marks, int totalSubjects){
        super(name, age, weight, height, dateOfBirth, address);
        this.roll = roll;
        this.subject = new String[totalSubjects];
        this.marks = new float[totalSubjects];
        for(int i=0; i<totalSubjects; i++){
            this.subject[i] = subject[i];
            this.marks[i] = marks[i];
        }
        this.totalSubjects = totalSubjects;
    }
    public Student(final Person object, int roll, String[] subject, float[] marks, int totalSubjects){
        super(object);
        this.roll = roll;
        this.subject = new String[totalSubjects];
        this.marks = new float[totalSubjects];
        for(int i=0; i<totalSubjects; i++){
            this.subject[i] = subject[i];
            this.marks[i] = marks[i];
        }
        this.totalSubjects = totalSubjects;
    }

    public float calculateGrade(){
        float total = 0;
        for(int i=0; i<totalSubjects; i++){
            total+=marks[i];
        }
        return total/totalSubjects;
    }

    public void display(){
        super.display();
        System.out.printf("Roll # : %d\n", roll);
        System.out.printf("Subject Name     Score\n");
        for(int i=0; i<totalSubjects; i++){
            System.out.printf("%-12s :   %.2f\n", subject[i], marks[i]);
        }
    }
}

