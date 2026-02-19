package Week3Day4Assignment;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("Print as "+ endpoint);

	}
	

	public void sendRequest(String endpoint, String requestBody, boolean a) {
		System.out.println("Print as "+ endpoint);
		System.out.println("Print as "+ requestBody);
		System.out.println("Print as "+ a);

	}
	
	public static void main(String[] args) {
		APIClient objClient = new APIClient();
		objClient.sendRequest("Test override with 1 Argument");
		objClient.sendRequest("Test override with 3 Argument", "Working", true);
		
	}

}
