import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class result {
    
    public void insertUpdateDeleteResult(char operation, String id, String sub1,String sub1s, String sub2,String sub2s, String sub3,String sub3s, String sub4,String sub4s, String sub5,String sub5s, String sub6,String sub6s)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        if(operation == 'i')
        {
            try {
                ps = con.prepareStatement("INSERT INTO results(RES_id, RES_s1,RES_s1s, RES_s2,RES_s2s, RES_s3,RES_s3s, RES_s4,RES_s4s, RES_s5,RES_s5s, RES_s6,RES_s6s) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1, id);
                ps.setString(2, sub1);
                ps.setString(3, sub1s);
                ps.setString(4, sub2);
                ps.setString(5, sub2s);
                ps.setString(6, sub3);
                ps.setString(7, sub3s);
                ps.setString(8, sub4);
                ps.setString(9, sub4s);
                ps.setString(10, sub5);
                ps.setString(11, sub5s);
                ps.setString(12, sub6);
                ps.setString(13, sub6s);
                
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "New Result Added");
                
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(result.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if(operation == 'u')// update
        {
            try {
                ps = con.prepareStatement("UPDATE `results` SET `RES_s1`= ?,`RES_s1s`= ?,`RES_s2`= ?,`RES_s2s`= ?,`RES_s3`= ?,`RES_s3s`= ?,`RES_s4`= ?,`RES_s4s`= ?,`RES_s5`= ?,`RES_s5s`= ?,`RES_s6`= ?,`RES_s6s`= ?  WHERE RES_id ='"+id+"'");
                
                ps.setString(1, sub1);
                ps.setString(2, sub1s);
                ps.setString(3, sub2);
                ps.setString(4, sub2s);
                ps.setString(5, sub3);
                ps.setString(6, sub3s);
                ps.setString(7, sub4);
                ps.setString(8, sub4s);
                ps.setString(9, sub5);
                ps.setString(10, sub5s);
                ps.setString(11, sub6);
                ps.setString(12, sub6s);
          
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
                ps = con.prepareStatement("DELETE FROM `results` WHERE `RES_id` = ?");
                ps.setString(1, id);
                if(ps.executeUpdate() >  0){
                    JOptionPane.showMessageDialog(null, "Result Removed");
                }
            } catch (SQLException ex) {
                Logger.getLogger(pgstudent.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
    }
        
        

    }
    
    
    public void fillResultJtable(JTable table, String valueToSearch)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("SELECT * FROM `results` WHERE CONCAT(`RES_id`, `RES_s1`, `RES_s1s`, `RES_s2`, `RES_s2s`, `RES_s3`, `RES_s3s`, `RES_s4`, `RES_s4s`, `RES_s5`, `RES_s5s`, `RES_s6`, `RES_s6s`)LIKE ?");
            ps.setString(1, "%"+valueToSearch+"%");
            
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next()){
                row = new Object[13];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                row[8] = rs.getString(9);
                row[9] = rs.getString(10);
                row[10] = rs.getString(11);
                row[11] = rs.getString(12);
                row[12] = rs.getString(13);
                
                
                model.addRow(row);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(result.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    public void fillIndexJtable(JTable table, String valueToSearch)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("SELECT * FROM `undergradstd` WHERE CONCAT(`UG_index`, `UG_name`, `UG_email`)LIKE ?");
            ps.setString(1, "%"+valueToSearch+"%");
            
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model1 = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next()){
                row = new Object[4];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(4);
                
                model1.addRow(row);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(result.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void fillIndexpgJtable(JTable table, String valueToSearch)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("SELECT * FROM `postgradstd` WHERE CONCAT(`PG_index`, `PG_name`, `PG_email`)LIKE ?");
            ps.setString(1, "%"+valueToSearch+"%");
            
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model2 = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next()){
                row = new Object[4];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(4);
                
                model2.addRow(row);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(result.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}