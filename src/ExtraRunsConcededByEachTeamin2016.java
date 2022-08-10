import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExtraRunsConcededByEachTeamin2016 {

	private List<Match> matchList = null;
	private List<Deliveries> deliveriesList = null;
	ExtraRunsConcededByEachTeamin2016(){
		
		ReadMatchesCsv rmc = new ReadMatchesCsv();
		rmc.readData();
		matchList = rmc.getMatchesData();
		
		ReadDeliveriesCsv rdc = new ReadDeliveriesCsv();
		rdc.readData();
		deliveriesList = rdc.getDeliveriesData();
	}
	
	/**
	 * 3. For the year 2016 get the extra runs conceded per team.
	 */
	private String extraRunsConcededByEachTeamin2016(List<Match> matches, List<Deliveries> deliveries) {
		String result = "";
		
		Map<String, Integer> winMap = new HashMap<>();
		
		for(Match m: matches) {
			int count;
			if(m.getSeason() == 2016) {
				if(winMap.containsKey(m.getTeam1())) {
					count = 0;
					for(Deliveries d: deliveries) {
						if(m.getMatchId() == d.getMatchId()) {
							count+=d.getExtraRuns();
						}
					}
					
					winMap.put(m.getTeam1(), count);
				}
				else {
					winMap.put(m.getTeam1(), 0);
				}
			}
			
		}
		for(String team: winMap.keySet()) {
			result += team + " got " + winMap.get(team) + " extra runs\n";
		}
		return result;
		
	}
	
	public String getExtraRunsConcededByEachTeamin2016() {
		return extraRunsConcededByEachTeamin2016(matchList, deliveriesList);
	}
	
}
