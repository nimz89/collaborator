package com.collaborate.views;

import com.collaborate.ui.models.CollaborateTaskWidget;
import io.dropwizard.views.View;

import java.util.List;

/**
 * Created by govindarajanr on 11/13/2016.
 */
public class CollaborateMainView extends View{
   private List<CollaborateTaskWidget> collaborateTaskWidgets;

   public CollaborateMainView(List<CollaborateTaskWidget> collaborateTaskWidgets){
       super("collaborate.ftl");
       this.collaborateTaskWidgets = collaborateTaskWidgets;
   }

    public List<CollaborateTaskWidget> getCollaborateTaskWidgets() {
        return collaborateTaskWidgets;
    }

    public void setCollaborateTaskWidgets(List<CollaborateTaskWidget> collaborateTaskWidgets) {
        this.collaborateTaskWidgets = collaborateTaskWidgets;
    }
}
