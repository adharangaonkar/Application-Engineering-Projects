/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.manageAirlinersJPanel;

import Business.Airliners;
import Business.AirlinersDirectory;
import Business.AirplaneDirectory;
import Business.FlightScheDirectory;
import Business.Flights;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class manageAirlinersJPanel extends javax.swing.JPanel {
    private JPanel rightJPanel;
    private AirlinersDirectory airlinersDirectory;
    private FlightScheDirectory flightScheDirectory;
    private Airliners airliners;
    private AirplaneDirectory airplaneDirectory;

    /**
     * Creates new form manageAirlinersJPanel
     */
   
    public manageAirlinersJPanel(JPanel rightJPanel, AirlinersDirectory airlinersDirectory, FlightScheDirectory flightScheDirectory, AirplaneDirectory airplaneDirectory) {
         //To change body of generated methods, choose Tools | Templates.
         initComponents();
        // this.airliners = airliners;
         airliners = new Airliners();
         this.airlinersDirectory = airlinersDirectory;
         this.rightJPanel = rightJPanel;
         this.flightScheDirectory = flightScheDirectory;
         this.airplaneDirectory = airplaneDirectory;
        //populateTable(airlinersDirectory, "all");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createBtn = new javax.swing.JButton();
        btnManage = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        createBtn.setText("Create a new Airliners ");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        btnManage.setText("Manage Airline");
        btnManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("Manage Airliner");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(338, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnManage, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(createBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(327, 327, 327))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addGap(141, 141, 141)
                .addComponent(createBtn)
                .addGap(82, 82, 82)
                .addComponent(btnManage)
                .addContainerGap(293, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        createAirlinersJPanel panel = new createAirlinersJPanel(rightJPanel, airlinersDirectory );
        rightJPanel.add("createAirlinersJPanel", panel);
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_createBtnActionPerformed

    private void btnManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageActionPerformed
        // TODO add your handling code here:
        BtnManageJPanel panel = new BtnManageJPanel(rightJPanel,flightScheDirectory, airlinersDirectory,airplaneDirectory);
        rightJPanel.add("BtnManageJPanel", panel);
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_btnManageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManage;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    
   
  

   
    /*
    void populateTableNew(FlightScheDirectory flighScheDirectory) {
         DefaultTableModel dtm = (DefaultTableModel)tblAirliners.getModel();
        dtm.setRowCount(0);
        for ( Flights flight : flightScheDirectory.getFlightData())
        {
            Object row[]= new Object [1];
            row[0] = flight;
           // row[1] = air.getStrengthofFlights();
           // row[2] = air.getFreqOfFlights();
            //row[3] = air.getHeadOffice();
            //row[4] = air.getRegionOfOperations();
            dtm.addRow(row);
            
            
        }
    }*/
}
