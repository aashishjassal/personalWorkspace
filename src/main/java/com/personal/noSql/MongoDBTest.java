package com.personal.noSql;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest {

    public static void main(String[] args) {
        try {
            // ---------- Connecting DataBase -------------------------//
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            // ---------- Creating DataBase ---------------------------//
            MongoDatabase db = mongoClient.getDatabase("test_database");
            // ---------- Creating Collection -------------------------//
            MongoCollection<Document> table = db.getCollection("movie");
            // ---------- Creating Document ---------------------------//
            Document doc = new Document("name", "Peter John");
            doc.append("id", 12);
            // ----------- Inserting Data ------------------------------//
            table.insertOne(doc);

            System.out.println("done");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
