import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.printf("Enter the # of threads that you want to have : ");
        int n = getInt();
        Random random = new Random();
        int[] array = new int[n*10];
        for(int i = 0, j = 1; i<array.length; i++, j+=(random.nextInt(n)+1)){
            array[i] = j;
            System.out.print(array[i] + " ");
        }
        System.out.printf("\nEnter the value of e that needs to be searched : ");
        int e = getInt();
        BinarySearchThread[] t = new BinarySearchThread[n];
        for(int i=0, l = 0, r = 9; i<n; i++, l+=10, r+=10){
            t[i] = new BinarySearchThread(array, l, r, e);
        }
        for(int i=0; i<n; i++){
            t[i].start();
        }
    }
    public static int getInt(){
        int n;
        while(true){
            try{
                n = new Scanner(System.in).nextInt();
                return n;
            }catch(Exception e){
                System.out.printf("Invalid input try again now : ");
            }
        }
    }
}

