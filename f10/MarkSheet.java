class MarkSheet {
    private Student student_object;
    private int[] marks;

    public MarkSheet(){
        student_object = new Student();
        marks = new int[5];
    }
    public MarkSheet(Student student_object, TabulationSheet[] tabulation_object, int x){
        this.student_object = new Student(student_object);
        this.setMarks(student_object, tabulation_object, x);
    }

    public int setMarks(Student student_object, TabulationSheet[] tabulation_object, int x){
        marks = new int[x];
        for(int i=0; i<x; i++){
            this.marks[i] = tabulation_object[i].getMarks(student_object.getRoll());
        }
        return 1;
    }

    public void display(){
        student_object.display();
        System.out.println("Subject_Name Marks");
        for(int i=0; i<student_object.getTotal_subjects(); i++){
            System.out.println(student_object.getSubject_name(i) + "    " + marks[i]);
        }
        System.out.println("");
    }

}

