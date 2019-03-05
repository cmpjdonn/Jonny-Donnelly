/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ljmu.VRS;
import java.util.Date;
        

/**
 *
 * @author cmpjdonn
 */
public class serviceRecords {
    private String vehicleLicensePlate;
    private Date serviceDate;
    private String serviceType;
    private String serviceComments;

    /**
     * @return the vehicleLicensePlate
     */
    public String getVehicleLicensePlate() {
        return vehicleLicensePlate;
    }

    /**
     * @param vehicleLicensePlate the vehicleLicensePlate to set
     */
    public void setVehicleLicensePlate(String vehicleLicensePlate) {
        this.vehicleLicensePlate = vehicleLicensePlate;
    }

    /**
     * @return the serviceDate
     */
    public Date getServiceDate() {
        return serviceDate;
    }

    /**
     * @param serviceDate the serviceDate to set
     */
    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    /**
     * @return the serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * @param serviceType the serviceType to set
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * @return the serviceComments
     */
    public String getServiceComments() {
        return serviceComments;
    }

    /**
     * @param serviceComments the serviceComments to set
     */
    public void setServiceComments(String serviceComments) {
        this.serviceComments = serviceComments;
    }
}
