package com.collaborate.views;

import io.dropwizard.views.View;

/**
 * Created by vgarg on 11/11/16.
 */
public class EmployeeView extends View {

    private String employeeName;

    public EmployeeView(String employeeName){
        super("collaborate.ftl");
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
