package com.howtodoinjava.demo.views;

import io.dropwizard.views.View;

/**
 * Created by vgarg on 11/11/16.
 */
public class EmployeeView extends View {

    public EmployeeView(){
        super("employee.ftl");
    }
}
