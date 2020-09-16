package businessrules.engine;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import businessrules.engine.service.JSONProcessingService;

public class BusinessRulesTest {
	
	@Test
	public void testJSONFile(){
		JSONProcessingService service = new JSONProcessingService();
		
		assertNotNull(service.prepareRulesDataFromJSON());
	}
	
	@Test
	public void testForPhyicalProduct(){
		BusinessRules br = new BusinessRules();
		List<String> list = new ArrayList<>();
		list.add("generateSlipForPackaging");
		list.add("generateCommisssion");
		assertEquals(br.getOutcome("physicalProduct"),list );
	}
	
	@Test
	public void testForBook(){
		BusinessRules br = new BusinessRules();
		List<String> list = new ArrayList<>();
		list.add("createDuplicateSlip");
		list.add("generateCommission");
		assertEquals(br.getOutcome("book"),list );
	}
	
	@Test
	public void testForMembership(){
		BusinessRules br = new BusinessRules();
		List<String> list = new ArrayList<>();
		list.add("activateMembership");
		list.add("emailOwner");
		assertEquals(br.getOutcome("membership"),list );
	}
	
	@Test
	public void testForUpgradeMembership(){
		BusinessRules br = new BusinessRules();
		List<String> list = new ArrayList<>();
		list.add("upgradeMemebeship");
		list.add("emailOwner");
		assertEquals(br.getOutcome("upgradeMemebeship"),list );
	}
	
	@Test
	public void testForLearnToSki(){
		BusinessRules br = new BusinessRules();
		List<String> list = new ArrayList<>();
		list.add("firstAid");
		assertEquals(br.getOutcome("learnToSki"),list );
	}

}
