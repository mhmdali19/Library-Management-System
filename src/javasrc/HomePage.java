package javasrc;

import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class HomePage extends javax.swing.JFrame{

    
    Color mouseEnterColor = new Color(0,0,0);
    Color mouseExitColor = new Color(51,51,51);
    public HomePage() {
        initComponents();
        //setDataToCards();
    }
 
    public HomePage(String name) {
        initComponents();
        //setDataToCards();
        jLabel4.setText("Welcome, " + name);
        int nbBooks = getNbBooks();
        int nbStudents = getNbStudents();
        int nbissuedBooks = getNbIssuedBooks();
        
        jLabel15.setText("Books Nb: " + nbBooks);                                             
        jLabel18.setText("Students Nb: " + nbStudents);
        jLabel20.setText("Issued Books:" + nbissuedBooks);
    }
    //setting card values from Database
    
    /*public void setDataToCards(){
        Statement st=null;
        ResultSet rs=null;
        
        long l = System.currentTimeMillis();
        Date todaysDate=new Date(1);
        
        try{
           Connection con=DBConnection.getConnection();
           st=con.createStatement();
           rs=st.executeQuery("select * from book_details");
           rs.last();
           //lbl_noOfBooks.setText(Integer.toString(rs.getRow()));
           
           rs=st.executeQuery("select * from student_details");
           rs.last();
           //lbl_noOfStudents.setText(Integer.toString(rs.getRow()));
           
           rs=st.executeQuery("select * from issue_book_details");
           rs.last();
           //lbl_issuedBooks.setText(Integer.toString(rs.getRow()));
           
           rs=st.executeQuery("select * from issue_book_details where due_date < '"+todaysDate+"' and status='"+"pending"+"'");
           rs.last();
           //lbl_defaulterList.setText(Integer.toString(rs.getRow()));
 
        }catch(Exception e){
        e.printStackTrace();
        }
    }*/

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        manageStudents = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        manageBooks = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        issueBook = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        ReturnBook = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        viewRecords = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        Logout = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        viewIssuedBooks = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adminIcons/adminIcons/icons8_menu_48px_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 56, 80));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(5, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 5, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LIBRARY MANAGEMENT SYSTEM");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 31, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Welcome,User");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 200, 50));

        jPanel16.setBackground(new java.awt.Color(255, 0, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, -1, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adminIcons/adminIcons/male_user_50px.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 50, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 80));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("   LMS Dashboard");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 51, 51));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Home Page");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 205, 35));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Features");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 114, 164, 23));

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageStudents.setBackground(new java.awt.Color(51, 51, 51));
        manageStudents.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageStudents.setForeground(new java.awt.Color(153, 153, 153));
        manageStudents.setText("     Manage Students");
        manageStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageStudentsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageStudentsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageStudentsMouseExited(evt);
            }
        });
        jPanel10.add(manageStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 227, 34));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adminIcons/adminIcons/icons8_Read_Online_26px.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 270, 40));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageBooks.setBackground(new java.awt.Color(204, 204, 204));
        manageBooks.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageBooks.setForeground(new java.awt.Color(153, 153, 153));
        manageBooks.setText("     Manage Books");
        manageBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageBooksMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageBooksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageBooksMouseExited(evt);
            }
        });
        jPanel9.add(manageBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 199, 34));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adminIcons/adminIcons/icons8_Book_26px.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 270, 50));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        issueBook.setBackground(new java.awt.Color(51, 51, 51));
        issueBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        issueBook.setForeground(new java.awt.Color(153, 153, 153));
        issueBook.setText("     Issue Book");
        issueBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                issueBookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                issueBookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                issueBookMouseExited(evt);
            }
        });
        jPanel11.add(issueBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 201, 34));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adminIcons/adminIcons/icons8_Sell_26px.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 270, 40));

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReturnBook.setBackground(new java.awt.Color(51, 51, 51));
        ReturnBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ReturnBook.setForeground(new java.awt.Color(153, 153, 153));
        ReturnBook.setText("     Return Book");
        ReturnBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnBookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReturnBookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReturnBookMouseExited(evt);
            }
        });
        jPanel12.add(ReturnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 201, 34));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adminIcons/adminIcons/icons8_Return_Purchase_26px.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        jPanel3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 270, 40));

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewRecords.setBackground(new java.awt.Color(51, 51, 51));
        viewRecords.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewRecords.setForeground(new java.awt.Color(153, 153, 153));
        viewRecords.setText("     Defaulter List");
        viewRecords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewRecordsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewRecordsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewRecordsMouseExited(evt);
            }
        });
        jPanel13.add(viewRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 210, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adminIcons/adminIcons/icons8_People_50px.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel13.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        jPanel3.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 270, 40));

        jPanel15.setBackground(new java.awt.Color(255, 0, 51));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logout.setBackground(new java.awt.Color(102, 102, 255));
        Logout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setText("      Logout");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        jPanel15.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 40));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adminIcons/adminIcons/icons8_Exit_26px_2.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel15.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jPanel3.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 270, 40));

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewIssuedBooks.setBackground(new java.awt.Color(51, 51, 51));
        viewIssuedBooks.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewIssuedBooks.setForeground(new java.awt.Color(153, 153, 153));
        viewIssuedBooks.setText("     View Issued Books");
        viewIssuedBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewIssuedBooksMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewIssuedBooksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewIssuedBooksMouseExited(evt);
            }
        });
        jPanel14.add(viewIssuedBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 34));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adminIcons/adminIcons/icons8_Books_26px.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel14.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        jPanel3.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 270, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adminIcons/adminIcons/icons8_Home_26px_2.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adminIcons/adminIcons/icons8_Library_32px.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 30, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 270, 580));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel15.setText("No.Of Books");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 190, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel18.setText("No.Of Students");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 190, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel20.setText("Issued Books");
        jLabel20.setMaximumSize(new java.awt.Dimension(200, 22));
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 140, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/Webp.net-resizeimage (1).jpg"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 780, 400));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 920, 580));

        setSize(new java.awt.Dimension(1188, 657));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private int getNbBooks(){
        int nbBooks = 0;
         try {
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("select Count(*) as cnt from book_details ");
            
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
             nbBooks = rs.getInt("cnt");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
         return nbBooks;
    }
    
    private int getNbStudents(){
        int nbStudents = 0;
         try {
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("select Count(*) as cnt from student_details ");
            
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
             nbStudents = rs.getInt("cnt");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
         return nbStudents;
    }
    
    private int getNbIssuedBooks(){
        int nbIssuedBooks = 0;
         try {
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("select Count(*) as cnt from issue_book_details ");
            
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
             nbIssuedBooks = rs.getInt("cnt");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
         return nbIssuedBooks;
    }
    
    
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void manageBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageBooksMouseClicked
        ManageBooks mb=new ManageBooks();
        mb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_manageBooksMouseClicked

    private void manageBooksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageBooksMouseEntered
        jPanel9.setBackground(mouseEnterColor);
    }//GEN-LAST:event_manageBooksMouseEntered

    private void manageBooksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageBooksMouseExited
       jPanel9.setBackground(mouseExitColor);
    }//GEN-LAST:event_manageBooksMouseExited

    private void manageStudentsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageStudentsMouseEntered
        jPanel10.setBackground(mouseEnterColor);
    }//GEN-LAST:event_manageStudentsMouseEntered

    private void manageStudentsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageStudentsMouseExited
        jPanel10.setBackground(mouseExitColor);
    }//GEN-LAST:event_manageStudentsMouseExited

    private void issueBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issueBookMouseEntered
        jPanel11.setBackground(mouseEnterColor);
    }//GEN-LAST:event_issueBookMouseEntered

    private void issueBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issueBookMouseExited
       jPanel11.setBackground(mouseExitColor);
    }//GEN-LAST:event_issueBookMouseExited

    private void ReturnBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnBookMouseEntered
       jPanel12.setBackground(mouseEnterColor); 
    }//GEN-LAST:event_ReturnBookMouseEntered

    private void ReturnBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnBookMouseExited
        jPanel12.setBackground(mouseExitColor);
    }//GEN-LAST:event_ReturnBookMouseExited

    private void viewIssuedBooksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewIssuedBooksMouseEntered
        jPanel14.setBackground(mouseEnterColor);
    }//GEN-LAST:event_viewIssuedBooksMouseEntered

    private void viewIssuedBooksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewIssuedBooksMouseExited
        jPanel14.setBackground(mouseExitColor);
    }//GEN-LAST:event_viewIssuedBooksMouseExited

    private void issueBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issueBookMouseClicked
       IssueBook book=new IssueBook();
       book.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_issueBookMouseClicked

    private void manageStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageStudentsMouseClicked
       ManageStudent student=new ManageStudent();
       student.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_manageStudentsMouseClicked

    private void ReturnBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnBookMouseClicked
        ReturnBook returnBook=new ReturnBook();
        returnBook.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReturnBookMouseClicked

    private void viewIssuedBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewIssuedBooksMouseClicked
        IssueBookDetails bookDetails=new IssueBookDetails();
        bookDetails.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewIssuedBooksMouseClicked

    private void viewRecordsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewRecordsMouseExited
        jPanel13.setBackground(mouseExitColor);
    }//GEN-LAST:event_viewRecordsMouseExited

    private void viewRecordsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewRecordsMouseEntered
        jPanel13.setBackground(mouseEnterColor);
    }//GEN-LAST:event_viewRecordsMouseEntered

    private void viewRecordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewRecordsMouseClicked
       DefaulterList list=new DefaulterList();
       list.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_viewRecordsMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        LoginPage lp=new LoginPage();
        lp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
 /*String outlookUsername = "Javacourse99@outlook.com";
    String outlookPassword = "advancedJava99";

    EmailSender outlookEmailSender = new EmailSender(outlookUsername, outlookPassword);

    String recipientGmail = "mhmd01ali01@gmail.com";
    String subject = "Test Email from Outlook to Gmail";
    String message = "This is a test email sent from an Outlook account to a Gmail account.";

    outlookEmailSender.sendEmail(recipientGmail, subject, message);
        */
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HomePage hp=new HomePage();
                hp.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel ReturnBook;
    private javax.swing.JLabel issueBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel manageBooks;
    private javax.swing.JLabel manageStudents;
    private javax.swing.JLabel viewIssuedBooks;
    private javax.swing.JLabel viewRecords;
    // End of variables declaration//GEN-END:variables
}
