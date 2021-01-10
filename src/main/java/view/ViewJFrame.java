/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.MoonController;
import java.time.LocalDate;
import javax.swing.DefaultListModel;
import model.DateException;
import model.PhaseException;

/**
 * View created in Swing which calculate phase of moon and show history
 *
 * @author Szymon Godziński
 * @version 1.2
 */
public class ViewJFrame extends javax.swing.JFrame {

    /**
     * Arguments of program
     */
    private static String[] programArgs;
    /**
     * Controller between Moon class and view
     */
    private MoonController mainController = new MoonController();
    /**
     * Object have calculated phase of moon and date
     */
    private DefaultListModel<String> defaultListModel = new DefaultListModel<>();
    /**
     * Date get from input which is give to calculate phase of moon
     */
    LocalDate date = null;

    /**
     * Creates new form ViewJFrame
     */
    public ViewJFrame() {
        initComponents();
        initInputDataFromProgramArgs(programArgs);
    }

    /**
     * Function set text to input if program have arguments
     *
     * @param args arguments of program
     */
    private void initInputDataFromProgramArgs(String[] args) {
        inputDate.setText(swapStringArrayToOneString(args));
    }

    /**
     * Function is responsible for connect array of string to one string
     *
     * @param stringArray array of string
     * @return connected array of string
     */
    private String swapStringArrayToOneString(String[] stringArray) {
        String result = "";
        for (int i = 0; i < stringArray.length; i++) {
            if (i == 0) {
                result = stringArray[i];
            } else {
                result = result + " " + stringArray[i];
            }
        }
        return result;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        inputDate = new javax.swing.JTextField();
        requestforIntroductionDateLabel = new javax.swing.JLabel();
        checkDateButton = new javax.swing.JButton();
        historyLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        historyList = new javax.swing.JList<>();
        resultMoonPhaseLabel = new javax.swing.JLabel();
        formatDateInformationLabel = new javax.swing.JLabel();
        sampleFormatDateLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 204, 204));
        titleLabel.setText("Moon Phase");

        inputDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inputDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDateActionPerformed(evt);
            }
        });

        requestforIntroductionDateLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        requestforIntroductionDateLabel.setText("Please input Date");

        checkDateButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkDateButton.setText("Check!");
        checkDateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDateButtonActionPerformed(evt);
            }
        });

        historyLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        historyLabel.setText("History");

        jScrollPane1.setViewportView(historyList);

        resultMoonPhaseLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resultMoonPhaseLabel.setForeground(new java.awt.Color(255, 51, 51));
        resultMoonPhaseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultMoonPhaseLabel.setToolTipText("");
        resultMoonPhaseLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        resultMoonPhaseLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        resultMoonPhaseLabel.setOpaque(true);

        formatDateInformationLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        formatDateInformationLabel.setText("year month day");

        sampleFormatDateLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sampleFormatDateLabel.setText("for example \"1996 08 21\"");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkDateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(requestforIntroductionDateLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(formatDateInformationLabel))
                    .addComponent(inputDate, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(sampleFormatDateLabel)))
                .addGap(136, 136, 136)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(titleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(resultMoonPhaseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(historyLabel)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(titleLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(historyLabel)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(resultMoonPhaseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(requestforIntroductionDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(formatDateInformationLabel)
                                .addGap(18, 18, 18)
                                .addComponent(sampleFormatDateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(checkDateButton)
                                .addGap(0, 28, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addContainerGap())))))
        );

        resultMoonPhaseLabel.getAccessibleContext().setAccessibleName("sssssssssssssssssssssssssssssssss2222222222222222aaaaaaaa");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Function is called when user click button and process date and calculate
     * phase of moon if everything is ok show result to window by function
     * processPhaseToStringAndAddToList
     *
     * @see processPhaseToStringAndAddToList
     * @param evt Action event
     */
    private void checkDateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDateButtonActionPerformed

        try {
            date = mainController.getDate(inputDate.getText());
        } catch (DateException ex) {
            this.resultMoonPhaseLabel.setText("<html><p>Error: " + ex.getMessage() + "</p></html>");
            return;
        }

        try {
            double result = mainController.calculatePhase(date);
            processPhaseToStringAndAddToList(result);
        } catch (PhaseException ex) {
            this.resultMoonPhaseLabel.setText("<html><p>Error: " + ex.getMessage() + "</p></html>");
        } catch (DateException ex) {
            this.resultMoonPhaseLabel.setText("<html><p>Error: " + ex.getMessage() + "</p></html>");
        }
    }//GEN-LAST:event_checkDateButtonActionPerformed

    /**
     * Swing function to input data
     *
     * @param evt
     */
    private void inputDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDateActionPerformed

    /**
     * Function is responsible for show phase of moon to user and add date and
     * phase of moon to history list
     *
     * @param phase phase of moon
     */
    private void processPhaseToStringAndAddToList(double phase) {
        /**
         * String which is seted to result text and have phase of moon
         */
        String phaseString = "";

        if (phase < 0.125 || phase > 0.875) {
            phaseString = "new moon";
        } else if (phase < 0.375) {
            phaseString = "first quarter";
        } else if (phase < 0.625) {
            phaseString = "full";
        } else if (phase <= 0.875) {
            phaseString = "second quarter";
        }
        this.resultMoonPhaseLabel.setText(phaseString);

        defaultListModel.addElement(date.toString() + " " + phaseString);
        historyList.setModel(defaultListModel);
    }

    /**
     * Main function which run a whole program
     * arguments can have date as format year month day
     * for example 1996 8 21
     *
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
            java.util.logging.Logger.getLogger(ViewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewJFrame().setVisible(true);
            }
        });
        programArgs = args;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkDateButton;
    private javax.swing.JLabel formatDateInformationLabel;
    private javax.swing.JLabel historyLabel;
    private javax.swing.JList<String> historyList;
    private javax.swing.JTextField inputDate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel requestforIntroductionDateLabel;
    private javax.swing.JLabel resultMoonPhaseLabel;
    private javax.swing.JLabel sampleFormatDateLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
