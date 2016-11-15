package com.collaborate.views;

import com.collaborate.ui.models.CollaborateCard;
import io.dropwizard.views.View;

/**
 * Created by govindarajanr on 11/13/2016.
 */
public class CollaborateWidgetView extends View {
    private CollaborateCard collaborateCard;

    public CollaborateWidgetView(CollaborateCard collaborateCard){
        super("collaborate-card.ftl");
        this.collaborateCard = collaborateCard;
    }

    public CollaborateCard getCollaborateCard() {
        return collaborateCard;
    }

    public void setCollaborateCard(CollaborateCard collaborateCard) {
        this.collaborateCard = collaborateCard;
    }
}
