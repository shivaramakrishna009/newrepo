import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IplProject {
	public static void main(String[] args) {
		
		YearWiseMatchCount count = new YearWiseMatchCount();
		String yearWiseMatches = count.getYearWiseMatchCount();
		System.out.println("Year Wise Data:\n" + yearWiseMatches);
		
		TeamsWiseWinningData data = new TeamsWiseWinningData();
		String teamWiseWonData = data.getWonedMatchesCountOverAllYears();
		System.out.println("Team wise wonned data for all seasons:\n" + teamWiseWonData);
		
		ExtraRunsConcededByEachTeamin2016 extraRuns = new ExtraRunsConcededByEachTeamin2016();
		String extraRunsPerTeam = extraRuns.getExtraRunsConcededByEachTeamin2016();
		System.out.println("Extra runs owned by each team in 2016:");
		System.out.println(extraRunsPerTeam);
		
		
		TopEcnomicalBowlerfor2015 economicalBowlers = new TopEcnomicalBowlerfor2015();
		String topBowler = economicalBowlers.getTopEconomicalBowlerfor2015();
		System.out.println("Top 10 economical bowlers for the year 2015: ");
		System.out.println(topBowler);
		
		Total6sHitByGivenPlayer total6s = new Total6sHitByGivenPlayer();
		String playerName = "MS Dhoni";
		int countOf6s = total6s.getTotal6sHitByGivenPlayer(playerName);
		System.out.println("6's hit by player "+ playerName + " in his Carrier are " +countOf6s);
		
	}
		
}
