//When I wrote this, only God and I understood what I was doing
//Now, God only knows

package finalproject;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Frame2 extends JFrame
{   
    private JLabel background;
    private final ImageIcon backgroundImage;
    private final Image icon;
    private JLabel backgroundLabel;
    
    private static String PLAYER_NAME = "";
    private static long PLAYER_CREDIT = 0;
    private static int BET = 5;
    private static int PREVIOUS_BET = 0;
    private int WIN = 0;
    private static int ROUND = 1;
    private String RESULT = "";
    private final ImageIcon ok;
    private final ImageIcon not;
    private final int[] holdButtons;
    
    private String[] possibleHands = {"Straight Flush", "Four Of A Kind", "Full House", "Flush", "Straight", "Three Of A Kind", "Two Pair", "One Pair"};
    private String[] cards = {"2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "TC", "JC", "QC", "KC", "AC", "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "TD", "JD", "QD", "KD", "AD", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "TH", "JH", "QH", "KH", "AH", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "TS", "JS", "QS", "KS", "AS"};
    private String hand = "";
    private String[] tempHand = {"", "", "", "", ""};
   
    private final static String faces = "AKQJT98765432A";
    private final static String suits = "HDSC";
    
    public Frame2(String name, long balance)
    {
        initComponents();
        
        this.backgroundImage = new ImageIcon(getClass().getClassLoader().getResource("finalproject/images/image_frame2_background.png"));
        this.icon = Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("finalproject/images/image_icon.png"));

        setGUIComponets();
        
        Frame2.PLAYER_NAME = name;
        Frame2.PLAYER_CREDIT = balance;
        
        jLabel4.setText(PLAYER_NAME);
        jLabel5.setText(Long.toString(PLAYER_CREDIT));
        jLabel6.setText(Integer.toString(BET));
        
        jLabel34.setVisible(false);
        
        setDefaultCards();
        
        setWinChart(BET);
        
        this.not = new ImageIcon(getClass().getResource("/finalproject/images/image_not.png"));
        this.ok = new ImageIcon(getClass().getResource("/finalproject/images/image_ok.png"));
        
        holdButtons = new int[5];
        hideHoldButtons();
        setHoldButtonListeners();   
    }
    
    private void setGUIComponets()
    {
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
	background = new JLabel(backgroundImage);
        add(background);
        background.setLayout(new FlowLayout());
        backgroundLabel = new JLabel();
        background.add(backgroundLabel);
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Poker - Dominik Lacković");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Player:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Balance:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Bet:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Change bet:");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("Deal!");
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cash out");
        jButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setToolTipText("");
        jLabel8.setMaximumSize(new java.awt.Dimension(120, 174));
        jLabel8.setMinimumSize(new java.awt.Dimension(120, 174));
        jLabel8.setPreferredSize(new java.awt.Dimension(120, 174));

        jLabel9.setToolTipText("");
        jLabel9.setMaximumSize(new java.awt.Dimension(120, 174));
        jLabel9.setMinimumSize(new java.awt.Dimension(120, 174));
        jLabel9.setPreferredSize(new java.awt.Dimension(120, 174));

        jLabel10.setToolTipText("");
        jLabel10.setMaximumSize(new java.awt.Dimension(120, 174));
        jLabel10.setMinimumSize(new java.awt.Dimension(120, 174));
        jLabel10.setPreferredSize(new java.awt.Dimension(120, 174));

        jLabel11.setToolTipText("");
        jLabel11.setMaximumSize(new java.awt.Dimension(120, 174));
        jLabel11.setMinimumSize(new java.awt.Dimension(120, 174));
        jLabel11.setPreferredSize(new java.awt.Dimension(120, 174));

        jLabel12.setMaximumSize(new java.awt.Dimension(120, 174));
        jLabel12.setMinimumSize(new java.awt.Dimension(120, 174));
        jLabel12.setPreferredSize(new java.awt.Dimension(120, 174));

        jButton5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setPreferredSize(new java.awt.Dimension(80, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton11.setText("All in");
        jButton11.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Select all");
        jButton12.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 204, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("STRAIGHT FLUSH");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 204, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("FOUR OF A KIND");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 204, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("FULL HOUSE");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 204, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("FLUSH");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 204, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("STRAIGHT");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 204, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("THREE OF A KIND");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 204, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("TWO PAIR");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 204, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("ONE PAIR");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 204, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("HIGH CARD");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 204, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("0");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 204, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("0");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 204, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("0");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 204, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("0");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 204, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("0");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 204, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("0");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 204, 0));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("0");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 204, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("0");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 204, 0));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText("0");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 204, 0));
        jLabel34.setText("WIN!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addGap(122, 122, 122)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel33)
                                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(20, 20, 20)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton12))
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(88, 88, 88)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Poker");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //increase bet
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        if(BET < PLAYER_CREDIT)
        {
            BET++;
            jLabel6.setText(Integer.toString(BET));
            setWinChart(BET);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    //decrease bet
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        if(BET > 1)
        {
            BET--;
            jLabel6.setText(Integer.toString(BET));
            setWinChart(BET);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        //minimum bet
        if(BET == 0)
            BET = 1;
        
        if(ROUND == 1)
        {
            if(BET > PLAYER_CREDIT)
            {
                BET = (int) PLAYER_CREDIT;
                PREVIOUS_BET = BET;
                jLabel6.setText(Integer.toString(BET));
            }
                
            PLAYER_CREDIT -= BET;
            PREVIOUS_BET = BET;
            jLabel5.setText(Long.toString(PLAYER_CREDIT));
            jLabel6.setText(Integer.toString(BET));
            
            setWinChart(BET);
            
            jLabel14.setText("");
            showHoldButtons();
            setDealLabel();
            setButtonImages();
            
            dealCards();
            
            setCardsImages();
            
            copyFirstFiveCards();
            
            String preHand = tempHand[0] + " " + tempHand[1] + " " + tempHand[2] + " " + tempHand[3] + " " + tempHand[4];
            RESULT = analyzeHand(preHand.split(" "));
            jLabel14.setText(RESULT);
          
            ROUND = 2;
        }   
        else
        {
            hideHoldButtons();
            setDealLabel();
            redeal();
            copyReplacedCards();
            
            RESULT = analyzeHand(hand.split(" "));
            
            jLabel14.setText(RESULT);
            
            calculateResult();
            jLabel5.setText(Long.toString(PLAYER_CREDIT));
            
            if(PLAYER_CREDIT == 0)
            {
                Thread t = new Thread(new PlaySound("sound_fail.wav"));
                t.start();
                Frame3 f3 = new Frame3(2, PLAYER_CREDIT);
                f3.setVisible(rootPaneCheckingEnabled);
                dispose();
            }
            
            setButtonImages();
            
            ROUND = 1;
            
            if(!"High Card".equals(RESULT))
            {
                Thread t = new Thread(new WinEffect(WIN));
                t.start();
                Thread t2 = new Thread(new PlaySound("sound_youwin.wav"));
                t2.start();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton4ActionPerformed
    {//GEN-HEADEREND:event_jButton4ActionPerformed
        if(PLAYER_CREDIT > 1)
        {
            Thread t = new Thread(new PlaySound("sound_congratulations.wav"));
            t.start();
            Frame3 f3 = new Frame3(1, PLAYER_CREDIT);
            f3.setVisible(rootPaneCheckingEnabled);
            dispose();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton5ActionPerformed
    {//GEN-HEADEREND:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton7ActionPerformed
    {//GEN-HEADEREND:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton9ActionPerformed
    {//GEN-HEADEREND:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton11ActionPerformed
    {//GEN-HEADEREND:event_jButton11ActionPerformed
        BET = (int) PLAYER_CREDIT;
        jLabel6.setText(Integer.toString(BET));
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton12ActionPerformed
    {//GEN-HEADEREND:event_jButton12ActionPerformed
        for(int i = 0; i < 5; i++)
            holdButtons[i] = 1;
        
        jButton5.setIcon(ok);
        jButton6.setIcon(ok);
        jButton7.setIcon(ok);
        jButton8.setIcon(ok);
        jButton9.setIcon(ok);
    }//GEN-LAST:event_jButton12ActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(() ->
        {
            new Frame2(PLAYER_NAME, PLAYER_CREDIT).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    public static javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void setDefaultCards()
    {
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/Cards/foi.png")));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/Cards/foi.png")));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/Cards/foi.png")));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/Cards/foi.png")));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/Cards/foi.png")));
    }

    private void setButtonImages()
    {
        jButton5.setIcon(not);
        
        
        jButton6.setIcon(not);
        holdButtons[1] = 0;
        
        jButton7.setIcon(not);
        holdButtons[2] = 0;
        
        jButton8.setIcon(not);
        holdButtons[3] = 0;
        
        jButton9.setIcon(not);
        holdButtons[4] = 0;
    }

    private void setHoldButtonListeners()
    {
        jButton5.addActionListener((ActionEvent e) ->
        {
            if(holdButtons[0] == 0)
            {
                jButton5.setIcon(ok);
                holdButtons[0] = 1;
            }
            else
            {
                jButton5.setIcon(not);
                holdButtons[0] = 0;
            }
        });
        
        jButton6.addActionListener((ActionEvent e) ->
        {
            if(holdButtons[1] == 0)
            {
                jButton6.setIcon(ok);
                holdButtons[1] = 1;
            }
            else
            {
                jButton6.setIcon(not);
                holdButtons[1] = 0;
            }
        });
        
        jButton7.addActionListener((ActionEvent e) ->
        {
            if(holdButtons[2] == 0)
            {
                jButton7.setIcon(ok);
                holdButtons[2] = 1;
            }
            else
            {
                jButton7.setIcon(not);
                holdButtons[2] = 0;
            }
        });
        
        jButton8.addActionListener((ActionEvent e) ->
        {
            if(holdButtons[3] == 0)
            {
                jButton8.setIcon(ok);
                holdButtons[3] = 1;
            }
            else
            {
                jButton8.setIcon(not);
                holdButtons[3] = 0;
            }
        });
        
        jButton9.addActionListener((ActionEvent e) ->
        {
            if(holdButtons[4] == 0)
            {
                jButton9.setIcon(ok);
                holdButtons[4] = 1;
            }
            else
            {
                jButton9.setIcon(not);
                holdButtons[4] = 0;
            }
        });
    }
    
    private void dealCards()
    {
        Collections.shuffle(Arrays.asList(cards));
    }
    
    //if set 1 -> keep card, else get new card
    private void redeal()
    {
        if(holdButtons[0] == 1)
            jLabel8.setIcon(new ImageIcon(getClass().getResource("/finalproject/images/Cards/" + cards[0] + ".png")));
        else
            jLabel8.setIcon(new ImageIcon(getClass().getResource("/finalproject/images/Cards/" + cards[5] + ".png")));      
        
        if(holdButtons[1] == 1)
            jLabel9.setIcon(new ImageIcon(getClass().getResource("/finalproject/images/Cards/" + cards[1] + ".png")));
        else
            jLabel9.setIcon(new ImageIcon(getClass().getResource("/finalproject/images/Cards/" + cards[6] + ".png")));
        
        if(holdButtons[2] == 1) 
            jLabel10.setIcon(new ImageIcon(getClass().getResource("/finalproject/images/Cards/" + cards[2] + ".png")));
        else
            jLabel10.setIcon(new ImageIcon(getClass().getResource("/finalproject/images/Cards/" + cards[7] + ".png")));
        
        if(holdButtons[3] == 1)
            jLabel11.setIcon(new ImageIcon(getClass().getResource("/finalproject/images/Cards/" + cards[3] + ".png")));
        else
            jLabel11.setIcon(new ImageIcon(getClass().getResource("/finalproject/images/Cards/" + cards[8] + ".png")));
        
        if(holdButtons[4] == 1)
            jLabel12.setIcon(new ImageIcon(getClass().getResource("/finalproject/images/Cards/" + cards[4] + ".png")));
        else
            jLabel12.setIcon(new ImageIcon(getClass().getResource("/finalproject/images/Cards/" + cards[9] + ".png")));
    }
    
    private void setWinChart(int bet)
    {
        jLabel25.setText("" + bet * 50);
        jLabel26.setText("" + bet * 25);
        jLabel27.setText("" + bet * 9);
        jLabel28.setText("" + bet * 6);
        jLabel29.setText("" + bet * 4);
        jLabel30.setText("" + bet * 3);
        jLabel31.setText("" + bet * 2);
        jLabel32.setText("" + bet * 1);
    }
        
    private void setCardsImages()
    {
        jLabel8.setIcon(new ImageIcon(getClass().getResource("/finalproject/images/Cards/" + cards[0] + ".png")));
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/finalproject/images/Cards/" + cards[1] + ".png")));
        jLabel10.setIcon(new ImageIcon(getClass().getResource("/finalproject/images/Cards/" + cards[2] + ".png")));
        jLabel11.setIcon(new ImageIcon(getClass().getResource("/finalproject/images/Cards/" + cards[3] + ".png")));
        jLabel12.setIcon(new ImageIcon(getClass().getResource("/finalproject/images/Cards/" + cards[4] + ".png")));
    }
    
    private void setDealLabel()
    {
        if(ROUND == 1)
            jLabel13.setText("1st deal");
        else
            jLabel13.setText("2nd deal");
    }
    
    private void hideHoldButtons()
    {
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
    }
    
    private void showHoldButtons()
    {
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        jButton7.setVisible(true);
        jButton8.setVisible(true);
        jButton9.setVisible(true);
    }
    
    private void copyFirstFiveCards()
    {
        System.arraycopy(cards, 0, tempHand, 0, 5);
    }
    
    private void copyReplacedCards()
    {
        if(holdButtons[0] == 0)
            tempHand[0] = cards[5];
        if(holdButtons[1] == 0)
            tempHand[1] = cards[6];
        if(holdButtons[2] == 0)
            tempHand[2] = cards[7];
        if(holdButtons[3] == 0)
            tempHand[3] = cards[8];
        if(holdButtons[4] == 0)
            tempHand[4] = cards[9];
        
        hand = tempHand[0] + " " + tempHand[1] + " " + tempHand[2] + " " + tempHand[3] + " " + tempHand[4];
    }
    
    public static String analyzeHand(final String[] hand)
    {
        boolean straight = false;
        boolean flush = false;
        
        if(hand.length != 5)
            return "Invalid hand: Wrong number of cards";
 
        if(new HashSet<>(Arrays.asList(hand)).size() != hand.length)
            return "Invalid hand: Duplicates";
        
        int[] rankCount = new int[faces.length()];
        
        int[] suitCount = new int[4];
        
        for(String card : hand)
        {
            //straight
            int rank = faces.indexOf(card.charAt(0));
            if (rank == -1)
                return "Invalid hand: Non existing face";
            
            rankCount[rank]++;
            
            if(rankCount[0] != 0)
            {
                rankCount[13] = 1;
            }
                
            
            //flush
            int suit = suits.indexOf(card.charAt(1));
            if (suit == -1)
                return "Invalid hand: Non existing suit";
            
            suitCount[suit]++;
        }
        
        //flush?
        for(int i : suitCount)
            if(i == 5)
                flush = true;
        
        //straight?
        int straightCounter = 0;
        for(int i : rankCount)
            if(i != 0)
                straightCounter++;
            else
            {
                if(straightCounter > 4)
                    straightCounter++;
                else
                    straightCounter = 0;
            }
        
        if(straightCounter >= 5)
            straight = true;
       
        if(straight && flush)
            return "Straight Flush";
 
        int total = 0;
        for(int count : rankCount)
        {
            if(count == 4)
                return "Four Of A Kind";
            if(count == 3)
                total += 3;
            else if(count == 2)
                total += 2;
        }
 
        if (total == 5)
            return "Full House";
 
        if (flush)
            return "Flush";
 
        if (straight)
            return "Straight";
 
        if (total == 3)
            return "Three Of A Kind";
 
        if (total == 4)
            return "Two Pair";
 
        if (total == 2)
            return "One Pair";
 
        return "High Card";
    }
    
    private void calculateResult()
    {
        switch(RESULT)
        {
            case "Straight Flush":
                WIN = PREVIOUS_BET * 50;
                PLAYER_CREDIT += WIN;
                break;
            case "Four Of A Kind":
                WIN = PREVIOUS_BET * 25;
                PLAYER_CREDIT += WIN;
                break;
            case "Full House":
                WIN = PREVIOUS_BET * 9;
                PLAYER_CREDIT += WIN;
                break;
            case "Flush":
                WIN = PREVIOUS_BET * 6;
                PLAYER_CREDIT += WIN;
                break;
            case "Straight":
                WIN = PREVIOUS_BET * 4;
                PLAYER_CREDIT += WIN;
                break;
            case "Three Of A Kind":
                WIN = PREVIOUS_BET * 3;
                PLAYER_CREDIT += WIN;
                break;
            case "Two Pair":
                WIN = PREVIOUS_BET * 2;
                PLAYER_CREDIT += WIN;
                break;
            case "One Pair":
                WIN = PREVIOUS_BET;
                PLAYER_CREDIT += WIN;
                break;
            default:
                
        }
    }
}
