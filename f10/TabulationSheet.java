class TabulationSheet {
    private String subject;
    int[] roll;
    int[] marks;
    boolean[] active;
    int capacity;

    public TabulationSheet(){
        this("default_subject", 5);
    }

    public TabulationSheet(String subject, int x){
        this.subject = subject;
        roll = new int[x];
        marks = new int[x];
        active = new boolean[x];
        for(int i=0; i<x; i++){
            active[i] = false;
        }
        capacity = x;
    }
    public int add(int roll, int marks){
        for(int i=0; i<capacity; i++){
            if(active[i]==false){
                this.roll[i] = roll;
                this.marks[i] = marks;
                active[i] = true;
                return 1;
            }
        }
        return -1;
    }

    public int getMarks(int roll){
        for(int i=0; i<capacity; i++){
            if(active[i]==true && this.roll[i]==roll){
                return marks[i];
            }
        }
        return -1;
    }

}

