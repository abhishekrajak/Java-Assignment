class Manager {
    private Account[] list;
    private boolean[] active;
    private int capacity;

    public Manager(){
        this(10);
    }
    public Manager(int x){
        list = new Account[x];
        active = new boolean[x];
        for(int i=0; i<x; i++){
            active[i] = false;
        }
        capacity = x;
    }

    public int add(SavingsAccount object){
        int emptyIndex = -1;
	for(int i=0; i<capacity; i++){
            if(!active[i] && emptyIndex== -1){
		emptyIndex = i;
	    }
	    else if(active[i]){
		if(object.getAccountNumber()==list[i].getAccountNumber()){
			System.out.println("Duplicate Account Found");
			System.out.println("Account # : " + object.getAccountNumber());
			System.out.println("Account Holder Name : " + object.getHolderName());
			return -1;
		}		
            }
        }
        if(emptyIndex!=-1){
		list[emptyIndex] = new SavingsAccount(object);
		active[emptyIndex] = true;
		return 1;
	}
	else{
		resize();
		return add(object);
	}
    }

    public int add(CurrentAccount object){
        int emptyIndex = -1;
        for(int i=0; i<capacity; i++){
            if(!active[i] && emptyIndex== -1){
                emptyIndex = i;
            }
            else if(active[i]){
                if(object.getAccountNumber()==list[i].getAccountNumber()){
                        System.out.println("Duplicate Account Found");
                        System.out.println("Account # : " + object.getAccountNumber());
                        System.out.println("Account Holder Name : " + object.getHolderName());
                        return -1;
                }
            }
        }
        if(emptyIndex!=-1){
                list[emptyIndex] = new CurrentAccount(object);
                active[emptyIndex] = true;
                return 1;
        }
        else{
                resize();
                return add(object);
        }

    }
    public void resize(){
	Account[] newList = new Account[capacity+10];
	boolean[] newActive = new boolean[capacity+10];
	int newCapacity = capacity+10;
	for(int i=0; i<capacity; i++){
		newList[i] = list[i];
		newActive[i] = active[i];
	}
	for(int i=capacity; i<newCapacity; i++){
		newActive[i] = false;
	}
    }
    public int remove(int accountNumber){
        for(int i=0; i<capacity; i++){
            if(active[i]==true && list[i].getAccountNumber()==accountNumber){
                active[i] = false;
                return 1;
            }
        }
        return -1;
    }

    public void display(){
        for(int i=0; i<capacity; i++){
            if(active[i]==true){
                list[i].display();
            }
        }
    }

}

