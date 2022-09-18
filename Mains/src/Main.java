import Components.DataTerminal.Comments.LaunchPage;
import Components.FIles.FileManager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main implements ActionListener {
    private JMenu menu;
    private JMenu submenu;
    private JMenu menu2;
    private JMenu menu3;
    private JMenu menu4;
    private JMenuItem i2;
    private JMenuItem i3;
    private JMenuItem i4;
    private JMenuItem i5;
    private JButton btn;
    private JButton btn2;
    private JButton btn3;
    private JPanel subPanel = new JPanel();
    private JFrame f = new JFrame();
    private int xDrag = 0;
    private int yDrag = 0;
    private int xPress = 0;
    private int yPress = 0;
    private ImageIcon image;

    public Main() {
        perpareGUI();

    }

    private void perpareGUI() {
//        final JFrame f = new JFrame();
        final Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Admin\\IdeaProjects\\Mains\\src\\libarary\\Image\\Hacking.png");

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new Color(0x123456));
        f.setTitle("Back Door");
        f.setIconImage(icon);
        f.add(subPanel);

        image = resizeImage("C:\\Users\\Admin\\IdeaProjects\\Mains\\src\\libarary\\Image\\Terminal.png", 50, 50);
        ImageIcon Setting = resizeImage("C:\\Users\\Admin\\IdeaProjects\\Mains\\src\\libarary\\Image\\Setting.png", 50, 50);

        JPanel panel = new JPanel();
        panel.setToolTipText("");
        f.add(panel);

        btn = new JButton();
        btn.addActionListener(this);
        btn.setIcon(Setting);
        btn.setBounds(10, 20, 70, 70);
        btn.setBackground(new Color(255, 255, 255, 0));
        btn.setOpaque(false);
        btn.setFocusable(false);
        btn.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btn.addMouseListener(HandleListener(btn));

        btn2 = new JButton();
        btn2.addActionListener(this);
        btn2.setIcon(image);
        btn2.setBounds(10, 120, 70, 70);
        btn2.setFocusable(false);
        btn2.setOpaque(true);
        btn2.setIcon(image);
        btn2.setBackground(new Color(255, 255, 255, 0));
        btn2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btn2.addMouseListener(HandleListener(btn2));

        btn3 = new JButton();
        btn3.addActionListener(this);
        btn3.setIcon(image);
        btn3.setBounds(10, 221, 70, 70);
        btn3.setFocusable(false);
        btn3.setBackground(new Color(255, 255, 255, 0));
        btn3.setOpaque(true);
        btn3.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btn3.addMouseListener(HandleListener(btn3));
        try {
            for (int i = 0; i < btn.getActionListeners().length; i++) {
                if (btn == null) {
                    JOptionPane.showMessageDialog(new JFrame(), "0x10000000", "Lỗi không xác định", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (Setting.getIconWidth() == -1) {
                JOptionPane.showMessageDialog(null, "No image!", "0x9999", JOptionPane.ERROR_MESSAGE);
            } else {
                btn.setIcon(Setting);
            }
        } catch (Error e) {
            System.err.println(e);
            System.exit(1);
        }
        f.add(btn);
        f.add(btn2);
        f.add(btn3);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        final JPopupMenu Clicks = new JPopupMenu();
        JMenuItem view = new JMenuItem("View");
        JMenuItem Sort = new JMenuItem("Sorty by");
        JMenuItem Refeack = new JMenuItem("Refeack");
        Clicks.setPreferredSize(new Dimension(200, 89));
        view.setFont(new Font("Arial", Font.ITALIC, 18));
        Clicks.setForeground(Color.BLUE);
        Clicks.setBackground(new Color(0x123456));
        Clicks.setBorder(BorderFactory.createLineBorder(Color.white,1));
        Clicks.add(view);
        Clicks.add(Sort);
        Clicks.add(Refeack);
        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (int i = 0; i <= e.getClickCount(); i++) {
                    if (SwingUtilities.isRightMouseButton(e) && e.getClickCount() == 1) {
                        Clicks.show(f, e.getX(), e.getY());
                    }
                }
            }
        });
        f.add(Clicks);

        final JMenuBar mb = new JMenuBar();
        mb.setBackground(Color.BLACK);
        mb.setLayout(null);
        // ================ //
        menu = new JMenu("Start");
        menu2 = new JMenu("Terminal");
        menu3 = new JMenu("Home");
        menu4 = new JMenu("Function");

        menu2.setBackground(new Color(0, 0, 0, 4));
        menu2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                LaunchPage launchPage = new LaunchPage();
            }
        });
        menu.setFont(new Font("Arial", Font.ITALIC, 15));
        menu2.setForeground(Color.white);
        menu3.setForeground(Color.white);

        menu4.setForeground(Color.white);
        menu.setForeground(Color.white);

        submenu = new JMenu("Setting");
        submenu.setPreferredSize(new Dimension(100,30));
        JMenuItem i1 = new JMenuItem("Search");
        i2 = new JMenuItem("File");
        i3 = new JMenuItem("Item 3");
        i4 = new JMenuItem("Item 4");
        i5 = new JMenuItem("Shut down");
        i5.addActionListener(e -> {
            f.dispose();
        });
        i2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                FileManager fileManager= new FileManager();
            }
        });
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        mb.add(menu);
        mb.add(menu2);
        mb.add(menu3);
        mb.add(menu4);
        f.addMouseListener(handlerMouseListener());
        f.addMouseMotionListener(handlerMouseMotionListener());
        f.setJMenuBar(mb);
        f.setVisible(true);
        f.setLayout(null);
        f.setPreferredSize(new Dimension(500, 500));
        f.setSize(1200, 900);
        f.pack();
        menu.setMnemonic('C');
    }



    public void attachAnyListener(JComponent component) {
        Component fields[] = component.getComponents();
        for (int i = 0; i < fields.length; i++) {
            if (fields[i] instanceof JComponent) {
                attachAnyListener((JComponent) fields[i]);
            }
            if (fields[i] instanceof JTextField) {
                ((JTextField) fields[i]).addActionListener(this);
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public MouseAdapter HandleListener(JButton button) {
        return new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                button.setOpaque(true);
                button.setBackground(new Color(255, 255, 255, 14));
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                button.setBackground(new Color(255, 255, 255, 10));
                button.setOpaque(true);

                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        int to = 10;
                        int from = 0;
                        while (from != to) {
                            button.setBackground(new Color(255, 255, 255, from));
                            from = from + 1;
                            try {
                                Thread.sleep(10);
                            } catch (InterruptedException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                });
                thread.start();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                button.setOpaque(false);
            }
        };
    }

    public MouseAdapter handlerMouseListener() {
        return new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                xPress = e.getPoint().x;
                yPress = e.getPoint().y;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                subPanel.setOpaque(false);
                subPanel.setVisible(false);
            }
        };
    }

    private MouseMotionAdapter handlerMouseMotionListener() {
        return new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                xDrag = e.getPoint().x;
                yDrag = e.getPoint().y;
                int distanceY = 55, distanceX = 7;
                subPanel.setOpaque(true);
                subPanel.setVisible(true);
                if (xDrag >= xPress && yDrag >= yPress) {
                    subPanel.setBounds(xPress - distanceX, yPress - distanceY, xDrag - xPress, yDrag - yPress);
                } else if (xDrag >= xPress && yPress >= yDrag) {
                    subPanel.setBounds(xPress - distanceX, yDrag - distanceY, xDrag - xPress, yPress - yDrag);
                } else if (xPress >= xDrag && yDrag >= yPress) {
                    subPanel.setBounds(xDrag - distanceX, yPress - distanceY, xPress - xDrag, yDrag - yPress);
                } else if (xPress >= xDrag && yPress >= yDrag) {
                    subPanel.setBounds(xDrag - distanceX, yDrag - distanceY, xPress - xDrag, yPress - yDrag);
                }
               subPanel.setBackground(new Color(25,6,48,3));
                subPanel.setLayout(null);
            }
        };
    }

    public ImageIcon resizeImage(String path, int width, int height) {
        ImageIcon currentIcon = new ImageIcon(path);
        Image setting = currentIcon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
        currentIcon= new ImageIcon(setting);
        return currentIcon;
    };
}