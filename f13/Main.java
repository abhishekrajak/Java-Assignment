class Main {

    public static void main(String[] args) {
        Date myDate = new Date(new Date(14, 04, 1997) );
        Date joinDate = new Date(1, 2, 2017);
        Person object = new Person("Abhishek Rajak", 21, 50, 160, myDate, "Park Street");

        object.display();
        System.out.println();

        Employee object2 = new Employee(object, 10000, joinDate, 2);
        object2.display();
        System.out.println();

        String[] subject = new String[6];
        float marks[] = new float[6];
        for(int i=0, j = 70; i<5; i++, j+=5){
            subject[i] = "subject_0" + Integer.toString(i+1);
            marks[i] = j;
        }

        Student object3 = new Student(object, 24, subject, marks, 6);
        object3.display();
        System.out.println("Overall grade : " + object3.calculateGrade());
        System.out.println();

        Technician object4 = new Technician(object2);
        object4.display();
        System.out.println();

        String[] courses = new String[5];
        String[] advisee = new String[5];
        for(int i=0; i<5; i++){
            courses[i] = "Course_0" + Integer.toString(i+1);
            advisee[i] = "Advisee_0" + Integer.toString(i+1);
        }
        Professor object5 = new Professor(object2, courses, 5, advisee, 5);
        object5.display();
    }
}

