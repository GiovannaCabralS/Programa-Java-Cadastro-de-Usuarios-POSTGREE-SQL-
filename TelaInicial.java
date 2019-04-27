package Interface;
import UsuarioClass.Usuario;
import UsuarioBanco.UsuarioConBanco;
import javax.swing.JOptionPane;

public class TelaInicial extends javax.swing.JFrame 
{
    public TelaInicial() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        Fundo = new javax.swing.JPanel();
        Nome = new javax.swing.JLabel();
        CampoNome = new javax.swing.JTextField();
        EMail = new javax.swing.JLabel();
        CampoEMail = new javax.swing.JTextField();
        Telefone = new javax.swing.JLabel();
        CampoCelular = new javax.swing.JTextField();
        End = new javax.swing.JLabel();
        CampoEnd = new javax.swing.JTextField();
        D_Nasc = new javax.swing.JLabel();
        CampoD_Nasc = new javax.swing.JTextField();
        BotaoCadastrar = new javax.swing.JButton();
        BotaoConsultar = new javax.swing.JButton();
        BotãoSair = new javax.swing.JButton();
        LimparNome = new javax.swing.JButton();
        LimparEMail = new javax.swing.JButton();
        LimparEnd = new javax.swing.JButton();
        LimparCelular = new javax.swing.JButton();
        LimparD_Nasc = new javax.swing.JButton();
        BotaoLimparTudo = new javax.swing.JButton();
        AvisoRodape = new javax.swing.JLabel();
        AvisoRodape1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Titulo.setText("Cadastro de Usuário");
        Titulo.setToolTipText("");
        Titulo.setName("Titulo"); // NOI18N

        Fundo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Nome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Nome.setText("Nome:*");

        CampoNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CampoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeActionPerformed(evt);
            }
        });

        EMail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EMail.setText("E-Mail:*");

        CampoEMail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Telefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Telefone.setText("Celular:*");

        CampoCelular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CampoCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCelularActionPerformed(evt);
            }
        });

        End.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        End.setText("Av/Rua:*");

        CampoEnd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CampoEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEndActionPerformed(evt);
            }
        });

        D_Nasc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        D_Nasc.setText("Data de Nascimento:*");

        CampoD_Nasc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        BotaoCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotaoCadastrar.setText("Cadastrar");
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });

        BotaoConsultar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotaoConsultar.setText("Consultar");
        BotaoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoConsultarActionPerformed(evt);
            }
        });

        BotãoSair.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotãoSair.setText("Sair");
        BotãoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoSairActionPerformed(evt);
            }
        });

        LimparNome.setText("X");
        LimparNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparNomeActionPerformed(evt);
            }
        });

        LimparEMail.setText("X");
        LimparEMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparEMailActionPerformed(evt);
            }
        });

        LimparEnd.setText("X");
        LimparEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparEndActionPerformed(evt);
            }
        });

        LimparCelular.setText("X");
        LimparCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparCelularActionPerformed(evt);
            }
        });

        LimparD_Nasc.setText("X");
        LimparD_Nasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparD_NascActionPerformed(evt);
            }
        });

        BotaoLimparTudo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotaoLimparTudo.setText("Limpar Tudo");
        BotaoLimparTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparTudoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FundoLayout = new javax.swing.GroupLayout(Fundo);
        Fundo.setLayout(FundoLayout);
        FundoLayout.setHorizontalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FundoLayout.createSequentialGroup()
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FundoLayout.createSequentialGroup()
                                .addComponent(D_Nasc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoD_Nasc))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FundoLayout.createSequentialGroup()
                                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nome)
                                    .addComponent(EMail)
                                    .addComponent(End)
                                    .addComponent(Telefone))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CampoEMail)
                                    .addComponent(CampoCelular)
                                    .addComponent(CampoEnd)
                                    .addComponent(CampoNome))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LimparNome)
                                        .addComponent(LimparEMail, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(LimparEnd, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(LimparCelular, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(LimparD_Nasc, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FundoLayout.createSequentialGroup()
                        .addGap(0, 114, Short.MAX_VALUE)
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoConsultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoLimparTudo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotãoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102))))
        );
        FundoLayout.setVerticalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome)
                    .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LimparNome))
                .addGap(18, 18, 18)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EMail)
                    .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CampoEMail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                        .addComponent(LimparEMail)))
                .addGap(18, 18, 18)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Telefone)
                    .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CampoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LimparCelular)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(End)
                    .addComponent(CampoEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LimparEnd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(D_Nasc)
                    .addComponent(CampoD_Nasc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LimparD_Nasc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotaoConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(BotaoCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotaoLimparTudo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(BotãoSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        AvisoRodape.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        AvisoRodape.setLabelFor(AvisoRodape);
        AvisoRodape.setText("*");

        AvisoRodape1.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        AvisoRodape1.setLabelFor(AvisoRodape);
        AvisoRodape1.setText("Campos obrigatórios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addGap(215, 215, 215))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(AvisoRodape, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AvisoRodape1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AvisoRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AvisoRodape1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void BotãoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoSairActionPerformed
                  System.exit(0); 
    }//GEN-LAST:event_BotãoSairActionPerformed

    private void BotaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoConsultarActionPerformed
        TelaConsulta frame = new TelaConsulta();
        frame.setVisible(true);
    }//GEN-LAST:event_BotaoConsultarActionPerformed

    private void BotaoLimparTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparTudoActionPerformed
        CampoNome.setText("");
        CampoEMail.setText("");
        CampoCelular.setText("");
        CampoEnd.setText("");
        CampoD_Nasc.setText("");
    }//GEN-LAST:event_BotaoLimparTudoActionPerformed

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed
        /*
            Cada "Campo" vai ter o seu conteúdo capturado pelos metodos da Classe Usuarios
            e transformados em variávéis para que possa ser feita a inclusão dos dados no 
            Banco de Dados.
        */
        Usuario usuarios = new Usuario();
        usuarios.setNome(CampoNome.getText());
        usuarios.setEmail(CampoEMail.getText());
        usuarios.setTelefone(CampoCelular.getText());
        usuarios.setEndereco(CampoEnd.getText());
        usuarios.setData_nascimento(CampoD_Nasc.getText());

        if(CampoNome.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(CampoNome, "Campo 'Nome' não pode ficar vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        if(CampoEMail.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(CampoEMail, "Campo 'E-Mail' não pode ficar vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        if(CampoCelular.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(CampoCelular, "Campo 'Celular' não pode ficar vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        if(CampoEnd.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(CampoEnd, "Campo 'Av/Rua' não pode ficar vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        if(CampoD_Nasc.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(CampoD_Nasc, "Campo 'Data de Nascimento' não pode ficar vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else 
        {
            /*
                Adicionando o usuário cadastrado ao banco de dados.
            */
            UsuarioConBanco bd = new UsuarioConBanco();
            bd.adiciona(usuarios);
            JOptionPane.showMessageDialog(null, "Usuário: " + CampoNome.getText() + " foi inserido no banco de dados!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void CampoEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEndActionPerformed

    private void CampoCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCelularActionPerformed

    private void CampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeActionPerformed

    private void LimparNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparNomeActionPerformed
        CampoNome.setText("");
    }//GEN-LAST:event_LimparNomeActionPerformed

    private void LimparEMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparEMailActionPerformed
        CampoEMail.setText("");
    }//GEN-LAST:event_LimparEMailActionPerformed

    private void LimparCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparCelularActionPerformed
        CampoCelular.setText("");
    }//GEN-LAST:event_LimparCelularActionPerformed

    private void LimparEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparEndActionPerformed
        CampoEnd.setText("");
    }//GEN-LAST:event_LimparEndActionPerformed

    private void LimparD_NascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparD_NascActionPerformed
        CampoD_Nasc.setText("");
    }//GEN-LAST:event_LimparD_NascActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new TelaInicial().setLocation(250, 80);
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvisoRodape;
    private javax.swing.JLabel AvisoRodape1;
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JButton BotaoConsultar;
    private javax.swing.JButton BotaoLimparTudo;
    private javax.swing.JButton BotãoSair;
    private javax.swing.JTextField CampoCelular;
    private javax.swing.JTextField CampoD_Nasc;
    private javax.swing.JTextField CampoEMail;
    private javax.swing.JTextField CampoEnd;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JLabel D_Nasc;
    private javax.swing.JLabel EMail;
    private javax.swing.JLabel End;
    private javax.swing.JPanel Fundo;
    private javax.swing.JButton LimparCelular;
    private javax.swing.JButton LimparD_Nasc;
    private javax.swing.JButton LimparEMail;
    private javax.swing.JButton LimparEnd;
    private javax.swing.JButton LimparNome;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Telefone;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
