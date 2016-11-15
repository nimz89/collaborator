package com.collaborate.ui.models;

/**
 * Created by govindarajanr on 11/11/2016.
 */
public class CollaborateTaskWidget {
    private Integer id;
    private String taskName;
    private String description;
    private Integer appliedCount;

    public CollaborateTaskWidget(Integer id, String taskName, String description, Integer appliedCount){
        this.id = id;
        this.appliedCount = appliedCount;
        this.description = description;
        this.taskName = taskName;

    }

    public Integer getId() {
        return id;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getDescription() {
        return description;
    }

    public Integer getAppliedCount() {
        return appliedCount;
    }
}
