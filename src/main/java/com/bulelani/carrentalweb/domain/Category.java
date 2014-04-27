/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalweb.domain;

import com.bulelani.carrentalweb.domain.customer.Builder;
import javax.persistence.Embeddable;

/**
 *
 * @author bulelani
 */
@Embeddable
class Category {
   private String SUV;
   private String sports;
   private String sedan;
   private String hatchBack; 
   
   private Category(){
        
    }
   
    private Category(Builder builder){
        SUV = builder.SUV;
        sports = builder.sports;
        sedan = builder.sedan;
        hatchBack = builder.hatchBack;
    }
    
    public static class Builder{
        private String SUV;
        private String sports;
        private String sedan;
        private String hatchBack;
        
    public Builder(String SUV){
            this.SUV = SUV;
    }
    
    public Builder sports(String value){
            sports = value;
            return this;
    }
    
    public Builder sedan(String value){
            sedan = value;
            return this;
    }
    
    public Builder hatchBack(String value){
            hatchBack = value;
            return this;
    }
    
    public Category build(){
            return new Category(this);
        }
  }

    public String getSUV() {
        return SUV;
    }

    public String getSports() {
        return sports;
    }

    public String getSedan() {
        return sedan;
    }

    public String getHatchBack() {
        return hatchBack;
    }
  
    
}
