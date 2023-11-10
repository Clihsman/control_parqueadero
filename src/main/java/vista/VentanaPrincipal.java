/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.ClientesControlador;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import repositorio.ClienteRepositorio;

/**
 *
 * @author Pc
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
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

        jPanel1 = new javax.swing.JPanel();
        btClientes = new javax.swing.JButton();
        btPuestos = new javax.swing.JButton();
        btReportes = new javax.swing.JButton();
        btCaja = new javax.swing.JButton();
        pnPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btClientes.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btClientes.setText("CLIENTES");
        btClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClientesActionPerformed(evt);
            }
        });

        btPuestos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPuestos.setText("PUESTOS");
        btPuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPuestosActionPerformed(evt);
            }
        });

        btReportes.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btReportes.setText("REPORTES");
        btReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReportesActionPerformed(evt);
            }
        });

        btCaja.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btCaja.setText("CAJA");
        btCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btPuestos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btReportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(502, Short.MAX_VALUE))
        );

        btClientes.getAccessibleContext().setAccessibleName("btClientes");
        btPuestos.getAccessibleContext().setAccessibleName("btPuestos");
        btReportes.getAccessibleContext().setAccessibleName("btReportes");
        btCaja.getAccessibleContext().setAccessibleName("btCaja");

        javax.swing.GroupLayout pnPrincipalLayout = new javax.swing.GroupLayout(pnPrincipal);
        pnPrincipal.setLayout(pnPrincipalLayout);
        pnPrincipalLayout.setHorizontalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 771, Short.MAX_VALUE)
        );
        pnPrincipalLayout.setVerticalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("");
        pnPrincipal.getAccessibleContext().setAccessibleName("pnPrincipal");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPuestosActionPerformed
         pnPrincipal.removeAll();
         Dimension size = pnPrincipal.getSize();
         PanelPuestos panelPuestos = new PanelPuestos();
         panelPuestos.setSize(size.width,size.height);
         panelPuestos.setLocation(0, 0);
         pnPrincipal.add(panelPuestos, BorderLayout.CENTER);
         pnPrincipal.revalidate();
         pnPrincipal.repaint();
    }//GEN-LAST:event_btPuestosActionPerformed

    private void btReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReportesActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null, "REPORTES", "Control Paqueadero", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btReportesActionPerformed

    private void btCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCajaActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null, "CAJA", "Control Paqueadero", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btCajaActionPerformed

    private void btClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClientesActionPerformed
        // TODO add your handling code here:
        // JOptionPane.showMessageDialog(null, "CLIENTES", "Control Paqueadero", JOptionPane.INFORMATION_MESSAGE);
         ClienteRepositorio clienteRepositorio = new ClienteRepositorio();
         PanelClientes panelClientes = new PanelClientes();
         ClientesControlador clienteControlador = new ClientesControlador(panelClientes, clienteRepositorio);
         clienteControlador.iniciar(pnPrincipal);
    }//GEN-LAST:event_btClientesActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        ventanaPrincipal.setLocation(dim.width/2-ventanaPrincipal.getSize().width/2, dim.height/2-ventanaPrincipal.getSize().height/2);
        
        java.awt.EventQueue.invokeLater(() -> {
            ventanaPrincipal.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCaja;
    private javax.swing.JButton btClientes;
    private javax.swing.JButton btPuestos;
    private javax.swing.JButton btReportes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnPrincipal;
    // End of variables declaration//GEN-END:variables
}
