/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.cmn;

import java.util.ArrayList;

/**
 *
 * @author revat
 */
public class NeedHelp {
    
    
    
    private String help;
    private String ttaken;
    private String servicetype;
    private String helpId;
    
    private String newHelp;
    
    private ArrayList<String> otherHelpList;
    
    private static int count = 01;
    
    public NeedHelp()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("HELP");
        sb.append(count);
        helpId = sb.toString();
        count++;
        
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    

    public String getServiceType() {
        return servicetype;
    }

    public void setServiceType(String servicetype) {
        this.servicetype = servicetype;
    }

    @Override
    public String toString() {
        return this.helpId;
    }
    

    public ArrayList<String> getOtherHelpList() {
        return otherHelpList;
    }

    public String getNewHelp() {
        return newHelp;
    }

    public void setNewHelp(String newHelp) {
        this.newHelp = newHelp;
    }

    

    public String getTimetaken() {
        return ttaken;
    }

    public void setTimetaken(String ttaken) {
        this.ttaken = ttaken;
    }
    
    
}
