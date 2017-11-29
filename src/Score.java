
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Score {
    
    public void InsertUpdateDeleteCouse(char operation, Integer sid, Integer cid,String description ){
    
    Connection con = MyConnection.getConection();
    PreparedStatement ps;
    //for insert
    if(operation=='i'){
        try {
            //INSERT INTO `score`(student_id,cource_id,student_score,description) VALUES (?,?,?,?)
            ps = con.prepareStatement("INSERT INTO `score`(student_id,cource_id,student_score,description) VALUES (?,?,?,?)");
            ps.setInt(1, sid);
            ps.setInt(2, cid);
            ps.setString(3, description);
           
            if(ps.executeUpdate()>0){
            JOptionPane.showMessageDialog(null, "Score Added");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //for update
//      if(operation=='u'){
//        try {
//            ps = con.prepareStatement("UPDATE `course` SET label= ?,hours_number= ? WHERE id= ?");
//            ps.setString(1, label);
//            ps.setInt(2, hours);
//             ps.setInt(3, id);
//            
//            if(ps.executeUpdate()>0){
//            JOptionPane.showMessageDialog(null, " Courses Update");
//            }
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//      //d for delete
//    if(operation=='d'){
//        try {
//            ps = con.prepareStatement("DELETE FROM `course` WHERE id= ?");
//           
//            ps.setInt(1,id);
//            
//            if(ps.executeUpdate()>0){
//            JOptionPane.showMessageDialog(null, " Course Deleted");
//            }
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    }
    
}
