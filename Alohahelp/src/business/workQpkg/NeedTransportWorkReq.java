/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQpkg;

import business.personpkg.Volunteer;

/**
 *
 * @author Siddhant
 */
public class NeedTransportWorkReq extends WorkRequest{
    
    private String transReqId;
    private static int count = 000;
    private String needTrans;
    private String transReqResult;
    
    
     public NeedTransportWorkReq()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("TRANS");
        sb.append(count);
        transReqId = sb.toString();
        count++;
    }
     
    public void setNeedTransport(String needTrans) {
        this.needTrans = needTrans;
    }

    public String getNeedTransport() {
        return needTrans;
    }

    @Override
    public String toString() {
        Volunteer volunteer = (Volunteer)this.getSender().getPerson();
        String address = volunteer.getAddress1().concat(volunteer.getAddress2().concat(volunteer.getTown()));
        return address;
                
    }

    public String getTransReqResult() {
        return transReqResult;
    }

    public void setTransReqResult(String transReqResult) {
        this.transReqResult = transReqResult;
    }
     
     
}
