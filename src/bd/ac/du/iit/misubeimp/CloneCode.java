package bd.ac.du.iit.misubeimp;

import java.util.List;

import org.bson.Document;

public class CloneCode {

	private String folderName;
	private String fileFileName;
	private String begineLine;
	private String endLine;
	private String actualCode;
	private String firstLine;

	public CloneCode(String folderFileName, String fileFileName, String begineLine, String endLine) {
		this.folderName = folderFileName;
		this.fileFileName = fileFileName;
		this.begineLine = begineLine;
		this.endLine = endLine;
	}

	public CloneCode(List<String> cloneInfo) {
		this.folderName = cloneInfo.get(0);
		this.fileFileName = cloneInfo.get(1);
		this.begineLine = cloneInfo.get(2);
		this.endLine = cloneInfo.get(3);
	}

	public int getStartLine() {
		return Integer.parseInt(this.begineLine);
	}
	public String getFirstLine()
	{
		return firstLine;
	}

	public int getEndLise() {
		return Integer.parseInt(this.endLine);
	}

	public void setActualCode(String code) {
		this.actualCode = code;
		this.firstLine=this.actualCode.split("\\r?\\n")[0];
	}

	public String getFilePath(String basePath) {
		return basePath + "\\" + this.folderName + "\\" + this.fileFileName;
	}

	public Document getBsonCloneCode() {
		Document document = new Document("folderName", this.folderName).append("fileFileName", this.fileFileName)
				.append("begineLine", this.begineLine).append("endLine", this.endLine)
				.append("actualCode", this.actualCode);

		return document;
	}

}
