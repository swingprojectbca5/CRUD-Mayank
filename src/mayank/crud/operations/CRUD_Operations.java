package mayank.crud.operations;

import java.sql.*;
import mayank.crud.dbconnection.dbConnection;

public class CRUD_Operations extends javax.swing.JFrame {

    public CRUD_Operations() {
        initComponents();
        txtstSrno.setVisible(false);
        //I have create master new branch in github...
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headingPanel = new javax.swing.JPanel();
        topHeading = new javax.swing.JLabel();
        middlePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtmarkJava = new javax.swing.JTextField();
        txtstName = new javax.swing.JTextField();
        txtmarkJavascript = new javax.swing.JTextField();
        txtmarkPython = new javax.swing.JTextField();
        txtstID = new javax.swing.JTextField();
        txtmarkTotal = new javax.swing.JTextField();
        txtPer = new javax.swing.JTextField();
        txtmarkCsharp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        txtstSrno = new javax.swing.JTextField();
        buttonPanel = new javax.swing.JPanel();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        insertBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Marksheet");
        setLocation(new java.awt.Point(10, 50));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        headingPanel.setBackground(new java.awt.Color(0, 204, 255));

        topHeading.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        topHeading.setText("Student Marksheet :");

        javax.swing.GroupLayout headingPanelLayout = new javax.swing.GroupLayout(headingPanel);
        headingPanel.setLayout(headingPanelLayout);
        headingPanelLayout.setHorizontalGroup(
            headingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headingPanelLayout.createSequentialGroup()
                .addGap(601, 601, 601)
                .addComponent(topHeading)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headingPanelLayout.setVerticalGroup(
            headingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headingPanelLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(topHeading)
                .addGap(14, 14, 14))
        );

        middlePanel.setBackground(new java.awt.Color(0, 204, 255));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setText("Student Name :");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setText("Search :");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setText("Marks Of Java :");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setText("Marks Of Python :");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setText("Marks Of JavaScript :");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setText("Total Is :");

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel8.setText("Marks Of Csharp :");

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel9.setText("Percentage Is :");

        txtmarkJava.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        txtstName.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        txtmarkJavascript.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        txtmarkPython.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        txtstID.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        txtmarkTotal.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        txtPer.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        txtmarkCsharp.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        dataTable.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SRNO", "ID", "NAME", "JAVA", "JAVASCRIPT", "PYTHON", "C#", "TOTAL", "PERCENTAGE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dataTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(dataTable);
        if (dataTable.getColumnModel().getColumnCount() > 0) {
            dataTable.getColumnModel().getColumn(0).setResizable(false);
            dataTable.getColumnModel().getColumn(1).setResizable(false);
            dataTable.getColumnModel().getColumn(2).setResizable(false);
            dataTable.getColumnModel().getColumn(3).setResizable(false);
            dataTable.getColumnModel().getColumn(5).setResizable(false);
            dataTable.getColumnModel().getColumn(6).setResizable(false);
            dataTable.getColumnModel().getColumn(7).setResizable(false);
            dataTable.getColumnModel().getColumn(8).setResizable(false);
        }

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel10.setText("Student Id :");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout middlePanelLayout = new javax.swing.GroupLayout(middlePanel);
        middlePanel.setLayout(middlePanelLayout);
        middlePanelLayout.setHorizontalGroup(
            middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(middlePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5))
                .addGap(85, 85, 85)
                .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(middlePanelLayout.createSequentialGroup()
                        .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmarkCsharp, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmarkTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPer, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(middlePanelLayout.createSequentialGroup()
                        .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtstID, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtmarkJavascript, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtmarkPython, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtmarkJava, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(middlePanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE)
                                .addGap(19, 19, 19))
                            .addGroup(middlePanelLayout.createSequentialGroup()
                                .addComponent(txtstSrno, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(31, 31, 31)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(189, 189, 189))))))
        );
        middlePanelLayout.setVerticalGroup(
            middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(middlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, middlePanelLayout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtstID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtstSrno, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGap(17, 17, 17)
                .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtstName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(middlePanelLayout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmarkJava, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, middlePanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, middlePanelLayout.createSequentialGroup()
                                .addComponent(txtmarkJavascript, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtmarkPython, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtmarkCsharp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtmarkTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(20, 20, 20)
                .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        buttonPanel.setBackground(new java.awt.Color(0, 204, 255));

        updateBtn.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        clearBtn.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        insertBtn.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        insertBtn.setText("Insert");
        insertBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });

        exitBtn.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(insertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn)
                    .addComponent(updateBtn)
                    .addComponent(insertBtn)
                    .addComponent(clearBtn)
                    .addComponent(exitBtn))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(headingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(middlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(middlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void clearTextBoxes() {
        txtstID.setText("");
        txtstName.setText("");
        txtmarkJava.setText("");
        txtmarkJavascript.setText("");
        txtmarkPython.setText("");
        txtmarkCsharp.setText("");
        txtmarkTotal.setText("");
        txtPer.setText("");
        txtSearch.setText("");

        txtstID.requestFocus();

    }
    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clearTextBoxes();

    }//GEN-LAST:event_clearBtnActionPerformed

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        try {
            Connection con = dbConnection.getConnection();
            //String insertQuery = "INSERT INTO `studentmarksheet` (`stId`, `stName`, `java`, `javascript`, `python`, `csharp`, `totalMarks`, `per`) VALUES ('1', 'ram', '67', '89', '78', '76', '310', '32.26');";
            String insertQuery = "INSERT INTO `studentmarksheet` (`stId`, `stName`, `java`, `javascript`, `python`, `csharp`, `totalMarks`, `per`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

            PreparedStatement ps = con.prepareStatement(insertQuery);
            int studentId = Integer.parseInt(txtstID.getText());
            String studentName = txtstName.getText();
            int studentMarkJava = Integer.parseInt(txtmarkJava.getText());
            int studentMarkJavaScript = Integer.parseInt(txtmarkJavascript.getText());
            int studentMarkPython = Integer.parseInt(txtmarkPython.getText());
            int studentMarkCsharp = Integer.parseInt(txtmarkCsharp.getText());

            ps.setInt(1, studentId);
            ps.setString(2, studentName);
            ps.setInt(3, studentMarkJava);
            ps.setInt(4, studentMarkJavaScript);
            ps.setInt(5, studentMarkPython);
            ps.setInt(6, studentMarkCsharp);
            int totalMarks = studentMarkJava + studentMarkJavaScript + studentMarkPython + studentMarkCsharp;
            ps.setInt(7, totalMarks);
            //float per = (totalMarks*100/600);
            //System.out.println(per);
            ps.setFloat(8, totalMarks * 100 / 600);

            ps.executeUpdate();
            clearTextBoxes();
            tableData();
            System.out.println("Data Inserted Successfully");
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_insertBtnActionPerformed

    public void tableData() {
        try {
            javax.swing.table.DefaultTableModel TableModel = (javax.swing.table.DefaultTableModel) dataTable.getModel();
            TableModel.setRowCount(0);
            Connection con = dbConnection.getConnection();
            String selectQuery = "SELECT * FROM `studentmarksheet`";
            Statement st = con.createStatement();
            ResultSet set = st.executeQuery(selectQuery);

            while (set.next()) {
                String srno = String.valueOf(set.getInt(1));
                String id = String.valueOf(set.getInt(2));
                String name = set.getString(3);
                String java = String.valueOf(set.getInt(4));
                String javascript = String.valueOf(set.getInt(5));
                String python = String.valueOf(set.getInt(6));
                String csharp = String.valueOf(set.getInt(7));
                String total = String.valueOf(set.getInt(8));
                String per = String.valueOf(set.getInt(9));

                String[] Row = {srno, id, name, java, javascript, python, csharp, total, per};
                TableModel.addRow(Row);
                //System.out.println(srno + " " + id + " " + name + " " + java + " " + javascript + " " + python + " " + csharp + " " + total + " " + per);
            }
            //System.out.println("Recored is add in JTable");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        tableData();
    }//GEN-LAST:event_formWindowOpened

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void dataTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataTableMousePressed
        // TODO add your handling code here:
        int i = dataTable.getSelectedRow();
        javax.swing.table.DefaultTableModel TableModel = (javax.swing.table.DefaultTableModel) dataTable.getModel();
        txtstSrno.setText(TableModel.getValueAt(i, 0).toString());
        txtstID.setText(TableModel.getValueAt(i, 1).toString());
        txtstName.setText(TableModel.getValueAt(i, 2).toString());
        txtmarkJava.setText(TableModel.getValueAt(i, 3).toString());
        txtmarkJavascript.setText(TableModel.getValueAt(i, 4).toString());
        txtmarkPython.setText(TableModel.getValueAt(i, 5).toString());
        txtmarkCsharp.setText(TableModel.getValueAt(i, 6).toString());
        txtmarkTotal.setText(TableModel.getValueAt(i, 7).toString());
        txtPer.setText(TableModel.getValueAt(i, 8).toString());
    }//GEN-LAST:event_dataTableMousePressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        //SELECT * FROM `studentmarksheet` where stName like '%ram%';
        try {
            javax.swing.table.DefaultTableModel TableModel = (javax.swing.table.DefaultTableModel) dataTable.getModel();
            TableModel.setRowCount(0);
            Connection con = dbConnection.getConnection();
            String stname = txtSearch.getText();
            String searchQuery = "SELECT * FROM `studentmarksheet` WHERE stName LIKE '%" + stname + "%'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(searchQuery);
            while (rs.next()) {
                String srno = rs.getString(1);
                String id = rs.getString(2);
                String name = rs.getString(3);
                String java = String.valueOf(rs.getInt(4));
                String javascript = String.valueOf(rs.getInt(5));
                String python = String.valueOf(rs.getInt(6));
                String csharp = String.valueOf(rs.getInt(7));
                String total = String.valueOf(rs.getInt(8));
                String per = String.valueOf(rs.getInt(9));

                String[] Row = {srno, id, name, java, javascript, python, csharp, total, per};
                TableModel.addRow(Row);
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Name is not exists");
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        if (!txtstID.getText().equals("")) {
            try {
                Connection con = dbConnection.getConnection();
                String deleteQuery = "DELETE FROM `studentmarksheet` WHERE srno=?";
                PreparedStatement ps = con.prepareStatement(deleteQuery);
                String srno = txtstSrno.getText();

                ps.setString(1, srno);
                ps.executeUpdate();
                clearTextBoxes();
                tableData();
                System.out.println("Recored Deleted....");
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            System.out.println("please recored");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        if (!txtstSrno.getText().equals("")) {
            try {
                Connection con = dbConnection.getConnection();

                String deleteQuery = "UPDATE studentmarksheet SET stId=?, stName=?, java=?, javascript=?, python=?, csharp=? WHERE srno=?";
                PreparedStatement ps = con.prepareStatement(deleteQuery);

                String id = txtstID.getText();
                String name = txtstName.getText();
                int java = Integer.parseInt(txtmarkJava.getText());
                int javascript = Integer.parseInt(txtmarkJavascript.getText());
                int python = Integer.parseInt(txtmarkPython.getText());
                int csharp = Integer.parseInt(txtmarkCsharp.getText());
                int srno = Integer.parseInt(txtstSrno.getText());

                ps.setString(1, id);
                ps.setString(2, name);
                ps.setInt(3, java);
                ps.setInt(4, javascript);
                ps.setInt(5, python);
                ps.setInt(6, csharp);
                ps.setInt(7, srno);

                ps.executeUpdate();

                clearTextBoxes();
                tableData();

                System.out.println("Recored updated....");
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            System.out.println("please select recored");
        }
    }//GEN-LAST:event_updateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CRUD_Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD_Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD_Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD_Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD_Operations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTable dataTable;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JPanel headingPanel;
    private javax.swing.JButton insertBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel middlePanel;
    private javax.swing.JLabel topHeading;
    private javax.swing.JTextField txtPer;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtmarkCsharp;
    private javax.swing.JTextField txtmarkJava;
    private javax.swing.JTextField txtmarkJavascript;
    private javax.swing.JTextField txtmarkPython;
    private javax.swing.JTextField txtmarkTotal;
    private javax.swing.JTextField txtstID;
    private javax.swing.JTextField txtstName;
    private javax.swing.JTextField txtstSrno;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
