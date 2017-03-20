package bd.ac.du.iit.misubeimp;

import java.io.IOException;

public class InputBuilder {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filePath = "E:\\CodeCloneData\\CloneWorksICSE2017BigClone\\clones";
		String fileName = "sourcerercc.txt";
		String mainpath = filePath + "\\" + fileName;
		// 1-1346657

		String[] data = new String[14];
		data[0] = CloneLocator.getCloneCode(mainpath, 1,100000);
		data[1] = CloneLocator.getCloneCode(mainpath, 100001, 200000);
		data[2] = CloneLocator.getCloneCode(mainpath, 200001, 300000);
		data[3] = CloneLocator.getCloneCode(mainpath, 300001, 400000);
		data[4] = CloneLocator.getCloneCode(mainpath, 400001, 500000);
		data[5] = CloneLocator.getCloneCode(mainpath, 500001, 600000);
		data[6] = CloneLocator.getCloneCode(mainpath, 600001, 700000);
		data[7] = CloneLocator.getCloneCode(mainpath, 700001, 800000);
		data[8] = CloneLocator.getCloneCode(mainpath, 800001, 900000);
		data[9] = CloneLocator.getCloneCode(mainpath, 900001, 1000000);
		data[10] = CloneLocator.getCloneCode(mainpath, 1000001, 1100000);
		data[11] = CloneLocator.getCloneCode(mainpath, 1100001, 1200000);
		data[12] = CloneLocator.getCloneCode(mainpath, 1200001, 1300000);
		data[13] = CloneLocator.getCloneCode(mainpath, 1300001, 1346657);

		for (int i = 0; i <data.length; i++) {
			CloneLocator.writeToFile(data[i], (filePath+"\\demo" + "\\" + "demo_" + i + ".txt"));

		}

	}

}
