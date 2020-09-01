package gson.gson;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App{
    
	public static void main( String[] args ){
    	
//		JAVA -> JSON
		User user = new User("Erisvam", 20, 1000.00);
		String json = "";
		Gson gson = new Gson();
		json = gson.toJson(user);
		System.out.println(json);
    
//		JSON -> JAVA
		User userFromJson = gson.fromJson(json, User.class);
		System.out.println(userFromJson.getNome());
		System.out.println(userFromJson.getIdade());
		System.out.println(userFromJson.getSalario());
	}
}
