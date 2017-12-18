/**********************************************
 Course:JAC444 - 4
 Last Name: Lee
 First Name: Jongkuk
 ID: 127730158
 Section: SCC
 This assignment represents my own work in accordance with
 Seneca Academic Policy.
 Signature JK Lee
 Date: 2017-12-8
**********************************************/
package ca.jay.jac444.workshop3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusinessRuleFactoryImpl implements BusinessRuleFactoryIF {
	
	Map<String, String> rules;	
	
	BusinessRuleFactoryImpl()
	{
		rules = new HashMap<String, String>();
		rules.put(BR_ID_0001, BR_CLASS_0001);
		rules.put(BR_ID_0002, BR_CLASS_0002);		
		rules.put(BR_ID_0003, BR_CLASS_0003);
		rules.put(BR_ID_0004, BR_CLASS_0004);
		//rules.put(BR_ID_0005, BR_CLASS_0005);		
	}
	
	// check the rule
	@Override
	public boolean ruleCheck(String ruleId, List<String> list)
	{
		BusinessRuleCheckIF br = null;

		try
		{
			Class<?> cls = ClassLoader.getSystemClassLoader().loadClass(rules.get(ruleId));
			Object obj = cls.newInstance();
			br = (BusinessRuleCheckIF)obj;
			return br.check(list);			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
}
