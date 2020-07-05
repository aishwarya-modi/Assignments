
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class client_liberary extends javax.swing.JFrame {
    static InetAddress host;
    static Socket socket = null;
    static ObjectOutputStream oos = null;
    static ObjectInputStream ois = null;
    DefaultTableModel all_books_table_model,issued_book_table_model;

    public client_liberary() {
        initComponents();
        Dynamic_Panal.removeAll();
        Dynamic_Panal.add(Issue_Panel);
        Dynamic_Panal.repaint();
        Dynamic_Panal.revalidate();
        all_books_table_model=(DefaultTableModel) Show_Books_Table.getModel();
        issued_book_table_model=(DefaultTableModel) Show_issued_book_table.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        issue_a_book = new javax.swing.JButton();
        check_availability = new javax.swing.JButton();
        return_a_book = new javax.swing.JButton();
        reserve_a_book = new javax.swing.JButton();
        Dynamic_Panal = new javax.swing.JPanel();
        Issue_Panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        T_issue_book_id = new javax.swing.JTextField();
        T_issue_student_name = new javax.swing.JTextField();
        T_issue_student_id = new javax.swing.JTextField();
        issue = new javax.swing.JButton();
        Check_Panel = new javax.swing.JPanel();
        T_check_book_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        check = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        LnumberOfBooks = new javax.swing.JLabel();
        Return_Panel = new javax.swing.JPanel();
        T_return_book_id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        returnbook = new javax.swing.JButton();
        Reserve_Panel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        T_reserve_book_name = new javax.swing.JTextField();
        T_reserve_student_name = new javax.swing.JTextField();
        T_reserve_student_id = new javax.swing.JTextField();
        reserve = new javax.swing.JButton();
        All_Available_Panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Show_Books_Table = new javax.swing.JTable();
        Issued_Panel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Show_issued_book_table = new javax.swing.JTable();
        Add_New_Panel = new javax.swing.JPanel();
        T_add_book_id = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Add_book_button = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        T_add_book_name = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        show_all_books = new javax.swing.JButton();
        show_issued_books = new javax.swing.JButton();
        show_available_books = new javax.swing.JButton();
        add_new_book = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Liberary Management Portal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));

        issue_a_book.setBackground(new java.awt.Color(255, 102, 0));
        issue_a_book.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        issue_a_book.setForeground(new java.awt.Color(255, 255, 255));
        issue_a_book.setText("Issue a Book");
        issue_a_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issue_a_bookActionPerformed(evt);
            }
        });

        check_availability.setBackground(new java.awt.Color(255, 102, 0));
        check_availability.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        check_availability.setForeground(new java.awt.Color(255, 255, 255));
        check_availability.setText("Check Availability");
        check_availability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_availabilityActionPerformed(evt);
            }
        });

        return_a_book.setBackground(new java.awt.Color(255, 102, 0));
        return_a_book.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        return_a_book.setForeground(new java.awt.Color(255, 255, 255));
        return_a_book.setText("Return a Book");
        return_a_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_a_bookActionPerformed(evt);
            }
        });

        reserve_a_book.setBackground(new java.awt.Color(255, 102, 0));
        reserve_a_book.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reserve_a_book.setForeground(new java.awt.Color(255, 255, 255));
        reserve_a_book.setText("Reserve a Book");
        reserve_a_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserve_a_bookActionPerformed(evt);
            }
        });

        Dynamic_Panal.setBackground(new java.awt.Color(102, 0, 102));
        Dynamic_Panal.setLayout(new java.awt.CardLayout());

        Issue_Panel.setBackground(new java.awt.Color(102, 0, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Book Id");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student Id");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Student Name");

        issue.setBackground(new java.awt.Color(255, 102, 0));
        issue.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        issue.setForeground(new java.awt.Color(255, 255, 255));
        issue.setText("Issue");
        issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Issue_PanelLayout = new javax.swing.GroupLayout(Issue_Panel);
        Issue_Panel.setLayout(Issue_PanelLayout);
        Issue_PanelLayout.setHorizontalGroup(
            Issue_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Issue_PanelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(Issue_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(Issue_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T_issue_book_id, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T_issue_student_name, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T_issue_student_id, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
            .addGroup(Issue_PanelLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(issue, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Issue_PanelLayout.setVerticalGroup(
            Issue_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Issue_PanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(Issue_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(T_issue_book_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(Issue_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(T_issue_student_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(Issue_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(T_issue_student_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(issue)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        Dynamic_Panal.add(Issue_Panel, "card2");

        Check_Panel.setBackground(new java.awt.Color(102, 0, 102));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Book Name");

        check.setBackground(new java.awt.Color(255, 102, 0));
        check.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        check.setForeground(new java.awt.Color(255, 255, 255));
        check.setText("Check");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Number of Books Available  = ");

        LnumberOfBooks.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LnumberOfBooks.setForeground(new java.awt.Color(255, 255, 255));
        LnumberOfBooks.setText("0");

        javax.swing.GroupLayout Check_PanelLayout = new javax.swing.GroupLayout(Check_Panel);
        Check_Panel.setLayout(Check_PanelLayout);
        Check_PanelLayout.setHorizontalGroup(
            Check_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Check_PanelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(T_check_book_name, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(Check_PanelLayout.createSequentialGroup()
                .addGroup(Check_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Check_PanelLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Check_PanelLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LnumberOfBooks)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Check_PanelLayout.setVerticalGroup(
            Check_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Check_PanelLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(Check_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(T_check_book_name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(check)
                .addGap(50, 50, 50)
                .addGroup(Check_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(LnumberOfBooks))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        Dynamic_Panal.add(Check_Panel, "card3");

        Return_Panel.setBackground(new java.awt.Color(102, 0, 102));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Book Id");

        returnbook.setBackground(new java.awt.Color(255, 102, 0));
        returnbook.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        returnbook.setForeground(new java.awt.Color(255, 255, 255));
        returnbook.setText("Return");
        returnbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Return_PanelLayout = new javax.swing.GroupLayout(Return_Panel);
        Return_Panel.setLayout(Return_PanelLayout);
        Return_PanelLayout.setHorizontalGroup(
            Return_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Return_PanelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(Return_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Return_PanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(T_return_book_id, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Return_PanelLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(returnbook, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(98, 98, 98))
        );
        Return_PanelLayout.setVerticalGroup(
            Return_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Return_PanelLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(Return_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(T_return_book_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(returnbook)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        Dynamic_Panal.add(Return_Panel, "card2");

        Reserve_Panel.setBackground(new java.awt.Color(102, 0, 102));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Student Id");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Book Name");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Student Name");

        reserve.setBackground(new java.awt.Color(255, 102, 0));
        reserve.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reserve.setForeground(new java.awt.Color(255, 255, 255));
        reserve.setText("Reserve");
        reserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Reserve_PanelLayout = new javax.swing.GroupLayout(Reserve_Panel);
        Reserve_Panel.setLayout(Reserve_PanelLayout);
        Reserve_PanelLayout.setHorizontalGroup(
            Reserve_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Reserve_PanelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(Reserve_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(Reserve_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T_reserve_book_name, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T_reserve_student_name, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T_reserve_student_id, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
            .addGroup(Reserve_PanelLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(reserve, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Reserve_PanelLayout.setVerticalGroup(
            Reserve_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Reserve_PanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(Reserve_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(T_reserve_book_name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(Reserve_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(T_reserve_student_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(Reserve_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(T_reserve_student_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(reserve)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        Dynamic_Panal.add(Reserve_Panel, "card3");

        All_Available_Panel.setBackground(new java.awt.Color(102, 0, 102));

        jScrollPane1.setBackground(new java.awt.Color(102, 0, 102));
        jScrollPane1.setForeground(new java.awt.Color(102, 0, 102));
        jScrollPane1.setOpaque(false);

        Show_Books_Table.setBackground(new java.awt.Color(102, 0, 102));
        Show_Books_Table.setForeground(new java.awt.Color(255, 255, 255));
        Show_Books_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"akash", "123"},
                {"aka", "a4854"},
                {"kakak", "akka"},
                {"kakak", null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        Show_Books_Table.setGridColor(new java.awt.Color(255, 102, 51));
        Show_Books_Table.setOpaque(false);
        Show_Books_Table.setSelectionBackground(new java.awt.Color(255, 153, 102));
        Show_Books_Table.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(Show_Books_Table);

        javax.swing.GroupLayout All_Available_PanelLayout = new javax.swing.GroupLayout(All_Available_Panel);
        All_Available_Panel.setLayout(All_Available_PanelLayout);
        All_Available_PanelLayout.setHorizontalGroup(
            All_Available_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(All_Available_PanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        All_Available_PanelLayout.setVerticalGroup(
            All_Available_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(All_Available_PanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Dynamic_Panal.add(All_Available_Panel, "card2");

        Issued_Panel.setBackground(new java.awt.Color(102, 0, 102));

        jScrollPane2.setBackground(new java.awt.Color(102, 0, 102));
        jScrollPane2.setForeground(new java.awt.Color(102, 0, 102));
        jScrollPane2.setOpaque(false);

        Show_issued_book_table.setBackground(new java.awt.Color(102, 0, 102));
        Show_issued_book_table.setForeground(new java.awt.Color(255, 255, 255));
        Show_issued_book_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"akash", "123", null, null},
                {"aka", "a4854", null, null},
                {"kakak", "akka", null, null},
                {"kakak", null, null, null}
            },
            new String [] {
                "Book Id", "Book Name", "Student Id", "Student Name"
            }
        ));
        Show_issued_book_table.setGridColor(new java.awt.Color(255, 102, 51));
        Show_issued_book_table.setOpaque(false);
        Show_issued_book_table.setSelectionBackground(new java.awt.Color(255, 153, 102));
        Show_issued_book_table.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(Show_issued_book_table);
        if (Show_issued_book_table.getColumnModel().getColumnCount() > 0) {
            Show_issued_book_table.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout Issued_PanelLayout = new javax.swing.GroupLayout(Issued_Panel);
        Issued_Panel.setLayout(Issued_PanelLayout);
        Issued_PanelLayout.setHorizontalGroup(
            Issued_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Issued_PanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        Issued_PanelLayout.setVerticalGroup(
            Issued_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Issued_PanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Dynamic_Panal.add(Issued_Panel, "card2");

        Add_New_Panel.setBackground(new java.awt.Color(102, 0, 102));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Book Id");

        Add_book_button.setBackground(new java.awt.Color(255, 102, 0));
        Add_book_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Add_book_button.setForeground(new java.awt.Color(255, 255, 255));
        Add_book_button.setText("Add");
        Add_book_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_book_buttonActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Book Name");

        javax.swing.GroupLayout Add_New_PanelLayout = new javax.swing.GroupLayout(Add_New_Panel);
        Add_New_Panel.setLayout(Add_New_PanelLayout);
        Add_New_PanelLayout.setHorizontalGroup(
            Add_New_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Add_New_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Add_book_button, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
            .addGroup(Add_New_PanelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(Add_New_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(Add_New_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T_add_book_id, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T_add_book_name, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
        );
        Add_New_PanelLayout.setVerticalGroup(
            Add_New_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_New_PanelLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(Add_New_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(T_add_book_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Add_New_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(T_add_book_name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(Add_book_button)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        Dynamic_Panal.add(Add_New_Panel, "card2");

        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        show_all_books.setBackground(new java.awt.Color(255, 102, 0));
        show_all_books.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        show_all_books.setForeground(new java.awt.Color(255, 255, 255));
        show_all_books.setText("Slow All Books");
        show_all_books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_all_booksActionPerformed(evt);
            }
        });

        show_issued_books.setBackground(new java.awt.Color(255, 102, 0));
        show_issued_books.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        show_issued_books.setForeground(new java.awt.Color(255, 255, 255));
        show_issued_books.setText("Show Issued Books");
        show_issued_books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_issued_booksActionPerformed(evt);
            }
        });

        show_available_books.setBackground(new java.awt.Color(255, 102, 0));
        show_available_books.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        show_available_books.setForeground(new java.awt.Color(255, 255, 255));
        show_available_books.setText("Show Available Books");
        show_available_books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_available_booksActionPerformed(evt);
            }
        });

        add_new_book.setBackground(new java.awt.Color(255, 102, 0));
        add_new_book.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add_new_book.setForeground(new java.awt.Color(255, 255, 255));
        add_new_book.setText("Add New Book");
        add_new_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_new_bookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(issue_a_book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(check_availability, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(return_a_book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reserve_a_book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(show_all_books, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(show_issued_books, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(show_available_books, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_new_book, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(Dynamic_Panal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Dynamic_Panal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(issue_a_book)
                                .addGap(18, 18, 18)
                                .addComponent(check_availability)
                                .addGap(18, 18, 18)
                                .addComponent(return_a_book)
                                .addGap(18, 18, 18)
                                .addComponent(reserve_a_book)
                                .addGap(18, 18, 18)
                                .addComponent(show_all_books)
                                .addGap(18, 18, 18)
                                .addComponent(show_issued_books)
                                .addGap(18, 18, 18)
                                .addComponent(show_available_books)
                                .addGap(18, 18, 18)
                                .addComponent(add_new_book)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void issue_a_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issue_a_bookActionPerformed
        Dynamic_Panal.removeAll();
        Dynamic_Panal.add(Issue_Panel);
        Dynamic_Panal.repaint();
        Dynamic_Panal.revalidate();
    }//GEN-LAST:event_issue_a_bookActionPerformed

    private void check_availabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_availabilityActionPerformed
        Dynamic_Panal.removeAll();
        Dynamic_Panal.add(Check_Panel);
        Dynamic_Panal.repaint();
        Dynamic_Panal.revalidate();
    }//GEN-LAST:event_check_availabilityActionPerformed

    private void return_a_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_a_bookActionPerformed
        Dynamic_Panal.removeAll();
        Dynamic_Panal.add(Return_Panel);
        Dynamic_Panal.repaint();
        Dynamic_Panal.revalidate();
    }//GEN-LAST:event_return_a_bookActionPerformed

    private void reserve_a_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserve_a_bookActionPerformed
        Dynamic_Panal.removeAll();
        Dynamic_Panal.add(Reserve_Panel);
        Dynamic_Panal.repaint();
        Dynamic_Panal.revalidate();
    }//GEN-LAST:event_reserve_a_bookActionPerformed

    private void issueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueActionPerformed
        String BookName="";
        try {
            //establish socket connection to server
            socket = new Socket(host.getHostName(), 8888);
            //write to socket using ObjectOutputStream
            oos = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Sending request to Socket Server");
            oos.writeObject("select BookName from available_books where bookid='"+T_issue_book_id.getText()+"'");
            //read the server response message
            ois = new ObjectInputStream(socket.getInputStream());
            String message = (String) ois.readObject();
            BookName = message.replaceAll("\\t+\\n+","");
            System.out.print("Message: " + BookName);
            //close resources
            ois.close();
            oos.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error : " + ex);
        }
        try {
            //establish socket connection to server
            socket = new Socket(host.getHostName(), 8888);
            //write to socket using ObjectOutputStream
            oos = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Sending request to Socket Server");
            oos.writeObject("0insert into issue_book values('"+T_issue_book_id.getText()+"','"+BookName+"','"+T_issue_student_id.getText()+"','"+T_issue_student_name.getText()+"')");
            //read the server response message
            ois = new ObjectInputStream(socket.getInputStream());
            String message = (String) ois.readObject();
            
            System.out.println("Message: " + message);
            //close resources
            ois.close();
            oos.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error : " + ex);
        }
        try {
            //establish socket connection to server
            socket = new Socket(host.getHostName(), 8888);
            //write to socket using ObjectOutputStream
            oos = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Sending request to Socket Server");
            oos.writeObject("0delete from available_books where bookid='"+T_issue_book_id.getText()+"'");
            //read the server response message
            ois = new ObjectInputStream(socket.getInputStream());
            String message = (String) ois.readObject();
            System.out.println("Message: " + message);
            //close resources
            ois.close();
            oos.close();
        } catch (Exception ex) {
            System.out.println("Error : " + ex);
        }
        JOptionPane.showMessageDialog(null,"Book Issued");
    }//GEN-LAST:event_issueActionPerformed

    private void show_all_booksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_all_booksActionPerformed
        all_books_table_model.setRowCount(0);
        try {
            //establish socket connection to server
            socket = new Socket(host.getHostName(), 8888);
            //write to socket using ObjectOutputStream
            oos = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Sending request to Socket Server");
            oos.writeObject("select * from all_books");
            //read the server response message
            ois = new ObjectInputStream(socket.getInputStream());
            String message = (String) ois.readObject();
            System.out.println("Message: " + message);
            String[] rows = message.split("\n");
            for(String data : rows){
                String[] columns=data.split("\t");
                Vector row = new Vector();
                for(String word : columns){
                    row.add(word);
                }
                all_books_table_model.addRow(row);
            }
            ois.close();
            oos.close();
        } catch (Exception ex) {
            System.out.println("Error : " + ex);
        }
        Dynamic_Panal.removeAll();
        Dynamic_Panal.add(All_Available_Panel);
        Dynamic_Panal.repaint();
        Dynamic_Panal.revalidate();
    }//GEN-LAST:event_show_all_booksActionPerformed

    private void show_issued_booksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_issued_booksActionPerformed
        Dynamic_Panal.removeAll();
        Dynamic_Panal.add(Issued_Panel);
        Dynamic_Panal.repaint();
        Dynamic_Panal.revalidate();
        issued_book_table_model.setRowCount(0);
        try {
            //establish socket connection to server
            socket = new Socket(host.getHostName(), 8888);
            //write to socket using ObjectOutputStream
            oos = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Sending request to Socket Server");
            oos.writeObject("select * from issue_book");
            //read the server response message
            ois = new ObjectInputStream(socket.getInputStream());
            String message = (String) ois.readObject();
            System.out.println("Message: \n" + message);
            String[] rows = message.split("\n");
            for(String data : rows){
                String[] columns=data.split("\t");
                Vector row = new Vector();
                for(String word : columns){
                    row.add(word);
                }
                issued_book_table_model.addRow(row);
            }
            ois.close();
            oos.close();
        } catch (Exception ex) {
            System.out.println("Error : " + ex);
        }
        
    }//GEN-LAST:event_show_issued_booksActionPerformed

    private void show_available_booksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_available_booksActionPerformed
        all_books_table_model.setRowCount(0);
        try {
            //establish socket connection to server
            socket = new Socket(host.getHostName(), 8888);
            //write to socket using ObjectOutputStream
            oos = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Sending request to Socket Server");
            oos.writeObject("select * from available_books");
            //read the server response message
            ois = new ObjectInputStream(socket.getInputStream());
            String message = (String) ois.readObject();
            System.out.println("Message: " + message);
            String[] rows = message.split("\n");
            for(String data : rows){
                String[] columns=data.split("\t");
                Vector row = new Vector();
                for(String word : columns){
                    row.add(word);
                }
                all_books_table_model.addRow(row);
            }
            ois.close();
            oos.close();
        } catch (Exception ex) {
            System.out.println("Error : " + ex);
        }
        Dynamic_Panal.removeAll();
        Dynamic_Panal.add(All_Available_Panel);
        Dynamic_Panal.repaint();
        Dynamic_Panal.revalidate();
    }//GEN-LAST:event_show_available_booksActionPerformed

    private void add_new_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_new_bookActionPerformed
        Dynamic_Panal.removeAll();
        Dynamic_Panal.add(Add_New_Panel);
        Dynamic_Panal.repaint();
        Dynamic_Panal.revalidate();
    }//GEN-LAST:event_add_new_bookActionPerformed

    private void Add_book_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_book_buttonActionPerformed
        try {
            //establish socket connection to server
            socket = new Socket(host.getHostName(), 8888);
            //write to socket using ObjectOutputStream
            oos = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Sending request to Socket Server");
            oos.writeObject("0insert into all_books values('"+T_add_book_id.getText()+"','"+T_add_book_name.getText()+"')");
            //read the server response message
            ois = new ObjectInputStream(socket.getInputStream());
            String message = (String) ois.readObject();
            System.out.println("0Message: " + message);
            //close resources
            ois.close();
            oos.close();
        } catch (Exception ex) {
            System.out.println("Error : " + ex);
        }
        try {
            //establish socket connection to server
            socket = new Socket(host.getHostName(), 8888);
            //write to socket using ObjectOutputStream
            oos = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Sending request to Socket Server");
            oos.writeObject("0insert into available_books values('"+T_add_book_id.getText()+"','"+T_add_book_name.getText()+"')");
            //read the server response message
            ois = new ObjectInputStream(socket.getInputStream());
            String message = (String) ois.readObject();
            System.out.println("0Message: " + message);
            //close resources
            ois.close();
            oos.close();
        } catch (Exception ex) {
            System.out.println("Error : " + ex);
        }
        JOptionPane.showMessageDialog(null,"Book Added");
    }//GEN-LAST:event_Add_book_buttonActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        try {
            //establish socket connection to server
            socket = new Socket(host.getHostName(), 8888);
            //write to socket using ObjectOutputStream
            oos = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Sending request to Socket Server");
            oos.writeObject("select count(*) from available_books where Bookname='"+T_check_book_name.getText()+"';");
            //read the server response message
            ois = new ObjectInputStream(socket.getInputStream());
            String message = (String) ois.readObject();
            message = message.replaceAll("\\t+\\n+", "");
            LnumberOfBooks.setText(message);
            System.out.println("Message: " + message);
            //close resources
            ois.close();
            oos.close();
        } catch (Exception ex) {
            System.out.println("Error : " + ex);
        }   
    }//GEN-LAST:event_checkActionPerformed

    private void returnbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbookActionPerformed
        String BookName="";
        try {
            socket = new Socket(host.getHostName(), 8888);
            oos = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Sending request to Socket Server");
            oos.writeObject("select bookName from issue_book where bookId='"+T_return_book_id.getText()+"';");
            ois = new ObjectInputStream(socket.getInputStream());
            String message = (String) ois.readObject();
            BookName = message.replaceAll("\\t+\\n+","");
            System.out.println("Message: " + BookName);
            ois.close();
            oos.close();
        } catch (Exception ex) {
            System.out.println("Error : " + ex);
        }
        try {
            socket = new Socket(host.getHostName(), 8888);
            oos = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Sending request to Socket Server");
            oos.writeObject("0delete from issue_book where bookId='"+T_return_book_id.getText()+"';");
            ois = new ObjectInputStream(socket.getInputStream());
            String message = (String) ois.readObject();
            System.out.println("Message: " + BookName);
            ois.close();
            oos.close();
        } catch (Exception ex) {
            System.out.println("Error : " + ex);
        }
        try {
            socket = new Socket(host.getHostName(), 8888);
            oos = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Sending request to Socket Server");
            oos.writeObject("0insert into available_books values('"+T_return_book_id.getText()+"','"+BookName+"')");
            ois = new ObjectInputStream(socket.getInputStream());
            String message = (String) ois.readObject();
            BookName = message.replaceAll("\\t+\\n+","");
            System.out.println("Message: " + BookName);
            ois.close();
            oos.close();
            
        } catch (Exception ex) {
            System.out.println("Error : " + ex);
        }
        JOptionPane.showMessageDialog(null,"Book Returned");        
    }//GEN-LAST:event_returnbookActionPerformed

    private void reserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveActionPerformed
        try {
            socket = new Socket(host.getHostName(), 8888);
            oos = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Sending request to Socket Server");
            oos.writeObject("0insert into reserve_book values('"+T_reserve_book_name.getText()+"','"+T_reserve_student_id.getText()+"','"+T_reserve_student_name.getText()+"')");
            ois = new ObjectInputStream(socket.getInputStream());
            String message = (String) ois.readObject();
            message= message.replaceAll("\\t+\\n+","");
            System.out.println("Message: " + message);
            ois.close();
            oos.close();
        } catch (Exception ex) {
            System.out.println("Error : " + ex);
        }
        JOptionPane.showMessageDialog(null,"Book Reserved"); 
    }//GEN-LAST:event_reserveActionPerformed

    public static void main(String args[]) throws UnknownHostException, IOException,
            ClassNotFoundException, InterruptedException {
        host = InetAddress.getLocalHost();

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(client_liberary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(client_liberary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(client_liberary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(client_liberary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new client_liberary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Add_New_Panel;
    private javax.swing.JButton Add_book_button;
    private javax.swing.JPanel All_Available_Panel;
    private javax.swing.JPanel Check_Panel;
    private javax.swing.JPanel Dynamic_Panal;
    private javax.swing.JPanel Issue_Panel;
    private javax.swing.JPanel Issued_Panel;
    private javax.swing.JLabel LnumberOfBooks;
    private javax.swing.JPanel Reserve_Panel;
    private javax.swing.JPanel Return_Panel;
    private javax.swing.JTable Show_Books_Table;
    private javax.swing.JTable Show_issued_book_table;
    private javax.swing.JTextField T_add_book_id;
    private javax.swing.JTextField T_add_book_name;
    private javax.swing.JTextField T_check_book_name;
    private javax.swing.JTextField T_issue_book_id;
    private javax.swing.JTextField T_issue_student_id;
    private javax.swing.JTextField T_issue_student_name;
    private javax.swing.JTextField T_reserve_book_name;
    private javax.swing.JTextField T_reserve_student_id;
    private javax.swing.JTextField T_reserve_student_name;
    private javax.swing.JTextField T_return_book_id;
    private javax.swing.JButton add_new_book;
    private javax.swing.JButton check;
    private javax.swing.JButton check_availability;
    private javax.swing.JButton issue;
    private javax.swing.JButton issue_a_book;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton reserve;
    private javax.swing.JButton reserve_a_book;
    private javax.swing.JButton return_a_book;
    private javax.swing.JButton returnbook;
    private javax.swing.JButton show_all_books;
    private javax.swing.JButton show_available_books;
    private javax.swing.JButton show_issued_books;
    // End of variables declaration//GEN-END:variables
}
