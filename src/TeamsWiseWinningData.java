import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeamsWiseWinningData {

	private List<Match> matchList = null;
	TeamsWiseWinningData(){
		
		ReadMatchesCsv rmc = new ReadMatchesCsv();
		rmc.readData();
		matchList = rmc.getMatchesData();
	}
	
	/**
	 * 2. Number of matches won of all teams over all the years of IPL.
	 */
	
	private String wonedMatchesCountOverAllYears(List<Match> lst) {
		String result = "";
		
		Map<String, Integer> winMap = new HashMap<>();
		
		for(Match m: lst) {
			int count;
			if(winMap.containsKey(m.getTeam1())) {
				count = 0;
				for(Match mat: lst) {
					if(m.getTeam1().equalsIgnoreCase(mat.getWinner())) {
						count++;
					}
				}
				
				winMap.put(m.getTeam1(), count);
			}
			else {
				winMap.put(m.getTeam1(), 0);
			}
		}
		for(String team: winMap.keySet()) {
			result += team + " woned " + winMap.get(team) + " matches\n";
		}
		return result;
	}
	
	public String getWonedMatchesCountOverAllYears() {
		return wonedMatchesCountOverAllYears(matchList);
	}
}
