package com.howtodoinjava.demo.database;

import com.howtodoinjava.demo.entities.TestEntity;
import org.mongodb.morphia.Datastore;

import java.util.List;

/**
 * Created by vgarg on 11/15/16.
 */
public class MongoDBDemo {

    public void mongoDemo(){
        Datastore datastore =  MongoDatabase.getMongoDataSource();

        TestEntity testEntity = new TestEntity("Test 123");

        datastore.save(testEntity);
    }

    public void getAllTestEntity(){
        Datastore datastore =  MongoDatabase.getMongoDataSource();
        List<TestEntity> list = datastore.createQuery(TestEntity.class).asList();
        for(TestEntity testEntity: list){
            System.out.println(testEntity.getName());
        }
    }
}
