package aplikasi_perpustakaan;

import javax.swing.*;
import java.awt.event.*;

public class home1 extends JFrame {

    private JLayeredPane jLayeredPane1;
    private JPanel jPanel1;
    private JMenuBar jMenuBar1;
    private JMenu menuHome, menuData, menuAbout, menuExit;
    private JMenuItem menuAnggota, menuPeminjaman, menuBuku;

    public home1() {
        initComponents();
    }

    private void initComponents() {
        // Layered Pane dan Panel
        jLayeredPane1 = new JLayeredPane();
        jPanel1 = new JPanel();
        jPanel1.setBackground(new java.awt.Color(173, 216, 230)); // Diubah menjadi biru muda
        jLayeredPane1.setLayer(jPanel1, JLayeredPane.DEFAULT_LAYER);

        // Layout panel
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        // Menu Bar
        jMenuBar1 = new JMenuBar();
        menuHome = new JMenu("Home");
        menuData = new JMenu("Data");
        menuAbout = new JMenu("About");
        menuExit = new JMenu("Exit");

        menuAnggota = new JMenuItem("Form Anggota");
        menuPeminjaman = new JMenuItem("Form Peminjaman");
        menuBuku = new JMenuItem("Form Buku");

        menuData.add(menuAnggota);
        menuData.add(menuPeminjaman);
        menuData.add(menuBuku);

        jMenuBar1.add(menuHome);
        jMenuBar1.add(menuData);
        jMenuBar1.add(menuAbout);
        jMenuBar1.add(menuExit);

        setJMenuBar(jMenuBar1);

        // Event Menu
        menuHome.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                showHome();
            }
        });

        menuAnggota.addActionListener(e -> new FormDataAnggota1().setVisible(true));
        menuPeminjaman.addActionListener(e -> JOptionPane.showMessageDialog(home1.this, "Form Peminjaman belum dibuat"));
        menuBuku.addActionListener(e -> JOptionPane.showMessageDialog(home1.this, "Form Buku belum dibuat"));
        menuAbout.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(home1.this, "Aplikasi Perpustakaan\nVersi 1.0\nDibuat oleh Abudi", "Tentang", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        menuExit.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });

        // Layout JFrame
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );

        setTitle("Home - Aplikasi Perpustakaan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    private void showHome() {
        jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new home1().setVisible(true));
    }
}