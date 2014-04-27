/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bulelani.carrentalweb.repository;

import com.bulelani.carrentalweb.domain.vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author bulelani
 */
public interface VehicleRepository extends JpaRepository< vehicle, Long>{
    
}
