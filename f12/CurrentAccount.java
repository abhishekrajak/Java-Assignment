class CurrentAccount extends Account {
    public CurrentAccount(){
        super();
    }
    public CurrentAccount(int accountNumber, String holderName, float balance){
        super(accountNumber, holderName, balance);
    }

    public CurrentAccount(final CurrentAccount object){
        this(object.getAccountNumber(), object.getHolderName(), object.getBalance());
    }


}

