/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class RegisterJPanel extends javax.swing.JPanel {


    /**
     * Creates new form FristJPanel
     */
    public RegisterJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/20160929110748.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("华文行楷", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("欢迎注册学生信息管理系统");

        jLabel4.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("姓名：");

        jLabel5.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("密码：");

        jButton1.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jButton1.setText("确定");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jButton2.setText("重置");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel6.setText("请再输一次：");

        jLabel3.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel3.setText("邮箱：");

        jLabel7.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel7.setText("电话：");

        jRadioButton1.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jRadioButton1.setText("管理员");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField2))))
                .addGap(191, 191, 191))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(95, 95, 95)
                .addComponent(jLabel1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String p1 = jPasswordField1.getText().trim();
        String p2 = jPasswordField2.getText().trim();
        String name = jTextField1.getText().trim();
        String email = jTextField2.getText().trim();
        String phone = jTextField3.getText().trim();
        Pattern p = Pattern.compile("^1[34578]\\d{9}$");    // 正则表达式// 正则表达式验证手机号
        Matcher m = p.matcher(phone);
        Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$");
        Matcher emm = pattern.matcher(email);
        if (name.length() == 0 || email.length() == 0 || phone.length() == 0 || p1.length() == 0 || (flag != 0 && flag != 1)) {
            JOptionPane.showMessageDialog(this, "信息不能为空", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!p1.equals(p2) || p1.equals(null)) {
            JOptionPane.showMessageDialog(this, "密码不一致", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!p1.equals(p2) || p1.equals(null)) {
            JOptionPane.showMessageDialog(this, "密码不一致", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (m.matches() != true) {
            JOptionPane.showMessageDialog(this, "手机号输入错误", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (emm.matches() != true) {
            JOptionPane.showMessageDialog(this, "邮箱输入错误", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (p1.length() < 6) {
            JOptionPane.showMessageDialog(this, "密码不得少于6位", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Connection con = DBCon.DBconnec();
                PreparedStatement ps = con.prepareStatement("insert into users(name,email,phone,password,position) values(?,?,?,?,?)");
                ps.setString(1, jTextField1.getText().trim());//去替代上面的几个问号
                ps.setString(2, jTextField2.getText().trim());
                ps.setString(3, jTextField3.getText().trim());
                ps.setString(4, jPasswordField1.getText().trim());
                ps.setInt(5, flag);
                ps.executeUpdate();
                ps = con.prepareStatement("select * from users");
                ResultSet rs = ps.executeQuery();
                rs.last();
                JOptionPane.showMessageDialog(this, "注册成功！你的账号是 " + rs.getInt(1) + "，请点击【确定】返回登录界面登录", "Succesed", JOptionPane.INFORMATION_MESSAGE);
                FristJPanel lg = new FristJPanel();
                MyJFrame.jf.remove(MyJFrame.jf.getContentPane());
                MyJFrame.jf.setContentPane(lg);
                MyJFrame.jf.validate();
            } catch (Exception e) {
                System.out.print("eeeee!");

            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jPasswordField1.setText("");
        jPasswordField2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton1.isSelected()) {
            flag = 1;
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
    int flag = 2;
}
