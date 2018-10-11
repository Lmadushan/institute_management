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

public class course {
    
    public void insertUpdateDeletecourse(char operation, String id, String name, String credit, String faculty)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        if(operation == 'i')
        {
            try {
                ps = con.prepareStatement("INSERT INTO courses( C_id, C_name, C_credit, C_faculty ) VALUES (?,?,?,?)");
                ps.setString(1, id);
                ps.setString(2, name);
                ps.setString(3, credit);
                ps.setString(4, faculty);
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "New Course Added");
                
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(teacher.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        if(operation == 'u')// update
        {
            try {
                ps = con.prepareStatement("UPDATE  `nsbm`.`courses` SET  `C_name` = ?,`C_credit` = ?,`C_faculty` = ? WHERE `course`.`C_id` ='"+id+"'");
                
                ps.setString(1, name);
                ps.setString(2, credit);
                ps.setString(3, faculty);
          
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Updated!!!");
                
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(course.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(operation == 'd')
    {
        
            try {
                ps = con.prepareStatement("DELETE FROM `courses` WHERE `C_id` = ?");
                ps.setString(1, id);
                if(ps.executeUpdate() >  0){
                    JOptionPane.showMessageDialog(null, "Course Removed");
                }
            } catch (SQLException ex) {
                Logger.getLogger(pgstudent.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
    }
    
    }
    
    
    public void fillCourseJtable(JTable table, String valueToSearch)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("SELECT * FROM `courses` WHERE CONCAT(`C_id`, `C_name`, `C_credit`,`C_faculty`)LIKE ?");
            ps.setString(1, "%"+valueToSearch+"%");
            
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next()){
                row = new Object[4];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);

                model.addRow(row);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(course.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    
}

