/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQpkg;

import business.userAccountpkg.UserAc;
import java.util.Date;

/**
 *
 * @author Siddhant
 */
public abstract class WorkRequest {

    private String msg;
    private UserAc sndr;
    private UserAc rcvr;
    private String status;
    private Date reqDate;
    private Date resDate;
    
    public WorkRequest(){
        reqDate = new Date();
    }

    public String getMessage() {
        return msg;
    }

    public void setMessage(String msg) {
        this.msg = msg;
    }

    public UserAc getSender() {
        return sndr;
    }

    public void setSender(UserAc sndr) {
        this.sndr = sndr;
    }

    public UserAc getReceiver() {
        return rcvr;
    }

    public void setReceiver(UserAc rcvr) {
        this.rcvr = rcvr;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return reqDate;
    }

    public void setRequestDate(Date reqDate) {
        this.reqDate = reqDate;
    }

    public Date getResolveDate() {
        return resDate;
    }

    public void setResolveDate(Date resDate) {
        this.resDate = resDate;
    }

    @Override
    public String toString() {
        return this.msg;
    }
    
    
}
