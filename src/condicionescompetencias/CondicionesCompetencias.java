
package condicionescompetencias;

public class CondicionesCompetencias extends javax.swing.JFrame {
    
    public CondicionesCompetencias() {
        initComponents();
        c = new Cerradura();
        rc = new RCompartido(c);  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bCorrer = new javax.swing.JButton();
        bPausar = new javax.swing.JButton();
        bParar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Area2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Area3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        Area4 = new javax.swing.JTextArea();
        plato1 = new javax.swing.JLabel();
        plato2 = new javax.swing.JLabel();
        plato3 = new javax.swing.JLabel();
        plato4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        bCorrer.setText("Correr");
        bCorrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCorrerActionPerformed(evt);
            }
        });

        bPausar.setText("Pausar");
        bPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPausarActionPerformed(evt);
            }
        });

        bParar.setText("Parar");
        bParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPararActionPerformed(evt);
            }
        });

        Area1.setColumns(20);
        Area1.setRows(5);
        jScrollPane1.setViewportView(Area1);

        Area2.setColumns(20);
        Area2.setRows(5);
        jScrollPane2.setViewportView(Area2);

        Area3.setColumns(20);
        Area3.setRows(5);
        jScrollPane3.setViewportView(Area3);

        Area4.setColumns(20);
        Area4.setRows(5);
        jScrollPane4.setViewportView(Area4);

        plato1.setText("Plato 1");

        plato2.setText("Plato 2");

        plato3.setText("Plato 3");

        plato4.setText("Plato 4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bParar)
                    .addComponent(bCorrer)
                    .addComponent(bPausar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(plato1)
                .addGap(123, 123, 123)
                .addComponent(plato2)
                .addGap(104, 104, 104)
                .addComponent(plato3)
                .addGap(105, 105, 105)
                .addComponent(plato4)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(bCorrer)
                        .addGap(18, 18, 18)
                        .addComponent(bPausar)
                        .addGap(18, 18, 18)
                        .addComponent(bParar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(plato1)
                            .addComponent(plato2)
                            .addComponent(plato3)
                            .addComponent(plato4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCorrerActionPerformed
        h1 = new Hilo(Area1, rc, 1, c);
        h2 = new Hilo(Area2, rc, 2, c);
        h3 = new Hilo(Area3, rc, 3, c);
        h4 = new Hilo(Area4, rc, 4, c);
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        bCorrer.setEnabled(false);
    }//GEN-LAST:event_bCorrerActionPerformed

    private void bPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPausarActionPerformed
        if(bPausar.getText().equals("Pausar")){
            bPausar.setText("Continuar");
            h1.pausar();
            h2.pausar();
            h3.pausar();
            h4.pausar();
        }else{
            bPausar.setText("Pausar");
            h1.continuar();
            h2.continuar();
            h3.continuar();
            h4.continuar();
        }
    }//GEN-LAST:event_bPausarActionPerformed

    private void bPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPararActionPerformed
        h1.parar();
        h2.parar();
        h3.parar();
        h4.parar();
        bCorrer.setEnabled(true);
    }//GEN-LAST:event_bPararActionPerformed

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
            java.util.logging.Logger.getLogger(CondicionesCompetencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CondicionesCompetencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CondicionesCompetencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CondicionesCompetencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CondicionesCompetencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area1;
    private javax.swing.JTextArea Area2;
    private javax.swing.JTextArea Area3;
    private javax.swing.JTextArea Area4;
    private javax.swing.JButton bCorrer;
    private javax.swing.JButton bParar;
    private javax.swing.JButton bPausar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel plato1;
    private javax.swing.JLabel plato2;
    private javax.swing.JLabel plato3;
    private javax.swing.JLabel plato4;
    // End of variables declaration//GEN-END:variables
    private Hilo h1, h2, h3, h4;
    private RCompartido rc;
    private Cerradura c;
}
