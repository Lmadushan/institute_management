
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class pgstudent {
    
    public void insertUpdateDeletePGStudent(char operation, String id, String name, String nic, String email, String addres, String Phone, String dob, String degree, String institute, String years, String faculty, String acayear )
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        if(operation == 'i')
        {
            try {
                ps = con.prepareStatement("INSERT INTO postgradstd(PG_index, PG_name, PG_nic, PG_addres, PG_email, PG_phone, PG_dob, PG_degree, PG_institute, PG_Years, PG_faculty, PG_acayear) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1, id);
                ps.setString(2, name);
                ps.setString(3, nic);
                ps.setString(4, email);
                ps.setString(5, addres);
                ps.setString(6, Phone);
                ps.setString(7, dob);
                ps.setString(8, degree);
                ps.setString(9, institute);
                ps.setString(10, years);
                ps.setString(11, faculty);
                ps.setString(12, acayear);
                
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "New Student Added");
                
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(pgstudent.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        if(operation == 'u')// update
        {
            try {
                ps = con.prepareStatement("UPDATE `postgradstd` SET `PG_name`=?,`PG_nic`=?,`PG_addres`=?,`PG_email`=?,`PG_phone`=?,`PG_dob`=?,`PG_degree`=?,`PG_institute`=?,`PG_Years`=?,`PG_faculty`=?,`PG_acayear`=? WHERE PG_index = '"+id+"'");
                
                ps.setString(1, name);
                ps.setString(2, nic);
                ps.setString(3, email);
                ps.setString(4, addres);
                ps.setString(5, Phone);
                ps.setString(6, dob);
                ps.setString(7, degree);
                ps.setString(8,institute);
                ps.setString(9, years);
                ps.setString(10, faculty);
                ps.setString(11, acayear);
                
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Updated!!!");
                
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(pgstudent.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(operation == 'd')
    {
        
            try {
                ps = con.prepareStatement("DELETE FROM `postgradstd` WHERE `PG_index` = ?");
                ps.setString(1, id);
                if(ps.executeUpdate() >  0){
                    JOptionPane.showMessageDialog(null, "Student Removed");
                }
            } catch (SQLException ex) {
                Logger.getLogger(pgstudent.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
    }
    
    }
    
    
    
    
    public void fillStudentJtable(JTable table, String valueToSearch)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("SELECT * FROM `postgradstd` WHERE CONCAT(`PG_index`, `PG_name`, `PG_nic`, `PG_email`,`PG_addres`, `PG_phone`, `PG_dob`, `PG_degree`, `PG_institute`, `PG_years`, `PG_faculty`, `PG_acaYear`)LIKE ?");
            ps.setString(1, "%"+valueToSearch+"%");
            
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next()){
                row = new Object[12];
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

                
                model.addRow(row);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(pgstudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    
}
