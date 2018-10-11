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

public class subject {
    
    public void insertUpdateDeletesubject(char operation, String code, String name, String teacher,String fees,String credit,String semester,String course,String location)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        if(operation == 'i')
        {
            try {
                ps = con.prepareStatement("INSERT INTO subjects( SU_code, SU_name, SU_teacher, SU_fees, SU_credit, SU_semester, SU_course, SU_location) VALUES (?,?,?,?,?,?,?,?)");
                ps.setString(1, code);
                ps.setString(2, name);
                ps.setString(3, teacher);
                ps.setString(4, fees);
                ps.setString(5, credit);
                ps.setString(6, semester);
                ps.setString(7, course);
                ps.setString(8, location);
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "New Subject Added");
                
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(subject.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        if(operation == 'u')// update
        {
            try {
                ps = con.prepareStatement("UPDATE `subjects` SET `SU_name`= ?,`SU_teacher`= ?,`SU_fees`= ?,`SU_credit`= ?,`SU_semester`= ?,`SU_course`= ?,`SU_location`= ?  WHERE SU_code ='"+code+"'");
                
                ps.setString(1, name);
                ps.setString(2, teacher);
                ps.setString(3, fees);
                ps.setString(4, credit);
                ps.setString(5, semester);
                ps.setString(6, course);
                ps.setString(7, location);
          
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Updated!!!");
                
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(subject.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if(operation == 'd')
    {
        
            try {
                ps = con.prepareStatement("DELETE FROM `subjects` WHERE `SU_code` = ?");
                ps.setString(1, code);
                if(ps.executeUpdate() >  0){
                    JOptionPane.showMessageDialog(null, "Subject Removed");
                }
            } catch (SQLException ex) {
                Logger.getLogger(subject.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
    }
    
    }
    
    
    public void fillSubjectJtable(JTable table, String valueToSearch)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("SELECT * FROM `subjects` WHERE CONCAT(`SU_code`, `SU_name`, `SU_teacher`, `SU_fees`, `SU_credit`, `SU_semester`, `SU_course`, `SU_location`)LIKE ?");
            ps.setString(1, "%"+valueToSearch+"%");
            
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next()){
                row = new Object[8];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);

                model.addRow(row);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(subject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    
}

