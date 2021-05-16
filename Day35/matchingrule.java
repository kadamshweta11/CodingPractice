package Day35;

import java.util.List;

public class matchingrule {
	public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ruleI=RuleKey(ruleKey);
        int count=0;
       
        for( List<String> item:items){
            if(item.get(ruleI).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
    public int RuleKey(String ruleKey){
        if(ruleKey.equals("type")) return 0;
        else if(ruleKey.equals("color")) return 1;
        else return 2;
    }

}
