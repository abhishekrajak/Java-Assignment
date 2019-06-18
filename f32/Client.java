import java.rmi.*;

public class Client{
	public static void main(String[] args) throws Exception {		
		System.out.println("Client Started");
		SortI obj = (SortI)Naming.lookup("Sort_Array");
		int[] array = new int[10];
        	for(int i=10, j=0; i>0; i--,j++){
            		array[j] = i;
        	}
		for(int i : array){
            		System.out.printf(i + " ");
        	}
		System.out.printf("\n");
		array = obj.Sort(array);
		System.out.printf("After Sorting via server\n");		
		for(int i : array){
            		System.out.printf(i + " ");
        	}
		System.out.printf("\n");
	}
}
