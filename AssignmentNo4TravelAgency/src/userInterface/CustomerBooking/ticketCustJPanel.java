/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.CustomerBooking;
import userInterface.TravelAgencyMainJFrame;
import userInterface.ManageTravelAgency.searchFlightJPanel;
import userInterface.manageAirlinersJPanel.BtnManageJPanel;

        
import Business.Airliners;
import Business.AirlinersDirectory;
import Business.FlightScheDirectory;
import Business.Flights;
import Business.Passenger;
import Business.PassengerDirectory;
import Business.Seats;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adhar
 */
public class ticketCustJPanel extends javax.swing.JPanel {
    
    //private AirlinersDirectory airlinersDirectory;
    //private Airliners airliners;
    public JPanel rightJPanel;
    public Flights flights;
    //private Flights flight;
    
    public FlightScheDirectory flightScheDirectory;
    public PassengerDirectory passengerDirectory;
    //private Passenger passenger;
    /**
     * Creates new form ticketBookingJPanel
     */
   

    public ticketCustJPanel(JPanel rightJPanel,Flights flights , PassengerDirectory passengerDirectory, FlightScheDirectory flightScheDirectory) {
        initComponents();
        this.flightScheDirectory = flightScheDirectory;
        this.passengerDirectory = passengerDirectory;
        this.rightJPanel = rightJPanel;
        this.flights = flights;
        //this.flight = flight;
        populateSeats();
        //this.airlinersDirectory = airlinersDirectory;
        //this.airliners = airliners;
        
        //this.passenger = passenger;           
        //this.flight = flight;
    }
    private void populateSeats() {
        DefaultTableModel dtm = (DefaultTableModel) seatTable.getModel();
        dtm.setRowCount(0);
        for(Seats s: flights.getSeatList())
        {
            if(s.isBooked())
            {
                
            }
            else
            {
                Object row[]=new Object[2];
                row[0]=s;
                row[1]=flights.getPrice();
               // row [2] = 
                dtm.addRow(row);
                //flights.getSeatList().remove(s);
            }
            
            
        } //To change body of generated methods, choose Tools | Templates.
    }

  /*  ticketCustJPanel(JPanel rightJPanel, FlightScheDirectory flightScheDirectory, Flights flight) {
         initComponents();
        this.flightScheDirectory = flightScheDirectory;
        this.rightJPanel = rightJPanel;
        this.airlinersDirectory = airlinersDirectory;
        this.airliners = airliners;
        this.passengerDirectory = passengerDirectory;
        this.passenger = passenger;           
        this.flight = flight;
    }
*/
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bookticketBtn = new javax.swing.JButton();
        fnameTextField = new javax.swing.JTextField();
        lnameTextField = new javax.swing.JTextField();
        passengerIDTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        seatTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("Passenger Details");

        bookticketBtn.setText("Book Ticket");
        bookticketBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookticketBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("Passenger ID:");

        jLabel5.setText("EmailID:");

        seatTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Seat Number :", "Price :"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(seatTable);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fnameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                .addComponent(passengerIDTextField)
                                .addComponent(emailTextField))
                            .addComponent(lnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(287, 287, 287))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(565, 565, 565)
                        .addComponent(bookticketBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(261, 261, 261)
                        .addComponent(jLabel1)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passengerIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(bookticketBtn)
                .addGap(81, 81, 81))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bookticketBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookticketBtnActionPerformed
        // TODO add your handling code here:
       Passenger p = passengerDirectory.addP();
       
       
       p.setPassengerFName(fnameTextField.getText());
       p.setPassengerLName(lnameTextField.getText());
       p.setPassengerID(passengerIDTextField.getText());
       p.setEmailID(emailTextField.getText());
       
       int selectedRow = seatTable.getSelectedRow();
       String name = fnameTextField.getText();
       String surname = lnameTextField.getText();
       
      /* Passenger p = passengerDirectory.addP();
       p.setPassengerFName(fnameTextField.getText());
       p.setPassengerLName(lnameTextField.getText());
       p.setPassengerID(passengerIDTextField.getText());
       p.setEmailID(emailTextField.getText());*/
       
       Seats s = (Seats) seatTable.getValueAt(selectedRow, 0);
       s.setPassenger(p);
       s.setName(fnameTextField.getText());
       s.setBooked(true);
       p.addSeat(s);
       String a = (String.valueOf(s));
       JOptionPane.showMessageDialog(null, "Dear customer "+ name + " "+ surname+ " Your ticket has been booked with Seat number " + a +  " ,We wish you a Happy and Safe Journey!");
       
       populateSeats();
       /*if(s.isBooked())
       {
           s.setBooked(false);
       }
       else
          
       {
           
       }
       */
     
      
       
       
      // System.out.println("wow");
    }//GEN-LAST:event_bookticketBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        rightJPanel.remove(this);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.previous(rightJPanel);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookticketBtn;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField fnameTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lnameTextField;
    private javax.swing.JTextField passengerIDTextField;
    private javax.swing.JTable seatTable;
    // End of variables declaration//GEN-END:variables

    
}

