package businessrules.engine;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import busineesrules.engine.model.Rules;
import busineesrules.engine.model.RulesData;
import businessrules.engine.service.JSONProcessingService;

public class BusinessRules {

	public List<String> getOutcome(String product) {
		JSONProcessingService service = new JSONProcessingService();
		RulesData rulesData = service.prepareRulesDataFromJSON();
		ArrayList<Rules> rules = rulesData.getRulesData();
		return rules.stream().filter(a -> a.getProduct().equals(product)).map(b -> b.getActions())
				.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		BusinessRules br = new BusinessRules();
		System.out.println(br.getOutcome("book"));
	}
}
