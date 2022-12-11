/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQpkg;

import java.util.ArrayList;

/**
 *
 * @author Siddhant
 */
public class WorkQ {
    
     private ArrayList<WorkRequest> workRequestList;

    public WorkQ() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}
