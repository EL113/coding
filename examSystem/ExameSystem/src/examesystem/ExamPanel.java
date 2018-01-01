/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examesystem;

import dbUtil.DbUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;

/**
 *
 * @author Daniel hunt
 */
public class ExamPanel extends javax.swing.JPanel {

    /**
     * Creates new form ExamPanel
     */
    public ExamPanel() {
        initComponents();
        groupComponents();
        getData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        q1 = new javax.swing.JLabel();
        optiona1 = new javax.swing.JRadioButton();
        optionb1 = new javax.swing.JRadioButton();
        optionc1 = new javax.swing.JRadioButton();
        optiond1 = new javax.swing.JRadioButton();
        q2 = new javax.swing.JLabel();
        optiona2 = new javax.swing.JRadioButton();
        optionb2 = new javax.swing.JRadioButton();
        optionc2 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        q3 = new javax.swing.JLabel();
        jRadioButton9 = new javax.swing.JRadioButton();
        optiona3 = new javax.swing.JRadioButton();
        optionb3 = new javax.swing.JRadioButton();
        optionc3 = new javax.swing.JRadioButton();
        q4 = new javax.swing.JLabel();
        jRadioButton13 = new javax.swing.JRadioButton();
        optiona4 = new javax.swing.JRadioButton();
        optionb4 = new javax.swing.JRadioButton();
        optionc4 = new javax.swing.JRadioButton();
        q5 = new javax.swing.JLabel();
        jRadioButton17 = new javax.swing.JRadioButton();
        optiona5 = new javax.swing.JRadioButton();
        optionb5 = new javax.swing.JRadioButton();
        optionc5 = new javax.swing.JRadioButton();
        confirm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        q1.setText("jLabel1");

        buttonGroup1.add(optiona1);
        optiona1.setText("jRadioButton1");

        buttonGroup1.add(optionb1);
        optionb1.setText("jRadioButton2");

        buttonGroup1.add(optionc1);
        optionc1.setText("jRadioButton3");

        buttonGroup1.add(optiond1);
        optiond1.setText("jRadioButton4");

        q2.setText("jLabel2");

        buttonGroup2.add(optiona2);
        optiona2.setText("jRadioButton5");

        buttonGroup2.add(optionb2);
        optionb2.setText("jRadioButton6");

        buttonGroup2.add(optionc2);
        optionc2.setText("jRadioButton7");

        buttonGroup2.add(jRadioButton8);
        jRadioButton8.setText("jRadioButton8");

        q3.setText("jLabel2");

        buttonGroup3.add(jRadioButton9);
        jRadioButton9.setText("jRadioButton8");

        buttonGroup3.add(optiona3);
        optiona3.setText("jRadioButton5");

        buttonGroup3.add(optionb3);
        optionb3.setText("jRadioButton6");

        buttonGroup3.add(optionc3);
        optionc3.setText("jRadioButton7");

        q4.setText("jLabel2");

        buttonGroup4.add(jRadioButton13);
        jRadioButton13.setText("jRadioButton8");

        buttonGroup4.add(optiona4);
        optiona4.setText("jRadioButton5");

        buttonGroup4.add(optionb4);
        optionb4.setText("jRadioButton6");

        buttonGroup4.add(optionc4);
        optionc4.setText("jRadioButton7");

        q5.setText("jLabel2");

        buttonGroup5.add(jRadioButton17);
        jRadioButton17.setText("jRadioButton8");

        buttonGroup5.add(optiona5);
        optiona5.setText("jRadioButton5");

        buttonGroup5.add(optionb5);
        optionb5.setText("jRadioButton6");

        buttonGroup5.add(optionc5);
        optionc5.setText("jRadioButton7");

        confirm.setText("完成");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        jLabel1.setText("欢迎参加本次测试");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(q5, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                    .addComponent(q4, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                    .addComponent(q3, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(optiona4)
                                .addGap(18, 18, 18)
                                .addComponent(optionb4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(optionc4)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton13))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(optiona3)
                                .addGap(18, 18, 18)
                                .addComponent(optionb3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(optionc3)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(optiona2)
                                .addGap(18, 18, 18)
                                .addComponent(optionb2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(optionc2)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton8))
                            .addComponent(q2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(optiona1)
                                .addGap(18, 18, 18)
                                .addComponent(optionb1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(optionc1)
                                .addGap(18, 18, 18)
                                .addComponent(optiond1))
                            .addComponent(q1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(confirm)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(optiona5)
                                    .addGap(18, 18, 18)
                                    .addComponent(optionb5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(optionc5)
                                    .addGap(18, 18, 18)
                                    .addComponent(jRadioButton17)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                                .addGap(123, 123, 123)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optiona1)
                    .addComponent(optionb1)
                    .addComponent(optionc1)
                    .addComponent(optiond1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optiona2)
                    .addComponent(optionb2)
                    .addComponent(optionc2)
                    .addComponent(jRadioButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optiona3)
                    .addComponent(optionb3)
                    .addComponent(optionc3)
                    .addComponent(jRadioButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optiona4)
                    .addComponent(optionb4)
                    .addComponent(optionc4)
                    .addComponent(jRadioButton13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optiona5)
                    .addComponent(optionb5)
                    .addComponent(optionc5)
                    .addComponent(jRadioButton17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(confirm)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        try {
            // TODO add your handling code here:
            result.first();
            //遍历题目
            for(ButtonGroup optionsGroup: optionsGroups){
                Enumeration<AbstractButton> radioBtns = optionsGroup.getElements();  
                //遍历每个题目的选项
                while (radioBtns.hasMoreElements()) {  
                    char answerIdentifier = 'a';
                    AbstractButton btn = radioBtns.nextElement();  
                    if(btn.isSelected()){
                        result.getString("answer").equals(answerIdentifier);
                    }
                    answerIdentifier++;
                }
                result.next();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExamPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_confirmActionPerformed


    private ResultSet result;
    private ArrayList<ButtonGroup> optionsGroups;
    private ArrayList<JLabel> questionLabels;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JRadioButton optiona1;
    private javax.swing.JRadioButton optiona2;
    private javax.swing.JRadioButton optiona3;
    private javax.swing.JRadioButton optiona4;
    private javax.swing.JRadioButton optiona5;
    private javax.swing.JRadioButton optionb1;
    private javax.swing.JRadioButton optionb2;
    private javax.swing.JRadioButton optionb3;
    private javax.swing.JRadioButton optionb4;
    private javax.swing.JRadioButton optionb5;
    private javax.swing.JRadioButton optionc1;
    private javax.swing.JRadioButton optionc2;
    private javax.swing.JRadioButton optionc3;
    private javax.swing.JRadioButton optionc4;
    private javax.swing.JRadioButton optionc5;
    private javax.swing.JRadioButton optiond1;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    // End of variables declaration//GEN-END:variables

    private void groupComponents() {
        optionsGroups.add(buttonGroup1);
        optionsGroups.add(buttonGroup2);
        optionsGroups.add(buttonGroup3);
        optionsGroups.add(buttonGroup4);
        questionLabels.add(q1);
        questionLabels.add(q2);
        questionLabels.add(q3);
        questionLabels.add(q4);
        questionLabels.add(q5);
    }

    private void getData() {
        Random random = new Random();
        int startIndex = random.nextInt(5);
        try {
            PreparedStatement ps = DbUtil.getStatement("select * from score where id >= ? LIMIT 5");
            ps.setInt(1, startIndex);
            result = ps.executeQuery();
            for(int i=0; i < questionLabels.size();i++){
                result.next();
                //填充问题
                JLabel question = questionLabels.get(i);
                question.setText(result.getString("text"));
                //填充选项
                ButtonGroup optionGroup = optionsGroups.get(i);
                Enumeration<AbstractButton> radioBtns = optionGroup.getElements();  
                while (radioBtns.hasMoreElements()) {  
                    char identifier = 'a';
                    AbstractButton btn = radioBtns.nextElement();  
                    btn.setText(result.getString("option" + identifier));
                    identifier++;
                }  
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExamPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
