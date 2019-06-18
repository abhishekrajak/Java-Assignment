class Stack {
    private int[] data;
    private int top;
    private int size;
    public Stack(){
        this(30);
    }
    public Stack(int size){
        this.size = size;
        top = -1;
        data = new int[size];
    }
    public int push(int value){
        if(top<size-1){
            data[++top] = value;
            return 1;
        }
        return 0;
    }
    public int pop(){
        if(top>-1){
            top--;
            return 1;
        }
        return 0;
    }
    public void print(){
        for(int i=0; i<=top; i++){
            System.out.print(data[i] + " ");
        }
        System.out.print("\n");
    }
}
