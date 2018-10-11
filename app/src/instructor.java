/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lahiru Madushan
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class instructor {
    
    public void insertUpdateDeleteinstructor(char operation, String id, String name, String email, String subject, String lab, String faculty)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        if(operation == 'i')
        {
            try {
                ps = con.prepareStatement("INSERT INTO instructors(INS_id, INS_name, INS_email, INS_subject, INS_lab, INS_faculty) VALUES (?,?,?,?,?,?)");
                ps.setString(1, id);
                ps.setString(2, name);
                ps.setString(3, email);
                ps.setString(4, subject);
                ps.setString(5, lab);
                ps.setString(6, faculty);
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "New Instuctor Added");
                
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(instructor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        if(operation == 'u')// update
        {
            try {
                ps = con.prepareStatement("UPDATE `instructors` SET `INS_name`= ?,`INS_email`= ?,`INS_subject`= ?,`INS_lab`= ?,`INS_faculty`= ?  WHERE `INS_id` = '"+id+"'");
                
                ps.setString(1, name);
                ps.setString(2, email);
                ps.setString(3, subject);
                ps.setString(4, lab);
                ps.setString(5, faculty);
          
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Updated!!!");
                
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(instructor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(operation == 'd')
    {
        
            try {
                ps = con.prepareStatement("DELETE FROM `instructors` WHERE `INS_id` = ?");
                ps.setString(1, id);
                if(ps.executeUpdate() >  0){
                    JOptionPane.showMessageDialog(null, "Instructor Removed");
                }
            } catch (SQLException ex) {
                Logger.getLogger(pgstudent.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
    }
    
    }
    
    
    public void fillInstructorJtable(JTable table, String valueToSearch)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("SELECT * FROM `instructors` WHERE CONCAT(`INS_id`, `INS_name`, `INS_email`,`INS_subject`,`INS_lab`,`INS_faculty`)LIKE ?");
            ps.setString(1, "%"+valueToSearch+"%");
            
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next()){
                row = new Object[7];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                

                model.addRow(row);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(instructor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    
}
