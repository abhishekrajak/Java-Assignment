class BinarySearchThread extends Thread {
    private int[] data;
    private int e;

    public BinarySearchThread(int[] data, int l, int r, int e){
        this.data = new int[r-l+1];
        for(int i=0; i<this.data.length; i++){
            this.data[i] = data[l++];
        }
        this.e = e;
    }

    @Override
    public void run(){
        int l = 0, r = data.length-1, m;
        while (!(l>r)){
            m = (l+r)/2;
            if(data[m]==e){
                System.out.println("data found at Thread Index : " + getName() + " location data[" + (Integer.parseInt(getName().substring(7))*(data.length)+m) + "]");
                return;
            }
            else if(data[m]>e){
                r = m-1;
            }
            else{
                l = m+1;
            }
        }
        System.out.println("Data not found at Thread Index : " + getName());
    }
}

