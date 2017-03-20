package bd.ac.du.iit.misubeimp;

import org.bson.Document;

public class ClonePair {

	private CloneCode firstClone;
	private CloneCode secondClone;
	
	
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
	public Document getBsonClonePair() {
		
		Document document = new Document();
		document.put("firstElement",this.firstClone.getBsonCloneCode());
		document.put("SecondElement",this.secondClone.getBsonCloneCode());
		
		return document;
	}
	
}
