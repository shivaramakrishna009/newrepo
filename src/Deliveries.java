
public class Deliveries {
	private int matchId; //0
	private int innings; //1
	private String battingTeam; //2
	private String bowlingTeam; //3
	private int over; //4
	private int ball; //5
	private String batsman; //6
	private String nonStriker; //7
	private String bowler; //8
	private int isSuperOver; //9
	private int wideRuns; //10
	private int byeRuns; //11
	private int legByRuns; //12
	private int noballRuns; //13
	private int penaltyRuns; //14
	private int batsmanRuns; //15
	private int extraRuns; //16
	private int totalRuns; //17
	private String playerDismissed; //18
	private String dismissalKind; //19
	private String fielder; //20
	
	Deliveries(){
	
	}
	
	Deliveries(int matchId, int innings, String battingTeam, String bowlingTeam, int over, int ball, String batsman, String nonStriker, String bowler,
			int isSuperOver, int wideRuns, int byeRuns, int legByRuns, int noballRuns, int penaltyRuns, int batsmanRuns,int extraRuns, 
			int totalRuns, String playerDismissed, String dismissalKind, String fielder){
		this.matchId = matchId;
		this.innings = innings;
		this.battingTeam = battingTeam;
		this.bowlingTeam = bowlingTeam;
		this.over = over;
		this.ball = ball;
		this.batsman = batsman;
		this.nonStriker = nonStriker;
		this.bowler = bowler;
		this.isSuperOver = isSuperOver;
		this.wideRuns = wideRuns;
		this.byeRuns = byeRuns;
		this.legByRuns = legByRuns;
		this.noballRuns = noballRuns;
		this.penaltyRuns = penaltyRuns;
		this.batsmanRuns = batsmanRuns;
		this.extraRuns = extraRuns;
		this.totalRuns = totalRuns;
		this.playerDismissed = playerDismissed;
		this.dismissalKind = dismissalKind;
		this.fielder = fielder;
	}
	
	public int getBall() {
		return ball;
	}
	public String getBatsman() {
		return batsman;
	}
	public int getBatsmanRuns() {
		return batsmanRuns;
	}
	public String getBattingTeam() {
		return battingTeam;
	}
	public String getBowler() {
		return bowler;
	}
	public String getBowlingTeam() {
		return bowlingTeam;
	}
	public int getByeRuns() {
		return byeRuns;
	}
	public String getDismissalKind() {
		return dismissalKind;
	}
	public int getExtraRuns() {
		return extraRuns;
	}
	public String getFielder() {
		return fielder;
	}
	public int getInnings() {
		return innings;
	}
	public int getIsSuperOver() {
		return isSuperOver;
	}
	public int getLegByRuns() {
		return legByRuns;
	}
	public int getMatchId() {
		return matchId;
	}
	public int getNoballRuns() {
		return noballRuns;
	}
	public String getNonStriker() {
		return nonStriker;
	}
	public int getOver() {
		return over;
	}
	public int getPenaltyRuns() {
		return penaltyRuns;
	}
	public String getPlayerDismissed() {
		return playerDismissed;
	}
	public int getTotalRuns() {
		return totalRuns;
	}
	public int getWideRuns() {
		return wideRuns;
	}
	
	public String toString() {
		return "" + matchId + " " + innings + " " + battingTeam + " " + bowlingTeam + " " + over + " " + ball + " " + batsman + " " + 
				nonStriker + " " + bowler + " " + isSuperOver + " " + wideRuns + " " + byeRuns + " " + legByRuns + " " + noballRuns + " " +
				penaltyRuns + " " + penaltyRuns + " " + batsmanRuns + " " + extraRuns + " " + totalRuns + " " + playerDismissed + " " +
				dismissalKind + " " + fielder;
	}
	
}
