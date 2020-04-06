/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.NGOEnterprise;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
/**
 *
 * @author adhar
 */
public class NGOAdminWorkArea extends javax.swing.JPanel {
    private JPanel downJPanel;
    private EcoSystem ESystem;
    private Enterprise enterprise;
    private Organization org;
    private UserAccount UserAccount;
    /**
     * Creates new form NGOAdminWorkArea
     */
    public NGOAdminWorkArea(JPanel downJPanel,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem) {
        initComponents();
        this.downJPanel = downJPanel;
        this.ESystem = ESystem;
        this.enterprise = enterprise;
        this.UserAccount = UserAccount;
        this.org = org;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mngUserAccountBtn = new javax.swing.JButton();
        mngEmployeeBtn = new javax.swing.JButton();
        mngOrganisationBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(66, 160, 236));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NGO Enterprise");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(411, 411, 411)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1025, -1));

        mngUserAccountBtn.setText("Manage User Account");
        mngUserAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngUserAccountBtnActionPerformed(evt);
            }
        });
        add(mngUserAccountBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 488, 241, 52));

        mngEmployeeBtn.setText("Manage Organization Employee");
        mngEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngEmployeeBtnActionPerformed(evt);
            }
        });
        add(mngEmployeeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 416, 241, 54));

        mngOrganisationBtn.setText("Manage Organization");
        mngOrganisationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngOrganisationBtnActionPerformed(evt);
            }
        });
        add(mngOrganisationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 348, 241, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void mngUserAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngUserAccountBtnActionPerformed
        // TODO add your handling code here:
        ManageUserAccount mng = new ManageUserAccount(downJPanel, enterprise);
        downJPanel.add("ManageUserAccount", mng);
        CardLayout layout = (CardLayout) downJPanel.getLayout();
        layout.next(downJPanel);
    }//GEN-LAST:event_mngUserAccountBtnActionPerformed

    private void mngEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngEmployeeBtnActionPerformed
        // TODO add your handling code here:
        ManageOrganizationEmployee mng = new ManageOrganizationEmployee(downJPanel, enterprise.getOrganizationDirectory());
        downJPanel.add("ManageEmployee", mng);
        CardLayout layout = (CardLayout) downJPanel.getLayout();
        layout.next(downJPanel);
    }//GEN-LAST:event_mngEmployeeBtnActionPerformed

    private void mngOrganisationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngOrganisationBtnActionPerformed
        // TODO add your handling code here:
        ManageOrganization mng = new ManageOrganization(downJPanel, enterprise.getOrganizationDirectory());
        downJPanel.add("ManageOrganization", mng);
        CardLayout layout = (CardLayout) downJPanel.getLayout();
        layout.next(downJPanel);
    }//GEN-LAST:event_mngOrganisationBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mngEmployeeBtn;
    private javax.swing.JButton mngOrganisationBtn;
    private javax.swing.JButton mngUserAccountBtn;
    // End of variables declaration//GEN-END:variables
}

