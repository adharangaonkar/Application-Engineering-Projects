/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class WorkQueue {
    
    private ArrayList<WorkReq> workReqList;
    
    public WorkQueue(){
        workReqList=new ArrayList<>();
    }

    public ArrayList<WorkReq> getWorkRequestList() {
        return workReqList;
    }
    
    
    
}
