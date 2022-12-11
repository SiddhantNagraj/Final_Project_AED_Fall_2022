/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.sensor;

import java.util.ArrayList;

/**
 *
 * @author shiba
 */
public class SensorDev {
    
    private String sName;
    private String sId;
    private HRSMeasurements hrsMeasurements;
    private ArrayList<HRSMeasurements> measurementList;
    
    public SensorDev()
    {
        this.hrsMeasurements = new HRSMeasurements();
        measurementList= new ArrayList<>();
    }
    
    public String getSensorName() {
        return sName;
    }

    public void setSensorName(String sName) {
        this.sName = sName;
    }

    public String getSensorId() {
        return sId;
    }

    public void setSensorId(String sId) {
        this.sId = sId;
    }

    public HRSMeasurements gethrsMeasurements() {
        return hrsMeasurements;
    }

    
    @Override
    public String toString() {
        return this.sName;
    }
    
    
    
}
