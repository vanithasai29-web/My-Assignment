package Week4Day1Assignment;

public abstract class MySqlConnection implements databaseConnection {

	@Override
	public void connect() {

      System.out.println("Method Connect is from databaseConnection interface");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Method disconnect is from databaseConnection interface");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Method executeUpdate is from databaseConnection interface");
		
	}
	
	abstract void executeQuery();

}