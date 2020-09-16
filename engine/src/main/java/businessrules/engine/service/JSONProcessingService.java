package businessrules.engine.service;

import busineesrules.engine.model.Rules;
import busineesrules.engine.model.RulesData;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONProcessingService {
	
	public RulesData prepareRulesDataFromJSON(){
		ObjectMapper objectMapper = new ObjectMapper();
		File file =new File(getClass().getClassLoader().getResource("rulesData.json").getFile());
		RulesData rulesData = new RulesData();
		try {
			 rulesData = objectMapper.readValue(file, RulesData.class);
		} catch (Exception e) {
			System.out.println("Exception occurred while processing json file.");
			e.printStackTrace();
		} 
		return rulesData;
	}

}
