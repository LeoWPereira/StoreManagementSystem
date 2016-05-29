/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

import java.util.Calendar;


/**
 *
 * @author Jorge
 */
public class ScheduleFrame extends javax.swing.JFrame {

    /**
     * Creates new form ScheduleFrame
     */
    public ScheduleFrame() {
        
        
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

        infoPanel = new javax.swing.JPanel();
        dateAndViewPanel = new javax.swing.JPanel();
        dayViewButton = new javax.swing.JButton();
        weekViewButton = new javax.swing.JButton();
        monthViewButton = new javax.swing.JButton();
        prevButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        dayField = new javax.swing.JFormattedTextField();
        monthField = new javax.swing.JFormattedTextField();
        yearField = new javax.swing.JFormattedTextField();
        mainCardPanel = new javax.swing.JPanel();
        dayPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        weekPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        monthPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newCompromisso = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        infoPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        infoPanel.setAutoscrolls(true);

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        dateAndViewPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dateAndViewPanel.setAutoscrolls(true);

        dayViewButton.setText("Dia");
        dayViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayViewButtonActionPerformed(evt);
            }
        });

        weekViewButton.setText("Semana");
        weekViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weekViewButtonActionPerformed(evt);
            }
        });

        monthViewButton.setText("Mês");
        monthViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthViewButtonActionPerformed(evt);
            }
        });

        prevButton.setText("Anterior");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });

        nextButton.setText("Próximo");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        dayField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat(" d"))));
        dayField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dayField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dayFieldPropertyChange(evt);
            }
        });

        monthField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        monthField.setText("2");
        monthField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                monthFieldPropertyChange(evt);
            }
        });

        yearField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy"))));
        yearField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yearField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                yearFieldPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout dateAndViewPanelLayout = new javax.swing.GroupLayout(dateAndViewPanel);
        dateAndViewPanel.setLayout(dateAndViewPanelLayout);
        dateAndViewPanelLayout.setHorizontalGroup(
            dateAndViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateAndViewPanelLayout.createSequentialGroup()
                .addComponent(dayViewButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weekViewButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monthViewButton)
                .addGap(18, 18, 18)
                .addComponent(prevButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dayField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(monthField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextButton))
        );
        dateAndViewPanelLayout.setVerticalGroup(
            dateAndViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dateAndViewPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(dateAndViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayViewButton)
                    .addComponent(weekViewButton)
                    .addComponent(monthViewButton)
                    .addComponent(prevButton)
                    .addComponent(nextButton)
                    .addComponent(dayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearField)))
        );

        mainCardPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mainCardPanel.setAutoscrolls(true);
        mainCardPanel.setLayout(new java.awt.CardLayout());

        dayPanel.setName("dayPanel"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"8:00", null},
                {"8:30", null},
                {"9:00", null},
                {"9:30", null},
                {"10:00", null},
                {"10:30", null},
                {"11:00", null},
                {"11:30", null},
                {"12:00", null},
                {"12:30", null},
                {"13:00", null},
                {"13:30", null},
                {"14:00", null},
                {"14:30", null},
                {"15:00", null},
                {"15:30", null},
                {"16:00", null},
                {"16:30", null},
                {"17:00", null},
                {"17:30", null},
                {"18:00", null}
            },
            new String [] {
                "Hora", "Compromisso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setRowHeight(40);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.getColumnModel().getColumn(0).setMinWidth(50);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setCellEditor(new PanelCellEditorRenderer("dayPanel",dayField, monthField, yearField));
        jTable1.getColumnModel().getColumn(1).setCellRenderer(new PanelCellEditorRenderer("dayPanel" ,dayField, monthField, yearField));

        javax.swing.GroupLayout dayPanelLayout = new javax.swing.GroupLayout(dayPanel);
        dayPanel.setLayout(dayPanelLayout);
        dayPanelLayout.setHorizontalGroup(
            dayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
        );
        dayPanelLayout.setVerticalGroup(
            dayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );

        mainCardPanel.add(dayPanel, "dayPanel");
        dayPanel.getAccessibleContext().setAccessibleName("");

        weekPanel.setName("weekPanel"); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setColumnSelectionAllowed(true);
        jTable2.setRowHeight(600);
        jScrollPane1.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable2.getColumnModel().getColumn(0).setCellEditor(new PanelCellEditorRenderer("weekPanel", dayField, monthField, yearField));
        jTable2.getColumnModel().getColumn(0).setCellRenderer(new PanelCellEditorRenderer("weekPanel",dayField, monthField, yearField) );
        jTable2.getColumnModel().getColumn(1).setCellEditor(new PanelCellEditorRenderer("weekPanel",dayField, monthField, yearField) );
        jTable2.getColumnModel().getColumn(1).setCellRenderer(new PanelCellEditorRenderer("weekPanel",dayField, monthField, yearField) );
        jTable2.getColumnModel().getColumn(2).setCellEditor(new PanelCellEditorRenderer("weekPanel",dayField, monthField, yearField));
        jTable2.getColumnModel().getColumn(2).setCellRenderer(new PanelCellEditorRenderer("weekPanel",dayField, monthField, yearField));
        jTable2.getColumnModel().getColumn(3).setCellEditor(new PanelCellEditorRenderer("weekPanel",dayField, monthField, yearField));
        jTable2.getColumnModel().getColumn(3).setCellRenderer(new PanelCellEditorRenderer("weekPanel",dayField, monthField, yearField));
        jTable2.getColumnModel().getColumn(4).setCellEditor(new PanelCellEditorRenderer("weekPanel",dayField, monthField, yearField));
        jTable2.getColumnModel().getColumn(4).setCellRenderer(new PanelCellEditorRenderer("weekPanel",dayField, monthField, yearField));
        jTable2.getColumnModel().getColumn(5).setCellEditor(new PanelCellEditorRenderer("weekPanel",dayField, monthField, yearField));
        jTable2.getColumnModel().getColumn(5).setCellRenderer(new PanelCellEditorRenderer("weekPanel",dayField, monthField, yearField));
        jTable2.getColumnModel().getColumn(6).setCellEditor(new PanelCellEditorRenderer("weekPanel",dayField, monthField, yearField));
        jTable2.getColumnModel().getColumn(6).setCellRenderer(new PanelCellEditorRenderer("weekPanel",dayField, monthField, yearField));

        javax.swing.GroupLayout weekPanelLayout = new javax.swing.GroupLayout(weekPanel);
        weekPanel.setLayout(weekPanelLayout);
        weekPanelLayout.setHorizontalGroup(
            weekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
        );
        weekPanelLayout.setVerticalGroup(
            weekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );

        mainCardPanel.add(weekPanel, "weekPanel");

        monthPanel.setName("monthPanel"); // NOI18N

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"
            }
        ));
        jTable3.setRowHeight(137);
        jScrollPane2.setViewportView(jTable3);
        jTable3.getColumnModel().getColumn(0).setResizable(false);
        jTable3.getColumnModel().getColumn(0).setCellEditor(new PanelCellEditorRenderer("monthPanel",dayField, monthField, yearField) );
        jTable3.getColumnModel().getColumn(0).setCellRenderer(new PanelCellEditorRenderer("monthPanel",dayField, monthField, yearField) );
        jTable3.getColumnModel().getColumn(1).setResizable(false);
        jTable3.getColumnModel().getColumn(1).setCellEditor(new PanelCellEditorRenderer("monthPanel",dayField, monthField, yearField) );
        jTable3.getColumnModel().getColumn(1).setCellRenderer(new PanelCellEditorRenderer("monthPanel",dayField, monthField, yearField) );
        jTable3.getColumnModel().getColumn(2).setResizable(false);
        jTable3.getColumnModel().getColumn(2).setCellEditor(new PanelCellEditorRenderer("monthPanel",dayField, monthField, yearField) );
        jTable3.getColumnModel().getColumn(2).setCellRenderer(new PanelCellEditorRenderer("monthPanel",dayField, monthField, yearField) );
        jTable3.getColumnModel().getColumn(3).setResizable(false);
        jTable3.getColumnModel().getColumn(3).setCellEditor(new PanelCellEditorRenderer("monthPanel",dayField, monthField, yearField) );
        jTable3.getColumnModel().getColumn(3).setCellRenderer(new PanelCellEditorRenderer("monthPanel",dayField, monthField, yearField) );
        jTable3.getColumnModel().getColumn(4).setResizable(false);
        jTable3.getColumnModel().getColumn(4).setCellEditor(new PanelCellEditorRenderer("monthPanel",dayField, monthField, yearField) );
        jTable3.getColumnModel().getColumn(4).setCellRenderer(new PanelCellEditorRenderer("monthPanel",dayField, monthField, yearField) );
        jTable3.getColumnModel().getColumn(5).setResizable(false);
        jTable3.getColumnModel().getColumn(5).setCellEditor(new PanelCellEditorRenderer("monthPanel",dayField, monthField, yearField) );
        jTable3.getColumnModel().getColumn(5).setCellRenderer(new PanelCellEditorRenderer("monthPanel",dayField, monthField, yearField) );
        jTable3.getColumnModel().getColumn(6).setResizable(false);
        jTable3.getColumnModel().getColumn(6).setCellEditor(new PanelCellEditorRenderer("monthPanel",dayField, monthField, yearField) );
        jTable3.getColumnModel().getColumn(6).setCellRenderer(new PanelCellEditorRenderer("monthPanel",dayField, monthField, yearField) );

        javax.swing.GroupLayout monthPanelLayout = new javax.swing.GroupLayout(monthPanel);
        monthPanel.setLayout(monthPanelLayout);
        monthPanelLayout.setHorizontalGroup(
            monthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
        );
        monthPanelLayout.setVerticalGroup(
            monthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );

        mainCardPanel.add(monthPanel, "monthPanel");

        jMenu1.setText("Menu");

        newCompromisso.setText("Novo Compromisso");
        newCompromisso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCompromissoActionPerformed(evt);
            }
        });
        jMenu1.add(newCompromisso);

        exit.setText("Sair");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dateAndViewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainCardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(dateAndViewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainCardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-816)/2, (screenSize.height-638)/2, 816, 638);
    }// </editor-fold>//GEN-END:initComponents

    private void dayViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayViewButtonActionPerformed
        cardChanger.changeCard(mainCardPanel, dayPanel);
        repaintAll();
    }//GEN-LAST:event_dayViewButtonActionPerformed

    private void weekViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weekViewButtonActionPerformed
       cardChanger.changeCard(mainCardPanel, weekPanel);
       repaintAll();
    }//GEN-LAST:event_weekViewButtonActionPerformed

    private void monthViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthViewButtonActionPerformed
        cardChanger.changeCard(mainCardPanel, monthPanel);
        repaintAll();
    }//GEN-LAST:event_monthViewButtonActionPerformed

    
    private void dayFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dayFieldPropertyChange
        this.setToday(1);
    }//GEN-LAST:event_dayFieldPropertyChange

    private void monthFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_monthFieldPropertyChange
        this.setToday(2);
    }//GEN-LAST:event_monthFieldPropertyChange

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
             
        correctDate.catchAndReturn(dayField.getText(), monthField.getText(), yearField.getText(), 
                "prev"+cardChanger.getCurrentCard(), dayField, monthField, yearField);
        repaintAll();
        
        
    }//GEN-LAST:event_prevButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
       correctDate.catchAndReturn(dayField.getText(), monthField.getText(), yearField.getText(), 
                "next"+cardChanger.getCurrentCard(), dayField, monthField, yearField);
        repaintAll();
    }//GEN-LAST:event_nextButtonActionPerformed

    private void yearFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_yearFieldPropertyChange
        this.setToday(3);
    }//GEN-LAST:event_yearFieldPropertyChange

    private void newCompromissoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCompromissoActionPerformed
       new NewCompromisso().setVisible(true);
    }//GEN-LAST:event_newCompromissoActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    
    
    //inicia os campos day, month and year com a data atual
    //parametro de valor:
    //1 - inicia o campo dia
    //2-inicia o campo mes
    //3 - inicia o campo ano
    private void setToday(int field){
        
        Calendar current = Calendar.getInstance();
        
        if(field == 1){
            dayField.setText("" + current.get(Calendar.DAY_OF_MONTH));
        }
        else if(field == 2){
            monthField.setText(correctDate.monthPortuguese(current.get(Calendar.MONTH)));
        }
        else{
            yearField.setText("" + current.get(Calendar.YEAR));
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                new ScheduleFrame().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dateAndViewPanel;
    public static javax.swing.JFormattedTextField dayField;
    private javax.swing.JPanel dayPanel;
    private javax.swing.JButton dayViewButton;
    private javax.swing.JMenuItem exit;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JTable jTable2;
    public static javax.swing.JTable jTable3;
    private javax.swing.JPanel mainCardPanel;
    public static javax.swing.JFormattedTextField monthField;
    private javax.swing.JPanel monthPanel;
    private javax.swing.JButton monthViewButton;
    private javax.swing.JMenuItem newCompromisso;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton prevButton;
    private javax.swing.JPanel weekPanel;
    private javax.swing.JButton weekViewButton;
    public static javax.swing.JFormattedTextField yearField;
    // End of variables declaration//GEN-END:variables
    //mais variaveis
    private CardChanger cardChanger = new CardChanger();
    private CorrectDate correctDate = new CorrectDate();
    
    
    public static void repaintAll(){
        
        jTable1.repaint();
        jTable2.repaint();
        jTable3.repaint();
    }
    
  
    

}
