/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author ACER
 */
public class Restaurant {
    private String propertyName;
    private String branchName;
    private String branchNo;
    private String bAddress;
    private String website;
    
    Restaurant(String restName, String branchName,String branchNo, String bAddress, String website){
        this.propertyName = propertyName;
        this.branchName = branchName;
        this.branchNo = branchNo;
        this.bAddress =  bAddress; 
        this.website = website;
    }
    
    Restaurant(){
        this.propertyName = " ";
        this.branchName = " ";
        this.branchNo = " ";
        this.bAddress =  " "; 
        this.website = " ";
    }
    
    /**
     * @return the propertyName
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * @param propertyName the propertyName to set
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * @return the branchName
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * @param branchName the branchName to set
     */
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * @return the branchNo
     */
    public String getBranchNo() {
        return branchNo;
    }

    /**
     * @param branchNo the branchNo to set
     */
    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }

    /**
     * @return the bAddress
     */
    public String getbAddress() {
        return bAddress;
    }

    /**
     * @param bAddress the bAddress to set
     */
    public void setbAddress(String bAddress) {
        this.bAddress = bAddress;
    }

    /**
     * @return the website
     */
    public String getWebsite() {
        return website;
    }

    /**
     * @param website the website to set
     */
    public void setWebsite(String website) {
        this.website = website;
    }
    
}
