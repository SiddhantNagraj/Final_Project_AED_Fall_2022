/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

import Person.Person;
import java.util.ArrayList;
import model.VitalSigns;

/**
 *
 * @author revat
 */
public class HelpSeeker  extends Person{
    
    private String helpSeekerId;
    private static int count = 001;
    private boolean shareVitalInfo = false;
    private boolean hasSensorDevice = false;
    private boolean hasCardiacProb = false;
    private boolean getAlerts = false;
    private ArrayList<VitalSigns> vitalSignList;
    private ArrayList<String> vitalSignTrackList;
    private boolean sendDataToDoctor = false;
    //private SensorDevice sensorDevice;

    public String getHelpSeekerId() {
        return helpSeekerId;
    }

    public void setHelpSeekerId(String helpSeekerId) {
        this.helpSeekerId = helpSeekerId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        HelpSeeker.count = count;
    }

    public boolean isShareVitalInfo() {
        return shareVitalInfo;
    }

    public void setShareVitalInfo(boolean shareVitalInfo) {
        this.shareVitalInfo = shareVitalInfo;
    }

    public boolean isHasSensorDevice() {
        return hasSensorDevice;
    }

    public void setHasSensorDevice(boolean hasSensorDevice) {
        this.hasSensorDevice = hasSensorDevice;
    }

    public boolean isHasCardiacProb() {
        return hasCardiacProb;
    }

    public void setHasCardiacProb(boolean hasCardiacProb) {
        this.hasCardiacProb = hasCardiacProb;
    }

    public boolean isGetAlerts() {
        return getAlerts;
    }

    public void setGetAlerts(boolean getAlerts) {
        this.getAlerts = getAlerts;
    }

    public ArrayList<VitalSigns> getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList<VitalSigns> vitalSignList) {
        this.vitalSignList = vitalSignList;
    }

    public ArrayList<String> getVitalSignTrackList() {
        return vitalSignTrackList;
    }

    public void setVitalSignTrackList(ArrayList<String> vitalSignTrackList) {
        this.vitalSignTrackList = vitalSignTrackList;
    }

    public boolean isSendDataToDoctor() {
        return sendDataToDoctor;
    }

    public void setSendDataToDoctor(boolean sendDataToDoctor) {
        this.sendDataToDoctor = sendDataToDoctor;
    } }

//    public SensorDevice getSensorDevice() {
//        return sensorDevice;
//    }
//
//    public void setSensorDevice(SensorDevice sensorDevice) {
//        this.sensorDevice = sensorDevice;
//    }
    

