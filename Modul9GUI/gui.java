import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class gui extends JFrame {
  private JTextField txtNama, txtTanggalLahir, txtNoPendaftaran, txtNoTelp, txtEmail;
  private JTextArea txtAlamat;
  private JButton btnSubmit, btnReset;

  private static final Color COLOR_BG = new Color(236, 240, 245);
  private static final Color COLOR_HEADER_TOP = new Color(26, 58, 110);
  private static final Color COLOR_HEADER_BOT = new Color(52, 120, 196);
  private static final Color COLOR_CARD = Color.WHITE;
  private static final Color COLOR_ACCENT = new Color(26, 115, 232);
  private static final Color COLOR_ACCENT2 = new Color(234, 67, 53);
  private static final Color COLOR_TEXT = new Color(33, 37, 41);
  private static final Color COLOR_LABEL = new Color(70, 90, 120);
  private static final Color COLOR_BORDER = new Color(200, 215, 230);

  public gui() {
    setTitle("Form Daftar Ulang Mahasiswa Baru");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);

    initUI();
  }

  private void initUI() {
    JPanel root = new JPanel(new BorderLayout()) {
      @Override
      protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        GradientPaint gp = new GradientPaint(0, 0, COLOR_BG, 0, getHeight(), new Color(215, 228, 244));
        g2.setPaint(gp);
        g2.fillRect(0, 0, getWidth(), getHeight());
      }
    };
    root.setOpaque(false);
    setContentPane(root);

    // ---- HEADER ----
    root.add(buildHeader(), BorderLayout.NORTH);

    // ---- FORM CARD ----
    JPanel centerWrapper = new JPanel(new GridBagLayout());
    centerWrapper.setOpaque(false);
    centerWrapper.setBorder(BorderFactory.createEmptyBorder(10, 30, 20, 30));
    centerWrapper.add(buildFormCard());
    root.add(centerWrapper, BorderLayout.CENTER);

    pack();
    setMinimumSize(getSize());
    setLocationRelativeTo(null);
  }

  // ──────────────────────────────────────────────
  // HEADER
  // ──────────────────────────────────────────────
  private JPanel buildHeader() {
    JPanel header = new JPanel(new BorderLayout()) {
      @Override
      protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gp = new GradientPaint(0, 0, COLOR_HEADER_TOP, getWidth(), getHeight(), COLOR_HEADER_BOT);
        g2.setPaint(gp);
        g2.fillRect(0, 0, getWidth(), getHeight());
        g2.dispose();
      }
    };
    header.setPreferredSize(new Dimension(620, 110));

    JPanel textPanel = new JPanel();
    textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
    textPanel.setOpaque(false);
    textPanel.setBorder(BorderFactory.createEmptyBorder(18, 30, 18, 30));

    JLabel lblUniv = new JLabel("UNIVERSITAS NUSANTARA JAYA");
    lblUniv.setFont(new Font("Segoe UI", Font.BOLD, 18));
    lblUniv.setForeground(Color.WHITE);
    lblUniv.setAlignmentX(Component.LEFT_ALIGNMENT);

    JLabel lblForm = new JLabel("Form Daftar Ulang Mahasiswa Baru \u2022 Tahun Akademik 2026/2027");
    lblForm.setFont(new Font("Segoe UI", Font.PLAIN, 12));
    lblForm.setForeground(new Color(190, 220, 255));
    lblForm.setAlignmentX(Component.LEFT_ALIGNMENT);

    JSeparator sep = new JSeparator();
    sep.setForeground(new Color(255, 255, 255, 60));
    sep.setMaximumSize(new Dimension(Integer.MAX_VALUE, 1));

    JLabel lblSub = new JLabel("Lengkapi semua data diri Anda dengan benar dan jelas.");
    lblSub.setFont(new Font("Segoe UI", Font.ITALIC, 11));
    lblSub.setForeground(new Color(170, 210, 255));
    lblSub.setAlignmentX(Component.LEFT_ALIGNMENT);

    textPanel.add(lblUniv);
    textPanel.add(Box.createVerticalStrut(4));
    textPanel.add(sep);
    textPanel.add(Box.createVerticalStrut(4));
    textPanel.add(lblForm);
    textPanel.add(Box.createVerticalStrut(2));
    textPanel.add(lblSub);

    header.add(textPanel, BorderLayout.CENTER);
    return header;
  }

  // ──────────────────────────────────────────────
  // FORM CARD
  // ──────────────────────────────────────────────
  private JPanel buildFormCard() {
    JPanel card = new JPanel(new GridBagLayout()) {
      @Override
      protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(0, 0, 0, 18));
        g2.fillRoundRect(4, 6, getWidth() - 4, getHeight() - 4, 20, 20);
        g2.setColor(COLOR_CARD);
        g2.fillRoundRect(0, 0, getWidth() - 4, getHeight() - 4, 20, 20);
        g2.setColor(COLOR_BORDER);
        g2.setStroke(new BasicStroke(1.2f));
        g2.drawRoundRect(0, 0, getWidth() - 5, getHeight() - 5, 20, 20);
        g2.dispose();
      }
    };
    card.setOpaque(false);

    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(8, 20, 8, 20);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.anchor = GridBagConstraints.WEST;

    int row = 0;

    // Section title
    JLabel secLabel = new JLabel("  \u2022  Data Pribadi Mahasiswa");
    secLabel.setFont(new Font("Segoe UI", Font.BOLD, 13));
    secLabel.setForeground(COLOR_ACCENT);
    secLabel.setOpaque(true);
    secLabel.setBackground(new Color(232, 242, 255));
    secLabel.setBorder(BorderFactory.createCompoundBorder(
        new LineBorder(new Color(180, 210, 245), 1, true),
        BorderFactory.createEmptyBorder(5, 8, 5, 8)));
    gbc.gridx = 0;
    gbc.gridy = row;
    gbc.gridwidth = 2;
    gbc.weightx = 1;
    card.add(secLabel, gbc);
    gbc.gridwidth = 1;
    row++;

    // Nama Lengkap
    txtNama = createStyledField(20);
    addFormRow(card, gbc, row++, "Nama Lengkap", txtNama, false);

    // Tanggal Lahir
    txtTanggalLahir = createStyledField(20);
    txtTanggalLahir.setToolTipText("Contoh: 3 Juli 1996");
    JPanel tglPanel = new JPanel(new BorderLayout(6, 0));
    tglPanel.setOpaque(false);
    tglPanel.add(txtTanggalLahir, BorderLayout.CENTER);
    JLabel tglHint = new JLabel("(DD Bulan YYYY)");
    tglHint.setFont(new Font("Segoe UI", Font.ITALIC, 10));
    tglHint.setForeground(Color.GRAY);
    tglPanel.add(tglHint, BorderLayout.EAST);
    addFormRowComponent(card, gbc, row++, "Tanggal Lahir", tglPanel);

    // No Pendaftaran
    txtNoPendaftaran = createStyledField(20);
    addFormRow(card, gbc, row++, "Nomor Pendaftaran", txtNoPendaftaran, false);

    // No Telp
    txtNoTelp = createStyledField(20);
    addFormRow(card, gbc, row++, "No. Telepon", txtNoTelp, false);

    // Alamat
    txtAlamat = new JTextArea(3, 20);
    txtAlamat.setFont(new Font("Segoe UI", Font.PLAIN, 13));
    txtAlamat.setLineWrap(true);
    txtAlamat.setWrapStyleWord(true);
    txtAlamat.setBackground(new Color(248, 251, 255));
    txtAlamat.setBorder(BorderFactory.createCompoundBorder(
        new LineBorder(COLOR_BORDER, 1, true),
        BorderFactory.createEmptyBorder(6, 10, 6, 10)));
    JScrollPane alamatScroll = new JScrollPane(txtAlamat);
    alamatScroll.setBorder(BorderFactory.createEmptyBorder());
    alamatScroll.setOpaque(false);
    addFormRowComponent(card, gbc, row++, "Alamat", alamatScroll);

    // Email
    txtEmail = createStyledField(20);
    addFormRow(card, gbc, row++, "E-mail", txtEmail, false);

    // Buttons — must follow the same row*2+2 pattern as form fields
    gbc.gridx = 0;
    gbc.gridy = row * 2 + 1;
    gbc.gridwidth = 2;
    gbc.insets = new Insets(18, 20, 16, 20);
    card.add(buildButtonPanel(), gbc);

    return card;
  }

  private JTextField createStyledField(int cols) {
    JTextField field = new JTextField(cols);
    field.setFont(new Font("Segoe UI", Font.PLAIN, 13));
    field.setBackground(new Color(248, 251, 255));
    field.setBorder(BorderFactory.createCompoundBorder(
        new LineBorder(COLOR_BORDER, 1, true),
        BorderFactory.createEmptyBorder(6, 10, 6, 10)));
    field.setPreferredSize(new Dimension(0, 36));
    // Highlight on focus
    field.addFocusListener(new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        field.setBorder(BorderFactory.createCompoundBorder(
            new LineBorder(COLOR_ACCENT, 2, true),
            BorderFactory.createEmptyBorder(5, 9, 5, 9)));
      }

      @Override
      public void focusLost(FocusEvent e) {
        field.setBorder(BorderFactory.createCompoundBorder(
            new LineBorder(COLOR_BORDER, 1, true),
            BorderFactory.createEmptyBorder(6, 10, 6, 10)));
      }
    });
    return field;
  }

  private void addFormRow(JPanel card, GridBagConstraints gbc, int row,
      String labelText, JTextField field, boolean wide) {
    addFormRowComponent(card, gbc, row, labelText, field);
  }

  private void addFormRowComponent(JPanel card, GridBagConstraints gbc, int row,
      String labelText, JComponent comp) {
    gbc.insets = new Insets(6, 20, 2, 20);
    JLabel lbl = new JLabel(labelText);
    lbl.setFont(new Font("Segoe UI", Font.BOLD, 12));
    lbl.setForeground(COLOR_LABEL);
    gbc.gridx = 0;
    gbc.gridy = row * 2 + 1;
    gbc.gridwidth = 2;
    gbc.weightx = 1;
    card.add(lbl, gbc);

    gbc.insets = new Insets(2, 20, 4, 20);
    gbc.gridx = 0;
    gbc.gridy = row * 2 + 2;
    gbc.gridwidth = 2;
    card.add(comp, gbc);
  }

  // ──────────────────────────────────────────────
  // BUTTONS
  // ──────────────────────────────────────────────
  private JPanel buildButtonPanel() {
    JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
    panel.setOpaque(false);

    btnReset = createStyledButton("Reset", new Color(108, 117, 125), Color.WHITE);
    btnSubmit = createStyledButton("Submit \u2192", COLOR_ACCENT, Color.WHITE);

    btnReset.addActionListener(e -> resetForm());
    btnSubmit.addActionListener(e -> handleSubmit());

    panel.add(btnReset);
    panel.add(btnSubmit);
    return panel;
  }

  private JButton createStyledButton(String text, Color bg, Color fg) {
    JButton btn = new JButton(text) {
      @Override
      protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (getModel().isPressed()) {
          g2.setColor(bg.darker());
        } else if (getModel().isRollover()) {
          g2.setColor(bg.brighter());
        } else {
          g2.setColor(bg);
        }
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
        g2.dispose();
        super.paintComponent(g);
      }
    };
    btn.setFont(new Font("Segoe UI", Font.BOLD, 13));
    btn.setForeground(fg);
    btn.setContentAreaFilled(false);
    btn.setBorderPainted(false);
    btn.setFocusPainted(false);
    btn.setOpaque(false);
    btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    btn.setPreferredSize(new Dimension(110, 38));
    return btn;
  }

  // ──────────────────────────────────────────────
  // LOGIC
  // ──────────────────────────────────────────────
  private void handleSubmit() {
    // Validate all fields
    String nama = txtNama.getText().trim();
    String tgl = txtTanggalLahir.getText().trim();
    String noPend = txtNoPendaftaran.getText().trim();
    String noTelp = txtNoTelp.getText().trim();
    String alamat = txtAlamat.getText().trim();
    String email = txtEmail.getText().trim();

    if (nama.isEmpty() || tgl.isEmpty() || noPend.isEmpty() ||
        noTelp.isEmpty() || alamat.isEmpty() || email.isEmpty()) {

      showWarningDialog("Semua kolom harus diisi!\nMohon lengkapi data yang masih kosong.");
      return;
    }

    // Confirmation dialog
    int choice = JOptionPane.showConfirmDialog(
        this,
        "<html><body style='font-family:Segoe UI;font-size:12px;'>" +
            "<b>Konfirmasi Data</b><br><br>" +
            "Apakah anda yakin data yang Anda isi sudah benar?" +
            "</body></html>",
        "Konfirmasi",
        JOptionPane.OK_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE);

    if (choice == JOptionPane.OK_OPTION) {
      showDataWindow(nama, tgl, noPend, noTelp, alamat, email);
    }
    // If CANCEL: do nothing, user goes back to form
  }

  private void showWarningDialog(String message) {
    JDialog dialog = new JDialog(this, "Perhatian", true);
    dialog.setSize(380, 200);
    dialog.setLocationRelativeTo(this);
    dialog.setUndecorated(false);
    dialog.setResizable(false);

    JPanel panel = new JPanel(new BorderLayout(10, 10));
    panel.setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 25));
    panel.setBackground(Color.WHITE);

    JLabel icon = new JLabel("\u26A0");
    icon.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 32));
    icon.setForeground(new Color(255, 180, 0));
    icon.setHorizontalAlignment(SwingConstants.CENTER);

    JLabel msg = new JLabel("<html><div style='text-align:center;font-family:Segoe UI;font-size:12px;'>"
        + message.replace("\n", "<br>") + "</div></html>");
    msg.setHorizontalAlignment(SwingConstants.CENTER);
    msg.setForeground(COLOR_TEXT);

    JButton ok = createStyledButton("OK", COLOR_ACCENT2, Color.WHITE);
    ok.setPreferredSize(new Dimension(80, 34));
    ok.addActionListener(e -> dialog.dispose());

    JPanel btnP = new JPanel(new FlowLayout(FlowLayout.CENTER));
    btnP.setOpaque(false);
    btnP.add(ok);

    panel.add(icon, BorderLayout.NORTH);
    panel.add(msg, BorderLayout.CENTER);
    panel.add(btnP, BorderLayout.SOUTH);
    dialog.setContentPane(panel);
    dialog.setVisible(true);
  }

  private void showDataWindow(String nama, String tgl, String noPend,
      String noTelp, String alamat, String email) {
    JFrame result = new JFrame("Data Mahasiswa");
    result.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    result.setSize(520, 440);
    result.setLocationRelativeTo(this);
    result.setResizable(false);

    JPanel root = new JPanel(new BorderLayout()) {
      @Override
      protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setColor(new Color(240, 245, 252));
        g2.fillRect(0, 0, getWidth(), getHeight());
        g2.dispose();
      }
    };
    root.setOpaque(false);

    // Result header
    JPanel resHeader = new JPanel() {
      @Override
      protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        GradientPaint gp = new GradientPaint(0, 0, COLOR_HEADER_TOP, getWidth(), getHeight(), COLOR_HEADER_BOT);
        g2.setPaint(gp);
        g2.fillRect(0, 0, getWidth(), getHeight());
        g2.dispose();
      }
    };
    resHeader.setPreferredSize(new Dimension(520, 70));
    resHeader.setLayout(new BorderLayout());

    JLabel resTitle = new JLabel("  \u2713  Data Pendaftaran Berhasil Disimpan");
    resTitle.setFont(new Font("Segoe UI", Font.BOLD, 15));
    resTitle.setForeground(Color.WHITE);
    resHeader.add(resTitle, BorderLayout.CENTER);
    JLabel resSub = new JLabel("   Berikut adalah ringkasan data yang telah Anda masukkan.");
    resSub.setFont(new Font("Segoe UI", Font.ITALIC, 11));
    resSub.setForeground(new Color(180, 215, 255));
    resHeader.add(resSub, BorderLayout.SOUTH);

    // Data card
    JPanel dataCard = new JPanel(new GridBagLayout()) {
      @Override
      protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(0, 0, 0, 15));
        g2.fillRoundRect(4, 6, getWidth() - 4, getHeight() - 4, 16, 16);
        g2.setColor(Color.WHITE);
        g2.fillRoundRect(0, 0, getWidth() - 4, getHeight() - 4, 16, 16);
        g2.setColor(new Color(200, 220, 240));
        g2.setStroke(new BasicStroke(1f));
        g2.drawRoundRect(0, 0, getWidth() - 5, getHeight() - 5, 16, 16);
        g2.dispose();
      }
    };
    dataCard.setOpaque(false);
    dataCard.setPreferredSize(new Dimension(460, 290));

    String[][] rows = {
        { "Nama Lengkap", nama },
        { "Tanggal Lahir", tgl },
        { "No. Pendaftaran", noPend },
        { "No. Telepon", noTelp },
        { "Alamat", alamat },
        { "E-mail", email }
    };

    GridBagConstraints gc = new GridBagConstraints();
    gc.insets = new Insets(8, 18, 8, 18);
    gc.anchor = GridBagConstraints.WEST;

    for (int i = 0; i < rows.length; i++) {
      gc.gridx = 0;
      gc.gridy = i;
      gc.weightx = 0.35;
      JLabel key = new JLabel(rows[i][0]);
      key.setFont(new Font("Segoe UI", Font.BOLD, 12));
      key.setForeground(COLOR_LABEL);
      dataCard.add(key, gc);

      gc.gridx = 1;
      gc.gridy = i;
      gc.weightx = 0;
      JLabel sep = new JLabel(" : ");
      sep.setFont(new Font("Segoe UI", Font.PLAIN, 12));
      sep.setForeground(COLOR_LABEL);
      dataCard.add(sep, gc);

      gc.gridx = 2;
      gc.gridy = i;
      gc.weightx = 0.65;
      gc.fill = GridBagConstraints.HORIZONTAL;
      JLabel val = new JLabel("<html><body style='font-family:Segoe UI;font-size:12px;'>" +
          rows[i][1].replace("\n", "<br>") + "</body></html>");
      val.setFont(new Font("Segoe UI", Font.PLAIN, 12));
      val.setForeground(COLOR_TEXT);
      dataCard.add(val, gc);
    }

    // Close button
    JButton btnClose = createStyledButton("Tutup", COLOR_ACCENT2, Color.WHITE);
    btnClose.addActionListener(e -> result.dispose());
    JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 20, 10));
    btnPanel.setOpaque(false);
    btnPanel.add(btnClose);

    JPanel centerWrap = new JPanel(new GridBagLayout());
    centerWrap.setOpaque(false);
    centerWrap.setBorder(BorderFactory.createEmptyBorder(15, 25, 5, 25));
    centerWrap.add(dataCard);

    root.add(resHeader, BorderLayout.NORTH);
    root.add(centerWrap, BorderLayout.CENTER);
    root.add(btnPanel, BorderLayout.SOUTH);
    result.setContentPane(root);
    result.setVisible(true);
  }

  private void resetForm() {
    txtNama.setText("");
    txtTanggalLahir.setText("");
    txtNoPendaftaran.setText("");
    txtNoTelp.setText("");
    txtAlamat.setText("");
    txtEmail.setText("");
    txtNama.requestFocus();
  }

  // ──────────────────────────────────────────────
  // MAIN
  // ──────────────────────────────────────────────
  public static void main(String[] args) {
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (Exception ignored) {
    }

    SwingUtilities.invokeLater(() -> {
      gui frame = new gui();
      frame.setVisible(true);
    });
  }
}
