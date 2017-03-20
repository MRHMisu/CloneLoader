package bd.ac.du.iit.misubeimp;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// long startTime = System.currentTimeMillis();
		String filePath = "E:\\CodeCloneData\\CloneWorksICSE2017BigClone\\clones\\demo\\demo_13.txt";
		String basePath = "E:\\CodeCloneData\\IJaDataset2.0BigCloneBenchSamples\\dataset\\dataset";

		List<ClonePair> clonePairs = CloneLocator.getConePairs(filePath);

		List<ClonePair> tempList1 = clonePairs.subList(0, 10000);
		updateDB(tempList1, basePath);
		List<ClonePair> tempList2 = clonePairs.subList(10001, 20000);
		updateDB(tempList2, basePath);
		List<ClonePair> tempList3 = clonePairs.subList(20001, 30000);
		updateDB(tempList3, basePath);
		List<ClonePair> tempList4 = clonePairs.subList(30001, 40000);
		updateDB(tempList4, basePath);
		List<ClonePair> tempList5 = clonePairs.subList(40001, 46657);
		updateDB(tempList5, basePath);

		/*
		 * long endTime = System.currentTimeMillis(); long totalTime = endTime -
		 * startTime; System.out.println("End in :"+totalTime);
		 */

	}

	public static void updateDB(List<ClonePair> tempList, String basePath) throws IOException {
		tempList = CloneLocator.getUpdatedClonePairs(tempList, basePath);
		DataBaseAccess.getAccess(tempList);
	}

}
