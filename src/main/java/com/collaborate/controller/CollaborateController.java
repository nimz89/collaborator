package com.collaborate.controller;

import com.collaborate.ui.models.CollaborateTaskWidget;
import com.collaborate.views.CollaborateMainView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by govindarajanr on 11/11/2016.
 */
@Path("/collaborate")
@Produces(MediaType.APPLICATION_JSON)
public class CollaborateController {
    List<CollaborateTaskWidget> collaborateTaskWidgets = new ArrayList<>();


    @GET
    @Produces("text/html")
    public CollaborateMainView openCollaborate(){
        return null;
    }


    private List<CollaborateTaskWidget> populateCollaborateTaskWidgets(){
        collaborateTaskWidgets.add(createCollaborateTaskWidget(1,"FirstTask","Task Description goes here",2));
        collaborateTaskWidgets.add(createCollaborateTaskWidget(1,"SecondTask","Task Description goes here",1));
        collaborateTaskWidgets.add(createCollaborateTaskWidget(1,"ThirdTask","Task Description goes here",5));
        collaborateTaskWidgets.add(createCollaborateTaskWidget(1,"FourthTask","Task Description goes here",7));

        return collaborateTaskWidgets;
    }

    private void addCollaborateTaskWidget(Integer id,String taskName, String description, Integer appliedCount){
        collaborateTaskWidgets.add(createCollaborateTaskWidget(id,taskName,description,appliedCount));
    }

    private CollaborateTaskWidget createCollaborateTaskWidget(Integer id,String taskName, String description, Integer appliedCount){
       return new CollaborateTaskWidget(id,taskName,description,appliedCount);
    }
}
