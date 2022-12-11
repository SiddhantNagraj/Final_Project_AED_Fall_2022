/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQpkg;

import business.cmn.NeedHelp;

/**
 *
 * @author Siddhant
 */
public class NeedHelpWorkReq extends WorkRequest {
 
    
    private String rId;
    private static int count = 000;
    private String cmnts;
    private NeedHelp needHelp;
    private String reqResult;
   

    public NeedHelpWorkReq()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("REQ");
        sb.append(count);
        rId = sb.toString();
        count++;
    }
    
    public String getComments() {
        return cmnts;
    }

    public void setComments(String cmnts) {
        this.cmnts = cmnts;
    }

    public String getRequestId() {
        return rId;
    }

    public void setNeedHelp(NeedHelp needHelp) {
        this.needHelp = needHelp;
    }

    public NeedHelp getNeedHelp() {
        return needHelp;
    }

    public void setRequestResult(String reqResult) {
        this.reqResult = reqResult;
    }

    public String getRequestResult() {
        return reqResult;
    }


    
    @Override
    public String toString() {
        return getNeedHelp().getHelp();
    }
    
    
    
    
}
