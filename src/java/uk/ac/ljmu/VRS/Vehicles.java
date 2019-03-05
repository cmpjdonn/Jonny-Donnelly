
package uk.ac.ljmu.VRS;
import java.util.Date;


public class Vehicles {
    
        private String vehicleManufacturer;
        private String vehicleModel;
        private Date purchaseDate;
        private Double vehiclePurchasePrice;
        private String licensePlate;
        private Boolean vehicleInsured;
        private Date vehicleMOT;
        private Boolean vehicleTax;

    /**
     * @return the vehiclePurchasePrice
     */
    public Double getVehiclePurchasePrice() {
        return vehiclePurchasePrice;
    }

    /**
     * @param vehiclePurchasePrice the vehiclePurchasePrice to set
     */
    public void setVehiclePurchasePrice(Double vehiclePurchasePrice) {
        this.vehiclePurchasePrice = vehiclePurchasePrice;
    }

    /**
     * @return the licensePlate
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * @param licensePlate the licensePlate to set
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    /**
     * @return the vehicleInsured
     */
    public Boolean getVehicleInsured() {
        return vehicleInsured;
    }

    /**
     * @param vehicleInsured the vehicleInsured to set
     */
    public void setVehicleInsured(Boolean vehicleInsured) {
        this.vehicleInsured = vehicleInsured;
    }

    /**
     * @return the vehicleMOT
     */
    public Date getVehicleMOT() {
        return vehicleMOT;
    }

    /**
     * @param vehicleMOT the vehicleMOT to set
     */
    public void setVehicleMOT(Date vehicleMOT) {
        this.vehicleMOT = vehicleMOT;
    }

    /**
     * @return the vehicleTax
     */
    public Boolean getVehicleTax() {
        return vehicleTax;
    }

    /**
     * @param vehicleTax the vehicleTax to set
     */
    public void setVehicleTax(Boolean vehicleTax) {
        this.vehicleTax = vehicleTax;
    }
    
}
