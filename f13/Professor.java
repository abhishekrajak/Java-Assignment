class Professor extends Employee{
    private String[] courses;
    private boolean[] activeCourses;
    private int coursesCapacity;

    private String[] listOfAdvisee;
    private boolean[] activeAdvisee;
    private int adviseeCapacity;

    public Professor(){
        super();
        this.courses = new String[15];
        this.listOfAdvisee = new String[15];
        this.activeAdvisee = new boolean[15];
        this.activeCourses = new boolean[15];
        for(int i=0; i<10; i++){
            courses[i] = "default_course_" + Integer.toString(i+1);
            listOfAdvisee[i] = "advisee_# " + Integer.toString(i+1);
            activeCourses[i] = activeAdvisee[i] = false;
        }
        this.coursesCapacity = this.adviseeCapacity = 15;

    }

    public Professor(String name, int age, float weight, float height, Date dateOfBirth, String address, float salary, Date dateOfJoining, float experience, String[] courses, int coursesCount, String[] listOfAdvisee, int adviseeCount){
        super(name, age, weight, height, dateOfBirth, address, salary, dateOfJoining, experience);
        setMembers(courses, coursesCount, listOfAdvisee, adviseeCount);
    }

    public Professor(final Employee object, String[] courses, int coursesCount, String[] listOfAdvisee, int adviseeCount){
        super(object);
        setMembers(courses, coursesCount, listOfAdvisee, adviseeCount);
    }

    public void setMembers(String[] courses, int coursesCount, String[] listOfAdvisee, int adviseeCount){
        this.coursesCapacity = coursesCount+5;
        this.courses = new String[coursesCapacity];
        this.activeCourses = new boolean[coursesCapacity];
        for(int i=0; i<coursesCapacity; i++) {
            activeCourses[i] = false;
            if (i < coursesCount) {
                addCourse(courses[i]);
            }
        }

        this.adviseeCapacity = adviseeCount+5;
        this.listOfAdvisee = new String[adviseeCapacity];
        this.activeAdvisee = new boolean[adviseeCapacity];
        for(int i=0; i<adviseeCount; i++){
            activeAdvisee[i] = false;
            if(i < adviseeCount){
                addAdvisee(listOfAdvisee[i]);
            }
        }

    }

    public int addCourse(String courseName){
        for(int i=0; i<coursesCapacity; i++){
            if(activeCourses[i]==false){
                courses[i] = courseName;
                activeCourses[i] = true;
                return 1;
            }
        }
        return -1;
    }
    public int removeCourse(String courseName){
        for(int i=0; i<coursesCapacity; i++){
            if(activeCourses[i]==true && courses[i]==courseName){
                activeCourses[i] = false;
                return 1;
            }
        }
        return -1;
    }

    public int addAdvisee(String adviseeName){
        for(int i=0; i<adviseeCapacity; i++){
            if(activeAdvisee[i]==false){
                listOfAdvisee[i] = adviseeName;
                activeAdvisee[i] = true;
                return 1;
            }
        }
        return -1;
    }

    public int removeAdvisee(String adviseeName){
        for(int i=0; i<adviseeCapacity; i++){
            if(activeAdvisee[i]==true && listOfAdvisee[i]==adviseeName){
                activeAdvisee[i] = false;
                return 1;
            }
        }
        return -1;
    }

    public void display(){
        super.display();
        System.out.printf("Job : Professor\nList of Courses Taught : \n");
        for(int i=0; i<coursesCapacity; i++){
            if(activeCourses[i]==true){
                System.out.println(courses[i]);
            }
        }
        System.out.printf("List of Advisee : \n");
        for(int i=0; i<adviseeCapacity; i++){
            if(activeAdvisee[i]==true){
                System.out.println(listOfAdvisee[i]);
            }
        }
    }
}

