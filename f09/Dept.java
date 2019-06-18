class Dept {
    String name;
    String location;
    private Employee[] list;
    boolean[] active;
    private int total_count;

    public Dept(){
        this("default_name", "default_Location", 10);
    }
    public Dept(String name, String location){
        this(name, location, 10);
    }
    public Dept(String name, String location, int x){
        this.name = name;
        this.location = location;
        list = new Employee[x];
        active = new boolean[x];
        for(int i=0; i<x; i++){
            active[i] = false;
        }
        total_count = x;
    }
    public int add(Employee object){
        int emptyIndex = -1;
	for(int i=0; i<total_count; i++){
            if(!active[i] && emptyIndex!=-1){
		emptyIndex = i;
            }
	    else if(active[i]){
		if(list[i].getId()==object.getId()){
			System.out.println("Duplicate ID found\n");
			object.display();
			return -1;
		}
	    }
        }
	if(emptyIndex!=-1){
		list[emptyIndex] = new Employee(object);
		active[emptyIndex] = true;
		return 1;
	}
	
        Employee[] newList = new Employee[total_count+10];
	boolean[] newActive = new boolean[total_count+10];
	int newTotal_Count = total_count+10;
	for(int i=0; i<total_count; i++){
		newList[i] = list[i];
		newActive[i] = active[i];
	}
	newList[total_count] = new Employee(object);
	newActive[total_count] = true;
	for(int i=total_count+1; i<newTotal_Count; i++){
		newActive[i] = false;
	}
	list = newList;
	active = newActive;
	total_count = newTotal_Count;
	return 2;
    }
    public int remove(Employee object){
        for(int i=0; i<total_count; i++){
            if(active[i]){
                if(list[i].getId()==object.getId()){
                    active[i] = false;
                    return 1;
                }
            }
        }
        return -1;
    }

    public void display(){
        System.out.printf("Dept. Details : \nName : %s\nLocation : %s\n\nEmployee details : \n\n", name, location);
        for(int i=0; i<total_count; i++){
            if(active[i]){
                list[i].display();
            }
        }
        System.out.println("");
    }

    public float getExpenditure(){
        float totalExpenditure = 0;
        for(int i=0; i<total_count; i++){
            if(active[i]){
                totalExpenditure+=list[i].getSalary();
            }
        }
        return totalExpenditure*12;
    }
}

