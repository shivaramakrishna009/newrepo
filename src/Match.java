
public class Match {

	private int matchId; //0
	private int season; //1
	private String city; //2
	private String date; //3
	private String team1; //4
	private String team2; //5
	private String tossWinner; //6
	private String tossDecision; //7
	private String result; //8
	private int dlApplied; //9
	private String winner; //10
	private int winByRuns; // 11
	private int winByWickets; // 12
	private String playerOfMatch; //13
	private String venue; //14
	private String umpire1; //15
	private String umpire2; //16
	
	
	Match(){};
	
	Match(int matchId, int season, String city, String date, String team1, String team2, String tossWinner, 
			String tossDecision, String result, int dlApplied, String winner, int winByRuns, int winByWickets, 
			String playerOfMatch, String venue, String umpire1, String umpire2){
		this.matchId = matchId;
		this.season = season;
		this.city = city;
		this.date = date;
		this.team1 = team1;
		this.team2 = team2;
		this.tossWinner = tossWinner;
		this.tossDecision = tossDecision;
		this.result = result;
		this.dlApplied = dlApplied;
		this.winner = winner;
		this.winByRuns = winByRuns;
		this.winByWickets = winByWickets;
		this.playerOfMatch = playerOfMatch;
		this.venue = venue;
		this.umpire1 = umpire1;
		this.umpire2 = umpire2;		
	}
	
	public String getCity() {
		return city;
	}
	public String getDate() {
		return date;
	}
	public int getMatchId() {
		return matchId;
	}
	public String getResult() {
		return result;
	}
	public int getSeason() {
		return season;
	}
	public String getTeam1() {
		return team1;
	}
	public String getTeam2() {
		return team2;
	}
	public String getTossDecision() {
		return tossDecision;
	}
	public String getTossWinner() {
		return tossWinner;
	}
	public String getWinner() {
		return winner;
	}
	public int getDlApplied() {
		return dlApplied;
	}
	public String getPlayerOfMatch() {
		return playerOfMatch;
	}
	public String getUmpire1() {
		return umpire1;
	}
	public String getUmpire2() {
		return umpire2;
	}
	public String getVenue() {
		return venue;
	}
	public int getWinByRuns() {
		return winByRuns;
	}
	public int getWinByWickets() {
		return winByWickets;
	}
	
	public String toString() {
		return "" + matchId + " "+ season + " " +city+ " " + date+ " " + team1 + " "+ team2+ " "+ tossWinner+ " "+
				tossDecision+ " " + result+ " " + dlApplied + " "+ winner+ " " +winByRuns+" "+ winByWickets+" "
				+ playerOfMatch+" "+ venue+" "+ umpire1+" "+ umpire2;
	}
	
}
