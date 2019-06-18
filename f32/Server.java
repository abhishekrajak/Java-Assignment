import java.rmi.*;

public class Server{
	public static void main(String[] args) throws Exception {
		SortC obj = new SortC();
		Naming.rebind("Sort_Array", obj);
		System.out.println("Server Started");
	}

}
