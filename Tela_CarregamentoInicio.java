package view;

import java.awt.*;
import javax.swing.*;

public class Tela_CarregamentoInicio extends JWindow {
    
    private int duration;
    
    public Tela_CarregamentoInicio(int d) {
        duration = d;
    }
    
// Este é um método simples para mostrar uma tela de apresentção
// no centro da tela durante a quantidade de tempo passada no construtor
    public void showSplash() {        
        JPanel content = (JPanel)getContentPane();
        Color back = new Color(0, 0, 94, 0);
        //content.setBackground(Color.getColor(null, back)); para deixar da mesma cor da tela de login
        content.setBackground(Color.WHITE);
        
        // Configura a posição e o tamanho da janela
        int width = 200;
        int height =180;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width-width)/2;
        int y = (screen.height-height)/2;
        setBounds(x,y,width,height);
        
        // Constrói o splash screen
        JLabel label = new JLabel(new ImageIcon(this.getClass().getResource("radio.gif")));
        JLabel copyrt = new JLabel
                ("Dino. Conectando...", JLabel.CENTER);
        copyrt.setFont(new Font("Sans-Serif", Font.BOLD, 12));
        content.add(label, BorderLayout.CENTER);
        content.add(copyrt, BorderLayout.SOUTH);
        content.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));        
        // Torna visível
        setVisible(true);
        
        // Espera ate que os recursos estejam carregados
        try { Thread.sleep(duration); } catch (Exception e) {}        
        setVisible(false);        
    }
}