package com.howtodoinjava.demo.entities;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.*;


/**
 * Created by vgarg on 11/15/16.
 */
@Entity
@Indexes(
        @Index(value = "name", fields = @Field("name"))
)
public class TestEntity {

    public TestEntity(){}

    public TestEntity(String name){
        this.name = name;
    }

    @Id
    protected ObjectId id;

    @Property
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
