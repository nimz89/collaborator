package com.howtodoinjava.demo.database;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

/**
 * Created by vgarg on 11/15/16.
 */
public class MongoDatabase {
    private static final String DATABASE_NAME = "test";

    private static Datastore datastore = null;

    private MongoDatabase(){}

    public static Datastore getMongoDataSource(){
        if( datastore == null ){
            synchronized(MongoDatabase.class) {
                if (datastore == null) {
                    Morphia morphia = new Morphia();
                    datastore = morphia.createDatastore(new MongoClient(), DATABASE_NAME );
                    datastore.ensureIndexes();
                }
            }
        }
        return datastore;
    }





}
