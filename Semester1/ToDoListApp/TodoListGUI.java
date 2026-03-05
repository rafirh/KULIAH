import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class TodoListGUI extends JFrame {
  private TodoListModel model;
  private JPanel listPanel;
  private JTextField inputField;
  private JButton addButton;
  private JButton clearAllButton;
  private JLabel emptyLabel;

  public TodoListGUI() {
    model = new TodoListModel();
    initializeUI();
  }

  private void initializeUI() {
    setTitle("To Do List App");
    setSize(500, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
    mainPanel.setBackground(new Color(248, 249, 250));
    mainPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

    JLabel headerLabel = new JLabel("My To Do List", SwingConstants.CENTER);
    headerLabel.setFont(new Font("Segoe UI", Font.BOLD, 28));
    headerLabel.setForeground(new Color(33, 37, 41));
    mainPanel.add(headerLabel, BorderLayout.NORTH);

    JPanel centerPanel = new JPanel(new BorderLayout(0, 10));
    centerPanel.setBackground(new Color(248, 249, 250));

    listPanel = new JPanel();
    listPanel.setLayout(new BoxLayout(listPanel, BoxLayout.Y_AXIS));
    listPanel.setBackground(Color.WHITE);
    listPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

    emptyLabel = new JLabel("Belum ada tugas. Tambahkan tugas baru!");
    emptyLabel.setFont(new Font("Segoe UI", Font.ITALIC, 16));
    emptyLabel.setForeground(new Color(108, 117, 125));
    emptyLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
    listPanel.add(Box.createVerticalGlue());
    listPanel.add(emptyLabel);
    listPanel.add(Box.createVerticalGlue());

    JScrollPane scrollPane = new JScrollPane(listPanel);
    scrollPane.setBorder(BorderFactory.createLineBorder(new Color(206, 212, 218), 1));
    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    centerPanel.add(scrollPane, BorderLayout.CENTER);

    mainPanel.add(centerPanel, BorderLayout.CENTER);

    JPanel bottomPanel = new JPanel(new BorderLayout(10, 10));
    bottomPanel.setBackground(new Color(248, 249, 250));

    JPanel inputPanel = new JPanel(new BorderLayout(10, 0));
    inputPanel.setBackground(new Color(248, 249, 250));

    inputField = new JTextField();
    inputField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
    inputField.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(new Color(206, 212, 218), 1),
        BorderFactory.createEmptyBorder(8, 12, 8, 12)));

    addButton = createStyledButton("Tambah", new Color(13, 110, 253), Color.WHITE);

    inputPanel.add(inputField, BorderLayout.CENTER);
    inputPanel.add(addButton, BorderLayout.EAST);

    bottomPanel.add(inputPanel, BorderLayout.NORTH);

    JPanel actionPanel = new JPanel(new GridLayout(1, 1, 10, 0));
    actionPanel.setBackground(new Color(248, 249, 250));

    clearAllButton = createStyledButton("Hapus Semua", new Color(220, 53, 69), Color.WHITE);

    actionPanel.add(clearAllButton);

    bottomPanel.add(actionPanel, BorderLayout.CENTER);

    mainPanel.add(bottomPanel, BorderLayout.SOUTH);

    add(mainPanel);

    addButton.addActionListener(e -> addTodo());
    inputField.addActionListener(e -> addTodo());
    clearAllButton.addActionListener(e -> clearAll());
  }

  private JButton createStyledButton(String text, Color bgColor, Color fgColor) {
    JButton button = new JButton(text);
    button.setFont(new Font("Segoe UI", Font.BOLD, 14));
    button.setBackground(bgColor);
    button.setForeground(fgColor);
    button.setFocusPainted(false);
    button.setBorderPainted(false);
    button.setOpaque(true);
    button.setCursor(new Cursor(Cursor.HAND_CURSOR));
    button.setPreferredSize(new Dimension(120, 40));

    button.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseEntered(MouseEvent e) {
        button.setBackground(bgColor.darker());
      }

      @Override
      public void mouseExited(MouseEvent e) {
        button.setBackground(bgColor);
      }
    });

    return button;
  }

  private Icon createTrashIcon() {
    return new Icon() {
      @Override
      public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);

        g2d.setColor(new Color(220, 53, 69));
        g2d.setStroke(new BasicStroke(2, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

        int offsetX = x + 2;
        int offsetY = y + 2;
        float scale = 0.75f;

        g2d.drawLine(
            offsetX + (int) (4 * scale),
            offsetY + (int) (7 * scale),
            offsetX + (int) (20 * scale),
            offsetY + (int) (7 * scale));

        g2d.drawLine(
            offsetX + (int) (10 * scale),
            offsetY + (int) (11 * scale),
            offsetX + (int) (10 * scale),
            offsetY + (int) (17 * scale));

        g2d.drawLine(
            offsetX + (int) (14 * scale),
            offsetY + (int) (11 * scale),
            offsetX + (int) (14 * scale),
            offsetY + (int) (17 * scale));

        g2d.drawLine(
            offsetX + (int) (5 * scale),
            offsetY + (int) (7 * scale),
            offsetX + (int) (6 * scale),
            offsetY + (int) (19 * scale));

        g2d.drawLine(
            offsetX + (int) (6 * scale),
            offsetY + (int) (19 * scale),
            offsetX + (int) (8 * scale),
            offsetY + (int) (21 * scale));

        g2d.drawLine(
            offsetX + (int) (8 * scale),
            offsetY + (int) (21 * scale),
            offsetX + (int) (16 * scale),
            offsetY + (int) (21 * scale));

        g2d.drawLine(
            offsetX + (int) (16 * scale),
            offsetY + (int) (21 * scale),
            offsetX + (int) (18 * scale),
            offsetY + (int) (19 * scale));

        g2d.drawLine(
            offsetX + (int) (18 * scale),
            offsetY + (int) (19 * scale),
            offsetX + (int) (19 * scale),
            offsetY + (int) (7 * scale));

        g2d.drawLine(
            offsetX + (int) (9 * scale),
            offsetY + (int) (7 * scale),
            offsetX + (int) (9 * scale),
            offsetY + (int) (4 * scale));

        g2d.drawLine(
            offsetX + (int) (9 * scale),
            offsetY + (int) (4 * scale),
            offsetX + (int) (10 * scale),
            offsetY + (int) (3 * scale));

        g2d.drawLine(
            offsetX + (int) (10 * scale),
            offsetY + (int) (3 * scale),
            offsetX + (int) (14 * scale),
            offsetY + (int) (3 * scale));

        g2d.drawLine(
            offsetX + (int) (14 * scale),
            offsetY + (int) (3 * scale),
            offsetX + (int) (15 * scale),
            offsetY + (int) (4 * scale));

        g2d.drawLine(
            offsetX + (int) (15 * scale),
            offsetY + (int) (4 * scale),
            offsetX + (int) (15 * scale),
            offsetY + (int) (7 * scale));

        g2d.dispose();
      }

      @Override
      public int getIconWidth() {
        return 20;
      }

      @Override
      public int getIconHeight() {
        return 20;
      }
    };
  }

  private void addTodo() {
    String task = inputField.getText().trim();
    if (!task.isEmpty()) {
      model.addTodo(task);
      updateList();
      inputField.setText("");
      inputField.requestFocus();
    } else {
      JOptionPane.showMessageDialog(this,
          "Mohon masukkan task terlebih dahulu!",
          "Input Kosong",
          JOptionPane.WARNING_MESSAGE);
    }
  }

  private void deleteTodo(int index) {
    int confirm = JOptionPane.showConfirmDialog(this,
        "Apakah Anda yakin ingin menghapus task ini?",
        "Konfirmasi Hapus",
        JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
      model.removeTodo(index);
      updateList();
    }
  }

  private void clearAll() {
    if (model.getSize() > 0) {
      int confirm = JOptionPane.showConfirmDialog(this,
          "Apakah Anda yakin ingin menghapus semua task?",
          "Konfirmasi Hapus Semua",
          JOptionPane.YES_NO_OPTION);

      if (confirm == JOptionPane.YES_OPTION) {
        model.clearAll();
        updateList();
      }
    } else {
      JOptionPane.showMessageDialog(this,
          "Tidak ada task untuk dihapus!",
          "List Kosong",
          JOptionPane.INFORMATION_MESSAGE);
    }
  }

  private void updateList() {
    listPanel.removeAll();

    if (model.getSize() == 0) {
      emptyLabel.setText("Belum ada tugas. Tambahkan tugas baru!");
      emptyLabel.setFont(new Font("Segoe UI", Font.ITALIC, 16));
      emptyLabel.setForeground(new Color(108, 117, 125));
      listPanel.setLayout(new BoxLayout(listPanel, BoxLayout.Y_AXIS));
      listPanel.add(Box.createVerticalGlue());
      listPanel.add(emptyLabel);
      listPanel.add(Box.createVerticalGlue());
    } else {
      listPanel.setLayout(new BoxLayout(listPanel, BoxLayout.Y_AXIS));

      for (int i = 0; i < model.getTodoItems().size(); i++) {
        TodoItem item = model.getTodoItems().get(i);
        final int index = i;

        JPanel itemPanel = new JPanel(new BorderLayout(5, 0));
        itemPanel.setBackground(Color.WHITE);
        itemPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 45));
        itemPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        itemPanel.setBorder(new EmptyBorder(4, 5, 4, 5));

        JCheckBox checkBox = new JCheckBox(item.getTask());
        checkBox.setSelected(item.isCompleted());
        checkBox.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        checkBox.setBackground(Color.WHITE);
        checkBox.setFocusPainted(false);
        checkBox.setBorder(new EmptyBorder(4, 5, 4, 5));

        if (item.isCompleted()) {
          checkBox.setForeground(new Color(108, 117, 125));
        } else {
          checkBox.setForeground(new Color(33, 37, 41));
        }

        checkBox.addActionListener(e -> {
          model.toggleComplete(index);
          updateList();
        });

        JButton deleteBtn = new JButton(createTrashIcon());
        deleteBtn.setBackground(Color.WHITE);
        deleteBtn.setFocusPainted(false);
        deleteBtn.setBorderPainted(false);
        deleteBtn.setOpaque(true);
        deleteBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        deleteBtn.setPreferredSize(new Dimension(40, 30));
        deleteBtn.setToolTipText("Hapus");

        deleteBtn.addMouseListener(new MouseAdapter() {
          @Override
          public void mouseEntered(MouseEvent e) {
            deleteBtn.setBackground(new Color(255, 240, 240));
          }

          @Override
          public void mouseExited(MouseEvent e) {
            deleteBtn.setBackground(Color.WHITE);
          }
        });

        deleteBtn.addActionListener(e -> deleteTodo(index));

        itemPanel.addMouseListener(new MouseAdapter() {
          @Override
          public void mouseEntered(MouseEvent e) {
            itemPanel.setBackground(new Color(248, 249, 250));
            checkBox.setBackground(new Color(248, 249, 250));
          }

          @Override
          public void mouseExited(MouseEvent e) {
            itemPanel.setBackground(Color.WHITE);
            checkBox.setBackground(Color.WHITE);
          }
        });

        itemPanel.add(checkBox, BorderLayout.CENTER);
        itemPanel.add(deleteBtn, BorderLayout.EAST);

        listPanel.add(itemPanel);
      }

      listPanel.add(Box.createVerticalGlue());
    }

    listPanel.revalidate();
    listPanel.repaint();
  }

  public static void main(String[] args) {
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (Exception e) {
      e.printStackTrace();
    }

    SwingUtilities.invokeLater(() -> {
      TodoListGUI app = new TodoListGUI();
      app.setVisible(true);
    });
  }
}
