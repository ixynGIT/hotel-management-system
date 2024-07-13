/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Pages;

import UI.LoginPage.login;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class main extends javax.swing.JFrame {
    int mouseX;
    int mouseY;
    Color clicked = new Color(255,200,1);
    Color hover = new Color(255,200,0);
    Color leave = new Color(26,28,30);
    public main() {
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

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dashboard = new RoundedPanel(20,new Color(26,28,30));
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_clients = new javax.swing.JPanel();
        btn_user1 = new javax.swing.JLabel();
        btn_manage = new javax.swing.JPanel();
        btn_rooms = new javax.swing.JLabel();
        btn_users = new javax.swing.JPanel();
        btn_user = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        btn_checkIN = new javax.swing.JPanel();
        btn_user7 = new javax.swing.JLabel();
        btn_checkOUT = new javax.swing.JPanel();
        btn_user8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        intPages = new javax.swing.JDesktopPane();

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("_");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 3, 20, 30));

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("x");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1065, 3, 20, 30));

        dashboard.setBackground(new java.awt.Color(26, 28, 30));
        dashboard.setOpaque(false);
        dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Chpatel");
        dashboard.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 53, -1, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dashboard");
        dashboard.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 63, -1, -1));

        btn_clients.setBackground(new java.awt.Color(26, 28, 30));
        btn_clients.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clientsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_clientsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_clientsMouseExited(evt);
            }
        });

        btn_user1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 13)); // NOI18N
        btn_user1.setForeground(new java.awt.Color(255, 255, 255));
        btn_user1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rating(1).png"))); // NOI18N
        btn_user1.setText("Clients");
        btn_user1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_user1.setIconTextGap(7);

        javax.swing.GroupLayout btn_clientsLayout = new javax.swing.GroupLayout(btn_clients);
        btn_clients.setLayout(btn_clientsLayout);
        btn_clientsLayout.setHorizontalGroup(
            btn_clientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_clientsLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btn_user1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_clientsLayout.setVerticalGroup(
            btn_clientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_clientsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btn_user1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        dashboard.add(btn_clients, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 179, -1));

        btn_manage.setBackground(new java.awt.Color(26, 28, 30));
        btn_manage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_manage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_manageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_manageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_manageMouseExited(evt);
            }
        });

        btn_rooms.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 13)); // NOI18N
        btn_rooms.setForeground(new java.awt.Color(255, 255, 255));
        btn_rooms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hotel-bed-line.png"))); // NOI18N
        btn_rooms.setText("Manage Rooms");
        btn_rooms.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_rooms.setIconTextGap(6);

        javax.swing.GroupLayout btn_manageLayout = new javax.swing.GroupLayout(btn_manage);
        btn_manage.setLayout(btn_manageLayout);
        btn_manageLayout.setHorizontalGroup(
            btn_manageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_manageLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(btn_rooms)
                .addGap(28, 28, 28))
        );
        btn_manageLayout.setVerticalGroup(
            btn_manageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_manageLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btn_rooms)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        dashboard.add(btn_manage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 179, -1));

        btn_users.setBackground(new java.awt.Color(26, 28, 30));
        btn_users.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_usersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_usersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_usersMouseExited(evt);
            }
        });

        btn_user.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 13)); // NOI18N
        btn_user.setForeground(new java.awt.Color(255, 255, 255));
        btn_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team-line.png"))); // NOI18N
        btn_user.setText("Users");
        btn_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_user.setIconTextGap(7);

        javax.swing.GroupLayout btn_usersLayout = new javax.swing.GroupLayout(btn_users);
        btn_users.setLayout(btn_usersLayout);
        btn_usersLayout.setHorizontalGroup(
            btn_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_usersLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btn_user)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_usersLayout.setVerticalGroup(
            btn_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_usersLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btn_user, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        dashboard.add(btn_users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 179, -1));

        jPanel1.setBackground(new java.awt.Color(26, 28, 30));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });

        logout.setBackground(new java.awt.Color(26, 28, 30));
        logout.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 13)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout-box-line.png"))); // NOI18N
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(logout)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(logout)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        dashboard.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, -1, -1));

        btn_checkIN.setBackground(new java.awt.Color(255, 200, 1));
        btn_checkIN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_checkIN.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btn_checkINAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btn_checkIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_checkINMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_checkINMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_checkINMouseExited(evt);
            }
        });

        btn_user7.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 13)); // NOI18N
        btn_user7.setForeground(new java.awt.Color(255, 255, 255));
        btn_user7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendar-check-line.png"))); // NOI18N
        btn_user7.setText("Check-In");
        btn_user7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_user7.setIconTextGap(7);

        javax.swing.GroupLayout btn_checkINLayout = new javax.swing.GroupLayout(btn_checkIN);
        btn_checkIN.setLayout(btn_checkINLayout);
        btn_checkINLayout.setHorizontalGroup(
            btn_checkINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_checkINLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btn_user7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_checkINLayout.setVerticalGroup(
            btn_checkINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_checkINLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btn_user7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        dashboard.add(btn_checkIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 179, -1));

        btn_checkOUT.setBackground(new java.awt.Color(26, 28, 30));
        btn_checkOUT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_checkOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_checkOUTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_checkOUTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_checkOUTMouseExited(evt);
            }
        });

        btn_user8.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 13)); // NOI18N
        btn_user8.setForeground(new java.awt.Color(255, 255, 255));
        btn_user8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconmonstr-calendar-9-16.png"))); // NOI18N
        btn_user8.setText("Check Out");
        btn_user8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_user8.setIconTextGap(7);

        javax.swing.GroupLayout btn_checkOUTLayout = new javax.swing.GroupLayout(btn_checkOUT);
        btn_checkOUT.setLayout(btn_checkOUTLayout);
        btn_checkOUTLayout.setHorizontalGroup(
            btn_checkOUTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_checkOUTLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btn_user8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_checkOUTLayout.setVerticalGroup(
            btn_checkOUTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_checkOUTLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btn_user8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        dashboard.add(btn_checkOUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 179, -1));

        jPanel2.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 180, 540));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        jLabel3.setForeground(java.awt.Color.orange);
        jLabel3.setText("HOTEL");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(26, 28, 30));
        jLabel14.setText("MANAGEMENT SYSTEM");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, 20));

        intPages.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout intPagesLayout = new javax.swing.GroupLayout(intPages);
        intPages.setLayout(intPagesLayout);
        intPagesLayout.setHorizontalGroup(
            intPagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        intPagesLayout.setVerticalGroup(
            intPagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        jPanel2.add(intPages, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 875, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        setState(main.ICONIFIED);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void btn_clientsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientsMouseEntered
        if(btn_clients.getBackground() != clicked)
            btn_clients.setBackground(hover);
    }//GEN-LAST:event_btn_clientsMouseEntered

    private void btn_clientsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientsMouseExited
        if (btn_clients.getBackground() != clicked)
            btn_clients.setBackground(leave);
    }//GEN-LAST:event_btn_clientsMouseExited

    private void btn_manageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_manageMouseEntered
        if (btn_manage.getBackground() != clicked)
            btn_manage.setBackground(leave);
    }//GEN-LAST:event_btn_manageMouseEntered

    private void btn_manageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_manageMouseExited
        if (btn_manage.getBackground() != clicked)
            btn_manage.setBackground(leave);
    }//GEN-LAST:event_btn_manageMouseExited

    private void btn_usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usersMouseEntered
        if (btn_users.getBackground() != clicked)
            btn_users.setBackground(hover);
    }//GEN-LAST:event_btn_usersMouseEntered

    private void btn_usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usersMouseExited
        if (btn_users.getBackground() != clicked)    
            btn_users.setBackground(leave);
    }//GEN-LAST:event_btn_usersMouseExited

    private void btn_usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usersMouseClicked
       Users usr = new Users();
       intPages.removeAll();
       intPages.add(usr).setVisible(true);
       if(usr.isVisible())
                btn_checkIN.setBackground(leave);
                btn_checkOUT.setBackground(leave);
                btn_clients.setBackground(leave);
                btn_manage.setBackground(leave);
                btn_users.setBackground(clicked);
       
    }//GEN-LAST:event_btn_usersMouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int coordX = evt.getXOnScreen();
        int coordY = evt.getYOnScreen();
        
        this.setLocation(coordX-mouseX, coordY-mouseY);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
         mouseX = evt.getX();
         mouseY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void btn_manageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_manageMouseClicked
        intPages.removeAll();
        try {
            ManageRooms mr = new ManageRooms();
            intPages.add(mr).setVisible(true);
            if(mr.isVisible())
                btn_checkIN.setBackground(leave);
                btn_checkOUT.setBackground(leave);
                btn_clients.setBackground(leave);
                btn_manage.setBackground(clicked);
                btn_users.setBackground(leave);
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_manageMouseClicked

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        jPanel1.setBackground(hover);
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        jPanel1.setBackground(leave);
    }//GEN-LAST:event_jPanel1MouseExited

    private void btn_checkINMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_checkINMouseEntered
       if (btn_checkIN.getBackground() != clicked) { 
        btn_checkIN.setBackground(hover);
        }
    }//GEN-LAST:event_btn_checkINMouseEntered

    private void btn_checkINMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_checkINMouseExited
        if (btn_checkIN.getBackground() != clicked) { 
        btn_checkIN.setBackground(leave);
        }
    }//GEN-LAST:event_btn_checkINMouseExited

    private void btn_checkOUTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_checkOUTMouseEntered
        if (btn_checkOUT.getBackground() != clicked) {
            btn_checkOUT.setBackground(hover);  
        }  
    }//GEN-LAST:event_btn_checkOUTMouseEntered

    private void btn_checkOUTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_checkOUTMouseExited
        if(btn_checkOUT.getBackground() != clicked){
            btn_checkOUT.setBackground(leave);
        }
    }//GEN-LAST:event_btn_checkOUTMouseExited

    private void btn_checkINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_checkINMouseClicked
      
        try {      
            CheckIN in = new CheckIN();
            intPages.add(in).setVisible(true);
            if(in.isVisible())
                btn_checkIN.setBackground(clicked);
                btn_checkOUT.setBackground(leave);
                btn_clients.setBackground(leave);
                btn_manage.setBackground(leave);
                btn_users.setBackground(leave);
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_checkINMouseClicked

    private void btn_clientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientsMouseClicked
        intPages.removeAll();
        Clients cn = new Clients();
        intPages.add(cn).setVisible(true);
        if(cn.isVisible())
            btn_checkIN.setBackground(leave);
            btn_checkOUT.setBackground(leave);
            btn_clients.setBackground(clicked);
            btn_manage.setBackground(leave);
            btn_users.setBackground(leave);
         
    }//GEN-LAST:event_btn_clientsMouseClicked

    private void btn_checkOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_checkOUTMouseClicked
        intPages.removeAll();
        CheckOUT out = new CheckOUT();
        intPages.add(out).setVisible(true);
        if(out.isVisible())
            btn_checkIN.setBackground(leave);
            btn_checkOUT.setBackground(clicked);
            btn_clients.setBackground(leave);
            btn_manage.setBackground(leave);
            btn_users.setBackground(leave);
            
    }//GEN-LAST:event_btn_checkOUTMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        dispose();
        login log = new login();
        log.setVisible(true);
    }//GEN-LAST:event_jPanel1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            CheckIN ovr = new CheckIN();
            intPages.add(ovr).setVisible(true);
            if(ovr.isVisible())
                btn_checkIN.setBackground(clicked);
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_formWindowOpened

    private void btn_checkINAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btn_checkINAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_checkINAncestorAdded

    /**
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_checkIN;
    private javax.swing.JPanel btn_checkOUT;
    private javax.swing.JPanel btn_clients;
    private javax.swing.JPanel btn_manage;
    private javax.swing.JLabel btn_rooms;
    private javax.swing.JLabel btn_user;
    private javax.swing.JLabel btn_user1;
    private javax.swing.JLabel btn_user7;
    private javax.swing.JLabel btn_user8;
    private javax.swing.JPanel btn_users;
    private javax.swing.JPanel dashboard;
    public javax.swing.JDesktopPane intPages;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logout;
    // End of variables declaration//GEN-END:variables
}
