import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReadMatchesCsv {
	
	private  List<Match> matchesData = new ArrayList<Match>();
	
	public void readData() {
		String fileLoc = "C:\\Users\\NEW\\Downloads\\iplProjectRawData\\matches.csv";
		BufferedReader br = null;
		String line = "";
		String csvSplit = ",";
		
		try {
			FileReader csvFileReader = new FileReader(fileLoc);
			br = new BufferedReader(csvFileReader);
			while((line = br.readLine()) != null) {
				
				String[] match = line.split(csvSplit);
//				System.out.println(line.split(csvSplit).length);
				this.storeData(match);
			}
		}
		catch( FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private void storeData(String[] data) {
		// TODO Auto-generated method stub 9 10 11
		Match match = null;
		int data0 = Integer.parseInt(data[0]);
		int data1 = Integer.parseInt(data[1]);
		int data9 = Integer.parseInt(data[9]);
		int data11 = Integer.parseInt(data[11]);
		int data12 = Integer.parseInt(data[12]);
//		
		if(data.length == 18) {
			data[14] += data[15];
			match = new Match(data0, data1, data[2], data[3], data[4], data[5], data[6], data[7], data[8], data9, data[10], data11, 
					data12, data[13], data[14], data[16], data[17]);
		}
		else {
			match = new Match(data0, data1, data[2], data[3], data[4], data[5], data[6], data[7], data[8], data9, data[10], data11, 
				data12, data[13], data[14], data[15], data[16]);
		
		}
		
		matchesData.add(match);
	}

	public List<Match> getMatchesData() {
		return matchesData;
	}
}
