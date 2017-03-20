package bd.ac.du.iit.misubeimp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// default,57783.java,19,34,default,100171.java,19,34
public class CloneLocator {

	public static List<ClonePair> getConePairs(String filepath) {
		List<ClonePair> clonePairs = new ArrayList<ClonePair>();
		File file = new File(filepath);
		if (file.exists()) {
			String line = "";
			BufferedReader reader;
			List<String> everyline;

			try {
				reader = new BufferedReader(new FileReader(filepath));
				while ((line = reader.readLine()) != null) {
					everyline = (Arrays.asList(line.split(",")));

					CloneCode firstCloneCode = new CloneCode(everyline.subList(0, 4));
					CloneCode secondCloneCode = new CloneCode(everyline.subList(4, 8));
					ClonePair clonePair = new ClonePair(firstCloneCode, secondCloneCode);
					clonePairs.add(clonePair);
				}

			} catch (Exception e) {
			}

		}
		return clonePairs;

	}

	public static String getCloneCode(String filepath, int start, int end) throws IOException {

		File file = new File(filepath);
		StringBuilder code = new StringBuilder();
		if (file.exists()) {
			try (LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(file))) {

				for (String line = null; (line = lineNumberReader.readLine()) != null;) {
					int currentLineNumber = lineNumberReader.getLineNumber();
					if (currentLineNumber >= start && currentLineNumber <= end) {
						code.append(line + '\n');
					}
				}
			} catch (Exception e) {
			}

		}
		return code.toString();

	}

	public static List<ClonePair> getUpdatedClonePairs(List<ClonePair> clonePairs, String basePath) throws IOException {
		for (ClonePair x : clonePairs) {
			CloneCode one = x.getFirstClone();
			String oneCode=getCloneCode(one.getFilePath(basePath),one.getStartLine(),one.getEndLise());
			System.out.println(oneCode);
			one.setActualCode(oneCode);
			CloneCode two = x.getSecondClone();
			String twoCode=getCloneCode(two.getFilePath(basePath),two.getStartLine(),two.getEndLise());
			two.setActualCode(twoCode);
			System.out.println(twoCode);
			
		}
		return clonePairs;

	}
}
