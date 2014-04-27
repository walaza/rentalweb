/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalweb.domain;

import javax.persistence.Embeddable;

/**
 *
 * @author bulelani
 */
@Embeddable
class bookings {
  private int hrsBooked;
  private String custName;
  private String regNum;  
  
   private bookings(){
       
    }
   
    private bookings(Builder builder){
     hrsBooked = builder.hrsBooked;
        custName = builder.custName;
        regNum = builder.regNum;
    }
    
    public static class Builder{
        private int hrsBooked;
        private String custName;
        private String regNum;
       
    public Builder(int hrsBooked){
            this.hrsBooked = hrsBooked;
    }
    public Builder custName(String value){
            custName = value;
            return this;
    }
    public Builder regNum(String value){
            regNum = value;
            return this;
    }
    public bookings build(){
            return new bookings(this);
    }
 }

    public int getHrsBooked() {
        return hrsBooked;
    }

    public String getCustName() {
        return custName;
    }

    public String getRegNum() {
        return regNum;
    }
    
}
