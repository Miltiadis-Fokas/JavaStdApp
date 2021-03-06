
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.runtime.Debug.id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miltos
 */
public class ManageStudentsForm extends javax.swing.JFrame {

    /**
     * Creates new form MangeStudentsForm
     */
    
    
    Student std = new Student();
    DefaultTableModel model;
    public ManageStudentsForm() {
        initComponents();
        std.FillStudentJTable(JTable, "");
        ButtonGroup bg  = new ButtonGroup();
        bg.add(jRadioButton_Male);
        bg.add(jRadioButton_Female);
         model=(DefaultTableModel)JTable.getModel();
         JTable.setRowHeight(40);
         JTable.setShowGrid(true);
         JTable.setGridColor(Color.blue);
         JTable.setSelectionBackground(Color.lightGray);

        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_FirstName = new javax.swing.JLabel();
        jLabel_LastName = new javax.swing.JLabel();
        jLabel_Sex = new javax.swing.JLabel();
        jLabel_Birthdate = new javax.swing.JLabel();
        jLabel_Phone = new javax.swing.JLabel();
        jLabel_Address = new javax.swing.JLabel();
        jTextField_FName = new javax.swing.JTextField();
        jTextField_LName = new javax.swing.JTextField();
        jRadioButton_Male = new javax.swing.JRadioButton();
        jRadioButton_Female = new javax.swing.JRadioButton();
        jDateChooser_Birthdate = new com.toedter.calendar.JDateChooser();
        jTextField_Phone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Address = new javax.swing.JTextArea();
        jButton_Remove = new javax.swing.JButton();
        jButton_Add = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jButton_Edit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTable = new javax.swing.JTable();
        jTextField_find = new javax.swing.JTextField();
        jLabelSearch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/if_Global_manager_131490.png"))); // NOI18N
        jLabel1.setText("Manage Students");

        jLabel_FirstName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_FirstName.setText("First Name");

        jLabel_LastName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_LastName.setText("Last Name");

        jLabel_Sex.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Sex.setText("Sex");

        jLabel_Birthdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Birthdate.setText("Birthdate");

        jLabel_Phone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Phone.setText("Phone");

        jLabel_Address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Address.setText("Address");

        jTextField_FName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FNameActionPerformed(evt);
            }
        });

        jRadioButton_Male.setText("Male");
        jRadioButton_Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_MaleActionPerformed(evt);
            }
        });

        jRadioButton_Female.setText("Female");

        jTextField_Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PhoneActionPerformed(evt);
            }
        });
        jTextField_Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PhoneKeyTyped(evt);
            }
        });

        jTextArea_Address.setColumns(20);
        jTextArea_Address.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Address);

        jButton_Remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/if_Line_ui_icons_Svg-03_1465842.png"))); // NOI18N
        jButton_Remove.setText("Remove");
        jButton_Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RemoveActionPerformed(evt);
            }
        });

        jButton_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user-new-30.png"))); // NOI18N
        jButton_Add.setText("Add");
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID");

        jTextField_ID.setEditable(false);

        jButton_Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/if_edit_103539.png"))); // NOI18N
        jButton_Edit.setText("Edit");
        jButton_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditActionPerformed(evt);
            }
        });

        JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "first_name", "last_name", "sex", "birthdate", "phone", "address"
            }
        ));
        JTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableMouseClicked(evt);
            }
        });
        JTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTableKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(JTable);

        jTextField_find.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_findKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_findKeyReleased(evt);
            }
        });

        jLabelSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSearch.setText("Search ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(558, 558, 558))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_FirstName)
                                    .addComponent(jLabel_LastName)
                                    .addComponent(jLabel_Sex)
                                    .addComponent(jLabel_Birthdate)
                                    .addComponent(jLabel_Phone)
                                    .addComponent(jLabel_Address))
                                .addGap(51, 51, 51))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jLabelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_find, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRadioButton_Male, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButton_Female, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jDateChooser_Birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(46, 46, 46))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextField_LName, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(64, 64, 64))
                                            .addComponent(jTextField_FName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jButton_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_FirstName)
                    .addComponent(jTextField_FName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_LastName)
                    .addComponent(jTextField_LName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabel_Sex)
                .addGap(40, 40, 40)
                .addComponent(jLabel_Birthdate)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Phone)
                    .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel_Address)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_find, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSearch))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(178, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton_Male)
                            .addComponent(jRadioButton_Female))
                        .addGap(37, 37, 37)
                        .addComponent(jDateChooser_Birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Add)
                            .addComponent(jButton_Edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_findKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_findKeyReleased
        JTable.setModel(new DefaultTableModel(null,new Object[]{"id","first_name","last_name","sex","birthdate","phone","address"}));
        std.FillStudentJTable(JTable, jTextField_find.getText());
    }//GEN-LAST:event_jTextField_findKeyReleased

    private void jTextField_findKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_findKeyPressed

    }//GEN-LAST:event_jTextField_findKeyPressed
int rowIndex;
    private void JTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableMouseClicked
         rowIndex=JTable.getSelectedRow();

         if(model.getValueAt(rowIndex, 1).toString().equals("Male")){
            jRadioButton_Male.setSelected(true);
            jRadioButton_Female.setSelected(false);
        }else {
            jRadioButton_Male.setSelected(false);
            jRadioButton_Female.setSelected(true);
         }
            jTextField_ID.setText(model.getValueAt(rowIndex, 0).toString());
            jTextField_FName.setText(model.getValueAt(rowIndex, 1).toString());
            jTextField_LName.setText(model.getValueAt(rowIndex, 2).toString());
            jTextField_Phone.setText(model.getValueAt(rowIndex, 5).toString());
            jTextArea_Address.setText(model.getValueAt(rowIndex, 6).toString());

            Date bdate;

            try {
                bdate= new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 4).toString());

                jDateChooser_Birthdate.setDate(bdate);
            } catch (ParseException ex) {
                Logger.getLogger(ManageStudentsForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        

    }//GEN-LAST:event_JTableMouseClicked

    private void jButton_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditActionPerformed
        String fname=jTextField_FName.getText();
        String lname=jTextField_LName.getText();
        String phone=jTextField_Phone.getText();
        String address=jTextArea_Address.getText();
        int id=Integer.valueOf(jTextField_ID.getText());
        String sex="";
        if(jRadioButton_Female.isSelected()){
            sex = "Female";
        }else if(jRadioButton_Male.isSelected()){
        sex = "Male";
        }
        if(verifText()){
            SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
            String bdate=dateFormat.format(jDateChooser_Birthdate.getDate());
            Student std = new Student();
            std.InsertUpdateDeleteStudent('u', id, fname, lname,sex, bdate, phone, address);
            std.FillStudentJTable(JTable, "");
            ManageStudentsForm.JTable.setModel(new DefaultTableModel(null,new Object[]{"id","first_name","last_name","sex","birthdate","phone","address"}));
            std.FillStudentJTable(JTable, jTextField_find.getText());
     // MainForm.jLabel_stdcount.setText("Students count ="+Integer.toString(MyFunction.countData("student")));
        }
    }//GEN-LAST:event_jButton_EditActionPerformed

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
AddStudentForm Addsf = new AddStudentForm();
                 Addsf.setVisible(true);
                 Addsf.pack();
                 Addsf.setLocationRelativeTo(null);
                 Addsf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        if(verifText()){
            SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");

            String bdate=dateFormat.format(jDateChooser_Birthdate.getDate());

            Student std = new Student();

//            std.InsertUpdateDeleteStudent('i', null, fname, lname, sex, bdate, phone, address);
            
          MainForm.jLabel_stdcount.setText("Students count ="+Integer.toString(MyFunction.countData("student")));
        }
    }//GEN-LAST:event_jButton_AddActionPerformed

    private void jButton_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RemoveActionPerformed
        
        if(jTextField_ID.getText().equals("")){
        JOptionPane.showMessageDialog(null, "No student selected");
        }
        else{
        int id=Integer.valueOf(jTextField_ID.getText());
        std.InsertUpdateDeleteStudent('d',id, null, null, null, null, null, null);
        std.FillStudentJTable(JTable, "");
        JTable.setModel(new DefaultTableModel(null,new Object[]{"id","first_name","last_name","sex","birthdate","phone","address"}));
        std.FillStudentJTable(JTable, jTextField_find.getText());
        MainForm.jLabel_stdcount.setText("Students count ="+Integer.toString(MyFunction.countData("student")));
        jTextField_ID.setText("");
        jTextField_FName.setText("");
        jTextField_LName.setText("");
        jRadioButton_Male.setSelected(false);
        jRadioButton_Female.setSelected(false);
        jDateChooser_Birthdate.setDate(null);
        jTextField_Phone.setText("");
        jTextArea_Address.setText("");
       
        }
    }//GEN-LAST:event_jButton_RemoveActionPerformed

    private void jTextField_PhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PhoneKeyTyped
        // Allow only numbers here

        if(!Character.isDigit(evt.getKeyChar())){

            evt.consume();
        }
    }//GEN-LAST:event_jTextField_PhoneKeyTyped

    private void jTextField_PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PhoneActionPerformed

    }//GEN-LAST:event_jTextField_PhoneActionPerformed

    private void jTextField_FNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FNameActionPerformed

    private void JTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTableKeyReleased
if(evt.getKeyCode()==KeyEvent.VK_UP || evt.getKeyCode()==KeyEvent.VK_DOWN ){
            rowIndex=JTable.getSelectedRow();
            jTextField_ID.setText(model.getValueAt(rowIndex, 0).toString());
            jTextField_FName.setText(model.getValueAt(rowIndex, 1).toString());
            jTextField_LName.setText(model.getValueAt(rowIndex, 2).toString());
            jTextField_Phone.setText(model.getValueAt(rowIndex, 5).toString());
            jTextArea_Address.setText(model.getValueAt(rowIndex, 6).toString());  
            
            if(model.getValueAt(rowIndex, 1).toString().equals("Male")){
            jRadioButton_Male.setSelected(true);
            jRadioButton_Female.setSelected(false);
        }else {
            jRadioButton_Male.setSelected(false);
            jRadioButton_Female.setSelected(true);
         }
            Date bdate;

            try {
                bdate= new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 4).toString());

                jDateChooser_Birthdate.setDate(bdate);
            } catch (ParseException ex) {
                Logger.getLogger(ManageStudentsForm.class.getName()).log(Level.SEVERE, null, ex);
            }
}


    }//GEN-LAST:event_JTableKeyReleased

    private void jRadioButton_MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_MaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_MaleActionPerformed
public boolean verifText(){
if(jTextField_FName.getText().equals("")|| jTextField_LName.getText().equals("") || jTextField_Phone.getText().equals("") ||jTextArea_Address.getText().equals("")
  || jDateChooser_Birthdate.getDate()==null || jTextField_ID.getText().equals("")){
    JOptionPane.showMessageDialog(null, "One or more selections are empty,please fill all the fields");
    return false;
  //select validate birthdate and no higher from current
} else if(jDateChooser_Birthdate.getDate().compareTo(new Date())>0){
JOptionPane.showMessageDialog(null, "No Students from the Future...!!!");
    return false;
}
else{
return true;
}}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageStudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageStudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageStudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageStudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageStudentsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable JTable;
    public javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Edit;
    private javax.swing.JButton jButton_Remove;
    private com.toedter.calendar.JDateChooser jDateChooser_Birthdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelSearch;
    private javax.swing.JLabel jLabel_Address;
    private javax.swing.JLabel jLabel_Birthdate;
    private javax.swing.JLabel jLabel_FirstName;
    private javax.swing.JLabel jLabel_LastName;
    private javax.swing.JLabel jLabel_Phone;
    private javax.swing.JLabel jLabel_Sex;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton_Female;
    private javax.swing.JRadioButton jRadioButton_Male;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea_Address;
    private javax.swing.JTextField jTextField_FName;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_LName;
    private javax.swing.JTextField jTextField_Phone;
    private javax.swing.JTextField jTextField_find;
    // End of variables declaration//GEN-END:variables
}
