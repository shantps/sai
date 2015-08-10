package raisingteam;
 
import java.io.FileWriter;
import java.io.IOException;

import raisingteam.Login;

import com.google.gson.Gson;
 
public class JavaObjectToJsonConvertor {
    public static void main(String[] args) {
 
	//Login obj = new Login("SAI","SAI");
    SignUp obj = new SignUp("saikrupa@gmail.com","SAI","sai","krupa", "");
	Gson gson = new Gson();
 
	// convert java object to JSON format,
	// and returned as JSON formatted string
	String json = gson.toJson(obj);
 
	try {
		//write converted json data to a file named "file.json"
		FileWriter writer = new FileWriter("C://Users//sbm//Desktop//SAIKRUPA-ME//SaiKrupa//signUP.json");
		writer.write(json);
		writer.close();
 
	} catch (IOException e) {
		e.printStackTrace();
	}
 
	System.out.println(json);
 
    }
}