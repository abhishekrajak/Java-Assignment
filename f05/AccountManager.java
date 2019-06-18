class AccountManager {
    private BankAccount[] list;
    private boolean[] active;
    private int total_accounts;

    AccountManager(){
        this(10);
    }
    AccountManager(int x){
        list = new BankAccount[x];
        active = new boolean[x];
        for(int i=0; i<x; i++){
            active[i] = false;
        }
        total_accounts = x;
    }
    public int create(int accountNumber, float balance, String ownerName){
        BankAccount object = new BankAccount(accountNumber, balance, ownerName);
	return this.create(object);
    }
    public int create(BankAccount object){
        int emptyIndex = -1;
	for(int i=0; i<total_accounts; i++){
            if(!active[i] && emptyIndex!=-1){
		emptyIndex = i;
            }
	    else if(active[i]){
		if(list[i].getAccountNumber()==object.getAccountNumber()){
			System.out.println("Duplicate Account found this account will not be added again");
			System.out.println("Duplicate Account Details : ");
			object.details();
			return -1;
		}
	    }
        }
	if(emptyIndex!=-1){
		list[emptyIndex] = new BankAccount(object);
		active[emptyIndex] = true;
		return 1;
	}	
	BankAccount[] newList = new BankAccount[total_accounts+10];
	boolean[] newActive = new boolean[total_accounts+10];
	int newTotal_Accounts = total_accounts+10;
	for(int i=0; i<total_accounts; i++){
		newList[i] = list[i];
		newActive[i] = active[i];
	}
	newList[total_accounts] = new BankAccount(object);
	newActive[total_accounts] = true;
	for(int i=total_accounts+1; i<newTotal_Accounts; i++){
		newActive[i] = false;
	} 
	list = newList;
	active = newActive;
	total_accounts = newTotal_Accounts;
        return 2;
    }
    public int delete(int accountNumber){
        for(int i=0; i<total_accounts; i++){
            if(active[i]){
                if(list[i].getAccountNumber()==accountNumber){
                    active[i] = false;
                    list[i] = null;
		    return 1;
                }
            }
        }
        return -1;
    }
    public int delete(BankAccount object){
        return delete(object.getAccountNumber());
    }
    public int deposit(int accountNumber, float balance){
        for(int i=0; i<total_accounts; i++){
            if(active[i]){
                if(list[i].getAccountNumber()==accountNumber){
                    return list[i].add(balance);
                }
            }
        }
        return -1;
    }
    public int withdraw(int accountNumber, float balance){
        for(int i=0; i<total_accounts; i++){
            if(active[i]){
                if(list[i].getAccountNumber()==accountNumber){
                    return list[i].subtract(balance);
                }
            }
        }
        return -1;
    }
    public void display(){
        for(int i=0; i<total_accounts; i++){
            if(active[i]){
                list[i].details();
            }
        }
    }
}

