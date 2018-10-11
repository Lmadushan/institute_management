
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ugstudent {
    
    public void insertUpdateDeleteUGStudent(char operation, String id, String name, String nic, String email, String addres, String Phone, String dob, String alres1, String alres2, String alres3, String alrank,String faculty, String acayear )
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        if(operation == 'i')
        {
            try {
                ps = con.prepareStatement("INSERT INTO undergradstd(UG_index, UG_name, UG_nic, UG_email, UG_addres, UG_phone, UG_dob, ALresultS1, ALresultS2, ALresultS3, ALrank, UG_faculty, UG_acaYear) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1, id);
                ps.setString(2, name);
                ps.setString(3, nic);
                ps.setString(4, email);
                ps.setString(5, addres);
                ps.setString(6, Phone);
                ps.setString(7, dob);
                ps.setString(8, alres1);
                ps.setString(9, alres2);
                ps.setString(10, alres3);
                ps.setString(11, alrank);
                ps.setString(12, faculty);
                ps.setString(13, acayear);
                
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "New Student Added");
                
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(ugstudent.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        if(operation == 'u')// update
        {
            try {
                ps = con.prepareStatement("UPDATE `undergradstd` SET `UG_name`= ?,`UG_nic`= ?,`UG_email`= ?,`UG_addres`= ?,`UG_phone`= ?,`UG_dob`= ?,`ALresultS1`= ?,`ALresultS2`= ?,`ALresultS3`= ?,`ALrank`= ?,`UG_faculty`= ?,`UG_acaYear`= ? WHERE UG_index ="+id);
                
                ps.setString(1, name);
                ps.setString(2, nic);
                ps.setString(3, email);
                ps.setString(4, addres);
                ps.setString(5, Phone);
                ps.setString(6, dob);
                ps.setString(7, alres1);
                ps.setString(8, alres2);
                ps.setString(9, alres3);
                ps.setString(10, alrank);
                ps.setString(11, faculty);
                ps.setString(12, acayear);
                
                
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Updated!!!");
                
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(ugstudent.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    
    }
    
    
    public void fillStudentJtable(JTable table, String valueToSearch)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("SELECT * FROM `undergradstd` WHERE CONCAT(`UG_index`, `UG_name`, `UG_nic`, `UG_email`,`UG_addres`, `UG_phone`, `UG_dob`, `ALresultS1`, `ALresultS2`, `ALresultS3`, `ALrank`, `UG_faculty`, `UG_acaYear`)LIKE ?");
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
            Logger.getLogger(ugstudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    
}
