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

public class payment {
    
    public void insertUpdateDeletePayment(char operation, String id, String pay)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        if(operation == 'i')
        {
            try {
                ps = con.prepareStatement("INSERT INTO payments(PAY_stdid, PAYMENT) VALUES (?,?)");
                ps.setString(1, id);
                ps.setString(2, pay);
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Paid!!");
                
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(payment.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        if(operation == 'u')// update
       {
            try {
                ps = con.prepareStatement("UPDATE `payments` SET `PAYMENT`= ? WHERE `PAY_stdid` = '"+id+"'");
                
                ps.setString(1, pay);
                
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Updated!!!");
                
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(payment.class.getName()).log(Level.SEVERE, null, ex);
            }
            
       }
    
    }
    
    
    public void fillPaymentJtable(JTable table, String valueToSearch)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("SELECT * FROM `payments` WHERE CONCAT(`PAY_stdid`, `PAYMENT`)LIKE ?");
            ps.setString(1, "%"+valueToSearch+"%");
            
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next()){
                row = new Object[2];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                

                model.addRow(row);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(payment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    
}
