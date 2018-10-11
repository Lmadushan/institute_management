

import javax.swing.ButtonGroup;
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
public class Addcourse extends javax.swing.JFrame {

    /**
     * Creates new form Addcourse
     */
    course cu = new course();
    public Addcourse() {
        initComponents();
        ButtonGroup bg4 = new ButtonGroup();
        bg4.add(soc);
        bg4.add(soe);
        bg4.add(som);
        soc.setSelected(true);
        
        cu.fillCourseJtable(jTable, "");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        soc = new javax.swing.JRadioButton();
        soe = new javax.swing.JRadioButton();
        som = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonEdit = new javax.swing.JButton();
        jButtonPGRemove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButtonCancel = new javax.swing.JButton();
        valtofined = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        credit = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel2.setText("Course ID :");

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel3.setText("Course Name :");

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel6.setText("Credit :");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Course Info");

        jLabel15.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel15.setText("Faculty :");

        id.setBackground(new java.awt.Color(51, 255, 204));
        id.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        name.setBackground(new java.awt.Color(51, 255, 204));
        name.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        soc.setBackground(new java.awt.Color(51, 255, 204));
        soc.setText("SOC");
        soc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                socActionPerformed(evt);
            }
        });

        soe.setBackground(new java.awt.Color(51, 255, 204));
        soe.setText("SOE");
        soe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soeActionPerformed(evt);
            }
        });

        som.setBackground(new java.awt.Color(51, 255, 204));
        som.setText("SOM");

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
                "ID", "Name", "Course", "Faculty"
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

        credit.setBackground(new java.awt.Color(51, 255, 204));
        credit.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditActionPerformed(evt);
            }
        });

        jButtonAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
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
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel6))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(credit, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(237, 237, 237)
                                            .addComponent(jButtonEdit))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButtonCancel)
                                            .addGap(29, 29, 29)
                                            .addComponent(jButtonPGRemove)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(109, 109, 109)
                                        .addComponent(soc)
                                        .addGap(18, 18, 18)
                                        .addComponent(soe)
                                        .addGap(18, 18, 18)
                                        .addComponent(som)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAdd)
                                .addGap(42, 42, 42)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(valtofined, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valtofined, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(credit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(soc)
                            .addComponent(soe)
                            .addComponent(som))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCancel)
                            .addComponent(jButtonPGRemove)
                            .addComponent(jButtonEdit)
                            .addComponent(jButtonAdd))))
                .addGap(0, 42, Short.MAX_VALUE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void soeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soeActionPerformed

    public boolean verifText(){
        if(id.getText().equals("") || name.getText().equals("") || credit.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Some fields are empty!!!");
            return false;
        }
        else{
            return true;
        }
    }
    private void jButtonPGRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPGRemoveActionPerformed
            if(id.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Select a Course");
        }else{
        String Id = String.valueOf(id.getText());
        cu.insertUpdateDeletecourse('d', Id, null, null, null);
        Addcourse.jTable.setModel(new DefaultTableModel(null, new Object[]{"ID","Name","Credit","Faculty"}));
        cu.fillCourseJtable(Addcourse.jTable, "");
        }
    }//GEN-LAST:event_jButtonPGRemoveActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked

        int rowIndex = jTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)jTable.getModel();

        if(model.getValueAt(rowIndex, 3).toString().equals("SOC"))
        {
            soc.setSelected(true);
            soe.setSelected(false);
            som.setSelected(false);
        }
        else if(model.getValueAt(rowIndex, 3).toString().equals("SOE"))
        {
            soc.setSelected(false);
            soe.setSelected(true);
            som.setSelected(false);
        }
        else if(model.getValueAt(rowIndex, 3).toString().equals("SOM"))
        {
            soc.setSelected(false);
            soe.setSelected(false);
            som.setSelected(true);
        }

        
        id.setText(model.getValueAt(rowIndex, 0).toString());
        name.setText(model.getValueAt(rowIndex, 1).toString());
        credit.setText(model.getValueAt(rowIndex, 2).toString());

    }//GEN-LAST:event_jTableMouseClicked

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void valtofinedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valtofinedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valtofinedActionPerformed

    private void valtofinedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valtofinedKeyPressed
        
    }//GEN-LAST:event_valtofinedKeyPressed

    private void valtofinedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valtofinedKeyReleased
        jTable.setModel(new DefaultTableModel(null, new Object[]{"ID","Name","Credit","Faculty"}));
        cu.fillCourseJtable(jTable, valtofined.getText());
    }//GEN-LAST:event_valtofinedKeyReleased

    private void valtofinedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valtofinedKeyTyped

    }//GEN-LAST:event_valtofinedKeyTyped

    private void creditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creditActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        String Id = id.getText();
        String Name = name.getText();
        String Credit = credit.getText();

        

        
        String faculty = "";
        if(soc.isSelected()){
            faculty = "SOC";
            soc.setSelected(true);
            soe.setSelected(false);
            som.setSelected(false);
        }else if(soe.isSelected()){
            faculty = "SOE";
            soc.setSelected(false);
            soe.setSelected(true);
            som.setSelected(false);
        }else if(som.isSelected()){
            faculty = "SOM";
            soc.setSelected(false);
            soe.setSelected(false);
            som.setSelected(true);
        }

//        String acayear = pgstdacayear.getText();

        if(verifText()){
            course cor = new course();
            cor.insertUpdateDeletecourse('i', Id, Name, Credit,faculty);
            

            Addcourse.jTable.setModel(new DefaultTableModel(null, new Object[]{"ID","Name","Credit","Faculty"}));
            cor.fillCourseJtable(Addcourse.jTable, "");
        }
    
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void socActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_socActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_socActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed

        String Id = id.getText();
        String Name = name.getText();
        String Credit = credit.getText();

        String faculty = "";
        if(soc.isSelected()){
            faculty = "SOC";

        }else if(soe.isSelected()){
            faculty = "SOE";

        }else if(som.isSelected()){
            faculty = "SOM";

        }

        //        String acayear = pgstdacayear.getText();

        if(verifText()){
            course cou = new course();
            cou.insertUpdateDeletecourse('u', Id, Name, Credit, faculty);
            //            MainForm.jLabel_teacher.setText("Teacher = "+Integer.toString( MyFunction.countData("teachers")));
            Addcourse.jTable.setModel(new DefaultTableModel(null, new Object[]{"ID","Name","Credit","Faculty"}));
            cou.fillCourseJtable(Addcourse.jTable, "");

        }
    }//GEN-LAST:event_jButtonEditActionPerformed

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
            java.util.logging.Logger.getLogger(Addcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addcourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField credit;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonPGRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable;
    private javax.swing.JTextField name;
    private javax.swing.JRadioButton soc;
    private javax.swing.JRadioButton soe;
    private javax.swing.JRadioButton som;
    private javax.swing.JTextField valtofined;
    // End of variables declaration//GEN-END:variables
}
