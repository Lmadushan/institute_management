
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lahiru Madushan
 */
public class resmanage extends javax.swing.JFrame {

    /**
     * Creates new form resmanage
     */
    result res = new result();
    public resmanage() {
        initComponents();
        res.fillResultJtable(jTable, "");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rs7 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rid = new javax.swing.JTextField();
        rs1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonEdit = new javax.swing.JButton();
        jButtonPGRemove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButtonCancel = new javax.swing.JButton();
        valtofined = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rs2 = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        rs3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rs4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rs5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        rs6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButtonMail = new javax.swing.JButton();
        rs2su = new javax.swing.JTextField();
        rs3su = new javax.swing.JTextField();
        rs4su = new javax.swing.JTextField();
        rs1su = new javax.swing.JTextField();
        rs6su = new javax.swing.JTextField();
        rs5su = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButtonMail1 = new javax.swing.JButton();

        rs7.setBackground(new java.awt.Color(51, 255, 204));
        rs7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        rs7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs7ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel2.setText("Student ID :");

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel3.setText("Subject 1 :");

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel6.setText("Subject 2 :");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Result");

        rid.setBackground(new java.awt.Color(51, 255, 204));
        rid.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        rid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ridActionPerformed(evt);
            }
        });
        rid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ridKeyTyped(evt);
            }
        });

        rs1.setBackground(new java.awt.Color(51, 255, 204));
        rs1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        rs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nsbm-green-uni-logo.png"))); // NOI18N

        jButtonEdit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonPGRemove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPGRemove.setText("Remove");
        jButtonPGRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPGRemoveActionPerformed(evt);
            }
        });

        jTable.setBackground(new java.awt.Color(51, 255, 204));
        jTable.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Sub1", "Result", "Sub2", "Result", "Sub3", "Result", "Sub4", "Result", "Sub5", "Result", "Sub6", "Result"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jButtonCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        valtofined.setBackground(new java.awt.Color(51, 255, 204));
        valtofined.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        valtofined.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valtofinedActionPerformed(evt);
            }
        });
        valtofined.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                valtofinedKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                valtofinedKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valtofinedKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel5.setText("Enter Value to Search :");

        rs2.setBackground(new java.awt.Color(51, 255, 204));
        rs2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        rs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs2ActionPerformed(evt);
            }
        });

        jButtonAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        rs3.setBackground(new java.awt.Color(51, 255, 204));
        rs3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        rs3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel7.setText("Subject 3 :");

        rs4.setBackground(new java.awt.Color(51, 255, 204));
        rs4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        rs4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs4ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel8.setText("Subject 4 :");

        rs5.setBackground(new java.awt.Color(51, 255, 204));
        rs5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel10.setText("Subject 5 :");

        rs6.setBackground(new java.awt.Color(51, 255, 204));
        rs6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel11.setText("Subject 6 :");

        jButtonMail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonMail.setText("View & Send Report  - UG");
        jButtonMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMailActionPerformed(evt);
            }
        });

        rs2su.setBackground(new java.awt.Color(51, 255, 204));
        rs2su.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        rs2su.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs2suActionPerformed(evt);
            }
        });

        rs3su.setBackground(new java.awt.Color(51, 255, 204));
        rs3su.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        rs3su.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs3suActionPerformed(evt);
            }
        });

        rs4su.setBackground(new java.awt.Color(51, 255, 204));
        rs4su.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        rs4su.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs4suActionPerformed(evt);
            }
        });

        rs1su.setBackground(new java.awt.Color(51, 255, 204));
        rs1su.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        rs1su.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rs1suMouseClicked(evt);
            }
        });
        rs1su.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs1suActionPerformed(evt);
            }
        });

        rs6su.setBackground(new java.awt.Color(51, 255, 204));
        rs6su.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        rs6su.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs6suActionPerformed(evt);
            }
        });

        rs5su.setBackground(new java.awt.Color(51, 255, 204));
        rs5su.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        rs5su.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs5suActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel9.setText("Subject");

        jLabel12.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel12.setText("Result");

        jButtonMail1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonMail1.setText("View & Send Report  - PG");
        jButtonMail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMail1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(14, 14, 14)
                                        .addComponent(rid, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel6))
                                                .addGap(13, 13, 13)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel12)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(rs2)
                                                        .addComponent(rs3)
                                                        .addComponent(rs4)
                                                        .addComponent(rs6)
                                                        .addComponent(rs5)
                                                        .addComponent(rs1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(rs5su, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                            .addComponent(rs4su, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rs3su, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rs2su, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rs1su, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rs6su))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonMail1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButtonCancel)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonPGRemove)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonEdit)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonAdd)))
                                .addGap(125, 125, 125)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(valtofined, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(valtofined, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel12)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 42, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(rs1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rs1su, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(rs2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rs2su, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(rs3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rs3su, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(rs4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rs4su, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(rs5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rs5su, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(rs6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rs6su, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAdd)
                            .addComponent(jButtonEdit)
                            .addComponent(jButtonPGRemove)
                            .addComponent(jButtonCancel))
                        .addGap(32, 32, 32)
                        .addComponent(jButtonMail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonMail1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ridActionPerformed

    private void rs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rs1ActionPerformed

    public boolean verifText(){
        if(rid.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "ID field is empty!!!");
            return false;
        }
        else{
            return true;
        }
    }
    
    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed

        String ID = rid.getText();
        String S1 = rs1.getText();
        String S1s = rs1su.getText();
        String S2 = rs2.getText();
        String S2s = rs2su.getText();
        String S3 = rs3.getText();
        String S3s = rs3su.getText();
        String S4 = rs4.getText();
        String S4s = rs4su.getText();
        String S5 = rs5.getText();
        String S5s = rs5su.getText();
        String S6 = rs6.getText();
        String S6s = rs6su.getText();

        

        if(verifText()){
            result sub = new result();
            sub.insertUpdateDeleteResult('u', ID, S1, S1s, S2, S2s, S3, S3s, S4, S4s, S5, S5s, S6, S6s);
            resmanage.jTable.setModel(new DefaultTableModel(null, new Object[]{"ID","Sub1","Result","Sub2","Result","Sub3","Result","Sub4","Result","Sub5","Result","Sub6","Result",}));
            sub.fillResultJtable(resmanage.jTable, "");
        }
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonPGRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPGRemoveActionPerformed
        if(rid.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Select a Result");
        }else{
        String Id = String.valueOf(rid.getText());
        res.insertUpdateDeleteResult('d', Id, null, null, null, null, null, null, null, null, null, null, null, null);
        resmanage.jTable.setModel(new DefaultTableModel(null, new Object[]{"ID","Sub1","Result","Sub2","Result","Sub3","Result","Sub4","Result","Sub5","Result","Sub6","Result"}));
        res.fillResultJtable(resmanage.jTable, "");
        }
    }//GEN-LAST:event_jButtonPGRemoveActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked

        int rowIndex = jTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)jTable.getModel();

        
        rid.setText(model.getValueAt(rowIndex, 0).toString());
        rs1.setText(model.getValueAt(rowIndex, 1).toString());
        rs1su.setText(model.getValueAt(rowIndex, 2).toString());
        rs2.setText(model.getValueAt(rowIndex, 3).toString());
        rs2su.setText(model.getValueAt(rowIndex, 4).toString());
        rs3.setText(model.getValueAt(rowIndex, 5).toString());
        rs3su.setText(model.getValueAt(rowIndex, 6).toString());
        rs4.setText(model.getValueAt(rowIndex, 7).toString());
        rs4su.setText(model.getValueAt(rowIndex, 8).toString());
        rs5.setText(model.getValueAt(rowIndex, 9).toString());
        rs5su.setText(model.getValueAt(rowIndex, 10).toString());
        rs6.setText(model.getValueAt(rowIndex, 11).toString());
        rs6su.setText(model.getValueAt(rowIndex, 12).toString());
        
    }//GEN-LAST:event_jTableMouseClicked

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void valtofinedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valtofinedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valtofinedActionPerformed

    private void valtofinedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valtofinedKeyPressed
        //        jTable1.setModel(new DefaultTableModel(null, new Object[]{"ID","Name","NIC","Email","Addres","Phone","DOB","A/L res1","A/L res2","A/L res3","A/L rank","Faculty","Aca year"}));
        //        std.fillStudentJtable(jTable1, valtofined.getText());
    }//GEN-LAST:event_valtofinedKeyPressed

    private void valtofinedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valtofinedKeyReleased
        jTable.setModel(new DefaultTableModel(null, new Object[]{"ID","Sub1","Result","Sub2","Result","Sub3","Result","Sub4","Result","Sub5","Result","Sub6","Result"}));
        res.fillResultJtable(jTable, valtofined.getText());
    }//GEN-LAST:event_valtofinedKeyReleased

    private void valtofinedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valtofinedKeyTyped

    }//GEN-LAST:event_valtofinedKeyTyped

    private void rs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rs2ActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        String ID = rid.getText();
        String S1 = rs1.getText();
        String S1s = rs1su.getText();
        String S2 = rs2.getText();
        String S2s = rs2su.getText();
        String S3 = rs3.getText();
        String S3s = rs3su.getText();
        String S4 = rs4.getText();
        String S4s = rs4su.getText();
        String S5 = rs5.getText();
        String S5s = rs5su.getText();
        String S6 = rs6.getText();
        String S6s = rs6su.getText();


        

        if(verifText()){
            result sj = new result();
            sj.insertUpdateDeleteResult('i', ID,S1,S1s,S2,S2s,S3,S3s,S4,S4s,S5,S5s,S6,S6s);
            //            MainForm.jLabel_instructor.setText("Subject = "+Integer.toString( MyFunction.countData("subject")));

            resmanage.jTable.setModel(new DefaultTableModel(null, new Object[]{"ID","Sub1","Result","Sub2","Result","Sub3","Result","Sub4","Result","Sub5","Result","Sub6","Result"}));
            sj.fillResultJtable(resmanage.jTable, "");
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void rs3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rs3ActionPerformed

    private void rs4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rs4ActionPerformed

    private void jButtonMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMailActionPerformed
                    Sendres sendr =new Sendres();
                    sendr.setVisible(true);
                    sendr.pack();
                    sendr.setLocationRelativeTo(null);
                    sendr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    this.dispose();
        
    }//GEN-LAST:event_jButtonMailActionPerformed

    private void rs7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rs7ActionPerformed

    private void rs2suActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs2suActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rs2suActionPerformed

    private void rs3suActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs3suActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rs3suActionPerformed

    private void rs4suActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs4suActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rs4suActionPerformed

    private void rs1suActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs1suActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rs1suActionPerformed

    private void rs6suActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs6suActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rs6suActionPerformed

    private void rs5suActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs5suActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rs5suActionPerformed

    private void ridKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ridKeyTyped
        
        
    }//GEN-LAST:event_ridKeyTyped

    private void rs1suMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rs1suMouseClicked
        
    }//GEN-LAST:event_rs1suMouseClicked

    private void jButtonMail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMail1ActionPerformed
        Sendrespg sendr =new Sendrespg();
        sendr.setVisible(true);
        sendr.pack();
        sendr.setLocationRelativeTo(null);
        sendr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonMail1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(resmanage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resmanage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resmanage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resmanage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resmanage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonMail;
    private javax.swing.JButton jButtonMail1;
    private javax.swing.JButton jButtonPGRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable;
    private javax.swing.JTextField rid;
    private javax.swing.JTextField rs1;
    private javax.swing.JTextField rs1su;
    private javax.swing.JTextField rs2;
    private javax.swing.JTextField rs2su;
    private javax.swing.JTextField rs3;
    private javax.swing.JTextField rs3su;
    private javax.swing.JTextField rs4;
    private javax.swing.JTextField rs4su;
    private javax.swing.JTextField rs5;
    private javax.swing.JTextField rs5su;
    private javax.swing.JTextField rs6;
    private javax.swing.JTextField rs6su;
    private javax.swing.JTextField rs7;
    private javax.swing.JTextField valtofined;
    // End of variables declaration//GEN-END:variables
}
