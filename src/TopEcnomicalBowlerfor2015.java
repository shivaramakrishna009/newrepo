import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TopEcnomicalBowlerfor2015 {
	
	private List<Match> matchList = null;
	private List<Deliveries> deliveriesList = null;
	TopEcnomicalBowlerfor2015(){
		
		ReadMatchesCsv rmc = new ReadMatchesCsv();
		rmc.readData();
		matchList = rmc.getMatchesData();
		
		ReadDeliveriesCsv rdc = new ReadDeliveriesCsv();
		rdc.readData();
		deliveriesList = rdc.getDeliveriesData();
	}
	

	/**
	 * 4. For the year 2015 get the top economical bowlers.
	 */
	private String topEconomicalBowlerfor2015(List<Match> matches, List<Deliveries> deliveries) {
		String result = "";
		
		Map<String, Double> economyMap = new HashMap<>();
		
		List<Match> matchesIn2015 = getMatchesByYear(matches, 2015);
		
		
		Set<Deliveries> deliveriesIn2015 = getDeliveriesByYear(deliveries, matchesIn2015);
		
		for(Deliveries d: deliveriesIn2015) {
			if(economyMap.containsKey(d.getBowler())) {
				economyMap.put(d.getBowler(), calculateEconomy(d.getBowler(), deliveriesIn2015));
			}
			else {
				economyMap.put(d.getBowler(), calculateEconomy(d.getBowler(), deliveriesIn2015));
			}
		}
		
		Collection<Double> values =  economyMap.values();
		Double[] arr =  new Double[values.size()];
		
		arr = values.toArray(arr);
		Arrays.sort(arr);
		for(int i=0; i<10; i++) {
			for(Entry<String, Double> entry: economyMap.entrySet()) {

			if(entry.getValue() == arr[i]) {
				result += String.format((i+1) + " " + entry.getKey() + " with %.2f economy\n", entry.getValue());
			}
		}
		}
		

		return result;
		
	}

	private static Double calculateEconomy(String bowler, Set<Deliveries> deliveriesIn2015) {
		// TODO Auto-generated method stub
		int balls = 0;
		int runs = 0;
		double economy = 0.0;
		for(Deliveries d:deliveriesIn2015) {
			if(d.getBowler().equalsIgnoreCase(bowler)) {
				runs+=d.getTotalRuns();
				balls++;
			}
		}
		economy = runs/(balls/6.0)*1.0d;
		return economy;
	}

	private static Set<Deliveries> getDeliveriesByYear(List<Deliveries> deliveries, List<Match> matchesIn2015) {
		// TODO Auto-generated method stub
		Set<Deliveries> result = new HashSet<>();
		
		for(Match m: matchesIn2015) {
			for(Deliveries d: deliveries) {
				if(m.getMatchId()==d.getMatchId()) {
					result.add(d);
					
				}
			}
		}
		
		return result;
	}

	private static List<Match> getMatchesByYear(List<Match> matches, int i) {
		// TODO Auto-generated method stub
		List<Match> result = new ArrayList<>();
		
		for(Match m: matches) {
			if(m.getSeason() == i) {
				if(result.contains(m) == false) {
					result.add(m);
				}
			}
		}
		
		return result;
	}

	public String getTopEconomicalBowlerfor2015() {
		return topEconomicalBowlerfor2015(matchList, deliveriesList);
	}
}
