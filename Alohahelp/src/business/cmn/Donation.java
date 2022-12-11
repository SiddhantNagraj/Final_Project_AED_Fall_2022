 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.cmn;

/**
 *
 * @author revat
 */
public class Donation {
    
    private String amt;
    private String dDate;
    private String acno;
    private String acname;
    public static String toAcNo = "2340987123";
    
    private static int count = 0;
    private int dId;
    
    public Donation()
    {
     count++;
     dId = count;
    }
    

    public String getAmount() {
        return amt;
    }

    public void setAmount(String amt) {
        this.amt = amt;
    }

    public String getDonationDate() {
        return dDate;
    }

    public void setDonationDate(String dDate) {
        this.dDate = dDate;
    }

    @Override
    public String toString() {
        return String.valueOf(dId);
    }

    public String getAccntNumber() {
        return acno;
    }

    public void setAccntNumber(String acno) {
        this.acno = acno;
    }

    public String getAccntName() {
        return acname;
    }

    public void setAccntName(String acname) {
        this.acname = acname;
    }

    public String getToAccountNumber() {
        return toAcNo;
    }
    
    
    
    
}
