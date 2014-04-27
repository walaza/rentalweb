/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalweb.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Locale.Builder;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author bulelani
 */
@Entity
public class customer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String idNo;
    private String address;
    @OneToMany
    @JoinColumn(name="person_id")
    List<bookings> bookings;        
   Object rentalType;
    
    private customer(){
       
    }
   
   private customer(Builder builder)
   {
       name=builder.name;
       idNo=builder.idNo;
       surname=builder.surname;
       address=builder.address;
   }
    public static class Builder{
        private String name;
        private String idNo;
        private String surname;
        private String address;
       
    public Builder(String name){
       this.name =name;
     }
    
    public Builder surname(String value){
        surname = value;
        return this;
    }
    
    public Builder idNo(String value){
        idNo = value;
        return this;
    }
    
     public Builder address(String value){
        address = value;
        return this;
    }
     
    public customer build(){
        return new customer(this);
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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIdNo() {
        return idNo;
    }

    public String getAddress() {
        return address;
    }

    public Object getRentalType() {
        return rentalType;
    }

    public List<bookings> getBookings() {
        return bookings;
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof customer)) {
            return false;
        }
        customer other = (customer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bulelani.carrentalweb.domain.customer[ id=" + id + " ]";
    }
    
}
