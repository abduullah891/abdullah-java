import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tugas_formmasterdanlogin_nathan extends JFrame {
    private JTextField txtKode1, txtKode2;
    private JTextField txtJudul1, txtJudul2;
    private JTextField txtPengarang1, txtPengarang2;
    private JTextField txtPenerbit1, txtPenerbit2;
    private JTextField txtTahun1, txtTahun2;
    private JTextField txtKategori1, txtKategori2;

    public Tugas_formmasterdanlogin_nathan() {
        setTitle("Form Master Buku Perpustakaan");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelUtama = new JPanel(new GridBagLayout());
        panelUtama.setBackground(Color.YELLOW);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // === Inisialisasi TextField ===
        txtKode1 = new JTextField(10); txtKode2 = new JTextField(10);
        txtJudul1 = new JTextField(10); txtJudul2 = new JTextField(10);
        txtPengarang1 = new JTextField(10); txtPengarang2 = new JTextField(10);
        txtPenerbit1 = new JTextField(10); txtPenerbit2 = new JTextField(10);
        txtTahun1 = new JTextField(10); txtTahun2 = new JTextField(10);
        txtKategori1 = new JTextField(10); txtKategori2 = new JTextField(10);

        // === Tambah ke panel ===
        tambahDuaField(panelUtama, gbc, 0, "kode buku", txtKode1, txtKode2);
        tambahDuaField(panelUtama, gbc, 1, "judul buku", txtJudul1, txtJudul2);
        tambahDuaField(panelUtama, gbc, 2, "pengarang", txtPengarang1, txtPengarang2);
        tambahDuaField(panelUtama, gbc, 3, "penerbit", txtPenerbit1, txtPenerbit2);
        tambahDuaField(panelUtama, gbc, 4, "tahun terbit", txtTahun1, txtTahun2);
        tambahDuaField(panelUtama, gbc, 5, "kategori", txtKategori1, txtKategori2);

        // === Panel Tombol ===
        JPanel panelTombol = new JPanel(new FlowLayout());
        panelTombol.setBackground(Color.YELLOW);

        JButton btnSimpan = new JButton("Simpan");
        btnSimpan.setBackground(Color.GREEN);

        JButton btnUbah = new JButton("ubah");
        btnUbah.setBackground(Color.CYAN);

        JButton btnHapus = new JButton("hapus");
        btnHapus.setBackground(Color.RED);

        JButton btnKeluar = new JButton("keluar");
        btnKeluar.setBackground(Color.GRAY);

        panelTombol.add(btnSimpan);
        panelTombol.add(btnUbah);
        panelTombol.add(btnHapus);
        panelTombol.add(btnKeluar);

        // === Event Tombol ===
        btnSimpan.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,
                "Data Tersimpan:\n" +
                "Kode: " + txtKode1.getText() + " " + txtKode2.getText() + "\n" +
                "Judul: " + txtJudul1.getText() + " " + txtJudul2.getText() + "\n" +
                "Pengarang: " + txtPengarang1.getText() + " " + txtPengarang2.getText() + "\n" +
                "Penerbit: " + txtPenerbit1.getText() + " " + txtPenerbit2.getText() + "\n" +
                "Tahun: " + txtTahun1.getText() + " " + txtTahun2.getText() + "\n" +
                "Kategori: " + txtKategori1.getText() + " " + txtKategori2.getText()
            );
        });

        btnKeluar.addActionListener(e -> System.exit(0));

        setLayout(new BorderLayout());
        add(panelUtama, BorderLayout.CENTER);
        add(panelTombol, BorderLayout.SOUTH);
        setVisible(true);
    }

    private void tambahDuaField(JPanel panel, GridBagConstraints gbc, int y, String labelText, JTextField tf1, JTextField tf2) {
        gbc.gridx = 0;
        gbc.gridy = y;
        panel.add(new JLabel(labelText), gbc);

        gbc.gridx = 1;
        panel.add(tf1, gbc);

        gbc.gridx = 2;
        panel.add(tf2, gbc);
    }

    public static void main(String[] args) {
        new Tugas_formmasterdanlogin_nathan();
    }
}
