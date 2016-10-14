package agendadecontatos;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author fernando
 *
 */
public class TelaAgenda extends javax.swing.JFrame {

  /**
   * Creates new form TelaAgenda
   */
  public TelaAgenda() {
    initComponents();
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
      new TelaAgenda().setVisible(true);
    });
  }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel2 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jLabel4 = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jLabel6 = new javax.swing.JLabel();
        lblSO = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuContatos = new javax.swing.JMenuItem();
        mnuUsuarios = new javax.swing.JMenu();
        mnuTrocarUsuario = new javax.swing.JMenuItem();
        mnuMudarSenha = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuSom = new javax.swing.JCheckBoxMenuItem();
        mnuTemas = new javax.swing.JMenu();
        mnuNimbus = new javax.swing.JCheckBoxMenuItem();
        mnuMetal = new javax.swing.JCheckBoxMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        mnuGTK = new javax.swing.JCheckBoxMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mnuMacOSX = new javax.swing.JCheckBoxMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mnuWindows = new javax.swing.JCheckBoxMenuItem();
        mnuWindowsClassic = new javax.swing.JCheckBoxMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mnuAluminium = new javax.swing.JCheckBoxMenuItem();
        mnuAero = new javax.swing.JCheckBoxMenuItem();
        mnuGraphite = new javax.swing.JCheckBoxMenuItem();
        mnuMint = new javax.swing.JCheckBoxMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        mnuPlastic = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/agenda.png"))); // NOI18N

        jToolBar1.setRollover(true);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0198.png"))); // NOI18N
        jLabel2.setText("Usuário: ");
        jToolBar1.add(jLabel2);

        lblUsuario.setMaximumSize(new java.awt.Dimension(200, 16));
        lblUsuario.setMinimumSize(new java.awt.Dimension(200, 16));
        jToolBar1.add(lblUsuario);
        jToolBar1.add(jSeparator2);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0277.png"))); // NOI18N
        jLabel4.setText("Nível: ");
        jToolBar1.add(jLabel4);

        lblNivel.setMaximumSize(new java.awt.Dimension(200, 16));
        lblNivel.setMinimumSize(new java.awt.Dimension(200, 16));
        jToolBar1.add(lblNivel);
        jToolBar1.add(jSeparator3);

        jLabel6.setText("S.O.: ");
        jToolBar1.add(jLabel6);

        lblSO.setMaximumSize(new java.awt.Dimension(200, 16));
        lblSO.setMinimumSize(new java.awt.Dimension(200, 16));
        jToolBar1.add(lblSO);

        jMenu1.setText("Cadastros");

        mnuContatos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.META_MASK));
        mnuContatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0544.png"))); // NOI18N
        mnuContatos.setText("Contatos");
        jMenu1.add(mnuContatos);

        mnuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0198.png"))); // NOI18N
        mnuUsuarios.setText("Usuários");

        mnuTrocarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0009.png"))); // NOI18N
        mnuTrocarUsuario.setText("Trocar Usuário");
        mnuTrocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTrocarUsuarioActionPerformed(evt);
            }
        });
        mnuUsuarios.add(mnuTrocarUsuario);

        mnuMudarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0375.png"))); // NOI18N
        mnuMudarSenha.setText("Mudar a Senha");
        mnuUsuarios.add(mnuMudarSenha);

        jMenu1.add(mnuUsuarios);
        jMenu1.add(jSeparator1);

        mnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        mnuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0190.png"))); // NOI18N
        mnuSair.setText("Sair");
        mnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSairActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Configurações");

        mnuSom.setSelected(true);
        mnuSom.setText("Som");
        jMenu2.add(mnuSom);

        mnuTemas.setText("Temas");

        buttonGroup1.add(mnuNimbus);
        mnuNimbus.setText("Nimbus");
        mnuNimbus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNimbusActionPerformed(evt);
            }
        });
        mnuTemas.add(mnuNimbus);

        buttonGroup1.add(mnuMetal);
        mnuMetal.setText("Metal");
        mnuMetal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMetalActionPerformed(evt);
            }
        });
        mnuTemas.add(mnuMetal);
        mnuTemas.add(jSeparator8);

        buttonGroup1.add(mnuGTK);
        mnuGTK.setText("GTK+");
        mnuGTK.setEnabled(false);
        mnuGTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGTKActionPerformed(evt);
            }
        });
        mnuTemas.add(mnuGTK);
        mnuTemas.add(jSeparator4);

        buttonGroup1.add(mnuMacOSX);
        mnuMacOSX.setText("Mac OS X");
        mnuMacOSX.setEnabled(false);
        mnuMacOSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMacOSXActionPerformed(evt);
            }
        });
        mnuTemas.add(mnuMacOSX);
        mnuTemas.add(jSeparator5);

        buttonGroup1.add(mnuWindows);
        mnuWindows.setText("Windows");
        mnuWindows.setEnabled(false);
        mnuWindows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuWindowsActionPerformed(evt);
            }
        });
        mnuTemas.add(mnuWindows);

        buttonGroup1.add(mnuWindowsClassic);
        mnuWindowsClassic.setText("Windows Classic");
        mnuWindowsClassic.setEnabled(false);
        mnuWindowsClassic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuWindowsClassicActionPerformed(evt);
            }
        });
        mnuTemas.add(mnuWindowsClassic);
        mnuTemas.add(jSeparator6);

        buttonGroup1.add(mnuAluminium);
        mnuAluminium.setText("Aluminium");
        mnuAluminium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAluminiumActionPerformed(evt);
            }
        });
        mnuTemas.add(mnuAluminium);

        buttonGroup1.add(mnuAero);
        mnuAero.setText("Aero");
        mnuAero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAeroActionPerformed(evt);
            }
        });
        mnuTemas.add(mnuAero);

        buttonGroup1.add(mnuGraphite);
        mnuGraphite.setText("Graphite");
        mnuGraphite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGraphiteActionPerformed(evt);
            }
        });
        mnuTemas.add(mnuGraphite);

        buttonGroup1.add(mnuMint);
        mnuMint.setText("Mint");
        mnuMint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMintActionPerformed(evt);
            }
        });
        mnuTemas.add(mnuMint);
        mnuTemas.add(jSeparator7);

        buttonGroup1.add(mnuPlastic);
        mnuPlastic.setText("Plastic");
        mnuPlastic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPlasticActionPerformed(evt);
            }
        });
        mnuTemas.add(mnuPlastic);

        jMenu2.add(mnuTemas);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1024, 629));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  /**
   * MenuItem Sair - Executado para encerrar o sistema
   *
   * @param evt
   */
    private void mnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSairActionPerformed
      System.exit(0);
    }//GEN-LAST:event_mnuSairActionPerformed

  /**
   * MenuItem GTK - Muda o tema da aplicação para GTK+
   *
   * @param evt
   */
    private void mnuGTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGTKActionPerformed
      mudaLaF("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
    }//GEN-LAST:event_mnuGTKActionPerformed

  /**
   * MenuItem Nimbus - Muda o tema da aplicação para Nimbus
   *
   * @param evt
   */
    private void mnuNimbusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNimbusActionPerformed
      mudaLaF("javax.swing.plaf.nimbus.NimbusLookAndFeel");
    }//GEN-LAST:event_mnuNimbusActionPerformed

  /**
   * MenuItem MacOSX - Muda o tema da aplicação para MacOSX
   *
   * @param evt
   */
    private void mnuMacOSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMacOSXActionPerformed
      mudaLaF("com.apple.laf.AquaLookAndFeel");
    }//GEN-LAST:event_mnuMacOSXActionPerformed

  /**
   * MenuItem Aluminium - Muda o tema para Aluminium
   *
   * @param evt
   */
    private void mnuAluminiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAluminiumActionPerformed
      mudaLaF("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
    }//GEN-LAST:event_mnuAluminiumActionPerformed

  /**
   * MenuItem Windows - Muda o tema para Windows
   *
   * @param evt
   */
    private void mnuWindowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuWindowsActionPerformed
      mudaLaF("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    }//GEN-LAST:event_mnuWindowsActionPerformed

  /**
   * Instancia e chama o JDialog TrocarUsuario
   *
   * @param evt
   */
    private void mnuTrocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTrocarUsuarioActionPerformed
      TelaLogin telaLogin = new TelaLogin(this, true);
      telaLogin.setVisible(true);
      

      if ( !telaLogin.getUsuario().isEmpty() ) {
          lblUsuario.setText( telaLogin.getUsuario() );
          lblNivel.setText( telaLogin.getNivel() );
      }
         
      lblSO.setText( descobreSO() );

      telaLogin.dispose();
      
      
      
      
    }//GEN-LAST:event_mnuTrocarUsuarioActionPerformed

  private void mnuWindowsClassicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuWindowsClassicActionPerformed
    mudaLaF("com.sun.java.swing.plaf.windowsclassic.WindowsClassicLookAndFeel");
  }//GEN-LAST:event_mnuWindowsClassicActionPerformed

  private void mnuGraphiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGraphiteActionPerformed
    mudaLaF("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
  }//GEN-LAST:event_mnuGraphiteActionPerformed

  private void mnuAeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAeroActionPerformed
    mudaLaF("com.jtattoo.plaf.aero.AeroLookAndFeel");
  }//GEN-LAST:event_mnuAeroActionPerformed

  private void mnuMintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMintActionPerformed
    mudaLaF("com.jtattoo.plaf.mint.MintLookAndFeel");
  }//GEN-LAST:event_mnuMintActionPerformed

  private void mnuPlasticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPlasticActionPerformed
    mudaLaF("com.jgoodies.looks.plastic.PlasticLookAndFeel");
  }//GEN-LAST:event_mnuPlasticActionPerformed

  private void mnuMetalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMetalActionPerformed
    mudaLaF("javax.swing.plaf.metal.MetalLookAndFeel");
  }//GEN-LAST:event_mnuMetalActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      TelaLogin telaLogin = new TelaLogin(this,true);
      telaLogin.setVisible( true );
      
      lblUsuario.setText( telaLogin.getUsuario() );
      lblNivel.setText( telaLogin.getNivel() );

      if ( lblUsuario.getText().trim().isEmpty() ) {
            System.exit(0);
      }
         
      lblSO.setText( descobreSO() );

      telaLogin.dispose();
      
    }//GEN-LAST:event_formWindowOpened

    private String descobreSO() {
      String soNome = "";
      
      soNome = System.getProperty( "os.name" );
      
      return soNome;
    }
    
    
    
    
    
    
  /**
   * Método mudaLaF - Muda o Look And Feel da Aplicação
   *
   * @param temaLaF
   */
  private void mudaLaF(String temaLaF) {
    try {

      UIManager.setLookAndFeel(temaLaF);
      SwingUtilities.updateComponentTreeUI(this);

    } catch (ClassNotFoundException | InstantiationException |
            IllegalAccessException | UnsupportedLookAndFeelException ex) {

      JOptionPane.showMessageDialog(null, "Tema não suportado neste S.O.",
              "Atenção", JOptionPane.INFORMATION_MESSAGE);

    }

  }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblSO;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JCheckBoxMenuItem mnuAero;
    private javax.swing.JCheckBoxMenuItem mnuAluminium;
    private javax.swing.JMenuItem mnuContatos;
    private javax.swing.JCheckBoxMenuItem mnuGTK;
    private javax.swing.JCheckBoxMenuItem mnuGraphite;
    private javax.swing.JCheckBoxMenuItem mnuMacOSX;
    private javax.swing.JCheckBoxMenuItem mnuMetal;
    private javax.swing.JCheckBoxMenuItem mnuMint;
    private javax.swing.JMenuItem mnuMudarSenha;
    private javax.swing.JCheckBoxMenuItem mnuNimbus;
    private javax.swing.JCheckBoxMenuItem mnuPlastic;
    private javax.swing.JMenuItem mnuSair;
    private javax.swing.JCheckBoxMenuItem mnuSom;
    private javax.swing.JMenu mnuTemas;
    private javax.swing.JMenuItem mnuTrocarUsuario;
    private javax.swing.JMenu mnuUsuarios;
    private javax.swing.JCheckBoxMenuItem mnuWindows;
    private javax.swing.JCheckBoxMenuItem mnuWindowsClassic;
    // End of variables declaration//GEN-END:variables
}
