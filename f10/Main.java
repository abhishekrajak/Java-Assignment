class Main {

    public static void main(String[] args) {
        String[] subject_name = new String[5];
        for(int i=0; i<5; i++){
            subject_name[i] = "subject_0" + Integer.toString(i+1);
        }

        Student stud_obj1 = new Student("Abhishek Rajak", 24, subject_name, 5);
        Student stud_obj2 = new Student("Ashok Rajak", 56, subject_name, 5);
        Student stud_obj3 = new Student("Manas Ghosh", 48, subject_name, 5);

        int marks1 = 60, marks2 = 70, marks3 = 80;

        TabulationSheet[] tab_obj = new TabulationSheet[5];

        for(int i=0; i<5; i++){
            tab_obj[i] = new TabulationSheet(subject_name[i], 3);
            tab_obj[i].add(stud_obj1.getRoll(), marks1);
            tab_obj[i].add(stud_obj2.getRoll(), marks2);
            tab_obj[i].add(stud_obj3.getRoll(), marks3);
            marks1+=5;
            marks2+=5;
            marks3+=5;
        }

        MarkSheet markobj1 = new MarkSheet(stud_obj1, tab_obj, 5);
        MarkSheet markobj2 = new MarkSheet(stud_obj2, tab_obj, 5);
        MarkSheet markobj3 = new MarkSheet(stud_obj3, tab_obj, 5);

        markobj1.display();
        markobj2.display();
        markobj3.display();


    }
}

