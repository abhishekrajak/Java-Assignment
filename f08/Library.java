class Library{
    Book[] list;
    boolean[] active;
    int total_capacity;

    Library(){
	this(10);
    }
    Library(int x){
        list = new Book[x];
        active = new boolean[x];
        for(int i=0; i<x; i++){
            active[i] = false;
        }
        total_capacity = x;
    }
    int add(Book object){
        int emptyIndex = -1;
	for(int i=0; i<total_capacity; i++){
            if(!active[i] && emptyIndex!=-1){
                emptyIndex = i;
            }
	    else if(active[i]){
		if(list[i].getTitle().equals(object.getTitle())){
			System.out.println("Duplicate Book found\nBook Details : ");
			object.display();
			System.out.println("\n");
			return -1;
		}
	    }
        }
	if(emptyIndex!=-1){
		list[emptyIndex] = new Book(object);
		active[emptyIndex] = true;
		return 1;
	}	
        Book[] newList = new Book[total_capacity+10];
	boolean[] newActive = new boolean[total_capacity+10];
	int newTotal_Capacity = total_capacity+10;
	for(int i=0; i<total_capacity; i++){
		newList[i] = list[i];
		newActive[i] = active[i];
	}
	newList[total_capacity] = new Book(object);
	newActive[total_capacity] = true;
	for(int i=total_capacity+1; i<newTotal_Capacity; i++){
		newActive[i] = false;
	}
	list = newList;
	active = newActive;
	total_capacity = newTotal_Capacity;
	return 2;
    }
    int delete(Book object){
        for(int i=0; i<total_capacity; i++){
            if(active[i]==true){
                if(list[i]==object){
                    active[i] = false;
                    return 1;
                }
            }
        }
        return -1;
    }

    public void display(){
        for(int i=0; i<total_capacity; i++){
            if(active[i]==true){
                list[i].display();
                System.out.println("");
            }
        }
    }

    public float total_Price(){
        float price = 0;
        for(int i=0; i<total_capacity; i++){
            if(active[i]==true){
                price+=list[i].getPrice();
            }
        }
        return price;
    }

}
