/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.networkpkg;

import business.enterprisemainpkg.EnterpriseDirectory;
import java.util.ArrayList;

/**
 *
 * @author Siddhant
 */
public class Network {

    private String cntry;

    private String st;

    private String city;
    
    private String name;

    private EnterpriseDirectory enterpDirect;
    

    public Network() {
        enterpDirect = new EnterpriseDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpDirect;
    }

    public String getCountry() {
        return cntry;
    }

    public void setCountry(String cntry) {
        this.cntry = cntry;
    }

    public String getState() {
        return st;
    }

    public void setState(String st) {
        this.st = st;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return this.city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    
    public ArrayList<Integer> getZipCodesInRange(String city)
    {
        ArrayList<Integer> zipCodeList = new ArrayList<>();
        zipCodeList.add(01245);
        zipCodeList.add(02135);
        
        return zipCodeList;
    }
}
