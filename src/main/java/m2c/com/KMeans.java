package kmeans.m2c.com;


import java.io.FileNotFoundException;

public class KMeans {

	public static void main(String[] args) throws FileNotFoundException {
		Cluster cluster = new Cluster();
		try {
			cluster.init("/home/lukuen/kmeans/cluster.txt", "/home/lukuen/kmeans/observations.txt");
			cluster.cluster(2);
			cluster.printAllInfo();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
