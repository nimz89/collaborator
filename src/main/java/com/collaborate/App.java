package com.collaborate;


import com.howtodoinjava.demo.database.MongoDBDemo;

import com.collaborate.controller.EmployeeRESTController;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App extends Application<Configuration>
{

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    //private static final String COLLABORATOR_CONFIG_PATH = "collaborator-config.yml";


    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {
        bootstrap.addBundle(new AssetsBundle());
        bootstrap.addBundle(new ViewBundle());
    }

    @Override
    public void run(Configuration c, Environment e) throws Exception {
        LOGGER.info("Registering REST resources");
        e.jersey().register(new EmployeeRESTController(e.getValidator()));

        MongoDBDemo mongoDBDemo = new MongoDBDemo();
        mongoDBDemo.mongoDemo();
        System.out.print("Database record inserted successfully");

        mongoDBDemo.getAllTestEntity();

    }

    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        new App().run("server");
    }
}
