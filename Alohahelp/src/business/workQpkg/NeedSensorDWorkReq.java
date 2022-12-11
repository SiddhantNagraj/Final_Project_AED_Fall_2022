/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQpkg;

/**
 *
 * @author Siddhant
 */
public class NeedSensorDWorkReq extends WorkRequest{
    
    private String reqSId;
    private static int count = 001;
    private String cmnts;
    private String donationReqResult;
    
    
    public NeedSensorDWorkReq()
    {
        
        StringBuffer sb = new StringBuffer();
        sb.append("SENSOR");
        sb.append(count);
        reqSId = sb.toString();
        count++;
    }

    public String getRequestSensorId() {
        return reqSId;
    }

    public String getComments() {
        return cmnts;
    }

    public void setComments(String cmnts) {
        this.cmnts = cmnts;
    }

    public String getdonationReqResult() {
        return donationReqResult;
    }

    public void setdonationReqResult(String requestResult) {
        this.donationReqResult = requestResult;
    }

    @Override
    public String toString() {
        return this.reqSId;
    }
    
    
    
    
}
