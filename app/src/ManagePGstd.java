
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
public class ManagePGstd extends javax.swing.JFrame {

    /**
     * Creates new form ManagePGstd
     */
    pgstudent std = new pgstudent();
    public ManagePGstd() {
        initComponents();
        std.fillStudentJtable(jTable, "");
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pgstdid = new javax.swing.JTextField();
        pgstdname = new javax.swing.JTextField();
        pgstdtp = new javax.swing.JTextField();
        pgstdaddres = new javax.swing.JTextField();
        pgstdinstitute = new javax.swing.JTextField();
        pgstdacayear = new javax.swing.JTextField();
        pgstdsoc = new javax.swing.JRadioButton();
        pgstdsoe = new javax.swing.JRadioButton();
        pgstdsom = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonEditPGStudent = new javax.swing.JButton();
        jButtonPGRemove = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        pgstdemail = new javax.swing.JTextField();
        pgstddob = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButtonCancel = new javax.swing.JButton();
        valtofined = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ugstdnic1 = new javax.swing.JTextField();
        pgstdnic = new javax.swing.JTextField();
        pgstddegree = new javax.swing.JTextField();
        pgstdyears = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel2.setText("ID :");

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel3.setText("Full Name :");

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel6.setText("NIC :");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PG Student Info");

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel7.setText("Addres :");

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel8.setText("Tel No:");

        jLabel9.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel9.setText("DOB :");

        jLabel10.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel10.setText("Institute :");

        jLabel11.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel11.setText("Pre Degree :");

        jLabel12.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel12.setText("Years :");

        jLabel14.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel14.setText("Aca Year :");

        jLabel15.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel15.setText("Faculty :");

        pgstdid.setEditable(false);
        pgstdid.setBackground(new java.awt.Color(51, 255, 204));
        pgstdid.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        pgstdid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pgstdidActionPerformed(evt);
            }
        });

        pgstdname.setBackground(new java.awt.Color(51, 255, 204));
        pgstdname.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        pgstdname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pgstdnameActionPerformed(evt);
            }
        });

        pgstdtp.setBackground(new java.awt.Color(51, 255, 204));
        pgstdtp.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        pgstdtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pgstdtpActionPerformed(evt);
            }
        });
        pgstdtp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pgstdtpKeyTyped(evt);
            }
        });

        pgstdaddres.setBackground(new java.awt.Color(51, 255, 204));
        pgstdaddres.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        pgstdaddres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pgstdaddresActionPerformed(evt);
            }
        });

        pgstdinstitute.setBackground(new java.awt.Color(51, 255, 204));
        pgstdinstitute.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        pgstdinstitute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pgstdinstituteActionPerformed(evt);
            }
        });

        pgstdacayear.setBackground(new java.awt.Color(51, 255, 204));
        pgstdacayear.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        pgstdacayear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pgstdacayearActionPerformed(evt);
            }
        });

        pgstdsoc.setBackground(new java.awt.Color(51, 255, 204));
        pgstdsoc.setText("SOC");

        pgstdsoe.setBackground(new java.awt.Color(51, 255, 204));
        pgstdsoe.setText("SOE");
        pgstdsoe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pgstdsoeActionPerformed(evt);
            }
        });

        pgstdsom.setBackground(new java.awt.Color(51, 255, 204));
        pgstdsom.setText("SOM");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nsbm-green-uni-logo.png"))); // NOI18N

        jButtonEditPGStudent.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEditPGStudent.setText("Edit");
        jButtonEditPGStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditPGStudentActionPerformed(evt);
            }
        });

        jButtonPGRemove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPGRemove.setText("Remove");
        jButtonPGRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPGRemoveActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel16.setText("Email :");

        pgstdemail.setBackground(new java.awt.Color(51, 255, 204));
        pgstdemail.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        pgstddob.setBackground(new java.awt.Color(51, 255, 204));
        pgstddob.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        pgstddob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pgstddobActionPerformed(evt);
            }
        });
        pgstddob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pgstddobKeyTyped(evt);
            }
        });

        jTable.setBackground(new java.awt.Color(51, 255, 204));
        jTable.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "NIC", "Email", "Addres", "Phone", "DOB", "Degree", "Institute", "Years", "Faculty", "Aca year"
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

        ugstdnic1.setBackground(new java.awt.Color(51, 255, 204));
        ugstdnic1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        pgstdnic.setBackground(new java.awt.Color(51, 255, 204));
        pgstdnic.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        pgstdnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pgstdnicActionPerformed(evt);
            }
        });

        pgstddegree.setBackground(new java.awt.Color(51, 255, 204));
        pgstddegree.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        pgstddegree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pgstddegreeActionPerformed(evt);
            }
        });

        pgstdyears.setBackground(new java.awt.Color(51, 255, 204));
        pgstdyears.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        pgstdyears.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pgstdyearsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonCancel)
                        .addGap(28, 28, 28)
                        .addComponent(jButtonPGRemove)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonEditPGStudent)
                        .addGap(75, 75, 75)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel16)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(pgstdid, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pgstdname, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pgstdemail, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pgstdtp, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pgstddob, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pgstdaddres, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pgstdnic, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pgstdinstitute, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pgstddegree, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(pgstdsoc)
                                        .addGap(18, 18, 18)
                                        .addComponent(pgstdsoe)
                                        .addGap(18, 18, 18)
                                        .addComponent(pgstdsom))
                                    .addComponent(pgstdyears, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pgstdacayear, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
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
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ugstdnic1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 599, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEditPGStudent)
                            .addComponent(jButtonPGRemove)
                            .addComponent(jButtonCancel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(pgstdid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(pgstdname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valtofined, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(pgstdnic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(pgstdemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(pgstdaddres, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(pgstdtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(pgstddob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(pgstddegree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(pgstdinstitute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(pgstdyears, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pgstdsoc)
                                    .addComponent(pgstdsoe)
                                    .addComponent(pgstdsom)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(pgstdacayear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 42, Short.MAX_VALUE)))
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ugstdnic1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 321, Short.MAX_VALUE)))
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

    private void pgstdidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pgstdidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pgstdidActionPerformed

    private void pgstdnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pgstdnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pgstdnameActionPerformed

    private void pgstdtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pgstdtpActionPerformed

    }//GEN-LAST:event_pgstdtpActionPerformed

    private void pgstdtpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pgstdtpKeyTyped
        // allow only numbers

        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_pgstdtpKeyTyped

    private void pgstdaddresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pgstdaddresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pgstdaddresActionPerformed

    private void pgstdinstituteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pgstdinstituteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pgstdinstituteActionPerformed

    private void pgstdacayearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pgstdacayearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pgstdacayearActionPerformed

    private void pgstdsoeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pgstdsoeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pgstdsoeActionPerformed
    public boolean verifText(){
        if(pgstdid.getText().equals("") || pgstdname.getText().equals("") || pgstdnic.getText().equals("") || pgstdemail.getText().equals("") || pgstdaddres.getText().equals("") || pgstdtp.getText().equals("") || pgstddob.getText().equals("")|| pgstddegree.getText().equals("")||pgstdinstitute.getText().equals("")||pgstdyears.getText().equals("")|| pgstdacayear.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Some fields are empty!!!");
            return false;
        }
        else{
            return true;
        }
    }
    
    private void jButtonEditPGStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditPGStudentActionPerformed

        String id = pgstdid.getText();
        String name = pgstdname.getText();
        String nic = pgstdnic.getText();
        String email = pgstdemail.getText();
        String addres = pgstdaddres.getText();
        String Phone = pgstdtp.getText();
        String dob = pgstddob.getText();
        String degree = pgstddegree.getText();
        String institute = pgstdinstitute.getText();
        String years = pgstdyears.getText();



        String faculty = "SOC";
        if(pgstdsoe.isSelected()){
            faculty = "SOE";
        }else if(pgstdsom.isSelected()){
            faculty = "SOM";
        }

        String acayear = pgstdacayear.getText();

        if(verifText()){
            pgstudent pgstd = new pgstudent();
            pgstd.insertUpdateDeletePGStudent('u', id, name, nic, email, addres, Phone, dob, degree, institute, years, faculty, acayear);
            ManagePGstd.jTable.setModel(new DefaultTableModel(null, new Object[]{"ID","Name","NIC","Email","Addres","Phone","DOB","Degree","Institute","Years","Faculty","Aca year"}));
            std.fillStudentJtable(ManagePGstd.jTable, "");
//MainForm.jLabel_StdCount.setText("UG Student Count = "+Integer.toString( MyFunction.countData("ugstd")));
        }
    }//GEN-LAST:event_jButtonEditPGStudentActionPerformed

    private void jButtonPGRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPGRemoveActionPerformed
        if(pgstdid.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Select a student");
        }else{
        String id = String.valueOf(pgstdid.getText());
        std.insertUpdateDeletePGStudent('d', id, null, null, null, null, null, null, null, null, null, null, null);
        ManagePGstd.jTable.setModel(new DefaultTableModel(null, new Object[]{"ID","Name","NIC","Email","Addres","Phone","DOB","Degree","Institute","Years","Faculty","Aca year"}));
        std.fillStudentJtable(ManagePGstd.jTable, "");
        }
    }//GEN-LAST:event_jButtonPGRemoveActionPerformed

    private void pgstddobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pgstddobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pgstddobActionPerformed

    private void pgstddobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pgstddobKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_pgstddobKeyTyped

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked

        int rowIndex = jTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)jTable.getModel();

        if(model.getValueAt(rowIndex, 10).toString().equals("SOC"))
        {
            pgstdsoc.setSelected(true);
            pgstdsoe.setSelected(false);
            pgstdsom.setSelected(false);
        }
        else if(model.getValueAt(rowIndex, 10).toString().equals("SOE"))
        {
            pgstdsoc.setSelected(false);
            pgstdsoe.setSelected(true);
            pgstdsom.setSelected(false);
        }
        else if(model.getValueAt(rowIndex, 10).toString().equals("SOM"))
        {
            pgstdsoc.setSelected(false);
            pgstdsoe.setSelected(false);
            pgstdsom.setSelected(true);
        }


        pgstdid.setText(model.getValueAt(rowIndex, 0).toString());
        pgstdname.setText(model.getValueAt(rowIndex, 1).toString());
        pgstdnic.setText(model.getValueAt(rowIndex, 2).toString());
        pgstdemail.setText(model.getValueAt(rowIndex, 3).toString());
        pgstdaddres.setText(model.getValueAt(rowIndex, 4).toString());
        pgstdtp.setText(model.getValueAt(rowIndex, 5).toString());
        pgstddob.setText(model.getValueAt(rowIndex, 6).toString());
        pgstddegree.setText(model.getValueAt(rowIndex, 7).toString());
        pgstdinstitute.setText(model.getValueAt(rowIndex, 8).toString());
        pgstdyears.setText(model.getValueAt(rowIndex, 9).toString());
        pgstdacayear.setText(model.getValueAt(rowIndex, 11).toString());

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
        jTable.setModel(new DefaultTableModel(null, new Object[]{"ID","Name","NIC","Email","Addres","Phone","DOB","Degree","Institute","Years","Faculty","Aca year"}));
        std.fillStudentJtable(jTable, valtofined.getText());
    }//GEN-LAST:event_valtofinedKeyReleased

    private void valtofinedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valtofinedKeyTyped

    }//GEN-LAST:event_valtofinedKeyTyped

    private void pgstdnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pgstdnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pgstdnicActionPerformed

    private void pgstddegreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pgstddegreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pgstddegreeActionPerformed

    private void pgstdyearsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pgstdyearsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pgstdyearsActionPerformed

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
            java.util.logging.Logger.getLogger(ManagePGstd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagePGstd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagePGstd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagePGstd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagePGstd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonEditPGStudent;
    private javax.swing.JButton jButtonPGRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JTextField pgstdacayear;
    private javax.swing.JTextField pgstdaddres;
    private javax.swing.JTextField pgstddegree;
    private javax.swing.JTextField pgstddob;
    private javax.swing.JTextField pgstdemail;
    private javax.swing.JTextField pgstdid;
    private javax.swing.JTextField pgstdinstitute;
    private javax.swing.JTextField pgstdname;
    private javax.swing.JTextField pgstdnic;
    private javax.swing.JRadioButton pgstdsoc;
    private javax.swing.JRadioButton pgstdsoe;
    private javax.swing.JRadioButton pgstdsom;
    private javax.swing.JTextField pgstdtp;
    private javax.swing.JTextField pgstdyears;
    private javax.swing.JTextField ugstdnic1;
    private javax.swing.JTextField valtofined;
    // End of variables declaration//GEN-END:variables
}