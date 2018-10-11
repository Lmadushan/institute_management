
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyFunction {
    
    public static int countData(String tableName)
    {
        int total = 0;
        Connection con = MyConnection.getConnection();
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS 'total' FROM "+tableName);
            while(rs.next()){
                total = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return total;
    }
    
    public static int countsoc(String tableName)
    {
        int countno = 0;
        Connection con = MyConnection.getConnection();
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS 'countno' FROM "+tableName+" WHERE UG_faculty='SOC'");
            while(rs.next()){
                countno = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return countno;
    }
    
    public static int countsoe(String tableName)
    {
        int countno = 0;
        Connection con = MyConnection.getConnection();
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS 'countno' FROM "+tableName+" WHERE UG_faculty='SOE'");
            while(rs.next()){
                countno = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return countno;
    }
    
    public static int countsom(String tableName)
    {
        int countno = 0;
        Connection con = MyConnection.getConnection();
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS 'countno' FROM "+tableName+" WHERE UG_faculty='SOM'");
            while(rs.next()){
                countno = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return countno;
    }
    
    public static int countsompg(String tableName)
    {
        int countno = 0;
        Connection con = MyConnection.getConnection();
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS 'countno' FROM "+tableName+" WHERE PG_faculty='SOM'");
            while(rs.next()){
                countno = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return countno;
    }
    
    public static int countsoepg(String tableName)
    {
        int countno = 0;
        Connection con = MyConnection.getConnection();
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS 'countno' FROM "+tableName+" WHERE PG_faculty='SOE'");
            while(rs.next()){
                countno = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return countno;
    }
    
    public static int countsocpg(String tableName)
    {
        int countno = 0;
        Connection con = MyConnection.getConnection();
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS 'countno' FROM "+tableName+" WHERE PG_faculty='SOC'");
            while(rs.next()){
                countno = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return countno;
    }
    
    
    public static String ema(String index)
    {
        String email="";
        Connection con = MyConnection.getConnection();
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT UG_email AS 'email' FROM ugstd WHERE UG_index="+index);
            email = rs.getString(1);
            
        } catch (SQLException ex) {
            Logger.getLogger(MyFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return email;
    }
    
}
