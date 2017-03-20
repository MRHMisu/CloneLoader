package bd.ac.du.iit.misubeimp;

import org.bson.Document;

public class ClonePair {

	private CloneCode firstClone;
	private CloneCode secondClone;
	private String firstCloneFirstLine;
	private String secondCloneFirstLine;

	public CloneCode getFirstClone() {
		return firstClone;
	}

	public CloneCode getSecondClone() {
		return secondClone;
	}

	public ClonePair(CloneCode firstClone, CloneCode secondClone) {
		this.firstClone = firstClone;
		this.secondClone = secondClone;

	}

	public void setCloneFirstLine() {
		this.firstCloneFirstLine = this.firstClone.getFirstLine();
		this.secondCloneFirstLine = this.secondClone.getFirstLine();
	}

	public Document getBsonClonePair() {

		Document document = new Document("firstCloneFirstLine", firstCloneFirstLine).append("secondCloneFirstLine",
				secondCloneFirstLine);

		document.put("firstElement", this.firstClone.getBsonCloneCode());
		document.put("SecondElement", this.secondClone.getBsonCloneCode());

		return document;
	}

}
