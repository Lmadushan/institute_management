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

public class enroll2 {
    
    public void insertUpdateDeleteenroll2(char operation, String id, String sub1, String sub2,String sub3,String sub4,String sub5,String sub6)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        if(operation == 'i')
        {
            try {
                ps = con.prepareStatement("INSERT INTO enrollment2( E2_id, E2_1, E2_2, E2_3, E2_4, E2_5, E2_6) VALUES (?,?,?,?,?,?,?)");
                ps.setString(1, id);
                ps.setString(2, sub1);
                ps.setString(3, sub2);
                ps.setString(4, sub3);
                ps.setString(5, sub4);
                ps.setString(6, sub5);
                ps.setString(7, sub6);
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Enrolled!");
                
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(enroll2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        if(operation == 'u')// update
        {
            try {
                ps = con.prepareStatement("UPDATE `enrollment2` SET `E2_1`= ?,`E2_2`= ?,`E2_3`= ?,`E2_4`= ?,`E2_5`= ?,`E2_6`= ?  WHERE E2_id ='"+id+"'");
                
                ps.setString(1, sub1);
                ps.setString(2, sub2);
                ps.setString(3, sub3);
                ps.setString(4, sub4);
                ps.setString(5, sub5);
                ps.setString(6, sub6);
          
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Updated!!!");
                
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(enroll.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(operation == 'd')
        {
        
            try {
                ps = con.prepareStatement("DELETE FROM `enrollment2` WHERE `E2_id` = ?");
                ps.setString(1, id);
                if(ps.executeUpdate() >  0){
                    JOptionPane.showMessageDialog(null, "Removed");
                }
            } catch (SQLException ex) {
                Logger.getLogger(pgstudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }
    
    
    public void fillEnroll2Jtable(JTable table, String valueToSearch)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("SELECT * FROM `enrollment2` WHERE CONCAT( `E2_id`, `E2_1`, `E2_2`, `E2_3`, `E2_4`, `E2_5`, `E2_6`)LIKE ?");
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
            Logger.getLogger(enroll2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    
}

