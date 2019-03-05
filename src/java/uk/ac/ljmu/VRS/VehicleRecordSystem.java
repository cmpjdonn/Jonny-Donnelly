/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ljmu.VRS;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author cmpjdonn
 */
@Named(value = "vehicleRecordSystem")
@SessionScoped
public class VehicleRecordSystem implements Serializable {
        private String vManufacturer;
        private String vModel;
        private Date vDate;
        private Double vPurchase;
        private String vLPlate;
        private Boolean vInsured;
        private Date vMOT;
        private Boolean vTax;
        private Date serviceDate;
        private String serviceType;
        private String serviceComments;
        
        private final ArrayList<Vehicles> vehicle = new ArrayList<>();
        private final ArrayList<serviceRecords> serviceRecord = new ArrayList<>();
        
        
        
    /**
     * Creates a new instance of VehicleRecordSystem
     */
    public VehicleRecordSystem() {
        

    }
    
}
