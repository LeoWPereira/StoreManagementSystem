/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.EventObject;
import java.util.GregorianCalendar;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Jorge
 */
public class PanelCellEditorRenderer extends AbstractTableModel implements TableCellEditor, TableCellRenderer {

    private static final long serialVersionUID = -2582341333552419142L;
    String card = null;
    JFormattedTextField day;
    JFormattedTextField month;
    JFormattedTextField year;

    public PanelCellEditorRenderer(String name, JFormattedTextField d, JFormattedTextField m, JFormattedTextField y) {
        card = name;

    }
    JTable tabela;

    @Override
    public Component getTableCellRendererComponent(JTable tabela, Object valor, boolean estaSelecionado, boolean temFoco, int linha, int coluna) {


        return new JScrollPane(new TablePanel(card, linha, coluna), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

    }

    @Override
    public Component getTableCellEditorComponent(JTable tabela, Object valor, boolean estaSelecionado, int linha, int coluna) {

        return new JScrollPane(new TablePanel(card, linha, coluna), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

    }

    @Override
    public Object getCellEditorValue() {

        return this;
    }

    @Override
    public int getRowCount() {
        return this.getRowCount();
    }

    @Override
    public int getColumnCount() {
        return this.getColumnCount();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return this.getValueAt(rowIndex, columnIndex);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        if (card.equals("dayPanel")) {
            if (column == 1) {

                return true;
            } else {

                return false;
            }
        }

        return true;
    }

    @Override
    public boolean isCellEditable(EventObject anEvent) {

        return true;
    }

    @Override
    public boolean shouldSelectCell(EventObject anEvent) {
        return false;
    }

    @Override
    public boolean stopCellEditing() {
        return true;
    }

    @Override
    public void cancelCellEditing() {
        this.cancelCellEditing();
    }

    @Override
    public void addCellEditorListener(CellEditorListener l) {
    }

    @Override
    public void removeCellEditorListener(CellEditorListener l) {
        this.removeCellEditorListener(l);
    }
}

class TablePanel extends JPanel {

    public TablePanel(String currentCard, int row, int col) {


        switch (currentCard) {
            case "dayPanel":

                setLayout(new GridLayout(1, 10));
                JPanel dayPanel = new DayRowPanel(row, this).getLabels();

                break;
            case "weekPanel":
                setLayout(new GridLayout(10, 2));
                JPanel weekPanel = new WeekColumnPanel(col, this).getLabels();
                break;
            case "monthPanel":
                setLayout(new GridLayout(20, 2));
                JPanel monthPanel = new monthPanel(col, row, this).getLabels();
                break;
            default:
                JOptionPane.showMessageDialog(null, "erro na criação do layout do painel");
                break;


        }



    }
}

class DayRowPanel {

    int row;
    JPanel panel;
    Calendar calDown = new String2Calendar().convert(ScheduleFrame.dayField.getText(), ScheduleFrame.monthField.getText(), ScheduleFrame.yearField.getText());
    Calendar calUp;
    private CtrlAgenda controle = new CtrlAgenda();
    ArrayList<DbResult> events;

    public DayRowPanel(int r, JPanel p) {

        row = r;
        panel = p;


    }

    public JPanel getLabels() {
        if (row == 0) {
            
            calDown.set(Calendar.HOUR_OF_DAY, 8);
            calDown.set(Calendar.MINUTE, 0);
            calDown.set(Calendar.SECOND, 0);
            calUp = (Calendar) calDown.clone();
            calUp.set(Calendar.MINUTE, 30);
        } else if (row == 1) {
            calDown.set(Calendar.HOUR_OF_DAY, 8);
            calDown.set(Calendar.MINUTE, 30);
            calDown.set(Calendar.SECOND, 0);
            calUp = (Calendar) calDown.clone();
            calUp.set(Calendar.MINUTE, 30);
        } else if (row == 2) {
            calDown.set(Calendar.HOUR_OF_DAY, 9);
            calDown.set(Calendar.MINUTE, 0);
            calDown.set(Calendar.SECOND, 0);
            calUp = (Calendar) calDown.clone();
            calUp.set(Calendar.MINUTE, 30);
        } else if (row == 3) {
            calDown.set(Calendar.HOUR_OF_DAY, 9);
            calDown.set(Calendar.MINUTE, 30);
            calDown.set(Calendar.SECOND, 0);
            calUp = (Calendar) calDown.clone();
            calUp.set(Calendar.MINUTE, 30);
        } else if (row == 4) {
            calDown.set(Calendar.HOUR_OF_DAY, 10);
            calDown.set(Calendar.MINUTE, 0);
            calDown.set(Calendar.SECOND, 0);
            calUp = (Calendar) calDown.clone();
            calUp.set(Calendar.MINUTE, 30);
        } else if (row == 5) {
            calDown.set(Calendar.HOUR_OF_DAY, 10);
            calDown.set(Calendar.MINUTE, 30);
            calDown.set(Calendar.SECOND, 0);
            calUp = (Calendar) calDown.clone();
            calUp.set(Calendar.MINUTE, 30);
        } else if (row == 6) {
            calDown.set(Calendar.HOUR_OF_DAY, 11);
            calDown.set(Calendar.MINUTE, 0);
            calDown.set(Calendar.SECOND, 0);
            calUp = (Calendar) calDown.clone();
            calUp.set(Calendar.MINUTE, 30);
        } else if (row == 7) {
            calDown.set(Calendar.HOUR_OF_DAY, 11);
            calDown.set(Calendar.MINUTE, 30);
            calDown.set(Calendar.SECOND, 0);
            calUp = (Calendar) calDown.clone();
            calUp.set(Calendar.MINUTE, 30);
        } else if (row == 8) {
            calDown.set(Calendar.HOUR_OF_DAY, 12);
            calDown.set(Calendar.MINUTE, 0);
            calDown.set(Calendar.SECOND, 0);
            calUp = (Calendar) calDown.clone();
            calUp.set(Calendar.MINUTE, 30);
        } else if (row == 9) {
            calDown.set(Calendar.HOUR_OF_DAY, 12);
            calDown.set(Calendar.MINUTE, 30);
            calDown.set(Calendar.SECOND, 0);
            calUp = (Calendar) calDown.clone();
            calUp.set(Calendar.MINUTE, 30);
        } else if (row == 10) {
            calDown.set(Calendar.HOUR_OF_DAY, 13);
            calDown.set(Calendar.MINUTE, 0);
            calDown.set(Calendar.SECOND, 0);
            calUp = (Calendar) calDown.clone();
            calUp.set(Calendar.MINUTE, 30);
        } else if (row == 11) {
            calDown.set(Calendar.HOUR_OF_DAY, 13);
            calDown.set(Calendar.MINUTE, 30);
            calDown.set(Calendar.SECOND, 0);
            calUp = (Calendar) calDown.clone();
            calUp.set(Calendar.MINUTE, 30);
        } else if (row == 12) {
            calDown.set(Calendar.HOUR_OF_DAY, 14);
            calDown.set(Calendar.MINUTE, 0);
            calDown.set(Calendar.SECOND, 0);
            calUp = (Calendar) calDown.clone();
            calUp.set(Calendar.MINUTE, 30);
        } else if (row == 13) {
            calDown.set(Calendar.HOUR_OF_DAY, 14);
            calDown.set(Calendar.MINUTE, 30);
            calDown.set(Calendar.SECOND, 0);
            calUp = (Calendar) calDown.clone();
            calUp.set(Calendar.MINUTE, 30);
        } else if (row == 14) {
            calDown.set(Calendar.HOUR_OF_DAY, 15);
            calDown.set(Calendar.MINUTE, 0);
            calDown.set(Calendar.SECOND, 0);
            calUp = (Calendar) calDown.clone();
            calUp.set(Calendar.MINUTE, 30);
        } else if (row == 15) {
            calDown.set(Calendar.HOUR_OF_DAY, 15);
            calDown.set(Calendar.MINUTE, 30);
            calDown.set(Calendar.SECOND, 0);
            calUp = (Calendar) calDown.clone();
            calUp.set(Calendar.MINUTE, 30);
        } else if (row == 16) {
            calDown.set(Calendar.HOUR_OF_DAY, 16);
            calDown.set(Calendar.MINUTE, 0);
            calDown.set(Calendar.SECOND, 0);
            calUp = (Calendar) calDown.clone();
            calUp.set(Calendar.MINUTE, 30);
        } else if (row == 17) {
            calDown.set(Calendar.HOUR_OF_DAY, 16);
            calDown.set(Calendar.MINUTE, 30);
            calDown.set(Calendar.SECOND, 0);
            calUp = (Calendar) calDown.clone();
            calUp.set(Calendar.MINUTE, 30);
        } else if (row == 18) {
            calDown.set(Calendar.HOUR_OF_DAY, 17);
            calDown.set(Calendar.MINUTE, 0);
            calDown.set(Calendar.SECOND, 0);
            calUp = (Calendar) calDown.clone();
            calUp.set(Calendar.MINUTE, 30);
        } else if (row == 19) {
            calDown.set(Calendar.HOUR_OF_DAY, 17);
            calDown.set(Calendar.MINUTE, 30);
            calDown.set(Calendar.SECOND, 0);
            calUp = (Calendar) calDown.clone();
            calUp.set(Calendar.MINUTE, 30);
        } else {

            calDown.set(Calendar.HOUR_OF_DAY, 18);
            calDown.set(Calendar.MINUTE, 0);
            calDown.set(Calendar.SECOND, 0);
            calUp = (Calendar) calDown.clone();
            calUp.set(Calendar.MINUTE, 30);
        }

        
        events = controle.getAllCompromissos(new Timestamp(calDown.getTimeInMillis()), new Timestamp(calUp.getTimeInMillis()));
        for (int i = 0; i < events.size(); i++) {

            JLabel temp = new JLabel();
            final DbResult tr = events.get(i);
            temp.setText(tr.nome);
            temp.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet.");
                }

                @Override
                public void mousePressed(MouseEvent e) {
                                        
                    new NewCompromisso(tr).setVisible(true);
                    
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet.");
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet.");
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet.");
                }
            });
            panel.add(temp);
        }
        return panel;
    }
}

class WeekColumnPanel {

    int column = 0;
    JPanel panel;
    Calendar cal;
    ArrayList<DbResult> events;

    public WeekColumnPanel(int c, JPanel p) {


        panel = p;
        column = c;
        cal = new String2Calendar().convert(ScheduleFrame.dayField.getText(), ScheduleFrame.monthField.getText(), ScheduleFrame.yearField.getText());
    }

    public JPanel getLabels() {

        switch (column) {
            case 0:
                cal.add(Calendar.DAY_OF_MONTH, (-(cal.get(Calendar.DAY_OF_WEEK) - 2)));
                break;
            case 1:
                cal.add(Calendar.DAY_OF_MONTH, (-(cal.get(Calendar.DAY_OF_WEEK) - 3)));
                break;
            case 2:
                cal.add(Calendar.DAY_OF_MONTH, (-(cal.get(Calendar.DAY_OF_WEEK) - 4)));
                break;
            case 3:
                cal.add(Calendar.DAY_OF_MONTH, (-(cal.get(Calendar.DAY_OF_WEEK) - 5)));
                break;
            case 4:
                cal.add(Calendar.DAY_OF_MONTH, (-(cal.get(Calendar.DAY_OF_WEEK) - 6)));
                break;
            case 5:
                cal.add(Calendar.DAY_OF_MONTH, (-(cal.get(Calendar.DAY_OF_WEEK) - 7)));
                break;
            case 6:
                cal.add(Calendar.DAY_OF_MONTH, (-(cal.get(Calendar.DAY_OF_WEEK) - 8)));
                break;
            default:
                System.out.println("erro na criação do painel da semana");

        }
        events = new CtrlAgenda().getWeekCompromissos(cal);
        for (int i = 0; i < events.size(); i++) {
            JLabel temp = new JLabel();
            final DbResult tr = events.get(i);
            temp.setText(tr.nome);
            temp.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet.");
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    new NewCompromisso(tr).setVisible(true);
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet.");
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet.");
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet.");
                }
            });
            panel.add(temp);
        }
        return panel;



    }
}

class monthPanel {

    int column = 0;
    int row = 0;
    JPanel panel;
    Calendar cal = new String2Calendar().convert(ScheduleFrame.dayField.getText(), ScheduleFrame.monthField.getText(), ScheduleFrame.yearField.getText());
    ArrayList<DbResult> events;
    GregorianCalendar leap = (GregorianCalendar) GregorianCalendar.getInstance();

    public monthPanel(int c, int r, JPanel p) {
        column = c;
        panel = p;
        row = r;
        

    }
    

    public JPanel getLabels() {
        

        switch (row) {
            case 0:

                cal.set(Calendar.DAY_OF_MONTH, (column + 1));

                break;
            case 1:
                cal.set(Calendar.DAY_OF_MONTH, (column + 8));
                break;
            case 2:
                cal.set(Calendar.DAY_OF_MONTH, (column + 15));
                break;
            case 3:
                cal.set(Calendar.DAY_OF_MONTH, (column + 22));
                break;
            case 4:
                if (cal.get(Calendar.MONTH) == 1 && leap.isLeapYear(cal.get(Calendar.YEAR))) {
                    
                    if (column == 0) {
                        cal.set(Calendar.DAY_OF_MONTH, (column + 29));
                    }
                    else{return new JPanel();
                    }
                    
                }else if(cal.get(Calendar.MONTH) == 1){
                    return new JPanel();
                }else if(cal.get(Calendar.MONTH)== 3 || cal.get(Calendar.MONTH)== 5 || cal.get(Calendar.MONTH)== 8 ||cal.get(Calendar.MONTH)== 10){
                    if(column == 0 || column == 1){
                        cal.set(Calendar.DAY_OF_MONTH, (column + 29));
                    }
                    else{return new JPanel();}
                }else{
                    if(column == 0 || column == 1 || column == 2){
                        cal.set(Calendar.DAY_OF_MONTH, (column + 29));
                    }
                    else{return new JPanel();}
                }

                break;

        }
        JLabel day = new JLabel(""+cal.get(Calendar.DAY_OF_MONTH));
        day.setForeground(Color.RED);
        panel.add(day);
        events = new CtrlAgenda().getWeekCompromissos(cal);
        for (int i = 0; i < events.size(); i++) {
            JLabel temp = new JLabel();
            final DbResult tr = events.get(i);
            temp.setText(tr.nome);
            temp.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet.");
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    new NewCompromisso(tr).setVisible(true);
                    
                    
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet.");
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet.");
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet.");
                }
            });
            panel.add(temp);
        }
        


        return panel;
    }
}
