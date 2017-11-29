
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Course {
 public void InsertUpdateDeleteCouse(char operation, Integer id, String label, Integer hours){
    
    Connection con = MyConnection.getConection();
    PreparedStatement ps;
    //for insert
    if(operation=='i'){
        try {
            ps = con.prepareStatement("INSERT INTO `course`(label,hours_number) VALUES (?,?)");
            ps.setString(1, label);
            ps.setInt(2, hours);
           
            if(ps.executeUpdate()>0){
            JOptionPane.showMessageDialog(null, "New Course Added");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //for update
      if(operation=='u'){
        try {
            ps = con.prepareStatement("UPDATE `course` SET label= ?,hours_number= ? WHERE id= ?");
            ps.setString(1, label);
            ps.setInt(2, hours);
             ps.setInt(3, id);
            
            if(ps.executeUpdate()>0){
            JOptionPane.showMessageDialog(null, " Courses Update");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      //d for delete
    if(operation=='d'){
        try {
            ps = con.prepareStatement("DELETE FROM `course` WHERE id= ?");
           
            ps.setInt(1,id);
            
            if(ps.executeUpdate()>0){
            JOptionPane.showMessageDialog(null, " Course Deleted");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    
}
 public boolean isCourseExist(String courseName){
     
     boolean isExist= false;
    Connection con = MyConnection.getConection();
    PreparedStatement ps;
      try {
            ps = con.prepareStatement("SELECT * FROM course WHERE label=?");
            ps.setString(1, courseName);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
             isExist=true;
            
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
         return isExist;
    }

 
 
 
 
   
    public void FillCourseJTable(JTable jTable_Courses) {
    
     Connection con = MyConnection.getConection();
    PreparedStatement ps;
    
        try {
            ps = con.prepareStatement("SELECT * FROM course ");
           
            
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model =(DefaultTableModel) jTable_Courses.getModel();
            Object [] row;
            while(rs.next()){
            row = new Object[3];
            
            row[0]=rs.getInt(1);
            row[1]= rs.getString(2);
            row[2]= rs.getInt(3);
            
            
            model.addRow(row);
            
            }
        
    
        
     } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
 }

    private int getCourseId(String courseLabel){
    
        int courseId=0;
        
        Connection con = MyConnection.getConection();
    PreparedStatement ps;
      try {
            ps = con.prepareStatement("SELECT * FROM course WHERE label=?");
            ps.setString(1, courseLabel);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
         courseId=rs.getInt("Id");
            
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return courseId;
    }

    public void FillCourseCombo(JComboBox combo) {
    
     Connection con = MyConnection.getConection();
    PreparedStatement ps;
    
        try {
            ps = con.prepareStatement("SELECT * FROM course ");
           
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            combo.addItem(rs.getString(2));
            
            }
        
    
        
     } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
    
}
 
