
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class lib extends javax.swing.JFrame {
    static InetAddress host;
    static Socket socket = null;
    static ObjectOutputStream oos = null;
    static ObjectInputStream ois = null;
    static int port=4024;
    static String output="";
    
    DefaultTableModel modelHistoryTable,modelAllTable,modelCurrentTable;
    public lib() {
        initComponents();
        modelHistoryTable=(DefaultTableModel) HistoryTable.getModel();
        modelAllTable=(DefaultTableModel) AllBookTable.getModel();
        modelCurrentTable=(DefaultTableModel) CurrentTable.getModel();
        TextDateIssue.setToolTipText("dd/mm/yyyy");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AddNewBookButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CheckAvailabilityButton = new javax.swing.JButton();
        TextBookNameCheck = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        sub_panel = new javax.swing.JPanel();
        issuePanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        TextStudentIdIssue = new javax.swing.JTextField();
        TextStudentNameIssue = new javax.swing.JTextField();
        TextBookNameIssue = new javax.swing.JTextField();
        TextBookIdIssue = new javax.swing.JTextField();
        IssueButton = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        TextDateIssue = new javax.swing.JTextField();
        reissuePanel = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        returnPanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        TextStudentIdReturn = new javax.swing.JTextField();
        TextBookNameReturn = new javax.swing.JTextField();
        TextBookIdReturn = new javax.swing.JTextField();
        returnButton = new javax.swing.JButton();
        reservePanel = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        TextStudentIdReserve = new javax.swing.JTextField();
        TextStudentNameReserve = new javax.swing.JTextField();
        TextBookNameReserve = new javax.swing.JTextField();
        reserveButton = new javax.swing.JButton();
        currentPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CurrentTable = new javax.swing.JTable();
        allPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AllBookTable = new javax.swing.JTable();
        historyPanel = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        TextStudentIdHistory = new javax.swing.JTextField();
        HistoryButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        HistoryTable = new javax.swing.JTable();
        AllowedIssueButton = new javax.swing.JButton();
        addPanel = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        TextBookNameAdd = new javax.swing.JTextField();
        TextBookIdAdd = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        ToastLabel = new javax.swing.JLabel();
        CurrentyAvailableButton = new javax.swing.JButton();
        AllBookButton = new javax.swing.JButton();
        numberOfBooksText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ReturnBookButton = new javax.swing.JButton();
        IssueBookButton = new javax.swing.JButton();
        ReserveBookButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LIBRARY");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setAlignmentY(0.0F);

        AddNewBookButton.setBackground(new java.awt.Color(255, 30, 86));
        AddNewBookButton.setForeground(new java.awt.Color(255, 255, 255));
        AddNewBookButton.setText("ADD NEW BOOK");
        AddNewBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewBookButtonActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MANAGEMENT");
        jLabel4.setAlignmentX(0.5F);
        jLabel4.setAlignmentY(0.0F);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SYSTEM");
        jLabel5.setAlignmentX(0.5F);
        jLabel5.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddNewBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddNewBookButton)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Book Name");

        CheckAvailabilityButton.setBackground(new java.awt.Color(255, 30, 65));
        CheckAvailabilityButton.setForeground(new java.awt.Color(255, 255, 255));
        CheckAvailabilityButton.setText("CHECK AVAILABILITY");
        CheckAvailabilityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckAvailabilityButtonActionPerformed(evt);
            }
        });

        TextBookNameCheck.setBackground(new java.awt.Color(80, 80, 80));
        TextBookNameCheck.setForeground(new java.awt.Color(255, 255, 255));
        TextBookNameCheck.setCaretColor(new java.awt.Color(0, 0, 0));
        TextBookNameCheck.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jPanel3.setOpaque(false);

        sub_panel.setBackground(new java.awt.Color(93, 93, 93));
        sub_panel.setForeground(new java.awt.Color(93, 93, 93));
        sub_panel.setLayout(new java.awt.CardLayout());

        issuePanel.setOpaque(false);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Student ID");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Student Name");

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Book Name");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Book Id");

        IssueButton.setBackground(new java.awt.Color(255, 30, 86));
        IssueButton.setForeground(new java.awt.Color(255, 255, 255));
        IssueButton.setText("ISSUE BOOK");
        IssueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssueButtonActionPerformed(evt);
            }
        });

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Date");

        TextDateIssue.setHighlighter(null);

        javax.swing.GroupLayout issuePanelLayout = new javax.swing.GroupLayout(issuePanel);
        issuePanel.setLayout(issuePanelLayout);
        issuePanelLayout.setHorizontalGroup(
            issuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, issuePanelLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(issuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, issuePanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(IssueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, issuePanelLayout.createSequentialGroup()
                        .addGroup(issuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel30))
                        .addGap(26, 26, 26)
                        .addGroup(issuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextDateIssue)
                            .addComponent(TextStudentIdIssue)
                            .addComponent(TextStudentNameIssue)
                            .addComponent(TextBookNameIssue)
                            .addComponent(TextBookIdIssue))))
                .addGap(106, 106, 106))
        );
        issuePanelLayout.setVerticalGroup(
            issuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(issuePanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(issuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TextStudentIdIssue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(issuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(TextStudentNameIssue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(issuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(TextBookNameIssue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(issuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(TextBookIdIssue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(issuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(TextDateIssue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(IssueButton)
                .addGap(53, 53, 53))
        );

        sub_panel.add(issuePanel, "card3");

        reissuePanel.setOpaque(false);

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Student ID");

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Student Name");

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Book Id");

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Date");

        jTextField25.setText("dd/mm/yyyy");

        jButton12.setBackground(new java.awt.Color(255, 30, 86));
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("REISSUE BOOK");

        javax.swing.GroupLayout reissuePanelLayout = new javax.swing.GroupLayout(reissuePanel);
        reissuePanel.setLayout(reissuePanelLayout);
        reissuePanelLayout.setHorizontalGroup(
            reissuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reissuePanelLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(reissuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reissuePanelLayout.createSequentialGroup()
                        .addGroup(reissuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26))
                        .addGap(26, 26, 26)
                        .addGroup(reissuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField22)
                            .addComponent(jTextField23)
                            .addComponent(jTextField24)
                            .addComponent(jTextField25)))
                    .addGroup(reissuePanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(106, 106, 106))
        );
        reissuePanelLayout.setVerticalGroup(
            reissuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reissuePanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(reissuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reissuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reissuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reissuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton12)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        sub_panel.add(reissuePanel, "card3");

        returnPanel.setOpaque(false);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Student ID");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Book Name");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Book Id");

        returnButton.setBackground(new java.awt.Color(255, 30, 86));
        returnButton.setForeground(new java.awt.Color(255, 255, 255));
        returnButton.setText("RETURN BOOK");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout returnPanelLayout = new javax.swing.GroupLayout(returnPanel);
        returnPanel.setLayout(returnPanelLayout);
        returnPanelLayout.setHorizontalGroup(
            returnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnPanelLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(returnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(returnPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, returnPanelLayout.createSequentialGroup()
                        .addGroup(returnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(41, 41, 41)
                        .addGroup(returnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextStudentIdReturn, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(TextBookNameReturn)
                            .addComponent(TextBookIdReturn))
                        .addGap(106, 106, 106))))
        );
        returnPanelLayout.setVerticalGroup(
            returnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnPanelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(returnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(TextStudentIdReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(returnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(TextBookNameReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(returnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(TextBookIdReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(returnButton)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        sub_panel.add(returnPanel, "card3");

        reservePanel.setOpaque(false);

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Student ID");

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Student Name");

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Book Name");

        reserveButton.setBackground(new java.awt.Color(255, 30, 86));
        reserveButton.setForeground(new java.awt.Color(255, 255, 255));
        reserveButton.setText("RESERVE BOOK");
        reserveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout reservePanelLayout = new javax.swing.GroupLayout(reservePanel);
        reservePanel.setLayout(reservePanelLayout);
        reservePanelLayout.setHorizontalGroup(
            reservePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reservePanelLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(reservePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reservePanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(reserveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reservePanelLayout.createSequentialGroup()
                        .addGroup(reservePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29))
                        .addGap(26, 26, 26)
                        .addGroup(reservePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextStudentIdReserve, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(TextStudentNameReserve)
                            .addComponent(TextBookNameReserve))
                        .addGap(106, 106, 106))))
        );
        reservePanelLayout.setVerticalGroup(
            reservePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reservePanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(reservePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(TextStudentIdReserve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reservePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(TextStudentNameReserve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reservePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(TextBookNameReserve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reserveButton)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        sub_panel.add(reservePanel, "card3");

        currentPanel.setOpaque(false);

        CurrentTable.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        CurrentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Book ID", "Book Name"
            }
        ));
        jScrollPane1.setViewportView(CurrentTable);

        javax.swing.GroupLayout currentPanelLayout = new javax.swing.GroupLayout(currentPanel);
        currentPanel.setLayout(currentPanelLayout);
        currentPanelLayout.setHorizontalGroup(
            currentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        currentPanelLayout.setVerticalGroup(
            currentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, currentPanelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        sub_panel.add(currentPanel, "card3");

        allPanel.setOpaque(false);

        AllBookTable.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        AllBookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Book ID", "Book Name"
            }
        ));
        jScrollPane2.setViewportView(AllBookTable);

        javax.swing.GroupLayout allPanelLayout = new javax.swing.GroupLayout(allPanel);
        allPanel.setLayout(allPanelLayout);
        allPanelLayout.setHorizontalGroup(
            allPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        allPanelLayout.setVerticalGroup(
            allPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allPanelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        sub_panel.add(allPanel, "card3");

        historyPanel.setOpaque(false);

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Student ID");

        HistoryButton.setBackground(new java.awt.Color(255, 30, 86));
        HistoryButton.setForeground(new java.awt.Color(255, 255, 255));
        HistoryButton.setText("HISTORY");
        HistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryButtonActionPerformed(evt);
            }
        });

        HistoryTable.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        HistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Book ID", "Book Name"
            }
        ));
        jScrollPane3.setViewportView(HistoryTable);

        AllowedIssueButton.setBackground(new java.awt.Color(255, 30, 86));
        AllowedIssueButton.setForeground(new java.awt.Color(255, 255, 255));
        AllowedIssueButton.setText("ALLOW TO ISSUE");
        AllowedIssueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllowedIssueButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout historyPanelLayout = new javax.swing.GroupLayout(historyPanel);
        historyPanel.setLayout(historyPanelLayout);
        historyPanelLayout.setHorizontalGroup(
            historyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historyPanelLayout.createSequentialGroup()
                .addGroup(historyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(historyPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(historyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(historyPanelLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(36, 36, 36)
                                .addComponent(TextStudentIdHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(HistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(historyPanelLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(AllowedIssueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        historyPanelLayout.setVerticalGroup(
            historyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historyPanelLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(historyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(TextStudentIdHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HistoryButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AllowedIssueButton)
                .addGap(28, 28, 28))
        );

        sub_panel.add(historyPanel, "card3");

        addPanel.setOpaque(false);

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Book Name");

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Book Id");

        AddButton.setBackground(new java.awt.Color(255, 30, 86));
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(166, Short.MAX_VALUE))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32))
                        .addGap(41, 41, 41)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextBookNameAdd)
                            .addComponent(TextBookIdAdd))
                        .addGap(106, 106, 106))))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(TextBookNameAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(TextBookIdAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(AddButton)
                .addGap(53, 53, 53))
        );

        sub_panel.add(addPanel, "card3");

        ToastLabel.setBackground(new java.awt.Color(255, 30, 86));
        ToastLabel.setForeground(new java.awt.Color(255, 30, 86));
        ToastLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ToastLabel.setText("Welcome");
        ToastLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        CurrentyAvailableButton.setBackground(new java.awt.Color(255, 30, 86));
        CurrentyAvailableButton.setForeground(new java.awt.Color(255, 255, 255));
        CurrentyAvailableButton.setText("CURRENTLY AVAILABLE");
        CurrentyAvailableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurrentyAvailableButtonActionPerformed(evt);
            }
        });

        AllBookButton.setBackground(new java.awt.Color(255, 30, 86));
        AllBookButton.setForeground(new java.awt.Color(255, 255, 255));
        AllBookButton.setText("All BOOK");
        AllBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllBookButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sub_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ToastLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(AllBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(CurrentyAvailableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AllBookButton)
                    .addComponent(CurrentyAvailableButton))
                .addGap(21, 21, 21)
                .addComponent(sub_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ToastLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        numberOfBooksText.setEditable(false);
        numberOfBooksText.setBackground(new java.awt.Color(80, 80, 80));
        numberOfBooksText.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Books Available");

        ReturnBookButton.setBackground(new java.awt.Color(255, 30, 86));
        ReturnBookButton.setForeground(new java.awt.Color(255, 255, 255));
        ReturnBookButton.setText("RETURN");
        ReturnBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnBookButtonActionPerformed(evt);
            }
        });

        IssueBookButton.setBackground(new java.awt.Color(255, 30, 86));
        IssueBookButton.setForeground(new java.awt.Color(255, 255, 255));
        IssueBookButton.setText("ISSUE BOOK");
        IssueBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssueBookButtonActionPerformed(evt);
            }
        });

        ReserveBookButton.setBackground(new java.awt.Color(255, 30, 86));
        ReserveBookButton.setForeground(new java.awt.Color(255, 255, 255));
        ReserveBookButton.setText("RESERVE BOOK");
        ReserveBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReserveBookButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numberOfBooksText, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(TextBookNameCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CheckAvailabilityButton))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(IssueBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ReserveBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ReturnBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextBookNameCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckAvailabilityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(numberOfBooksText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReserveBookButton)
                    .addComponent(ReturnBookButton)
                    .addComponent(IssueBookButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckAvailabilityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckAvailabilityButtonActionPerformed
        String data="select count(*) from availabletable where BookName='"+TextBookNameCheck.getText()+"'";
        sendCommandWithRecieveData(data);
        data=output;
        data=data.replaceAll("\\t+\\n+","");
        System.out.println("--------"+data);
        numberOfBooksText.setText(data);
    }//GEN-LAST:event_CheckAvailabilityButtonActionPerformed

    private void IssueBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssueBookButtonActionPerformed
        sub_panel.removeAll();
        sub_panel.add(historyPanel);
        sub_panel.repaint();
        sub_panel.revalidate();
    }//GEN-LAST:event_IssueBookButtonActionPerformed

    private void ReserveBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReserveBookButtonActionPerformed
        sub_panel.removeAll();
        sub_panel.add(reservePanel);
        sub_panel.repaint();
        sub_panel.revalidate();
    }//GEN-LAST:event_ReserveBookButtonActionPerformed

    private void ReturnBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnBookButtonActionPerformed
        sub_panel.removeAll();
        sub_panel.add(returnPanel);
        sub_panel.repaint();
        sub_panel.revalidate();
    }//GEN-LAST:event_ReturnBookButtonActionPerformed

    private void AllBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllBookButtonActionPerformed
        String Data ="select * from alltable";
        sendCommandWithRecieveData(Data);
        Data=output;
        String[] temp1=Data.split("\n");
        modelAllTable.setRowCount(0);
        for(String temp2 : temp1){
            String[] temp3 =temp2.split("\t");
            Vector row =new Vector();
            for(String temp4 : temp3){
                row.add(temp4);
            }
            modelAllTable.addRow(row);
        }
        sub_panel.removeAll();
        sub_panel.add(allPanel);
        sub_panel.repaint();
        sub_panel.revalidate();
    }//GEN-LAST:event_AllBookButtonActionPerformed

    private void CurrentyAvailableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurrentyAvailableButtonActionPerformed
        String Data ="select * from availabletable";
        sendCommandWithRecieveData(Data);
        Data=output;
        String[] temp1=Data.split("\n");
        modelCurrentTable.setRowCount(0);
        for(String temp2 : temp1){
            String[] temp3 =temp2.split("\t");
            Vector row =new Vector();
            for(String temp4 : temp3){
                row.add(temp4);
            }
            modelCurrentTable.addRow(row);
        }
        sub_panel.removeAll();
        sub_panel.add(currentPanel);
        sub_panel.repaint();
        sub_panel.revalidate();
    }//GEN-LAST:event_CurrentyAvailableButtonActionPerformed

    private void AllowedIssueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllowedIssueButtonActionPerformed
        sub_panel.removeAll();
        sub_panel.add(issuePanel);
        sub_panel.repaint();
        sub_panel.revalidate();
    }//GEN-LAST:event_AllowedIssueButtonActionPerformed

    private void HistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoryButtonActionPerformed
        String Data ="select * from issuetable where StudentId='"+TextStudentIdHistory.getText()+"'";
        sendCommandWithRecieveData(Data);
        Data=output;
        modelHistoryTable.setRowCount(0);
        String[] temp1=Data.split("\n");
        for(String temp2 : temp1){
            String[] temp3 =temp2.split("\t");
            Vector row =new Vector();
            for(String temp4 : temp3){
                row.add(temp4);
            }
            modelHistoryTable.addRow(row);
        }
    }//GEN-LAST:event_HistoryButtonActionPerformed

    private void reserveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveButtonActionPerformed
        String Data="-insert into reservetable values('"+TextStudentNameReserve.getText()
                +"','"+TextStudentIdReserve.getText()+"','"+TextBookNameReserve.getText()+"')";
        sendCommandWithNoRecieveData(Data);
        JOptionPane.showMessageDialog(null,"Book is Reserved");
    }//GEN-LAST:event_reserveButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        String Data="-insert into availabletable values('"+TextBookNameReturn.getText()+"','"+TextBookIdReturn.getText()+"')";
        sendCommandWithNoRecieveData(Data);
        Data="-delete from issuetable where BookId='"+TextBookIdReturn.getText()+"'";
        sendCommandWithNoRecieveData(Data);
        JOptionPane.showMessageDialog(null,"Book is Returned");
    }//GEN-LAST:event_returnButtonActionPerformed

    private void IssueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssueButtonActionPerformed
        String Data="-insert into issuetable values('"+TextBookNameIssue.getText()+"','"+TextBookIdIssue.getText()+"','"
                +TextStudentNameIssue.getText()+"','"+TextStudentIdIssue.getText()+"','"+TextDateIssue.getText()+"')";
        sendCommandWithNoRecieveData(Data);
        Data="";
        Data="-delete from availabletable where BookId='"+TextBookIdIssue.getText()+"'";
        sendCommandWithNoRecieveData(Data);
        JOptionPane.showMessageDialog(null,"Book is Issued\n Return date = 23/042020");
    }//GEN-LAST:event_IssueButtonActionPerformed

    private void AddNewBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewBookButtonActionPerformed
        sub_panel.removeAll();
        sub_panel.add(addPanel);
        sub_panel.repaint();
        sub_panel.revalidate();
    }//GEN-LAST:event_AddNewBookButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        String Data="-insert into alltable values('"+TextBookNameAdd.getText()+"','"+TextBookIdAdd.getText()+"')";
        sendCommandWithNoRecieveData(Data);
        Data="";
        Data="-insert into availabletable values('"+TextBookNameAdd.getText()+"','"+TextBookIdAdd.getText()+"')";
        sendCommandWithNoRecieveData(Data);
        JOptionPane.showMessageDialog(null,"New Book Added");
    }//GEN-LAST:event_AddButtonActionPerformed
    public void sendCommandWithNoRecieveData(String data){
        try {
            socket = new Socket(host.getHostName(), port);
            oos = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Sending request to Socket Server");
            oos.writeObject(data);
            oos.close();
        } catch (Exception ex) {
            System.out.println("Error : " + ex);
        }
    }
    public void sendCommandWithRecieveData(String data){
        output="";
        try {
            socket = new Socket(host.getHostName(), port);
            oos = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Sending request to Socket Server");
            oos.writeObject(data);
            ois = new ObjectInputStream(socket.getInputStream());
            String message = (String) ois.readObject();
            System.out.println("Message: " + message);
            output=message;
            ois.close();
            oos.close();
        } catch (Exception ex) {
            System.out.println("Error : " + ex);
        }
    }
    
    public static void main(String args[]) throws IOException {
        host = InetAddress.getLocalHost();
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
            java.util.logging.Logger.getLogger(lib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lib().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton AddNewBookButton;
    private javax.swing.JButton AllBookButton;
    private javax.swing.JTable AllBookTable;
    private javax.swing.JButton AllowedIssueButton;
    private javax.swing.JButton CheckAvailabilityButton;
    private javax.swing.JTable CurrentTable;
    private javax.swing.JButton CurrentyAvailableButton;
    private javax.swing.JButton HistoryButton;
    private javax.swing.JTable HistoryTable;
    private javax.swing.JButton IssueBookButton;
    private javax.swing.JButton IssueButton;
    private javax.swing.JButton ReserveBookButton;
    private javax.swing.JButton ReturnBookButton;
    private javax.swing.JTextField TextBookIdAdd;
    private javax.swing.JTextField TextBookIdIssue;
    private javax.swing.JTextField TextBookIdReturn;
    private javax.swing.JTextField TextBookNameAdd;
    private javax.swing.JTextField TextBookNameCheck;
    private javax.swing.JTextField TextBookNameIssue;
    private javax.swing.JTextField TextBookNameReserve;
    private javax.swing.JTextField TextBookNameReturn;
    private javax.swing.JTextField TextDateIssue;
    private javax.swing.JTextField TextStudentIdHistory;
    private javax.swing.JTextField TextStudentIdIssue;
    private javax.swing.JTextField TextStudentIdReserve;
    private javax.swing.JTextField TextStudentIdReturn;
    private javax.swing.JTextField TextStudentNameIssue;
    private javax.swing.JTextField TextStudentNameReserve;
    private javax.swing.JLabel ToastLabel;
    private javax.swing.JPanel addPanel;
    private javax.swing.JPanel allPanel;
    private javax.swing.JPanel currentPanel;
    private javax.swing.JPanel historyPanel;
    private javax.swing.JPanel issuePanel;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField numberOfBooksText;
    private javax.swing.JPanel reissuePanel;
    private javax.swing.JButton reserveButton;
    private javax.swing.JPanel reservePanel;
    private javax.swing.JButton returnButton;
    private javax.swing.JPanel returnPanel;
    private javax.swing.JPanel sub_panel;
    // End of variables declaration//GEN-END:variables
}
