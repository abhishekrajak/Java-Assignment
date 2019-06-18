import java.rmi.Remote;

public interface SortI extends Remote{
	public int[] Sort(int[] array) throws Exception;	

}
