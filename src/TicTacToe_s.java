/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author divaskararulmozhi
 */
public class TicTacToe_s extends javax.swing.JFrame {
    
    private String startGame="x";
    private int xCount = 0;
    
    private int oCount = 0;
    boolean c1=true;
    boolean c2=true;
    boolean c3=true;
    boolean c4=true;
    boolean c5=true;
    boolean c6=true;
    boolean c7=true;
    boolean c8=true;
    boolean c9=true;
    /**
     * Creates new form TicTacToe_s
     */
    public TicTacToe_s() {
        initComponents();
        jButton1.setText (" ");
    jButton2.setText (" ");
    jButton3.setText (" ");
    
    jButton4.setText (" ");
    jButton5.setText (" ");
    jButton6.setText (" ");
    
    jButton7.setText (" ");
    jButton8.setText (" ");
    jButton9.setText (" ");
        setSize(700,550);
        setLocationRelativeTo(null);
        
        
    }
 private void gameScore()
{
    jlblPlayerX.setText (String.valueOf(xCount));
    jlblPlayerO.setText (String.valueOf (oCount));
}    

private void choose_a_Player()
{
    if (startGame.equalsIgnoreCase ("x"))
    {
        startGame="o";
    }
    else
    {
        startGame = "x";
    }
}



 private void winningGame()
{
    String b1 =jButton1.getText();
    String b2 =jButton2.getText();
    String b3 =jButton3.getText();
    String b4 =jButton4.getText();
    String b5 =jButton5.getText();
    String b6 =jButton6.getText();
    String b7 =jButton7.getText();
    String b8 =jButton8.getText();
    String b9 =jButton9.getText();
    if (b1 == ("x") && b2 == ("x") && b3 ==("x"))
    {
        JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        gameScore();
        
        if(b1==" ")
        b1="_";
        if(b2==" ")
        b2="_";
        if(b3==" ")
        b3="_";
        if(b4==" ")
        b4="_";
        if(b5==" ")
        b5="_";
        if(b6==" ")
        b6="_";
        if(b7==" ")
        b7="_";
        if(b8==" ")
        b8="_";
        if(b9==" ")
        b9="_";
        //getter(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        String s=""+b1+" "+b2+" "+b3+"\n"+b4+" "+b5+" "+b6+"\n"+b7+" "+b8+" "+b9;
        ai.game_tree(s);
        ai.display();
        jButton1.setBackground(Color.YELLOW);
        jButton2.setBackground(Color.YELLOW);
        jButton3.setBackground(Color.YELLOW);

    }
    
    else if (b4 == ("x") && b5 == ("x") && b6 ==("x"))
    {
        JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        gameScore();
        
        if(b1==" ")
        b1="_";
        if(b2==" ")
        b2="_";
        if(b3==" ")
        b3="_";
        if(b4==" ")
        b4="_";
        if(b5==" ")
        b5="_";
        if(b6==" ")
        b6="_";
        if(b7==" ")
        b7="_";
        if(b8==" ")
        b8="_";
        if(b9==" ")
        b9="_";
        //getter(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        String s=""+b1+" "+b2+" "+b3+"\n"+b4+" "+b5+" "+b6+"\n"+b7+" "+b8+" "+b9;
        ai.game_tree(s);
        ai.display();
        jButton4.setBackground(Color.YELLOW);
        jButton5.setBackground(Color.YELLOW);
        jButton6.setBackground(Color.YELLOW);
    }
    
    else if (b7 == ("x") && b8 == ("x") && b9 ==("x"))
    {
        JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        gameScore();
        
        if(b1==" ")
        b1="_";
        if(b2==" ")
        b2="_";
        if(b3==" ")
        b3="_";
        if(b4==" ")
        b4="_";
        if(b5==" ")
        b5="_";
        if(b6==" ")
        b6="_";
        if(b7==" ")
        b7="_";
        if(b8==" ")
        b8="_";
        if(b9==" ")
        b9="_";
        //getter(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        String s=""+b1+" "+b2+" "+b3+"\n"+b4+" "+b5+" "+b6+"\n"+b7+" "+b8+" "+b9;
        ai.game_tree(s);
        ai.display();
        jButton7.setBackground(Color.YELLOW);
        jButton8.setBackground(Color.YELLOW);
        jButton9.setBackground(Color.YELLOW);
    }
    
    else if (b1 == ("x") && b4 == ("x") && b7 ==("x"))
    {
        JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        gameScore();
        
        if(b1==" ")
        b1="_";
        if(b2==" ")
        b2="_";
        if(b3==" ")
        b3="_";
        if(b4==" ")
        b4="_";
        if(b5==" ")
        b5="_";
        if(b6==" ")
        b6="_";
        if(b7==" ")
        b7="_";
        if(b8==" ")
        b8="_";
        if(b9==" ")
        b9="_";
        //getter(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        String s=""+b1+" "+b2+" "+b3+"\n"+b4+" "+b5+" "+b6+"\n"+b7+" "+b8+" "+b9;
        ai.game_tree(s);
        ai.display();
        jButton1.setBackground(Color.YELLOW);
        jButton4.setBackground(Color.YELLOW);
        jButton7.setBackground(Color.YELLOW);
    }
    
    else if (b2 == ("x") && b5 == ("x") && b8 ==("x"))
    {
        JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        jButton1.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton9.setEnabled(false);
        gameScore();
        
        if(b1==" ")
        b1="_";
        if(b2==" ")
        b2="_";
        if(b3==" ")
        b3="_";
        if(b4==" ")
        b4="_";
        if(b5==" ")
        b5="_";
        if(b6==" ")
        b6="_";
        if(b7==" ")
        b7="_";
        if(b8==" ")
        b8="_";
        if(b9==" ")
        b9="_";
        //getter(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        String s=""+b1+" "+b2+" "+b3+"\n"+b4+" "+b5+" "+b6+"\n"+b7+" "+b8+" "+b9;
        ai.game_tree(s);
        ai.display();
        jButton2.setBackground(Color.YELLOW);
        jButton5.setBackground(Color.YELLOW);
        jButton8.setBackground(Color.YELLOW);
    }
    
    else if (b3 == ("x") && b6 == ("x") && b9 ==("x"))
    {
        JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        gameScore();
        
        if(b1==" ")
        b1="_";
        if(b2==" ")
        b2="_";
        if(b3==" ")
        b3="_";
        if(b4==" ")
        b4="_";
        if(b5==" ")
        b5="_";
        if(b6==" ")
        b6="_";
        if(b7==" ")
        b7="_";
        if(b8==" ")
        b8="_";
        if(b9==" ")
        b9="_";
        //getter(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        String s=""+b1+" "+b2+" "+b3+"\n"+b4+" "+b5+" "+b6+"\n"+b7+" "+b8+" "+b9;
        ai.game_tree(s);
        ai.display();
        jButton3.setBackground(Color.YELLOW);
        jButton6.setBackground(Color.YELLOW);
        jButton9.setBackground(Color.YELLOW);
    }
    
    else if (b1 == ("x") && b5 == ("x") && b9 ==("x"))
    {
        JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        gameScore();
        
        if(b1==" ")
        b1="_";
        if(b2==" ")
        b2="_";
        if(b3==" ")
        b3="_";
        if(b4==" ")
        b4="_";
        if(b5==" ")
        b5="_";
        if(b6==" ")
        b6="_";
        if(b7==" ")
        b7="_";
        if(b8==" ")
        b8="_";
        if(b9==" ")
        b9="_";
        //getter(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        String s=""+b1+" "+b2+" "+b3+"\n"+b4+" "+b5+" "+b6+"\n"+b7+" "+b8+" "+b9;
        ai.game_tree(s);
        ai.display();
        jButton1.setBackground(Color.YELLOW);
        jButton5.setBackground(Color.YELLOW);
        jButton9.setBackground(Color.YELLOW);
    }
    
    else if (b3 == ("x") && b5 == ("x") && b7 ==("x"))
    {
        JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton4.setEnabled(false);
        jButton6.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        gameScore();
        
        if(b1==" ")
        b1="_";
        if(b2==" ")
        b2="_";
        if(b3==" ")
        b3="_";
        if(b4==" ")
        b4="_";
        if(b5==" ")
        b5="_";
        if(b6==" ")
        b6="_";
        if(b7==" ")
        b7="_";
        if(b8==" ")
        b8="_";
        if(b9==" ")
        b9="_";
        //getter(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        String s=""+b1+" "+b2+" "+b3+"\n"+b4+" "+b5+" "+b6+"\n"+b7+" "+b8+" "+b9;
        ai.game_tree(s);
        ai.display();
        jButton3.setBackground(Color.YELLOW);
        jButton5.setBackground(Color.YELLOW);
        jButton7.setBackground(Color.YELLOW);
        
    }
    
    
    
    
    else if (b1 == ("o") && b2 == ("o") && b3 ==("o"))
    {
        JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        gameScore();
        
        if(b1==" ")
        b1="_";
        if(b2==" ")
        b2="_";
        if(b3==" ")
        b3="_";
        if(b4==" ")
        b4="_";
        if(b5==" ")
        b5="_";
        if(b6==" ")
        b6="_";
        if(b7==" ")
        b7="_";
        if(b8==" ")
        b8="_";
        if(b9==" ")
        b9="_";
        //getter(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        String s=""+b1+" "+b2+" "+b3+"\n"+b4+" "+b5+" "+b6+"\n"+b7+" "+b8+" "+b9;
        ai.game_tree(s);
        ai.display();
        jButton1.setBackground(Color.CYAN);
        jButton2.setBackground(Color.CYAN);
        jButton3.setBackground(Color.CYAN);

    }
    
    else if (b4 == ("o") && b5 == ("o") && b6 ==("o"))
    {
        JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        gameScore();
        
        if(b1==" ")
        b1="_";
        if(b2==" ")
        b2="_";
        if(b3==" ")
        b3="_";
        if(b4==" ")
        b4="_";
        if(b5==" ")
        b5="_";
        if(b6==" ")
        b6="_";
        if(b7==" ")
        b7="_";
        if(b8==" ")
        b8="_";
        if(b9==" ")
        b9="_";
        //getter(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        String s=""+b1+" "+b2+" "+b3+"\n"+b4+" "+b5+" "+b6+"\n"+b7+" "+b8+" "+b9;
        ai.game_tree(s);
        ai.display();
        jButton4.setBackground(Color.CYAN);
        jButton5.setBackground(Color.CYAN);
        jButton6.setBackground(Color.CYAN);

    }
    
    else if (b7 == ("o") && b8 == ("o") && b9 ==("o"))
    {
        JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        gameScore();
        
        if(b1==" ")
        b1="_";
        if(b2==" ")
        b2="_";
        if(b3==" ")
        b3="_";
        if(b4==" ")
        b4="_";
        if(b5==" ")
        b5="_";
        if(b6==" ")
        b6="_";
        if(b7==" ")
        b7="_";
        if(b8==" ")
        b8="_";
        if(b9==" ")
        b9="_";
        //getter(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        String s=""+b1+" "+b2+" "+b3+"\n"+b4+" "+b5+" "+b6+"\n"+b7+" "+b8+" "+b9;
        ai.game_tree(s);
        ai.display();
        jButton7.setBackground(Color.CYAN);
        jButton8.setBackground(Color.CYAN);
        jButton9.setBackground(Color.CYAN);

    }
    
    else if (b1 == ("o") && b4 == ("o") && b7 ==("o"))
    {
        JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        gameScore();
        
        if(b1==" ")
        b1="_";
        if(b2==" ")
        b2="_";
        if(b3==" ")
        b3="_";
        if(b4==" ")
        b4="_";
        if(b5==" ")
        b5="_";
        if(b6==" ")
        b6="_";
        if(b7==" ")
        b7="_";
        if(b8==" ")
        b8="_";
        if(b9==" ")
        b9="_";
        //getter(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        String s=""+b1+" "+b2+" "+b3+"\n"+b4+" "+b5+" "+b6+"\n"+b7+" "+b8+" "+b9;
        ai.game_tree(s);
        ai.display();
        jButton1.setBackground(Color.CYAN);
        jButton4.setBackground(Color.CYAN);
        jButton7.setBackground(Color.CYAN);

    }
    
    else if (b2 == ("o") && b5 == ("o") && b8 ==("o"))
    {
        JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        jButton1.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton9.setEnabled(false);
        gameScore();
        
        if(b1==" ")
        b1="_";
        if(b2==" ")
        b2="_";
        if(b3==" ")
        b3="_";
        if(b4==" ")
        b4="_";
        if(b5==" ")
        b5="_";
        if(b6==" ")
        b6="_";
        if(b7==" ")
        b7="_";
        if(b8==" ")
        b8="_";
        if(b9==" ")
        b9="_";
        //getter(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        String s=""+b1+" "+b2+" "+b3+"\n"+b4+" "+b5+" "+b6+"\n"+b7+" "+b8+" "+b9;
        ai.game_tree(s);
        ai.display();
        jButton2.setBackground(Color.CYAN);
        jButton5.setBackground(Color.CYAN);
        jButton8.setBackground(Color.CYAN);

    }
    
    else if (b3 == ("o") && b6 == ("o") && b9 ==("o"))
    {
        JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        gameScore();
        
        if(b1==" ")
        b1="_";
        if(b2==" ")
        b2="_";
        if(b3==" ")
        b3="_";
        if(b4==" ")
        b4="_";
        if(b5==" ")
        b5="_";
        if(b6==" ")
        b6="_";
        if(b7==" ")
        b7="_";
        if(b8==" ")
        b8="_";
        if(b9==" ")
        b9="_";
        //getter(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        String s=""+b1+" "+b2+" "+b3+"\n"+b4+" "+b5+" "+b6+"\n"+b7+" "+b8+" "+b9;
        ai.game_tree(s);
        ai.display();
        jButton3.setBackground(Color.CYAN);
        jButton6.setBackground(Color.CYAN);
        jButton9.setBackground(Color.CYAN);

    }
    
    else if (b1 == ("o") && b5 == ("o") && b9 ==("o"))
    {
        JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        gameScore();
        
        if(b1==" ")
        b1="_";
        if(b2==" ")
        b2="_";
        if(b3==" ")
        b3="_";
        if(b4==" ")
        b4="_";
        if(b5==" ")
        b5="_";
        if(b6==" ")
        b6="_";
        if(b7==" ")
        b7="_";
        if(b8==" ")
        b8="_";
        if(b9==" ")
        b9="_";
        //getter(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        String s=""+b1+" "+b2+" "+b3+"\n"+b4+" "+b5+" "+b6+"\n"+b7+" "+b8+" "+b9;
        ai.game_tree(s);
        ai.display();
        jButton1.setBackground(Color.CYAN);
        jButton5.setBackground(Color.CYAN);
        jButton9.setBackground(Color.CYAN);

    }
    
    else if (b3 == ("o") && b5 == ("o") && b7 ==("o"))
    {
        JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton4.setEnabled(false);
        jButton6.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        gameScore();
        if(b1==" ")
        b1="_";
        if(b2==" ")
        b2="_";
        if(b3==" ")
        b3="_";
        if(b4==" ")
        b4="_";
        if(b5==" ")
        b5="_";
        if(b6==" ")
        b6="_";
        if(b7==" ")
        b7="_";
        if(b8==" ")
        b8="_";
        if(b9==" ")
        b9="_";
        //getter(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        String s=""+b1+" "+b2+" "+b3+"\n"+b4+" "+b5+" "+b6+"\n"+b7+" "+b8+" "+b9;
        ai.game_tree(s);
        ai.display();
        jButton3.setBackground(Color.CYAN);
        jButton5.setBackground(Color.CYAN);
        jButton7.setBackground(Color.CYAN);

    }
    else if((b1==("o")||b1==("x"))&&(b2==("o")||b2==("x"))&&(b3==("o")||b3==("x"))&&(b4==("o")||b4==("x"))&&(b5==("o")||b5==("x"))&&(b6==("o")||b6==("x"))&&(b7==("o")||b7==("x"))&&(b8==("o")||b8==("x"))&&(b9==("o")||b9==("x")) ){
    JOptionPane.showMessageDialog(this, "Please Reset");
        if(b1==" ")
        b1="_";
        if(b2==" ")
        b2="_";
        if(b3==" ")
        b3="_";
        if(b4==" ")
        b4="_";
        if(b5==" ")
        b5="_";
        if(b6==" ")
        b6="_";
        if(b7==" ")
        b7="_";
        if(b8==" ")
        b8="_";
        if(b9==" ")
        b9="_";
        //getter(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        String s=""+b1+" "+b2+" "+b3+"\n"+b4+" "+b5+" "+b6+"\n"+b7+" "+b8+" "+b9;
        ai.game_tree(s);
    ai.display();}

}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jlblPlayerX = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jlblPlayerO = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jbtnReset = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();
        jbtnNG = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 408));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 408));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Silom", 1, 100)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Silom", 1, 90)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Silom", 1, 90)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Silom", 1, 90)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PLAYER X:");
        jPanel6.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jlblPlayerX.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
        jlblPlayerX.setForeground(new java.awt.Color(0, 204, 204));
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jlblPlayerX, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Silom", 1, 90)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(0, 102, 102));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Silom", 1, 90)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(0, 102, 102));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Silom", 1, 90)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(0, 102, 102));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PLAYER O:");
        jPanel11.add(jLabel5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(0, 102, 102));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jlblPlayerO.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
        jlblPlayerO.setForeground(new java.awt.Color(0, 204, 204));
        jlblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(jlblPlayerO, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(0, 102, 102));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Silom", 1, 90)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(0, 102, 102));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Silom", 1, 90)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(0, 102, 102));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Silom", 1, 90)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(0, 102, 102));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jbtnReset.setBackground(new java.awt.Color(0, 153, 102));
        jbtnReset.setFont(new java.awt.Font("Silom", 1, 36)); // NOI18N
        jbtnReset.setText("RESET");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel16.add(jbtnReset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(0, 102, 102));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jbtnExit.setBackground(new java.awt.Color(0, 153, 102));
        jbtnExit.setFont(new java.awt.Font("Silom", 1, 36)); // NOI18N
        jbtnExit.setText("HOME");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel17.add(jbtnExit, java.awt.BorderLayout.CENTER);

        jbtnNG.setBackground(new java.awt.Color(0, 153, 102));
        jbtnNG.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        jbtnNG.setText("New Game");
        jbtnNG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNGActionPerformed(evt);
            }
        });
        jPanel17.add(jbtnNG, java.awt.BorderLayout.PAGE_START);

        jPanel2.add(jPanel17);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  private JFrame frame;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    if(c1)
    {
        jButton1.setText(startGame);
        if (startGame.equalsIgnoreCase ("x"))
        {
            jButton1.setForeground(Color.BLACK); 
            c1= false;
        }
        else
        {
            jButton1.setForeground(Color.BLACK);
            c1= false;
        }
        choose_a_Player();
        winningGame();
    }
    else
    {
       JOptionPane.showMessageDialog(this, "Please Click An Empty Box"); 
    }  
    String b1 =jButton1.getText();
        String b2 =jButton2.getText();
        String b3 =jButton3.getText();
        String b4 =jButton4.getText();
        String b5 =jButton5.getText();
        String b6 =jButton6.getText();
        String b7 =jButton7.getText();
        String b8 =jButton8.getText();
        String b9 =jButton9.getText();
        if(b1==" ")
        b1="_";
        if(b2==" ")
        b2="_";
        if(b3==" ")
        b3="_";
        if(b4==" ")
        b4="_";
        if(b5==" ")
        b5="_";
        if(b6==" ")
        b6="_";
        if(b7==" ")
        b7="_";
        if(b8==" ")
        b8="_";
        if(b9==" ")
        b9="_";
        //getter(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        String s=""+b1+" "+b2+" "+b3+"\n"+b4+" "+b5+" "+b6+"\n"+b7+" "+b8+" "+b9;
        ai.game_tree(s);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    if(c3)
    {
        jButton3.setText(startGame);
        if (startGame.equalsIgnoreCase ("x"))
        {
            jButton3.setForeground(Color.BLACK); 
            c3= false;
        }
        else
        {
            jButton3.setForeground(Color.BLACK);
            c3= false;
        }
        choose_a_Player();
        winningGame();
    }
    else
    {
       JOptionPane.showMessageDialog(this, "Please Click An Empty Box"); 
    }  
    String b1 =jButton1.getText();
        String b2 =jButton2.getText();
        String b3 =jButton3.getText();
        String b4 =jButton4.getText();
        String b5 =jButton5.getText();
        String b6 =jButton6.getText();
        String b7 =jButton7.getText();
        String b8 =jButton8.getText();
        String b9 =jButton9.getText();
        if(b1==" ")
        b1="_";
        if(b2==" ")
        b2="_";
        if(b3==" ")
        b3="_";
        if(b4==" ")
        b4="_";
        if(b5==" ")
        b5="_";
        if(b6==" ")
        b6="_";
        if(b7==" ")
        b7="_";
        if(b8==" ")
        b8="_";
        if(b9==" ")
        b9="_";
        //getter(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        String s=""+b1+" "+b2+" "+b3+"\n"+b4+" "+b5+" "+b6+"\n"+b7+" "+b8+" "+b9;
        ai.game_tree(s);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

    if(c7)
    {
        jButton7.setText(startGame);
        if (startGame.equalsIgnoreCase ("x"))
        {
            jButton7.setForeground(Color.BLACK); 
            c7= false;
        }
        else
        {
            jButton7.setForeground(Color.BLACK);
            c7= false;
        }
        choose_a_Player();
        winningGame();
    }
    else
    {
       JOptionPane.showMessageDialog(this, "Please Click An Empty Box"); 
    }  
    String b1 =jButton1.getText();
        String b2 =jButton2.getText();
        String b3 =jButton3.getText();
        String b4 =jButton4.getText();
        String b5 =jButton5.getText();
        String b6 =jButton6.getText();
        String b7 =jButton7.getText();
        String b8 =jButton8.getText();
        String b9 =jButton9.getText();
        if(b1==" ")
        b1="_";
        if(b2==" ")
        b2="_";
        if(b3==" ")
        b3="_";
        if(b4==" ")
        b4="_";
        if(b5==" ")
        b5="_";
        if(b6==" ")
        b6="_";
        if(b7==" ")
        b7="_";
        if(b8==" ")
        b8="_";
        if(b9==" ")
        b9="_";
        //getter(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        String s=""+b1+" "+b2+" "+b3+"\n"+b4+" "+b5+" "+b6+"\n"+b7+" "+b8+" "+b9;
        ai.game_tree(s);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

    if(c8)
    {
        jButton8.setText(startGame);
        if (startGame.equalsIgnoreCase ("x"))
        {
            jButton8.setForeground(Color.BLACK); 
            c8= false;
        }
        else
        {
            jButton8.setForeground(Color.BLACK);
            c8= false;
        }
        choose_a_Player();
        winningGame();
    }
    else
    {
       JOptionPane.showMessageDialog(this, "Please Click An Empty Box"); 
    }  
    String b1 =jButton1.getText();
        String b2 =jButton2.getText();
        String b3 =jButton3.getText();
        String b4 =jButton4.getText();
        String b5 =jButton5.getText();
        String b6 =jButton6.getText();
        String b7 =jButton7.getText();
        String b8 =jButton8.getText();
        String b9 =jButton9.getText();
        if(b1==" ")
        b1="_";
        if(b2==" ")
        b2="_";
        if(b3==" ")
        b3="_";
        if(b4==" ")
        b4="_";
        if(b5==" ")
        b5="_";
        if(b6==" ")
        b6="_";
        if(b7==" ")
        b7="_";
        if(b8==" ")
        b8="_";
        if(b9==" ")
        b9="_";
        //getter(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        String s=""+b1+" "+b2+" "+b3+"\n"+b4+" "+b5+" "+b6+"\n"+b7+" "+b8+" "+b9;
        ai.game_tree(s);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
       setVisible(false);
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
    c1=true;
    c2=true;
    c3=true;
    c4=true;
    c5=true;
    c6=true;
    c7=true;
    c8=true;
    c9=true;
    jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
    
    jButton1.setText (" ");
    jButton2.setText (" ");
    jButton3.setText (" ");
    
    jButton4.setText (" ");
    jButton5.setText (" ");
    jButton6.setText (" ");
    
    jButton7.setText (" ");
    jButton8.setText (" ");
    jButton9.setText (" ");
    ai.g.clear();
    ai.t.clear();
    jButton1.setBackground (Color.LIGHT_GRAY);
    jButton2.setBackground (Color.LIGHT_GRAY);
    jButton3.setBackground (Color.LIGHT_GRAY);
    
    jButton4.setBackground (Color.LIGHT_GRAY);
    jButton5.setBackground (Color.LIGHT_GRAY);
    jButton6.setBackground (Color.LIGHT_GRAY);
    
    jButton7.setBackground (Color.LIGHT_GRAY);
    jButton8.setBackground (Color.LIGHT_GRAY);
    jButton9.setBackground (Color.LIGHT_GRAY);

    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
    if(c2)
    {
        jButton2.setText(startGame);
        if (startGame.equalsIgnoreCase ("x"))
        {
            jButton2.setForeground(Color.BLACK); 
            c2= false;
        }
        else
        {
            jButton2.setForeground(Color.BLACK);
            c2= false;
        }
        choose_a_Player();
        winningGame();
    }
    else
    {
       JOptionPane.showMessageDialog(this, "Please Click An Empty Box"); 
    }  
    String b1 =jButton1.getText();
        String b2 =jButton2.getText();
        String b3 =jButton3.getText();
        String b4 =jButton4.getText();
        String b5 =jButton5.getText();
        String b6 =jButton6.getText();
        String b7 =jButton7.getText();
        String b8 =jButton8.getText();
        String b9 =jButton9.getText();
        if(b1==" ")
        b1="_";
        if(b2==" ")
        b2="_";
        if(b3==" ")
        b3="_";
        if(b4==" ")
        b4="_";
        if(b5==" ")
        b5="_";
        if(b6==" ")
        b6="_";
        if(b7==" ")
        b7="_";
        if(b8==" ")
        b8="_";
        if(b9==" ")
        b9="_";
        //getter(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        String s=""+b1+" "+b2+" "+b3+"\n"+b4+" "+b5+" "+b6+"\n"+b7+" "+b8+" "+b9;
        ai.game_tree(s);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    if(c4)
    {
        jButton4.setText(startGame);
        if (startGame.equalsIgnoreCase ("x"))
        {
            jButton4.setForeground(Color.BLACK); 
            c4= false;
        }
        else
        {
            jButton4.setForeground(Color.BLACK);
            c4= false;
        }
        choose_a_Player();
        winningGame();
    }
    else
    {
       JOptionPane.showMessageDialog(this, "Please Click An Empty Box"); 
    }  
    String b1 =jButton1.getText();
        String b2 =jButton2.getText();
        String b3 =jButton3.getText();
        String b4 =jButton4.getText();
        String b5 =jButton5.getText();
        String b6 =jButton6.getText();
        String b7 =jButton7.getText();
        String b8 =jButton8.getText();
        String b9 =jButton9.getText();
        if(b1==" ")
        b1="_";
        if(b2==" ")
        b2="_";
        if(b3==" ")
        b3="_";
        if(b4==" ")
        b4="_";
        if(b5==" ")
        b5="_";
        if(b6==" ")
        b6="_";
        if(b7==" ")
        b7="_";
        if(b8==" ")
        b8="_";
        if(b9==" ")
        b9="_";
        //getter(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        String s=""+b1+" "+b2+" "+b3+"\n"+b4+" "+b5+" "+b6+"\n"+b7+" "+b8+" "+b9;
        ai.game_tree(s);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    if(c5)
    {
        jButton5.setText(startGame);
        if (startGame.equalsIgnoreCase ("x"))
        {
            jButton5.setForeground(Color.BLACK); 
            c5= false;
        }
        else
        {
            jButton5.setForeground(Color.BLACK);
            c5= false;
        }
        choose_a_Player();
        winningGame();
    }
    else
    {
       JOptionPane.showMessageDialog(this, "Please Click An Empty Box"); 
    }  
    String b1 =jButton1.getText();
        String b2 =jButton2.getText();
        String b3 =jButton3.getText();
        String b4 =jButton4.getText();
        String b5 =jButton5.getText();
        String b6 =jButton6.getText();
        String b7 =jButton7.getText();
        String b8 =jButton8.getText();
        String b9 =jButton9.getText();
        if(b1==" ")
        b1="_";
        if(b2==" ")
        b2="_";
        if(b3==" ")
        b3="_";
        if(b4==" ")
        b4="_";
        if(b5==" ")
        b5="_";
        if(b6==" ")
        b6="_";
        if(b7==" ")
        b7="_";
        if(b8==" ")
        b8="_";
        if(b9==" ")
        b9="_";
       //getter(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        String s=""+b1+" "+b2+" "+b3+"\n"+b4+" "+b5+" "+b6+"\n"+b7+" "+b8+" "+b9;
        ai.game_tree(s);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

    if(c6)
    {
        jButton6.setText(startGame);
        if (startGame.equalsIgnoreCase ("x"))
        {
            jButton6.setForeground(Color.BLACK); 
            c6= false;
        }
        else
        {
            jButton6.setForeground(Color.BLACK);
            c6= false;
        }
        choose_a_Player();
        winningGame();
    }
    else
    {
       JOptionPane.showMessageDialog(this, "Please Click An Empty Box"); 
    }  
    String b1 =jButton1.getText();
        String b2 =jButton2.getText();
        String b3 =jButton3.getText();
        String b4 =jButton4.getText();
        String b5 =jButton5.getText();
        String b6 =jButton6.getText();
        String b7 =jButton7.getText();
        String b8 =jButton8.getText();
        String b9 =jButton9.getText();
        if(b1==" ")
        b1="_";
        if(b2==" ")
        b2="_";
        if(b3==" ")
        b3="_";
        if(b4==" ")
        b4="_";
        if(b5==" ")
        b5="_";
        if(b6==" ")
        b6="_";
        if(b7==" ")
        b7="_";
        if(b8==" ")
        b8="_";
        if(b9==" ")
        b9="_";
        //getter(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        String s=""+b1+" "+b2+" "+b3+"\n"+b4+" "+b5+" "+b6+"\n"+b7+" "+b8+" "+b9;
        ai.game_tree(s);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
     
    if(c9)
    {
        jButton9.setText(startGame);
        if (startGame.equalsIgnoreCase ("x"))
        {
            jButton9.setForeground(Color.BLACK); 
            c9= false;
        }
        else
        {
            jButton9.setForeground(Color.BLACK);
            c9= false;
        }
        choose_a_Player();
        winningGame();
    }
    else
    {
       JOptionPane.showMessageDialog(this, "Please Click An Empty Box"); 
    }  
    String b1 =jButton1.getText();
        String b2 =jButton2.getText();
        String b3 =jButton3.getText();
        String b4 =jButton4.getText();
        String b5 =jButton5.getText();
        String b6 =jButton6.getText();
        String b7 =jButton7.getText();
        String b8 =jButton8.getText();
        String b9 =jButton9.getText();
        if(b1==" ")
        b1="_";
        if(b2==" ")
        b2="_";
        if(b3==" ")
        b3="_";
        if(b4==" ")
        b4="_";
        if(b5==" ")
        b5="_";
        if(b6==" ")
        b6="_";
        if(b7==" ")
        b7="_";
        if(b8==" ")
        b8="_";
        if(b9==" ")
        b9="_";
        
        //getter(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        String s=""+b1+" "+b2+" "+b3+"\n"+b4+" "+b5+" "+b6+"\n"+b7+" "+b8+" "+b9;
        ai.game_tree(s);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jbtnNGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNGActionPerformed
    
    xCount = 0;
    oCount = 0;
    gameScore();
    
    c1=true;
    c2=true;
    c3=true;
    c4=true;
    c5=true;
    c6=true;
    c7=true;
    c8=true;
    c9=true;
    
    jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
    
    jButton1.setText (" ");
    jButton2.setText (" ");
    jButton3.setText (" ");
    
    jButton4.setText (" ");
    jButton5.setText (" ");
    jButton6.setText (" ");
    
    jButton7.setText (" ");
    jButton8.setText (" ");
    jButton9.setText (" ");
    
    jButton1.setBackground (Color.LIGHT_GRAY);
    jButton2.setBackground (Color.LIGHT_GRAY);
    jButton3.setBackground (Color.LIGHT_GRAY);
    
    jButton4.setBackground (Color.LIGHT_GRAY);
    jButton5.setBackground (Color.LIGHT_GRAY);
    jButton6.setBackground (Color.LIGHT_GRAY);
    
    jButton7.setBackground (Color.LIGHT_GRAY);
    jButton8.setBackground (Color.LIGHT_GRAY);
    jButton9.setBackground (Color.LIGHT_GRAY);
    
    ai.g.clear();
    ai.t.clear();
    }//GEN-LAST:event_jbtnNGActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe_s().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnNG;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JLabel jlblPlayerO;
    private javax.swing.JLabel jlblPlayerX;
    // End of variables declaration//GEN-END:variables
}
