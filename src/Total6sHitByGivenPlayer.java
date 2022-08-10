import java.util.List;

public class Total6sHitByGivenPlayer {

	private List<Match> matchList = null;
	private List<Deliveries> deliveriesList = null;
	Total6sHitByGivenPlayer(){
		
		ReadMatchesCsv rmc = new ReadMatchesCsv();
		rmc.readData();
		matchList = rmc.getMatchesData();
		
		ReadDeliveriesCsv rdc = new ReadDeliveriesCsv();
		rdc.readData();
		deliveriesList = rdc.getDeliveriesData();
	}
	
	/**
	 * 5. Create your own scenario: total number of 6's hit by given player in all seasons.
	 */
	
	private int total6sHitByGivenPlayer(String player, List<Deliveries> deliveries) {
		int result = 0;
		
		for(Deliveries d: deliveries) {
			if(d.getBatsman().equalsIgnoreCase(player)) {
				if(d.getBatsmanRuns() == 6) {
					result++;
				}
			}
		}
		
		return result;
	}
	
	public int getTotal6sHitByGivenPlayer(String player) {
		return total6sHitByGivenPlayer(player, deliveriesList);
	}
}
