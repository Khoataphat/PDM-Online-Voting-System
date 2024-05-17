/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin;

import General.*;
import Voters.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;
import java.util.Vector;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author welcome
 */
public class ElectionPage extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int q;
    int i;
    int deleteItem;


    // loi add

    public void upDateDB(){
        String serverName = "TRAN-TRIEU-NHU\\SQLEXPRESS";
        String databaseName = "Online-Voting";
        String url = "jdbc:sqlserver://" + serverName + ":1433;databaseName=" + databaseName + ";encrypt=true;trustServerCertificate=true;";

        try{
            con = DriverManager.getConnection(url, "sa", "123456789");
            pst = con.prepareStatement("select Election_ID, Election_name, Start_date, End_date from Election");

            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();

            q = stData.getColumnCount();

            String[] columnNames = {"Election_ID", "Election_name", "Date_start", "Date_end"};

            DefaultTableModel RecordTable = new DefaultTableModel(columnNames, 0);
            jTable1.setModel(RecordTable);

            while (rs.next()){
                Vector columnData = new Vector();

                for(i = 1;i <= q; i++){
                    columnData.add(rs.getString("Election_ID"));
                    columnData.add(rs.getString("Election_name"));
                    columnData.add(rs.getString("Start_date"));
                    columnData.add(rs.getString("End_date"));
                }
                RecordTable.addRow(columnData);
            }

        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public ElectionPage() {
        initComponents();
        upDateDB();
        JButton [] btns = {jButton1, jButton2, jButton3, jButton4, jButton5, jButton7, jButton12/*, jButton13*/, jButton14/*, jButton15*/,jButton16,jButton17};
        for (JButton btn : btns) {
            btn.setBackground(new Color(21,25,28));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(new Color(54,81,207));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(new Color(21,25,28));
                }

            });
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel pnRoot = new JPanel();
        JPanel pnSide = new JPanel();
        JPanel jPanel1 = new JPanel();
        JButton jButton6 = new JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        JPanel jPanel5 = new JPanel();
        JPanel jPanel6 = new JPanel();
        JPanel pnCenter = new JPanel();
        JPanel pnCBottom = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        JPanel pniCTop = new JPanel();
        JLabel jLabel2 = new JLabel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();
        JPanel jPanel4 = new JPanel();
        JButton jButton9 = new JButton();
        JPanel pniCCenter = new JPanel();
        JButton jButton8 = new JButton();
        jButton12 = new javax.swing.JButton();
        JLabel jLabel8 = new JLabel();
        JLabel jLabel9 = new JLabel();
        jTextField2 = new javax.swing.JTextField();
        JLabel jLabel10 = new JLabel();
        jTextField1 = new javax.swing.JTextField();

        //loi add
        jTextField3 = new javax.swing.JTextField();
        JLabel jLabel11 = new JLabel();
        jTable1 = new javax.swing.JTable();
        JScrollPane jScrollPane3 = new JScrollPane();
        JLabel jLabel12 = new JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnRoot.setLayout(new java.awt.BorderLayout());

        pnSide.setBackground(new java.awt.Color(21, 25, 28));
        pnSide.setPreferredSize(new java.awt.Dimension(250, 0));

        jPanel1.setBackground(new java.awt.Color(21, 25, 28));
        jPanel1.setPreferredSize(new java.awt.Dimension(270, 150));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 40));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("VOTE IS OUR RIGHT");
        jButton6.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel1.add(jButton6);

        pnSide.add(jPanel1);

        jButton1.setForeground(new java.awt.Color(0, 255, 204));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\icons hub\\icons8-home-25.png")); // NOI18N
        jButton1.setText(" HOME");
        jButton1.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(this::jButton1ActionPerformed);
        pnSide.add(jButton1);

        jButton2.setForeground(new java.awt.Color(0, 255, 204));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\icons hub\\icons8-elections-25.png")); // NOI18N
        jButton2.setText("VOTERS");
        jButton2.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton2.addActionListener(this::jButton2ActionPerformed);
        pnSide.add(jButton2);

        jButton3.setForeground(new java.awt.Color(0, 255, 204));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\icons hub\\icons8-people-25.png")); // NOI18N
        jButton3.setText("ADMINISTRATOR");
        jButton3.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton3.addActionListener(this::jButton3ActionPerformed);
        pnSide.add(jButton3);

        jButton4.setForeground(new java.awt.Color(0, 255, 204));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\icons hub\\icons8-leader-25.png")); // NOI18N
        jButton4.setText("CANDIDATES");
        jButton4.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton4.addActionListener(this::jButton4ActionPerformed);
        pnSide.add(jButton4);

        jButton5.setForeground(new java.awt.Color(0, 255, 204));
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\icons hub\\icons8-list-25.png")); // NOI18N
        jButton5.setText("VOTER LIST");
        jButton5.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton5.addActionListener(this::jButton5ActionPerformed);
        pnSide.add(jButton5);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        pnSide.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(34, 40, 44));
        jPanel6.setMinimumSize(new java.awt.Dimension(200, 280));
        jPanel6.setPreferredSize(new java.awt.Dimension(200, 280));

        pnRoot.add(pnSide, java.awt.BorderLayout.WEST);

        pnCenter.setBackground(new java.awt.Color(34, 40, 44));
        pnCenter.setLayout(new java.awt.BorderLayout());

        pnCBottom.setBackground(new java.awt.Color(30, 40, 44));
        pnCBottom.setPreferredSize(new java.awt.Dimension(734, 100));

        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("INTERNATIONAL UNIVERSITY");

        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Group 5");

        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Copyright © 2021 PSG");

        javax.swing.GroupLayout pnCBottomLayout = new javax.swing.GroupLayout(pnCBottom);
        pnCBottom.setLayout(pnCBottomLayout);
        pnCBottomLayout.setHorizontalGroup(
                pnCBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnCBottomLayout.createSequentialGroup()
                                .addGap(80, 80, 172)
                                .addComponent(jLabel1)
                                .addGap(105, 105, 187)
                                .addComponent(jLabel4)
                                // .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1184, Short.MAX_VALUE)
                                .addGap(105, 105, 187)
                                .addComponent(jLabel3)
                                .addGap(80, 80, 100))
        );
        pnCBottomLayout.setVerticalGroup(
                pnCBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnCBottomLayout.createSequentialGroup()
                                .addContainerGap(37, Short.MAX_VALUE)
                                .addGroup(pnCBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                .addGap(23, 23, 23))
        );

        pnCenter.add(pnCBottom, java.awt.BorderLayout.SOUTH);

        pniCTop.setBackground(new java.awt.Color(34, 40, 44));
        pniCTop.setPreferredSize(new java.awt.Dimension(0, 150));

        jLabel2.setFont(new java.awt.Font("Adobe Caslon Pro", Font.BOLD, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Manage Election");

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 415, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 38, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 313, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 39, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 175, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 39, Short.MAX_VALUE)
        );

        jButton9.setIcon(new javax.swing.ImageIcon("C:\\icons hub\\icons8-back-25.png")); // NOI18N
        jButton9.setText("Back");
        jButton9.addActionListener(this::jButton9ActionPerformed);

        javax.swing.GroupLayout pniCTopLayout = new javax.swing.GroupLayout(pniCTop);
        pniCTop.setLayout(pniCTopLayout);
        pniCTopLayout.setHorizontalGroup(
                pniCTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pniCTopLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pniCTopLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jButton9)
                                .addGap(105, 105, 105)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1864, Short.MAX_VALUE)
                                .addGroup(pniCTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pniCTopLayout.setVerticalGroup(
                pniCTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pniCTopLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pniCTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pniCTopLayout.createSequentialGroup()
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(72, 72, 72))
                                        .addGroup(pniCTopLayout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(pniCTopLayout.createSequentialGroup()
                                                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(120, 120, 120))))
        );
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Election_ID","Election_name", "Start_date","End_date"
                }
        ));


        pnCenter.add(pniCTop, java.awt.BorderLayout.NORTH);

        pniCCenter.setBackground(new java.awt.Color(30, 40, 44));

        jButton8.setForeground(new java.awt.Color(240, 240, 240));
        jButton8.setIcon(new javax.swing.ImageIcon("C:\\IMAGE HUB\\politics-election-voting-cartoon_1284-23116.jpg")); // NOI18N
        jButton8.addActionListener(this::jButton8ActionPerformed); // check  dong trang

        jButton12.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 255, 204));
        jButton12.setText("Add Election");
        jButton12.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton12.addActionListener(this::jButton12ActionPerformed);

        jButton14.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(0, 255, 204));
        jButton14.setText("Add Cadidate");
        jButton14.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton14.addActionListener(this::jButton14ActionPerformed);

        jButton16.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 18)); // NOI18N
        jButton16.setForeground(new java.awt.Color(0, 255, 204));
        jButton16.setText("Result");
        jButton16.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton16.addActionListener(this::jButton16ActionPerformed);

        jButton17.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 18)); // NOI18N
        jButton17.setForeground(new java.awt.Color(0, 255, 204));
        jButton17.setText("Delete Election");
        jButton17.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton17.addActionListener(this::jButton17ActionPerformed);


        jLabel8.setFont(new java.awt.Font("Adobe Caslon Pro Bold", Font.BOLD | Font.ITALIC, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 102));
        jLabel8.setText("Admins");

        jLabel9.setFont(new java.awt.Font("Adobe Caslon Pro", Font.ITALIC, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Date_start");

        jLabel11.setFont(new java.awt.Font("Adobe Caslon Pro", Font.ITALIC, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Date_end");

        jTextField2.addActionListener(this::jTextField2ActionPerformed);

        jLabel10.setFont(new java.awt.Font("Adobe Caslon Pro", Font.ITALIC, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Name of the Election");

        jLabel12.setFont(new java.awt.Font("Adobe Caslon Pro", Font.ITALIC, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("ID");

        javax.swing.GroupLayout pniCCenterLayout = new javax.swing.GroupLayout(pniCCenter);
        pniCCenter.setLayout(pniCCenterLayout);
        pniCCenterLayout.setHorizontalGroup(
                pniCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                        .addGroup(pniCCenterLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(pniCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                        .addGroup(pniCCenterLayout.createSequentialGroup()
                                                //Hang button
                                                .addComponent(jButton14,javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10 )
                                                //.addComponent(jButton15,javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10 )
                                                .addComponent(jButton16,javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10 )
                                                .addComponent(jButton17,javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10 )
                                                .addComponent(jButton12,javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pniCCenterLayout.createSequentialGroup()
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(pniCCenterLayout.createSequentialGroup()
                                                        .addGap(116, 116, 116)
                                                        .addGroup(pniCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(1888, Short.MAX_VALUE))
        );
        pniCCenterLayout.setVerticalGroup(
                pniCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pniCCenterLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(pniCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pniCCenterLayout.createSequentialGroup()
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel12)
                                                .addGap(12, 12, 12)
                                                .addComponent(jTextField4,javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40 )
                                                .addGroup(pniCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) //Hang button
                                                        .addComponent(jButton14,javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        //.addComponent(jButton15,javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton16,javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton17,javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton12,javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))

                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))// thay jtable here
                                .addContainerGap(110, Short.MAX_VALUE))
        );

        pnCenter.add(pniCCenter, java.awt.BorderLayout.CENTER);

        pnRoot.add(pnCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnRoot, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int movetohome = JOptionPane.showConfirmDialog(null, "Do You Want to Go to VoterList Page",
                "Warning", JOptionPane.YES_NO_OPTION);
        if(movetohome == JOptionPane.YES_NO_OPTION){
            VotersList h = new VotersList();
            h.show();

            dispose();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int movetohome = JOptionPane.showConfirmDialog(null, "Do You Want to Go to Home Page",
                "Warning", JOptionPane.YES_NO_OPTION);
        if(movetohome == JOptionPane.YES_NO_OPTION){
            Home h = new Home();
            h.show();

            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int movetohome = JOptionPane.showConfirmDialog(null, "Do You Want Go to Voters Login Page",
                "Warning", JOptionPane.YES_NO_OPTION);
        if(movetohome == JOptionPane.YES_NO_OPTION){
            VotersLogin v = new VotersLogin();
            v.show();

            dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:

        try {
            String NameOfTheElection = jTextField2.getText();
            String Date_St = jTextField1.getText();
            String Date_Ed = jTextField3.getText();
            String Num_id = jTextField4.getText();
            String serverName = "TRAN-TRIEU-NHU\\SQLEXPRESS";
            String databaseName = "Online-Voting";
            String url = "jdbc:sqlserver://" + serverName + ":1433;databaseName=" + databaseName + ";encrypt=true;trustServerCertificate=true;";

            if(NameOfTheElection.isEmpty() || Date_St.isEmpty()|| Date_Ed.isEmpty()|| Num_id.isEmpty()){
                JOptionPane.showMessageDialog(this, "Name of the Election / Time Should not be empty.");
            }
            else{
                con = DriverManager.getConnection(url, "sa", "123456789");
                pst = con.prepareStatement("insert into Election values(?,?,?,?,null)");

                pst.setString(1, jTextField4.getText()); // ID
                pst.setString(2, jTextField2.getText()); // Name
                pst.setString(3, jTextField1.getText()); // Start time
                pst.setString(4, jTextField3.getText()); // End time

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "New Election Added");
                upDateDB();

                //CreateElectionAddCanditates c = new CreateElectionAddCanditates();
                //c.show(); // loi check
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }


    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int movetohome = JOptionPane.showConfirmDialog(null, "Do You Want to LogOut",
                "Warning", JOptionPane.YES_NO_OPTION);
        if(movetohome == JOptionPane.YES_NO_OPTION){
            AdminLogin h = new AdminLogin();
            h.show();

            dispose();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int movetohome = JOptionPane.showConfirmDialog(null, "Do You Want to Go to Canditates Page",
                "Warning", JOptionPane.YES_NO_OPTION);
        if(movetohome == JOptionPane.YES_NO_OPTION){
            Candidates h = new Candidates();
            h.show();

            dispose();
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();

        jTextField1.setText(RecordTable.getValueAt(SelectedRows, 2).toString());//Date_start
        jTextField2.setText(RecordTable.getValueAt(SelectedRows, 1).toString());//ElectionName
        jTextField3.setText(RecordTable.getValueAt(SelectedRows, 3).toString());//Date_end
        jTextField4.setText(RecordTable.getValueAt(SelectedRows, 0).toString());//ID

    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        AdminPage h = new AdminPage();
        h.show();

        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
        if (SelectedRows != -1) {
            String electionID = RecordTable.getValueAt(SelectedRows, 0).toString();

            // Hiển thị cảnh báo với election ID
            int confirmation = JOptionPane.showConfirmDialog(this, "Go to Election page with ID: " + electionID + "?", "Confirm", JOptionPane.YES_NO_OPTION);

            if (confirmation == JOptionPane.YES_OPTION) {
                // Chuyển đến trang chứa Election ID
                ElectionPageAddCandidates v = new ElectionPageAddCandidates(electionID);
                v.setVisible(true);
                dispose();
            }
        } else {
            // Xử lý khi không có hàng nào được chọn
            JOptionPane.showMessageDialog(this, "Please select a row in the table.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();

        ElectionResults e = new ElectionResults(RecordTable.getValueAt(SelectedRows,0).toString());
        e.show();

        dispose();
    }

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {

        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();

        String serverName = "TRAN-TRIEU-NHU\\SQLEXPRESS";
        String databaseName = "Online-Voting";
        String username = "sa";
        String password = "123456789";
        String url = "jdbc:sqlserver://" + serverName + ":1433;databaseName=" + databaseName + ";encrypt=true;trustServerCertificate=true;";

        try {
            String election_id = RecordTable.getValueAt(SelectedRows, 0).toString();

            deleteItem = JOptionPane.showConfirmDialog(null, "Confirm if you want to delete election",
                    "Warning", JOptionPane.YES_NO_OPTION);

            if(deleteItem == JOptionPane.YES_NO_OPTION){
                con = DriverManager.getConnection(url, username, password);

                pst = con.prepareStatement("delete from votes where Election_ID = ?");
                pst.setString(1, election_id);
                pst.executeUpdate();

                pst = con.prepareStatement("delete from Candidate WHERE Candidate_ID NOT IN (SELECT Candidate_ID FROM votes);");
                pst.executeUpdate();

                pst = con.prepareStatement("delete from Election where Election_ID = ?");
                pst.setString(1, election_id);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Election Detals Updated");

                upDateDB();

                jTextField4.setText("");
                jTextField2.requestFocus();
                jTextField1.setText("");
                jTextField3.setText("");

            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://d...content-available-to-author-only...e.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElectionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new ElectionPage().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
