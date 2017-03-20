package bd.ac.du.iit.misubeimp;

import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filePath = "E:\\CodeCloneData\\CloneWorksICSE2017BigClone\\clones\\demo.txt";
		String basePath="E:\\CodeCloneData\\IJaDataset2.0BigCloneBenchSamples\\dataset\\dataset";
		List<ClonePair> clonePairs=CloneLocator.getConePairs(filePath);
		
		clonePairs=CloneLocator.getUpdatedClonePairs(clonePairs, basePath);
		int l=0;
	}

}
