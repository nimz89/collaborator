package com.collaborate.ui.models;

import java.util.Date;
import java.util.List;

/**
 * Created by govindarajanr on 11/11/2016.
 */
public class CollaborateCard {
 private Integer id;
 private String description;
 private List<String> tags;
 private List<String> skillSets;
 private Date duration;
 private String learnings;
 private Date dueDate;
 private String location;
 private boolean isCompleted;
 private boolean isApplied;

    public CollaborateCard(Integer id,String description,List<String> tags,List<String> skillSets,Date duration,
                           String learnings, Date dueDate, String location, boolean isCompleted, boolean isApplied){
        this.id = id;
        this.description = description;
        this.tags = tags;
        this.skillSets = skillSets;
        this.duration = duration;
        this.learnings = learnings;
        this.dueDate = dueDate;
        this.location = location;
        this.isApplied = isApplied;
        this.isCompleted = isCompleted;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getTags() {
        return tags;
    }

    public List<String> getSkillSets() {
        return skillSets;
    }

    public Date getDuration() {
        return duration;
    }

    public String getLearnings() {
        return learnings;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public String getLocation() {
        return location;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public boolean isApplied() {
        return isApplied;
    }
}
