package aplikasi_perpustakaan;
import javax.swing.*;

class FormDataAnggota1 extends JFrame {

    private JTextField txtNIS, txtNama;
    private JRadioButton rbLaki, rbPerempuan;
    private JComboBox<String> comboKelas, comboKompetensi;
    private JButton btnSimpan, btnBatal;

    public FormDataAnggota1() {
        setTitle("Form Data Anggota");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // hanya close form ini
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new java.awt.Color(173, 216, 230)); 
        add(panel);

        JLabel lblNIS = new JLabel("NIS");
        lblNIS.setBounds(20, 20, 80, 25);
        panel.add(lblNIS);

        txtNIS = new JTextField();
        txtNIS.setBounds(120, 20, 150, 25);
        panel.add(txtNIS);

        JLabel lblNama = new JLabel("NAMA SISWA");
        lblNama.setBounds(20, 60, 100, 25);
        panel.add(lblNama);

        txtNama = new JTextField();
        txtNama.setBounds(120, 60, 150, 25);
        panel.add(txtNama);

        JLabel lblJK = new JLabel("JENIS KELAMIN");
        lblJK.setBounds(20, 100, 100, 25);
        panel.add(lblJK);

        rbLaki = new JRadioButton("Laki-Laki");
        rbLaki.setBounds(120, 100, 100, 25);
        rbPerempuan = new JRadioButton("Perempuan");
        rbPerempuan.setBounds(220, 100, 120, 25);

        ButtonGroup groupJK = new ButtonGroup();
        groupJK.add(rbLaki);
        groupJK.add(rbPerempuan);

        panel.add(rbLaki);
        panel.add(rbPerempuan);

        JLabel lblKelas = new JLabel("KELAS");
        lblKelas.setBounds(20, 140, 100, 25);
        panel.add(lblKelas);

        comboKelas = new JComboBox<>(new String[]{"Pilih kelas", "X", "XI", "XII"});
        comboKelas.setBounds(120, 140, 150, 25);
        panel.add(comboKelas);

        JLabel lblKompetensi = new JLabel("KOMPETENSI");
        lblKompetensi.setBounds(20, 180, 100, 25);
        panel.add(lblKompetensi);

        comboKompetensi = new JComboBox<>(new String[]{"Pilih Kompetensi", "RPL", "TKJ", "DKV", "MM"});
        comboKompetensi.setBounds(120, 180, 150, 25);
        panel.add(comboKompetensi);

        btnSimpan = new JButton("Simpan");
        btnSimpan.setBounds(120, 220, 100, 30);
        btnSimpan.setBackground(new java.awt.Color(0, 255, 0));
        panel.add(btnSimpan);

        btnBatal = new JButton("Batal");
        btnBatal.setBounds(230, 220, 100, 30);
        btnBatal.setBackground(new java.awt.Color(255, 0, 0));
        panel.add(btnBatal);

        btnSimpan.addActionListener(e -> simpanData());
        btnBatal.addActionListener(e -> batalData());
    }

    private void simpanData() {
        String nis = txtNIS.getText();
        String nama = txtNama.getText();
        String jk = rbLaki.isSelected() ? "Laki-Laki" : rbPerempuan.isSelected() ? "Perempuan" : "";
        String kelas = (String) comboKelas.getSelectedItem();
        String kompetensi = (String) comboKompetensi.getSelectedItem();

        JOptionPane.showMessageDialog(this,
                "Data Disimpan:\nNIS: " + nis +
                        "\nNama: " + nama +
                        "\nJenis Kelamin: " + jk +
                        "\nKelas: " + kelas +
                        "\nKompetensi: " + kompetensi);
    }

    private void batalData() {
        txtNIS.setText("");
        txtNama.setText("");
        rbLaki.setSelected(false);
        rbPerempuan.setSelected(false);
        comboKelas.setSelectedIndex(0);
        comboKompetensi.setSelectedIndex(0);
    }
}
