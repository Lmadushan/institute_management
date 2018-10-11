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

public class teacher {
    
    public void insertUpdateDeleteteacher(char operation, String id, String name, String nic, String email, String addres, String Phone, String faculty)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        if(operation == 'i')
        {
            try {
                ps = con.prepareStatement("INSERT INTO teachers(T_id, T_name, T_nic, T_email, T_addres, T_phone, T_faculty) VALUES (?,?,?,?,?,?,?)");
                ps.setString(1, id);
                ps.setString(2, name);
                ps.setString(3, nic);
                ps.setString(4, email);
                ps.setString(5, addres);
                ps.setString(6, Phone);
                ps.setString(7, faculty);
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "New Teacher Added");
                
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(teacher.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        if(operation == 'u')// update
        {
            try {
                ps = con.prepareStatement("UPDATE `teachers` SET `T_name`= ?,`T_nic`= ?,`T_email`= ?,`T_addres`= ?,`T_phone`= ?,`T_faculty`= ?  WHERE `T_id` = '"+id+"'");
                
                ps.setString(1, name);
                ps.setString(2, nic);
                ps.setString(3, email);
                ps.setString(4, addres);
                ps.setString(5, Phone);
                ps.setString(6, faculty);
          
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Updated!!!");
                
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(teacher.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(operation == 'd')
    {
        
            try {
                ps = con.prepareStatement("DELETE FROM `teachers` WHERE `T_id` = ?");
                ps.setString(1, id);
                if(ps.executeUpdate() >  0){
                    JOptionPane.showMessageDialog(null, "Teacher Removed");
                }
            } catch (SQLException ex) {
                Logger.getLogger(pgstudent.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
    }
    
    }
    
    
    public void fillTeacherJtable(JTable table, String valueToSearch)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("SELECT * FROM `teachers` WHERE CONCAT(`T_id`, `T_name`, `T_nic`, `T_email`,`T_addres`, `T_phone`,`T_faculty`)LIKE ?");
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
                row[6] = rs.getString(7);

                model.addRow(row);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(teacher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    
}
