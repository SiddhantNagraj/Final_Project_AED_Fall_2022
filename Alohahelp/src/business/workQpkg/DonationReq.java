/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQpkg;

import business.cmn.Donation;



/**
 *
 * @author Siddhant
 */
public class DonationReq extends WorkRequest{
    
    private String dBy;
    private String rId;
    private static int count = 000;
    private Donation donation;
   
    public DonationReq()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("DONATION");
        sb.append(count);
        rId = sb.toString();
        count++;
    }

    public String getDonatedBy() {
        return dBy;
    }

    public void setDonatedBy(String dBy) {
        this.dBy = dBy;
    }

    public void setDonation(Donation donation) {
        this.donation = donation;
    }

    public Donation getDonation() {
        return donation;
    }

    @Override
    public String toString() {
        return this.rId;
    }
    
    
}
