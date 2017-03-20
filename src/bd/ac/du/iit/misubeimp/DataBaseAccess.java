package bd.ac.du.iit.misubeimp;

import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DataBaseAccess {

	public static void getAccess(List<ClonePair> clonePairs) {
		try {

			MongoClient mongoClient = new MongoClient("localhost", 27017);
			MongoDatabase database = mongoClient.getDatabase("CloneCodeBySourcerCC");
			System.out.println("Connect to DB");
			MongoCollection<Document> collection = database.getCollection("ClonePairs");
			List<Document> documents = new ArrayList<Document>();
			for (ClonePair m : clonePairs) {
				documents.add(m.getBsonClonePair());
			}
			collection.insertMany(documents);
			mongoClient.close();
			System.out.println("Disconnected From DB");
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}
	}

}
