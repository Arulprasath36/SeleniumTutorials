package jsonOperations;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWritingExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		JSONObject jsonObject= new JSONObject();
		jsonObject.put("Name", "Agniprasath");
		jsonObject.put("Age", 1);
		
		//["magical smile","magnetic eyes"]
		
		JSONArray array = new JSONArray();
		array.add("magical smile");
		array.add("magnetic eyes");
		
		jsonObject.put("Special Qualities", array);
		
		FileWriter fileWriter = new FileWriter("agniprasath.json");
		
		fileWriter.write(jsonObject.toJSONString());
		fileWriter.close();
		
		
		
	}

}
