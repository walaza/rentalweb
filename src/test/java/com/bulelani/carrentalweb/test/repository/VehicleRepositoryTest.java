/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalweb.test.repository;

import com.bulelani.carrentalweb.app.conf.ConnectionConfig;
import com.bulelani.carrentalweb.domain.vehicle;
import com.bulelani.carrentalweb.repository.VehicleRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author bulelani
 */
public class VehicleRepositoryTest {
    public static ApplicationContext ctx;
    private Long id;
    
    private VehicleRepository repo;
    public VehicleRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createVehicle(){
       repo = ctx.getBean(VehicleRepository.class);
       vehicle v = new vehicle.Builder("Toyota").colour("Black").regNumber("CA 12345")
               .build();
       repo.save(v);
       id = v.getId();
       Assert.assertNotNull(v);
        
    }

    @Test(dependsOnMethods = "createVehicle")
    public void readVehicle(){
        repo = ctx.getBean(VehicleRepository.class);
        vehicle veh = repo.findOne(id);
        Assert.assertEquals(veh.getCarName(), "Toyota");
    }
    @Test(dependsOnMethods = "readVehicle")
    private void updatePerson(){
      repo = ctx.getBean(VehicleRepository.class); 
      vehicle veh = repo.findOne(id);
    }
    @BeforeClass
    public static void setUpClass() throws Exception {
         ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
    }

   /* @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }*/
}
