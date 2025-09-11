package tugasformmaster;

import javax.swing.*;
import java.awt.*;

public class Formlogin extends javax.swing.JFrame {

    // String untuk Button
    private static final String TEXT_SIMPAN = "SIMPAN";
    private static final String TEXT_HAPUS  = "HAPUS";
    private static final String TEXT_UBAH   = "UBAH";
    private static final String TEXT_KELUAR = "KELUAR";

    public Formlogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        // Panel utama
        jPanel1 = new JPanel();
        jPanel1.setBackground(new Color(173, 216, 230));

        jLabel1 = new JLabel("Form Login");
        jLabel2 = new JLabel("nama");
        jLabel3 = new JLabel("kelas");
        jLabel9 = new JLabel("kompetensi");
        jLabel4 = new JLabel("alamat");
        jLabel5 = new JLabel("jenis kelamin");

        // Field nama
        jTextField1 = new JTextField(15);
        jTextField2 = new JTextField(15); // untuk menyalin data nama

        // Field kelas
        jTextField4 = new JTextField(15);
        jComboBox2 = new JComboBox<>(new String[] {
            "silahkan pilih kelas", "X", "XI", "XII"
        });

        // Field kompetensi
        jTextField6 = new JTextField(15);
        jComboBox3 = new JComboBox<>(new String[] {
            "silahkan pilih kompetensi", "Rekayasa Perangkat Lunak", "Teknik Komputer Jaringan", "Desain Komunikasi Visual"
        });

        // Alamat
        jTextArea1 = new JTextArea(5, 15);
        jTextArea2 = new JTextArea(5, 15);
        jScrollPane1 = new JScrollPane(jTextArea1);
        jScrollPane2 = new JScrollPane(jTextArea2);

        // Jenis kelamin
        jRadioButton1 = new JRadioButton("Laki-laki");
        jRadioButton2 = new JRadioButton("Perempuan");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(jRadioButton1);
        genderGroup.add(jRadioButton2);

        // Tombol
        jButton4 = new JButton(TEXT_SIMPAN);
        jButton4.setBackground(Color.GREEN);

        jButton1 = new JButton(TEXT_HAPUS);
        jButton1.setBackground(Color.RED);

        jButton2 = new JButton(TEXT_UBAH);
        jButton2.setBackground(Color.CYAN);

        jButton3 = new JButton(TEXT_KELUAR);
        jButton3.setBackground(Color.LIGHT_GRAY);

        // Layout pakai GroupLayout
        GroupLayout layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.CENTER)
            .addComponent(jLabel1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addComponent(jTextField1)
                .addComponent(jTextField2))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addComponent(jComboBox2)
                .addComponent(jTextField4))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addComponent(jComboBox3)
                .addComponent(jTextField6))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addComponent(jScrollPane1)
                .addComponent(jScrollPane2))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addComponent(jRadioButton1)
                .addComponent(jRadioButton2))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton4)
                .addComponent(jButton1)
                .addComponent(jButton2)
                .addComponent(jButton3))
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2).addComponent(jTextField1).addComponent(jTextField2))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3).addComponent(jComboBox2).addComponent(jTextField4))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9).addComponent(jComboBox3).addComponent(jTextField6))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4).addComponent(jScrollPane1).addComponent(jScrollPane2))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5).addComponent(jRadioButton1).addComponent(jRadioButton2))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(jButton4).addComponent(jButton1).addComponent(jButton2).addComponent(jButton3))
        );

        add(jPanel1);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // ===== Logika Tombol =====
        jButton4.addActionListener(e -> { // SIMPAN
            jTextField2.setText(jTextField1.getText()); // copy nama
            jTextField4.setText(jComboBox2.getSelectedItem().toString());
            jTextField6.setText(jComboBox3.getSelectedItem().toString());
            jTextArea2.setText(jTextArea1.getText());

            String gender = jRadioButton1.isSelected() ? "Laki-laki" :
                            jRadioButton2.isSelected() ? "Perempuan" : "Belum dipilih";

            JOptionPane.showMessageDialog(this,
                    "Data berhasil disimpan!\nNama: " + jTextField1.getText() +
                    "\nKelas: " + jComboBox2.getSelectedItem() +
                    "\nKompetensi: " + jComboBox3.getSelectedItem() +
                    "\nAlamat: " + jTextArea1.getText() +
                    "\nJenis Kelamin: " + gender
            );
        });

        jButton1.addActionListener(e -> { // HAPUS
            jTextField1.setText(""); jTextField2.setText("");
            jTextField4.setText(""); jTextField6.setText("");
            jTextArea1.setText(""); jTextArea2.setText("");
            jComboBox2.setSelectedIndex(0); jComboBox3.setSelectedIndex(0);
            genderGroup.clearSelection();
        });

        jButton2.addActionListener(e -> { // UBAH
            JOptionPane.showMessageDialog(this, "Data berhasil diubah!");
        });

        jButton3.addActionListener(e -> System.exit(0)); // KELUAR
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Formlogin().setVisible(true));
    }

    // Variabel
    private JPanel jPanel1;
    private JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel9;
    private JTextField jTextField1, jTextField2, jTextField4, jTextField6;
    private JComboBox<String> jComboBox2, jComboBox3;
    private JTextArea jTextArea1, jTextArea2;
    private JScrollPane jScrollPane1, jScrollPane2;
    private JRadioButton jRadioButton1, jRadioButton2;
    private JButton jButton1, jButton2, jButton3, jButton4;
}
