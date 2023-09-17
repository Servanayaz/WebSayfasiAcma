
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class WebSayfasi extends javax.swing.JFrame {

    private int say = 0;

    public WebSayfasi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tikla_butonu = new javax.swing.JButton();
        websayfasi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tikla_butonu.setText("Tikla");
        tikla_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tikla_butonuActionPerformed(evt);
            }
        });

        websayfasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                websayfasiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(tikla_butonu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(websayfasi, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addComponent(websayfasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(tikla_butonu)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tikla_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tikla_butonuActionPerformed
        try {
            /*
            say++;
            System.out.println("Butona "+say+" kere tiklandi..."); */
            String intAdresi=websayfasi.getText();
            Desktop d=Desktop.getDesktop();
            d.browse(new URI(intAdresi));
        } catch (URISyntaxException ex) {
            Logger.getLogger(WebSayfasi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(WebSayfasi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_tikla_butonuActionPerformed

    private void websayfasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_websayfasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_websayfasiActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WebSayfasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton tikla_butonu;
    private javax.swing.JTextField websayfasi;
    // End of variables declaration//GEN-END:variables
}
