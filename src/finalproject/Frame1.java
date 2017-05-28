//When I wrote this, only God and I understood what I was doing
//Now, God only knows

package finalproject;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.UnsupportedLookAndFeelException;

public class Frame1 extends JFrame implements KeyListener
{
    private JLabel background;
    private final ImageIcon backgroundImage;
    private final Image icon;
    private JLabel backgroundLabel;
    
    private final int MIN_CREDIT = 5;
    private final int MAX_CREDIT = 1000;

    public Frame1() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException
    {
        initComponents();
        
        this.backgroundImage = new ImageIcon(getClass().getClassLoader().getResource("finalproject/images/image_frame1_background.png"));
        this.icon = Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("finalproject/images/image_icon.png"));

        setGUIComponets();
        
        textFieldStartBalance.addActionListener((ActionEvent e) ->
        {
            runGame();
        });
       
        textFieldPlayerName.addActionListener((ActionEvent e) ->
        {
            runGame();
        });
       
        buttonPlay.addKeyListener(this);
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

        buttonPlay = new javax.swing.JButton();
        textFieldPlayerName = new javax.swing.JTextField();
        textFieldStartBalance = new javax.swing.JTextField();
        labelPlayerName = new javax.swing.JLabel();
        labelStartBalance = new javax.swing.JLabel();
        lableErrorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Poker - Dominik Lacković");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("Poker"); // NOI18N
        setPreferredSize(new java.awt.Dimension(576, 360));
        setResizable(false);
        setSize(new java.awt.Dimension(576, 360));

        buttonPlay.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buttonPlay.setText("Play!");
        buttonPlay.setMaximumSize(new java.awt.Dimension(70, 32));
        buttonPlay.setMinimumSize(new java.awt.Dimension(70, 32));
        buttonPlay.setPreferredSize(new java.awt.Dimension(70, 32));
        buttonPlay.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonPlayActionPerformed(evt);
            }
        });

        textFieldPlayerName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        textFieldPlayerName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldPlayerName.setToolTipText("Name");
        textFieldPlayerName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textFieldPlayerName.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                textFieldPlayerNameActionPerformed(evt);
            }
        });

        textFieldStartBalance.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        textFieldStartBalance.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldStartBalance.setToolTipText("Balance");
        textFieldStartBalance.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textFieldStartBalance.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                textFieldStartBalanceActionPerformed(evt);
            }
        });

        labelPlayerName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelPlayerName.setForeground(new java.awt.Color(255, 255, 255));
        labelPlayerName.setText("Player's name");

        labelStartBalance.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelStartBalance.setForeground(new java.awt.Color(255, 255, 255));
        labelStartBalance.setText("Starting balance");

        lableErrorMessage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lableErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        lableErrorMessage.setMaximumSize(new java.awt.Dimension(200, 20));
        lableErrorMessage.setMinimumSize(new java.awt.Dimension(200, 20));
        lableErrorMessage.setPreferredSize(new java.awt.Dimension(200, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(960, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lableErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(labelPlayerName)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFieldStartBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(labelStartBalance)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPlayerName)
                    .addComponent(labelStartBalance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldStartBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonPlay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lableErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(631, 631, 631))
        );

        textFieldPlayerName.getAccessibleContext().setAccessibleName("");

        getAccessibleContext().setAccessibleName("Poker");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void runGame()
    {
        if(isValidInput())
        {
            Thread t = new Thread(new PlaySound("sound_coins.wav"));
            t.start();
            
            Frame2 f2 = new Frame2(textFieldPlayerName.getText(), Integer.parseInt(textFieldStartBalance.getText()));
            f2.setVisible(rootPaneCheckingEnabled);
            dispose();
        }
        
        if(textFieldPlayerName.getText().isEmpty())
        {
            Thread t = new Thread(new ErrorLog("Please enter your name!"));
            t.start();
        }
        else if(textFieldStartBalance.getText().isEmpty())
        {
            Thread t = new Thread(new ErrorLog("Please enter starting balance!"));
            t.start();
        }
    }
    
    private boolean isValidInput()
    {
        return (!(textFieldPlayerName.getText().isEmpty() && textFieldStartBalance.getText().isEmpty()) && (isInteger(textFieldStartBalance.getText())));
    }

    private void buttonPlayActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonPlayActionPerformed
    {//GEN-HEADEREND:event_buttonPlayActionPerformed
        runGame();
    }//GEN-LAST:event_buttonPlayActionPerformed

    private void textFieldStartBalanceActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_textFieldStartBalanceActionPerformed
    {//GEN-HEADEREND:event_textFieldStartBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldStartBalanceActionPerformed

    private void textFieldPlayerNameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_textFieldPlayerNameActionPerformed
    {//GEN-HEADEREND:event_textFieldPlayerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPlayerNameActionPerformed
    
    public boolean isInteger(String s)
    {
        try
        {
            int num = Integer.parseInt(s);
            if(num < MIN_CREDIT || num > MAX_CREDIT)
            {
                Thread t = new Thread(new ErrorLog("Must be between 5 and 1000!"));
                t.start();
                return false;
            }    
            else
            {
                return true;
            }
                
        }
        catch(Exception e)
        {
            Thread t = new Thread(new ErrorLog("Balance have to be a number!"));
            t.start();
            return false;
        }
    }
    
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(() ->
        {
            try
            {
                new Frame1().setVisible(true);
            }
            catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex)
            {
                Logger.getLogger(Frame1.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPlay;
    private javax.swing.JLabel labelPlayerName;
    private javax.swing.JLabel labelStartBalance;
    public static javax.swing.JLabel lableErrorMessage;
    private javax.swing.JTextField textFieldPlayerName;
    private javax.swing.JTextField textFieldStartBalance;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_ENTER)
        {
            runGame();
        }
            
    }
    
    @Override
    public void keyTyped(KeyEvent ke)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
