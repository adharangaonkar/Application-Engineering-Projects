/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author hp
 */


import Business.HelpProvider.HelpProvider;
import Business.HelpSeeker.HelpSeeker;
import Business.Supplier.Supplier;
import Business.Supplier.Supply;
import Business.NGO.NGO;
import Business.UserAccount.UserAccount;
import Business.Volunteer.Volunteer;
import java.util.Date;


public class WorkReq {
 
    private String subject;
    private UserAccount sender;
    private UserAccount reciever;
    private String status;
    private Date dateOfRequest;
    private Date dateOfResolving;
    private HelpProvider helpProvider;
    private HelpSeeker helpSeeker;
    private NGO ngo;
    private Supplier supplier;
    private Supply supply;
    private Volunteer volunteer;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReciever() {
        return reciever;
    }

    public void setReciever(UserAccount reciever) {
        this.reciever = reciever;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateOfRequest() {
        return dateOfRequest;
    }

    public void setDateOfRequest(Date dateOfRequest) {
        this.dateOfRequest = dateOfRequest;
    }

    public Date getDateOfResolving() {
        return dateOfResolving;
    }

    public void setDateOfResolving(Date dateOfResolving) {
        this.dateOfResolving = dateOfResolving;
    }

    public HelpProvider getHelpProvider() {
        return helpProvider;
    }

    public void setHelpProvider(HelpProvider helpProvider) {
        this.helpProvider = helpProvider;
    }

    public HelpSeeker getHelpSeeker() {
        return helpSeeker;
    }

    public void setHelpSeeker(HelpSeeker helpSeeker) {
        this.helpSeeker = helpSeeker;
    }

    public NGO getNgo() {
        return ngo;
    }

    public void setNgo(NGO ngo) {
        this.ngo = ngo;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Supply getSupply() {
        return supply;
    }

    public void setSupply(Supply supply) {
        this.supply = supply;
    }

    public Volunteer getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Volunteer volunteer) {
        this.volunteer = volunteer;
    }
    
    @Override
    public String toString(){
        return status;
    }
    
}
