import java.util.Scanner;
class Main {
    public static void main(String[] args) {
	   int val = -1;
	   Scanner Scan = new Scanner(System.in);
  	   System.out.print("Enter the value of no for the series : ");
	   val = Scan.nextInt();
	   if(val>-1){
		DataObject dataObject = new DataObject();
	        t1 thread1 = new t1(val+1, dataObject);
        	t2 thread2 = new t2(val+1, dataObject);

           	thread1.start();
           	thread2.start();
	   }
    }

}
