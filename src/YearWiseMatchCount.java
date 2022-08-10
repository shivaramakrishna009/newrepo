import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YearWiseMatchCount {
	private List<Match> matchList = null;
	YearWiseMatchCount(){
		
		ReadMatchesCsv rmc = new ReadMatchesCsv();
		rmc.readData();
		matchList = rmc.getMatchesData();
		
	}
	
	/**
	 *  1. Number of matches played per year of all the years in IPL.
	 */
	
	public String yearWiseMatchCount(List<Match> lst) {
		
		Map<Integer, Integer> matchCount = new HashMap<>();
		String result = "";
		for(Match m: lst) {
			if(matchCount.containsKey(m.getSeason())) {
				matchCount.put(m.getSeason(), matchCount.get(m.getSeason())+1);
			}
			else {
				matchCount.put(m.getSeason(), 1);
			}
		}
		
		for(Integer year: matchCount.keySet()) {
			result += "In " + year + ", " + matchCount.get(year) + " matches\n";
		}
		
		return result;
	}
	
	public String getYearWiseMatchCount() {
		return yearWiseMatchCount(matchList);
	}
}
