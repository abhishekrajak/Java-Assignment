import java.rmi.server.*;
import java.util.Arrays;

public class SortC extends UnicastRemoteObject implements SortI{

	public SortC() throws Exception{
		super();
	}
	
	public int[] Sort(int[] array){
		Arrays.sort(array);
		return array;
	}

}
