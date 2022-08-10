import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadDeliveriesCsv {
	
	private List<Deliveries> deliveriesData = new ArrayList<>();
	
	public void readData() {
		String fileLoc = "C:\\Users\\NEW\\Downloads\\iplProjectRawData\\deliveries.csv";
		BufferedReader br = null;
		String line = "";
		String csvSplit = ",";
		
		try {
			FileReader csvFileReader = new FileReader(fileLoc);
			br = new BufferedReader(csvFileReader);
			
			while((line = br.readLine()) != null) {
				String[] delivery = line.split(csvSplit);
				this.storeData(delivery);
			}
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void storeData(String[] data) {
		
		Deliveries deliveries = null;
		
		int data0, data1, data4, data5, data9, data10, data11, data12, data13, data14, data15, data16, data17;
		data0 = Integer.parseInt(data[0]);
		data1 = Integer.parseInt(data[1]);
		data4 = Integer.parseInt(data[4]);
		data5 = Integer.parseInt(data[5]);
		data9 = Integer.parseInt(data[9]);
		data10 = Integer.parseInt(data[10]);
		data11 = Integer.parseInt(data[11]);
		data12 = Integer.parseInt(data[12]);
		data13 = Integer.parseInt(data[13]);
		data14 = Integer.parseInt(data[14]);
		data15 = Integer.parseInt(data[15]);
		data16 = Integer.parseInt(data[16]);
		data17 = Integer.parseInt(data[17]);
		if(data.length == 21) {
			deliveries = new Deliveries(data0, data1, data[2], data[3], data4, data5, data[6], data[7], data[8],
				data9, data10, data11, data12, data13, data14, data15, data16, data17, data[18], data[19], data[20]);
		
		}
		else {
			deliveries = new Deliveries(data0, data1, data[2], data[3], data4, data5, data[6], data[7], data[8],
					data9, data10, data11, data12, data13, data14, data15, data16, data17, "", "", "");
			
		}
		
		deliveriesData.add(deliveries);
	}
	
	public List<Deliveries> getDeliveriesData() {
		return deliveriesData;
	}


	
}
