/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Voters;

import Admin.AdminLogin;
import Admin.AdminPage;
import General.Canditates;
import General.Home;
import General.VotersList;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author welcome
 */
public class ElectionResultsForVoters extends JFrame {

    /**
     * Creates new form Home
     */

    private String Election_id ;
    public String getElection_id(){
        return Election_id;
    }
    public void setElection_id(String Election_id){
        this.Election_id = Election_id;
    }

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;


    public ElectionResultsForVoters(String ClickID) {
        initComponents();
        upDateDB(ClickID);
        JButton [] btns = {jButton1, jButton2, jButton3, jButton4, jButton5, jButton7, jButton13};
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


    public int noCand(String ClickID){
        String serverName = "LAPTOP-O6MDECFV\\SQLEXPRESS";
        String databaseName = "Online-Voting";
        String url = "jdbc:sqlserver://" + serverName + ":1433;databaseName=" + databaseName + ";encrypt=true;trustServerCertificate=true;";

        try{
            con = DriverManager.getConnection(url, "sa", "123456789");
            pst = con.prepareStatement("select count(Candidate_No) AS Total from candidates Where ElectionID = ? ");
            pst.setString(1, ClickID);
            
            rs = pst.executeQuery();
            

            if(rs.next()){
                String noofcandidates = rs.getString("Total");
                jLabel12.setText(noofcandidates);
            }

            else{
                return 0;
            }

        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return 0;
    }


    public int novoters(String ClickID){
        String serverName = "LAPTOP-O6MDECFV\\SQLEXPRESS";
        String databaseName = "Online-Voting";
        String username = "sa";
        String password = "123456789";
        String url = "jdbc:sqlserver://" + serverName + ":1433;databaseName=" + databaseName + ";encrypt=true;trustServerCertificate=true;";

        try{
            //Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            pst = con.prepareStatement("select count(Username) AS Username_Count from votersvoting Where ElectionID = ?");
            pst.setString(1, ClickID);
            rs = pst.executeQuery();
            

            if(rs.next()){
                String noofvoters = rs.getString("Username_Count");
                jLabel10.setText(noofvoters);
            }

            else{
                return 0;
            }

        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return 0;
    }

    public void upDateDB(String ClickID){
        String serverName = "LAPTOP-O6MDECFV\\SQLEXPRESS";
        String databaseName = "Online-Voting";
        String url = "jdbc:sqlserver://" + serverName + ":1433;databaseName=" + databaseName + ";encrypt=true;trustServerCertificate=true;";

        try{
            con = DriverManager.getConnection(url, "sa", "123456789");
            pst = con.prepareStatement("select Candidate_Name from candidates where Candidate_No = 1 And ElectionID = ?");
            pst.setString(1, ClickID);
            rs = pst.executeQuery();
            // String noofcandidates = rs.getString("count(Candidate_No)");
            if(rs.next()){

                lb01.setText(rs.getString("Candidate_Name"));
                pst= con.prepareStatement("select count(Username) AS Username_Count from votersvoting where Candidate_No = 1 And ElectionID = ?");
                pst.setString(1, ClickID);
                rs = pst.executeQuery();
                if(rs.next()){
                    jPanel7.setSize(84, 5*(rs.getInt("Username_Count")));

                }
                else{
                    jPanel7.setSize(0, 0);
                }
            }

            else{
                lb01.setText("No Candidate");
                jPanel7.setSize(84, 5);
            }

        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        try{
            con = DriverManager.getConnection(url, "sa", "123456789");
            pst = con.prepareStatement("select Candidate_Name from candidates where Candidate_No = 2 And ElectionID = ?");
            pst.setString(1, ClickID);
            rs = pst.executeQuery();
            // String noofcandidates = rs.getString("count(Candidate_No)");
            if(rs.next()){

                lb02.setText(rs.getString("Candidate_Name"));
                pst= con.prepareStatement("select count(Username) AS Username_Count  from votersvoting where Candidate_No = 2 And ElectionID = ?");
                pst.setString(1, ClickID);
                rs = pst.executeQuery();

                if(rs.next()){
                    jPanel8.setSize(84, 30*(rs.getInt("Username_Count")));
                }
                else{
                    jPanel8.setSize(84, 5);
                }
            }

            else{
                lb02.setText("No Candidate");
                jPanel8.setSize(84, 5);
            }

        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        try{
            con = DriverManager.getConnection(url, "sa", "123456789");
            pst = con.prepareStatement("select Candidate_Name from candidates where Candidate_No = 3 And ElectionID = ?");
            pst.setString(1, ClickID);
            rs = pst.executeQuery();
            // String noofcandidates = rs.getString("count(Candidate_No)");
            if(rs.next()){

                lb03.setText(rs.getString("Candidate_Name"));
                pst= con.prepareStatement("select count(Username) AS Username_Count from votersvoting where Candidate_No = 3 And ElectionID = ?");
                pst.setString(1, ClickID);
                rs = pst.executeQuery();
                if(rs.next()){
                    jPanel9.setSize(84, 30*(rs.getInt("Username_Count")));
                }
                else{
                    jPanel9.setSize(84, 5);
                }
            }

            else{
                lb03.setText("No Candidate");
                jPanel9.setSize(84, 5);
            }

        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        try{
            con = DriverManager.getConnection(url, "sa", "123456789");
            pst = con.prepareStatement("select Candidate_Name from candidates where Candidate_No = 4 And ElectionID = ?");
            pst.setString(1, ClickID);
            rs = pst.executeQuery();
            // String noofcandidates = rs.getString("count(Candidate_No)");
            if(rs.next()){

                lb04.setText(rs.getString("Candidate_Name"));
                pst= con.prepareStatement("select count(Username) AS Username_Count from votersvoting where Candidate_No = 4 And ElectionID = ?");
                pst.setString(1, ClickID);
                rs = pst.executeQuery();
                if(rs.next()){
                    jPanel10.setSize(84, 30*(rs.getInt("Username_Count")));
                }
                else{
                    jPanel10.setSize(84, 5);
                }
            }

            else{
                lb04.setText("No Candidate");
                jPanel10.setSize(84, 5);
            }

        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        try{
            con = DriverManager.getConnection(url, "sa", "123456789");
            pst = con.prepareStatement("select Candidate_Name from candidates where Candidate_No = 5 And ElectionID = ?");
            pst.setString(1, ClickID);
            rs = pst.executeQuery();
            // String noofcandidates = rs.getString("count(Candidate_No)");
            if(rs.next()){

                lb05.setText(rs.getString("Candidate_Name"));
                pst= con.prepareStatement("select count(Username) AS Username_Count from votersvoting Where Candidate_No = 5 And ElectionID = ?");
                pst.setString(1, ClickID);
                rs = pst.executeQuery();
                if(rs.next()){
                    jPanel11.setSize(84, 30*(rs.getInt("Username_Count")));
                }
                else{
                    jPanel11.setSize(84, 5);
                }
            }

            else{
                lb05.setText("No Candidate");
                jPanel11.setSize(84, 5);
            }

        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        noCand(ClickID);
        novoters(ClickID);

    }

    
    /*public int noCand() {
        String serverName = "DESKTOP-0IKLTBG";
        String databaseName = "OnlineVoting";
        String username = "sa";
        String password = "123456789";
        String url = "jdbc:sqlserver://" + serverName + ":1433;databaseName=" + databaseName + ";encrypt=true;trustServerCertificate=true;";

        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement pst = con.prepareStatement("SELECT COUNT(Candidate_No) AS Total FROM candidates");
             ResultSet rs = pst.executeQuery()) {

            if (rs.next()) {
                int noOfCandidates = rs.getInt("Total");
                jLabel12.setText(String.valueOf(noOfCandidates));
                return noOfCandidates;
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database connection error.");
        }
        return 0;
    }


    public int novoters() {
        String serverName = "DESKTOP-0IKLTBG";
        String databaseName = "OnlineVoting";
        String username = "sa";
        String password = "123456789";
        String url = "jdbc:sqlserver://" + serverName + ":1433;databaseName=" + databaseName + ";encrypt=true;trustServerCertificate=true;";

        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement pst = con.prepareStatement("SELECT COUNT(Username) AS Username_Count FROM votersvoting");
             ResultSet rs = pst.executeQuery()) {

            if (rs.next()) {
                int noOfVoters = rs.getInt("Username_Count");
                jLabel10.setText(String.valueOf(noOfVoters));
                return noOfVoters;
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database connection error.");
        }
        return 0;
    }*/


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
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton7 = new JButton();
        JPanel jPanel5 = new JPanel();
        JPanel jPanel6 = new JPanel();
        jButton13 = new JButton();
        JLabel jLabel5 = new JLabel();
        JLabel jLabel6 = new JLabel();
        JLabel jLabel7 = new JLabel();
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
        //JButton jButton8 = new JButton();
        JPanel pniCCenter = new JPanel();
        JLabel jLabel8 = new JLabel();
        JButton jButton17 = new JButton();
        JLabel jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        JLabel jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        JLabel jLabel13 = new JLabel();
        jPanel7 = new JPanel();
        lb03 = new JLabel();
        lb02 = new JLabel();
        lb04 = new JLabel();
        lb01 = new JLabel();
        lb05 = new JLabel();
        JLabel jLabel14 = new JLabel();
        jLabel15 = new JLabel();
        jPanel8 = new JPanel();
        jPanel9 = new JPanel();
        jPanel10 = new JPanel();
        jPanel11 = new JPanel();
        JLabel jLabel16 = new JLabel();
        JLabel jLabel17 = new JLabel();
        jLabel18 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        pnRoot.setLayout(new BorderLayout());

        pnSide.setBackground(new Color(21, 25, 28));
        pnSide.setPreferredSize(new Dimension(250, 0));

        jPanel1.setBackground(new Color(21, 25, 28));
        jPanel1.setPreferredSize(new Dimension(270, 150));
        jPanel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 40));

        jButton6.setBackground(new Color(0, 0, 0));
        jButton6.setForeground(new Color(255, 255, 255));
        jButton6.setText("VOTE IS OUR RIGHT");
        jButton6.setPreferredSize(new Dimension(200, 40));
        jPanel1.add(jButton6);

        pnSide.add(jPanel1);

        jButton1.setForeground(new Color(0, 255, 204));
        jButton1.setIcon(new ImageIcon("C:\\icons hub\\icons8-home-25.png")); // NOI18N
        jButton1.setText(" HOME");
        jButton1.setPreferredSize(new Dimension(200, 40));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(this::jButton1ActionPerformed);
        pnSide.add(jButton1);

        jButton2.setForeground(new Color(0, 255, 204));
        jButton2.setIcon(new ImageIcon("C:\\icons hub\\icons8-elections-25.png")); // NOI18N
        jButton2.setText("VOTERS");
        jButton2.setPreferredSize(new Dimension(200, 40));
        jButton2.addActionListener(this::jButton2ActionPerformed);
        pnSide.add(jButton2);

        jButton3.setForeground(new Color(0, 255, 204));
        jButton3.setIcon(new ImageIcon("C:\\icons hub\\icons8-people-25.png")); // NOI18N
        jButton3.setText("ADMINISTRATOR");
        jButton3.setPreferredSize(new Dimension(200, 40));
        jButton3.addActionListener(this::jButton3ActionPerformed);
        pnSide.add(jButton3);

        jButton4.setForeground(new Color(0, 255, 204));
        jButton4.setIcon(new ImageIcon("C:\\icons hub\\icons8-leader-25.png")); // NOI18N
        jButton4.setText("CANDIDATES");
        jButton4.setPreferredSize(new Dimension(200, 40));
        jButton4.addActionListener(this::jButton4ActionPerformed);
        pnSide.add(jButton4);

        jButton5.setForeground(new Color(0, 255, 204));
        jButton5.setIcon(new ImageIcon("C:\\icons hub\\icons8-list-25.png")); // NOI18N
        jButton5.setText("VOTER LIST");
        jButton5.setPreferredSize(new Dimension(200, 40));
        jButton5.addActionListener(this::jButton5ActionPerformed);
        pnSide.add(jButton5);


        pnRoot.add(pnSide, BorderLayout.WEST);

        pnCenter.setBackground(new Color(34, 40, 44));
        pnCenter.setLayout(new BorderLayout());

        pnCBottom.setBackground(new Color(30, 40, 44));
        pnCBottom.setPreferredSize(new Dimension(734, 100));

        jLabel1.setForeground(new Color(0, 204, 204));
        jLabel1.setText("INTERNATIONAL UNIVERSITY");

        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setText("Group 6 - PDM");

        jLabel4.setForeground(new Color(0, 204, 204));
        jLabel4.setText("Copyright © 2021 PSG");

        GroupLayout pnCBottomLayout = new GroupLayout(pnCBottom);
        pnCBottom.setLayout(pnCBottomLayout);
        pnCBottomLayout.setHorizontalGroup(
            pnCBottomLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnCBottomLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(105, 105, 105)
                .addComponent(jLabel4)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 2999, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(176, 176, 176))
        );
        pnCBottomLayout.setVerticalGroup(
            pnCBottomLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnCBottomLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(pnCBottomLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(23, 23, 23))
        );

        pnCenter.add(pnCBottom, BorderLayout.SOUTH);

        pniCTop.setBackground(new Color(34, 40, 44));
        pniCTop.setPreferredSize(new Dimension(0, 150));

        jLabel2.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 48)); // NOI18N
        jLabel2.setForeground(new Color(0, 204, 204));
        jLabel2.setText("Election Results");

        jPanel2.setBackground(new Color(255, 204, 204));

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new Color(153, 255, 204));

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new Color(255, 255, 102));

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        jButton9.setIcon(new ImageIcon("C:\\icons hub\\icons8-back-25.png")); // NOI18N
        jButton9.setText("Back");
        //jButton9.addActionListener(this::jButton9ActionPerformed);
/*
        jButton8.setIcon(new ImageIcon("C:\\icons hub\\icons8-refresh-32.png")); // NOI18N
        jButton8.setText("Click me");
        jButton8.addActionListener(this::jButton8ActionPerformed);
*/
        GroupLayout pniCTopLayout = new GroupLayout(pniCTop);
        pniCTop.setLayout(pniCTopLayout);
        pniCTopLayout.setHorizontalGroup(
            pniCTopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pniCTopLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            .addGroup(pniCTopLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jButton9)
                .addGap(81, 81, 81)
                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 484, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                //.addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 2747, Short.MAX_VALUE)
                .addGroup(pniCTopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        );
        pniCTopLayout.setVerticalGroup(
            pniCTopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, pniCTopLayout.createSequentialGroup()
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pniCTopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(pniCTopLayout.createSequentialGroup()
                        .addGroup(pniCTopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            /*.addComponent(jButton8)*/)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(pniCTopLayout.createSequentialGroup()
                        .addGroup(pniCTopLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jButton9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pnCenter.add(pniCTop, BorderLayout.NORTH);

        pniCCenter.setBackground(new Color(30, 40, 44));

        jLabel8.setFont(new Font("Adobe Caslon Pro Bold", Font.BOLD | Font.ITALIC, 36)); // NOI18N
        jLabel8.setForeground(new Color(0, 255, 102));
        jLabel8.setText("Voter");

        jButton17.setBackground(new Color(255, 102, 102));
        jButton17.setFont(new Font("Tahoma", Font.PLAIN, 18)); // NOI18N
        jButton17.setText("Logout");
        jButton17.setPreferredSize(new Dimension(200, 40));
        jButton17.addActionListener(this::jButton17ActionPerformed);

        jLabel9.setFont(new Font("Adobe Caslon Pro", Font.ITALIC, 14)); // NOI18N
        jLabel9.setForeground(new Color(255, 255, 0));
        jLabel9.setText("No of People Contributed Upto ");

        jLabel10.setFont(new Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        jLabel10.setForeground(new Color(0, 255, 0));

        jLabel11.setFont(new Font("Adobe Caslon Pro", Font.ITALIC, 14)); // NOI18N
        jLabel11.setForeground(new Color(255, 255, 0));
        jLabel11.setText("No of Canditates Partcipating");

        jLabel12.setFont(new Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        jLabel12.setForeground(new Color(51, 255, 0));

        jLabel13.setFont(new Font("Adobe Caslon Pro", Font.ITALIC, 14)); // NOI18N
        jLabel13.setForeground(new Color(255, 255, 0));
        jLabel13.setText("this time");

        jPanel7.setBackground(new Color(0, 255, 204));
        //test

        lb03.setForeground(new Color(0, 255, 204));
        lb03.setText("03");

        lb02.setForeground(new Color(0, 255, 204));
        lb02.setText("02");

        lb04.setForeground(new Color(0, 255, 204));
        lb04.setText("04");

        lb01.setForeground(new Color(0, 255, 204));
        lb01.setText("01");

        lb05.setForeground(new Color(0, 255, 204));
        lb05.setText("05");

        jLabel14.setFont(new Font("Tahoma", Font.PLAIN, 30)); // NOI18N
        jLabel14.setForeground(new Color(0, 255, 204));
        jLabel14.setText("The Winner Of The Election is");

        jLabel15.setFont(new Font("Tahoma", Font.PLAIN, 30)); // NOI18N
        jLabel15.setForeground(new Color(102, 255, 102));

        jPanel8.setBackground(new Color(102, 255, 204));

        GroupLayout jPanel8Layout = new GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new Color(255, 255, 0));
        //jPanel9.setForeground(new java.awt.Color(255, 255, 255));

        GroupLayout jPanel9Layout = new GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new Color(0, 255, 0));

        GroupLayout jPanel10Layout = new GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new Color(102, 255, 102));

        GroupLayout jPanel11Layout = new GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel16.setFont(new Font("Tahoma", Font.PLAIN, 30)); // NOI18N
        jLabel16.setForeground(new Color(0, 255, 204));
        jLabel16.setText("BY");

        jLabel17.setFont(new Font("Tahoma", Font.PLAIN, 30)); // NOI18N
        jLabel17.setForeground(new Color(0, 255, 204));
        jLabel17.setText("Votes");

        jLabel18.setFont(new Font("Tahoma", Font.PLAIN, 30)); // NOI18N
        jLabel18.setForeground(new Color(255, 255, 0));

        GroupLayout pniCCenterLayout = new GroupLayout(pniCCenter);
        pniCCenter.setLayout(pniCCenterLayout);
        pniCCenterLayout.setHorizontalGroup(
            pniCCenterLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pniCCenterLayout.createSequentialGroup()
                .addGroup(pniCCenterLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(pniCCenterLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(pniCCenterLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb01, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(jPanel7))
                        .addGap(47, 47, 47)
                        .addGroup(pniCCenterLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb02, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(jPanel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(pniCCenterLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb03, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(jPanel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(pniCCenterLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb04, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(pniCCenterLayout.createParallelGroup(GroupLayout.Alignment.TRAILING,false)
                            .addComponent(jPanel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb05, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pniCCenterLayout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17))
                    .addGroup(pniCCenterLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 408, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)))
                .addGap(177, 177, 177)
                .addGroup(pniCCenterLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(pniCCenterLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9)
                    .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
                    .addGroup(pniCCenterLayout.createSequentialGroup()
                        .addGroup(pniCCenterLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton17, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(2783, Short.MAX_VALUE))
        );
        pniCCenterLayout.setVerticalGroup(
            pniCCenterLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pniCCenterLayout.createSequentialGroup()
                .addGroup(pniCCenterLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(pniCCenterLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(pniCCenterLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(82, 82, 82)
                        .addGroup(pniCCenterLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                            .addGap(100)
                        .addComponent(jButton17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            
                    .addGroup(pniCCenterLayout.createSequentialGroup()
                        .addGroup(pniCCenterLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGap (350)
                                .addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18) 
                        .addGroup(pniCCenterLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lb01, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb02, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb03, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb04, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb05, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))))

                .addGroup(pniCCenterLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(pniCCenterLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pniCCenterLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                    .addGroup(pniCCenterLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel17, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(182, Short.MAX_VALUE))
        );

        pnCenter.add(pniCCenter, BorderLayout.CENTER);

        pnRoot.add(pnCenter, BorderLayout.CENTER);

        getContentPane().add(pnRoot, BorderLayout.CENTER);

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

    private void jButton1MouseClicked(MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
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

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Admin Panel",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            AdminLogin c = new AdminLogin();
            c.show();
            
            dispose();
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        //VotersPage h = new VotersPage();
        //h.show();

        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jPanel7MouseClicked(MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:

        int[] Results = new int[5];
        String[] cand_name = new String[5];
        String serverName = "LAPTOP-O6MDECFV\\SQLEXPRESS";
        String databaseName = "Online-Voting";
        String url = "jdbc:sqlserver://" + serverName + ":1433;databaseName=" + databaseName + ";encrypt=true;trustServerCertificate=true;";

        try{
            con = DriverManager.getConnection(url, "sa", "123456789");
            pst = con.prepareStatement("select Candidate_Name from candidates where Candidate_No = 1 And ElectionID = ?");
            pst.setString(1, getElection_id());
            rs = pst.executeQuery();
            // String noofcandidates = rs.getString("count(Candidate_No)");
            if(rs.next()){

                lb01.setText(rs.getString("Candidate_Name"));
                cand_name[0] = rs.getString("Candidate_Name");
                pst= con.prepareStatement("select count(Username) AS Username_Count from votersvoting where Candidate_No = 1 And ElectionID = ?");
                pst.setString(1, getElection_id());
                rs = pst.executeQuery();
                if(rs.next()){
                    jPanel7.setSize(84, 30*(rs.getInt("Username_Count")));
                    Results[0] = rs.getInt("Username_Count");

                }
                else{
                    jPanel7.setSize(84, 5);
                }
            }

            else{
                lb01.setText("No Candidate");
                jPanel7.setSize(84, 5);
            }

        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        try{
            con = DriverManager.getConnection(url, "sa", "123456789");
            pst = con.prepareStatement("select Candidate_Name from candidates where Candidate_No = 2 And ElectionID = ?");
            pst.setString(1, getElection_id());
            rs = pst.executeQuery();
            // String noofcandidates = rs.getString("count(Candidate_No)");
            if(rs.next()){

                lb02.setText(rs.getString("Candidate_Name"));
                cand_name[1] = rs.getString("Candidate_Name");
                pst= con.prepareStatement("select count(Username) AS Username_Count  from votersvoting where Candidate_No = 2 And ElectionID = ?");
                pst.setString(1, getElection_id());
                rs = pst.executeQuery();

                if(rs.next()){
                    jPanel8.setSize(84, 30*(rs.getInt("Username_Count")));
                    Results[1] = rs.getInt("Username_Count");
                }
                else{
                    jPanel8.setSize(84, 5);
                }
            }

            else{
                lb02.setText("No Candidate");
                jPanel8.setSize(84, 5);
            }

        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        try{
            con = DriverManager.getConnection(url, "sa", "123456789");
            pst = con.prepareStatement("select Candidate_Name from candidates where Candidate_No = 3 And ElectionID = ?");
            pst.setString(1, getElection_id());
            rs = pst.executeQuery();
            // String noofcandidates = rs.getString("count(Candidate_No)");
            if(rs.next()){

                lb03.setText(rs.getString("Candidate_Name"));
                cand_name[2] = rs.getString("Candidate_Name");
                pst= con.prepareStatement("select count(Username) AS Username_Count from votersvoting where Candidate_No = 3 And ElectionID = ?");
                pst.setString(1, getElection_id());
                rs = pst.executeQuery();
                if(rs.next()){
                    jPanel9.setSize(84, 30*(rs.getInt("Username_Count")));
                    Results[2] = rs.getInt("Username_Count");
                }
                else{
                    jPanel9.setSize(84, 5);
                }
            }

            else{
                lb03.setText("No Candidate");
                jPanel9.setSize(84, 5);
            }

        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        try{
            con = DriverManager.getConnection(url, "sa", "123456789");
            pst = con.prepareStatement("select Candidate_Name from candidates where Candidate_No = 4 And ElectionID = ?");
            pst.setString(1, getElection_id());
            rs = pst.executeQuery();
            // String noofcandidates = rs.getString("count(Candidate_No)");
            if(rs.next()){

                lb04.setText(rs.getString("Candidate_Name"));
                cand_name[3] = rs.getString("Candidate_Name");
                pst= con.prepareStatement("select count(Username) AS Username_Count from votersvoting where Candidate_No = 4 And ElectionID = ?");
                pst.setString(1, getElection_id());
                rs = pst.executeQuery();
                if(rs.next()){
                    jPanel10.setSize(84, 30*(rs.getInt("Username_Count")));
                    Results[3] = rs.getInt("Username_Count");
                }
                else{
                    jPanel10.setSize(84, 5);
                }
            }

            else{
                lb04.setText("No Candidate");
                jPanel10.setSize(84, 5);
            }

        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        try{
            con = DriverManager.getConnection(url, "sa", "123456789");
            pst = con.prepareStatement("select Candidate_Name from candidates where Candidate_No = 5 And ElectionID = ?");
            pst.setString(1, getElection_id());
            rs = pst.executeQuery();
            // String noofcandidates = rs.getString("count(Candidate_No)");
            if(rs.next()){

                lb05.setText(rs.getString("Candidate_Name"));
                cand_name[4] = rs.getString("Candidate_Name");
                pst= con.prepareStatement("select count(Username) AS Username_Count from votersvoting Where Candidate_No = 5 And ElectionID = ?");
                pst.setString(1, getElection_id());
                rs = pst.executeQuery();
                if(rs.next()){
                    jPanel11.setSize(84, 30*(rs.getInt("Username_Count")));
                    Results[4] = rs.getInt("Username_Count");
                }
                else{
                    jPanel11.setSize(84, 5);
                }
            }

            else{
                lb05.setText("No Candidate");
                jPanel11.setSize(84, 5);
            }

        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        //jPanel8.setSize(84, 10*5);
        //jPanel9.setSize(84, 10*4);
        //jPanel10.setSize(84, 10*2);
        //jPanel11.setSize(84, 10*11);

        //Thục Minh coi lại chuyển đoạn code đó sang sử dụng sql ha

        int max = Results[0];
        int maxi = 0;
        for(int i=0;i<5;i++){

            if(max<Results[i]){
                max = Results[i];
                maxi = i;
            }
        }
        String m = Integer.toString(max);
        jLabel18.setText(m);
        jLabel15.setText(cand_name[maxi]);
    }//GEN-LAST:event_jButton8ActionPerformed

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
            Canditates h = new Canditates();
            h.show();
            
            dispose();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElectionResultsForVoters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(() -> new ElectionResultsForVoters(null).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton jButton1;
    private JButton jButton13;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton7;
    private JLabel jLabel10;
    private JLabel jLabel12;
    private JLabel jLabel15;
    private JLabel jLabel18;
    private JPanel jPanel10;
    private JPanel jPanel11;
    private JPanel jPanel7;
    private JPanel jPanel8;
    private JPanel jPanel9;
    private JLabel lb01;
    private JLabel lb02;
    private JLabel lb03;
    private JLabel lb04;
    private JLabel lb05;
    // End of variables declaration//GEN-END:variables
}
