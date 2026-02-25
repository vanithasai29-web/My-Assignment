package Week4Day1Assignment;

import java.util.ArrayList;
import java.util.List;

public class JavaConnection extends MySqlConnection{

	@Override
	void executeQuery() {
		System.out.println("Method executequery is from MySQL abstract class");
		
	}
		
	public static void main(String[] args) {
		
		List<Integer> Value = new ArrayList<Integer>();
		
		JavaConnection Obj = new JavaConnection();
		Obj.connect();
		Obj.executeQuery();
		Obj.executeUpdate();
		Obj.disconnect();
	
		
	}

		
	}

