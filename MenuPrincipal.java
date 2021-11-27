/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121;

/**
 *
 * @author JP
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        archivoMenu = new javax.swing.JMenu();
        userMenu = new javax.swing.JMenu();
        empresaMenu = new javax.swing.JMenu();
        procesoMenu = new javax.swing.JMenu();
        addDeleteUserMenu = new javax.swing.JMenu();
        addDeleteEmpresaMenu = new javax.swing.JMenu();
        addDeleteConsumoMenu = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        informeMenu = new javax.swing.JMenu();
        infoConsumoMenu = new javax.swing.JMenu();
        utilityMenu = new javax.swing.JMenu();
        auditorMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        archivoMenu.setText("Archivo");

        userMenu.setText("Usuarios");
        userMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userMenuActionPerformed(evt);
            }
        });
        archivoMenu.add(userMenu);

        empresaMenu.setText("Empresas");
        empresaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empresaMenuActionPerformed(evt);
            }
        });
        archivoMenu.add(empresaMenu);

        jMenuBar1.add(archivoMenu);

        procesoMenu.setText("Procesos");

        addDeleteUserMenu.setText("Agregar/Eliminar Usuario");
        addDeleteUserMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDeleteUserMenuActionPerformed(evt);
            }
        });
        procesoMenu.add(addDeleteUserMenu);

        addDeleteEmpresaMenu.setText("Agregar/Eliminar Empresa");
        addDeleteEmpresaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDeleteEmpresaMenuActionPerformed(evt);
            }
        });
        procesoMenu.add(addDeleteEmpresaMenu);

        addDeleteConsumoMenu.setText("Registrar/Eliminar Consumo");
        addDeleteConsumoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDeleteConsumoMenuActionPerformed(evt);
            }
        });
        procesoMenu.add(addDeleteConsumoMenu);

        jMenuBar1.add(procesoMenu);
        jMenuBar1.add(jMenu3);

        informeMenu.setText("Informes");

        infoConsumoMenu.setText("Informe consumos");
        infoConsumoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoConsumoMenuActionPerformed(evt);
            }
        });
        informeMenu.add(infoConsumoMenu);

        jMenuBar1.add(informeMenu);

        utilityMenu.setText("Utilidades");

        auditorMenu.setText("Auditoría");
        auditorMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auditorMenuActionPerformed(evt);
            }
        });
        utilityMenu.add(auditorMenu);

        jMenuBar1.add(utilityMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userMenuActionPerformed
        // TODO add your handling code here:
        Usuario usuarioMenu = new Usuario();
        usuarioMenu.setVisible(true);
        
    }//GEN-LAST:event_userMenuActionPerformed

    private void empresaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empresaMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empresaMenuActionPerformed

    private void addDeleteUserMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDeleteUserMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDeleteUserMenuActionPerformed

    private void addDeleteEmpresaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDeleteEmpresaMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDeleteEmpresaMenuActionPerformed

    private void addDeleteConsumoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDeleteConsumoMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDeleteConsumoMenuActionPerformed

    private void infoConsumoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoConsumoMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_infoConsumoMenuActionPerformed

    private void auditorMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auditorMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_auditorMenuActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu addDeleteConsumoMenu;
    private javax.swing.JMenu addDeleteEmpresaMenu;
    private javax.swing.JMenu addDeleteUserMenu;
    private javax.swing.JMenu archivoMenu;
    private javax.swing.JMenu auditorMenu;
    private javax.swing.JMenu empresaMenu;
    private javax.swing.JMenu infoConsumoMenu;
    private javax.swing.JMenu informeMenu;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu procesoMenu;
    private javax.swing.JMenu userMenu;
    private javax.swing.JMenu utilityMenu;
    // End of variables declaration//GEN-END:variables
}
