class Library {
    private Publication[] list;
    private boolean[] active;
    private int capacity;

    public Library(){
        this(10);
    }
    public Library(int x){
        list = new Publication[x];
        active = new boolean[x];
        for(int i=0; i<x; i++){
            active[i] = false;
        }
        capacity = x;
    }
    public int add(final Book object){
        int emptyIndex = -1;
	for(int i=0; i<capacity; i++){
            if(!active[i] && emptyIndex==-1){
		emptyIndex = i;
            }
	    else if(active[i]){
		if(list[i].getClass().getName().equals(object.getClass().getName())){
			if(((Book)list[i]).getBookName().equals(object.getBookName())){
				System.out.println("Duplicate Book found");
				object.display();
				return -1;
			}
		}
	    }
        }
	if(emptyIndex!=-1){
		list[emptyIndex] = new Book(object);
		active[emptyIndex] = true;
		return 1;
	}
	else{
		resize();
		return add(object);
	}
    }
    public int add(final Journal object){
        int emptyIndex = -1;
        for(int i=0; i<capacity; i++){
            if(!active[i] && emptyIndex==-1){
                emptyIndex = i;
            }
            else if(active[i]){
                if(list[i].getClass().getName().equals(object.getClass().getName())){
                        if(((Journal)list[i]).getJournalName().equals(object.getJournalName())){
                                System.out.println("Duplicate Journal found");
                                object.display();
                                return -1;
                        }
                }
            }
        }
        if(emptyIndex!=-1){
                list[emptyIndex] = new Journal(object);
                active[emptyIndex] = true;
                return 1;
        }
        else{
                resize();
                return add(object);
        }
    }
    public int add(final Publication object){
	if(object==null){
		return -2;
	}
	if(object.getClass().getName().equals(Book.class.getName())){
		return add((Book)object);
	}
	if(object.getClass().getName().equals(Journal.class.getName())){
		return add((Journal)object);
	}
	System.out.println("Unknown case");
    	return -4;
    }
    public void resize(){
	Publication[] newList = new Publication[capacity+10];
	boolean[] newActive = new boolean[capacity+10];
	int newCapacity = capacity+10;
	for(int i=0; i<capacity; i++){
		newList[i] = list[i];
		newActive[i] = active[i];
	}
	for(int i = capacity+1; i<newCapacity; i++){
		newActive[i] = false;
	}
	list = newList;
	active = newActive;
	capacity = newCapacity;
    }

    public void display(){
	System.out.println("Library Details : \n");
        for(int i=0; i<capacity; i++){
            if(active[i]==true){
                list[i].display();
            	System.out.printf("\n");
	    }
        }
    }

}

