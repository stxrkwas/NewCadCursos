/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Malu Passo Silva
 */
import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Login extends javax.swing.JFrame {

    // Variável de conexão:
    Conexao con_cliente;
    
    // Variáveis da tela gráfica:
    
    //Painel
    JPanel tela;

    // Label para a imagem
    JLabel fundo;
    
    // Imagem 
    ImageIcon imagem;
    
    // Painel de fundo 
    JPanel jPanel1;
    
    // Título da tela
    JLabel titulo;
    
    public Login() {
        
        con_cliente = new Conexao();
        con_cliente.conecta();
        
        // Configurações da janela:
        
        // Definindo o tamanho da tela
        setSize(755, 527);
        
        // Configurando a visibilidade da tela
        setVisible(true);
        
        // Configurando o redimensionamento da tela
        setResizable(false);
        
        // Centraliza a tela gráfica em relação à tela do dispositivo
        setLocationRelativeTo(null);
        
        //-----------------------------------------------------------//
        
        // Criando um objeto que representa a tela do aplicativo
        Container telalogin = getContentPane(); 
        
        // Configurando a cor de fundo do painel
        telalogin.setBackground(new Color(255, 255, 255));
        
        // Criando um painel para a tela do app
        JPanel jpanel1 = new JPanel();
        
        // Adicionando cor de fundo ao painel
        jpanel1.setBackground(new Color(255, 255, 255));
        
        // Adicionando o painel à tela do app
        telalogin.add(jpanel1);
        
        // Instanciando o objeto imagem e atribuindo o aqruivo "fundo_2.png" à ele
        //imagem = new ImageIcon("fundo_2.png");
        
        // Criando o objeto fundo
        JLabel fundo = new JLabel();
        
        //
        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fundo_2.png")));
       
        
        //
        fundo.setBounds(0, 351, 0, 527);
        
        // Adicionando o 'fundo' à tela
        jpanel1.add(fundo);
        
        // Iniciando as configurações da label 'titulo':
        
        JLabel titulo = new JLabel();
        
        // Atribuindo a fonte e o seu tamanho à JLabel 'titulo'
        titulo.setFont(new Font("Gadugi", Font.BOLD, 30)); 
        
        // Alinhando o texto da label ao centro
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        // Atribuindo o texto à label
        titulo.setText("Login");
        
        jpanel1.add(titulo);
        
    }

    
    /*@SuppressWarnings("unchecked")                         
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        img_lbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        senha_lbl = new javax.swing.JLabel();
        user_field = new javax.swing.JTextField();
        senha_field = new javax.swing.JPasswordField();
        Cadastro = new javax.swing.JButton();
        enter_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        img_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fundo_2.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 30)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");

        jLabel3.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Olá, seja bem-vindo!");

        jLabel4.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabel4.setText("Nome de usuário");

        senha_lbl.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        senha_lbl.setText("Senha");

        user_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N

        senha_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N

        Cadastro.setBackground(new java.awt.Color(102, 0, 255));
        Cadastro.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        Cadastro.setForeground(new java.awt.Color(255, 255, 255));
        Cadastro.setText("Cadastre-se");
        Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroActionPerformed(evt);
            }
        });

        enter_btn.setBackground(new java.awt.Color(102, 0, 255));
        enter_btn.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        enter_btn.setForeground(new java.awt.Color(255, 255, 255));
        enter_btn.setText("Entrar");
        enter_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(img_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enter_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Cadastro)
                        .addGap(80, 80, 80))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(senha_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(user_field, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(senha_field, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 10, Short.MAX_VALUE)))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(img_lbl)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(76, 76, 76)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_field, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(senha_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senha_field, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enter_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        
    // Definindo o tamanho da tela
        setSize(755, 527);
        
        // Configurando a visibilidade da tela
        setVisible(true);
        
        // Configurando o redimensionamento da tela
        setResizable(false);
        
        // Centraliza a tela gráfica em relação à tela do dispositivo
        setLocationRelativeTo(null);
    

    */
    
    /*private void CadastroActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        //Abrir a tela de cadastro e fechar a tela de login.
        Cadastro cad = new Cadastro();
        cad.setVisible(true);
        
    }                                        

    private void enter_btnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        try{
            
            String pesquisa = "select * from tblusuario where usuario like '" + user_field.getText() +"' && senha = " + senha_field.getText()+ "";
            con_cliente.executaSQL(pesquisa);
            
            if(con_cliente.resultset.first()){
                
                Menu mostra = new Menu();
                mostra.setVisible(true);
                dispose();
            }
            
            else{
                JOptionPane.showMessageDialog(null, "\n Usuário não cadastrado!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                con_cliente.desconecta();
                System.exit(0);
            }
        
        }catch(SQLException errosql){
            JOptionPane.showMessageDialog(null, "\n Os dados digitados não foram localizados! :\n " + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }*/                                         

    public static void main(String args[]) {
       
        new Login().setVisible(true);
        new Login().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    // Variables declaration - do not modify                     

    // End of variables declaration                   
}

