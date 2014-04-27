/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalweb.domain;

import java.io.Serializable;
import java.util.Locale.Builder;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author bulelani
 */
@Entity
public class vehicle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     static boolean regNum;
    private String carName;
    private String colour;
    @Column(unique = true)
    private String regNumber;
    //private String category;
    @Embedded
    private Category category;
    
    public vehicle(){
        
    }
    
    private vehicle(Builder builder){
       carName = builder.carName;
       colour = builder.colour;
       regNumber = builder.regNumber;
       category = builder.category;
       
    }
     
    public static class Builder{
        private String carName;
        private String colour;
        private String regNumber;
       // private String category;
        private Category category;
        
     public Builder(String name){
       this.carName =name;
     }
       
    public Builder colour(String value){
        colour = value;
        return this;
    }
    
    public Builder regNumber(String value){
            regNumber = value;
            return this;
    }
    
   public Builder category(Category value){
        category = value;
        return this;
    }
    
    public vehicle build(){
       return new vehicle(this);
    }
 }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static boolean isRegNum() {
        return regNum;
    }

    public String getCarName() {
        return carName;
    }

    public String getColour() {
        return colour;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public Category getCategory() {
        return category;
    }

    
  /* public String getCategory() {
        return category;
    }*/
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof vehicle)) {
            return false;
        }
        vehicle other = (vehicle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bulelani.carrentalweb.domain.vehicle[ id=" + id + " ]";
    }
    
}
