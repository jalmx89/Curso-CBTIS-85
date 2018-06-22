/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author josef
 */
public class LeyOhm extends javax.swing.JFrame {

    public static final String VOLTAJE_TEXTO = "Voltaje";
    public static final String CORRIENTE_TEXTO = "Corriente";
    public static final String RESISTENCIA_TEXTO = " Resistencia";
    
    public static final String VOLTAJE_UNIDAD = "Volts";
    public static final String CORRIENTE_UNIDAD = "Amps";
    public static final String RESISTENCIA_UNIDAD = " Ohms";

    /**
     * Creates new form LeyOhm
     */
    public LeyOhm() {
        initComponents();
        addGroupRadio();
    }

    private void addGroupRadio() {
        buttonGroup1.add(voltajeRadio);
        buttonGroup1.add(resistenciaRadio);
        buttonGroup1.add(corrienteRadio);
    }

    private void seleccionado() {

        double resultado = 0;
        String unidad = "";

        if (voltajeRadio.isSelected()) {
            if (verificandoValores()) {
                resultado = calculoVoltaje(
                        Double.parseDouble(campoUno.getText()),
                        Double.parseDouble(campoDos.getText())
                );
                unidad = "V";
            }
        } else if (corrienteRadio.isSelected()) {
            if (verificandoValores()) {
                resultado = calculoCorriente(
                        Double.parseDouble(campoUno.getText()),
                        Double.parseDouble(campoDos.getText())
                );
                unidad = "A";
            }
        } else if (resistenciaRadio.isSelected()) {
            if (verificandoValores()) {
                resultado = calculoResistencia(
                        Double.parseDouble(campoUno.getText()),
                        Double.parseDouble(campoDos.getText())
                );
                unidad = "Ohm";
            }
        }
        etiquetaResultado.setText(String.format("%.2f", resultado) +" "+ unidad);
    }

    private boolean verificandoValores() {

        try {
            Double.parseDouble(campoUno.getText());
            Double.parseDouble(campoDos.getText());
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al ingresar los datos");
            return false;
        }

    }

    private double calculoVoltaje(double corriente, double resistencia) {
        return corriente * resistencia;
    }

    private double calculoCorriente(double voltaje, double resistencia) {
        return voltaje / resistencia;
    }

    private double calculoResistencia(double voltaje, double corriente) {
        return voltaje / corriente;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        voltajeRadio = new javax.swing.JRadioButton();
        resistenciaRadio = new javax.swing.JRadioButton();
        corrienteRadio = new javax.swing.JRadioButton();
        etiquetaDos = new javax.swing.JLabel();
        etiquetaUno = new javax.swing.JLabel();
        campoUno = new javax.swing.JTextField();
        campoDos = new javax.swing.JTextField();
        etiquetaResultado = new javax.swing.JLabel();
        botonCalcular = new javax.swing.JButton();
        etiquetaUnidadUno = new javax.swing.JLabel();
        etiquetaUnidadDos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ley de Ohm");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LEY DE OHM");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Calcular"));

        voltajeRadio.setSelected(true);
        voltajeRadio.setText("Voltaje");
        voltajeRadio.setToolTipText("Calculará voltaje");
        voltajeRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltajeRadioActionPerformed(evt);
            }
        });

        resistenciaRadio.setText("Resistencia");
        resistenciaRadio.setToolTipText("Calculará resistencia");
        resistenciaRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resistenciaRadioActionPerformed(evt);
            }
        });

        corrienteRadio.setText("Corriente");
        corrienteRadio.setToolTipText("Calculará corriente");
        corrienteRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corrienteRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(voltajeRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(corrienteRadio)
                .addGap(34, 34, 34)
                .addComponent(resistenciaRadio))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltajeRadio)
                    .addComponent(resistenciaRadio)
                    .addComponent(corrienteRadio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        etiquetaDos.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        etiquetaDos.setText("Resistencia");

        etiquetaUno.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        etiquetaUno.setText("Corriente");

        etiquetaResultado.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        etiquetaResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaResultado.setText("0");

        botonCalcular.setText("Calcular");
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });

        etiquetaUnidadUno.setText("Amps");

        etiquetaUnidadDos.setText("Ohms");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaDos)
                            .addComponent(etiquetaUno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoUno)
                            .addComponent(campoDos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiquetaUnidadUno)
                            .addComponent(etiquetaUnidadDos))
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaUno)
                    .addComponent(campoUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaUnidadUno))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaDos)
                    .addComponent(campoDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaUnidadDos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonCalcular)
                .addGap(18, 18, 18)
                .addComponent(etiquetaResultado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        seleccionado();
    }//GEN-LAST:event_botonCalcularActionPerformed

    private void voltajeRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltajeRadioActionPerformed
        etiquetaUno.setText(CORRIENTE_TEXTO);
        etiquetaDos.setText(RESISTENCIA_TEXTO);
        
        etiquetaUnidadUno.setText(CORRIENTE_UNIDAD);
        etiquetaUnidadDos.setText(RESISTENCIA_UNIDAD);
    }//GEN-LAST:event_voltajeRadioActionPerformed

    private void corrienteRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corrienteRadioActionPerformed
        etiquetaUno.setText(VOLTAJE_TEXTO);
        etiquetaDos.setText(RESISTENCIA_TEXTO);
        
        etiquetaUnidadUno.setText(VOLTAJE_UNIDAD);
        etiquetaUnidadDos.setText(RESISTENCIA_UNIDAD);
    }//GEN-LAST:event_corrienteRadioActionPerformed

    private void resistenciaRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resistenciaRadioActionPerformed
        etiquetaUno.setText(VOLTAJE_TEXTO);
        etiquetaDos.setText(CORRIENTE_TEXTO);
        
        etiquetaUnidadUno.setText(VOLTAJE_UNIDAD);
        etiquetaUnidadDos.setText(CORRIENTE_UNIDAD);
    }//GEN-LAST:event_resistenciaRadioActionPerformed

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
            java.util.logging.Logger.getLogger(LeyOhm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeyOhm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeyOhm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeyOhm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LeyOhm l = new LeyOhm();
                l.setVisible(true);
                l.setLocationRelativeTo(null);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalcular;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campoDos;
    private javax.swing.JTextField campoUno;
    private javax.swing.JRadioButton corrienteRadio;
    private javax.swing.JLabel etiquetaDos;
    private javax.swing.JLabel etiquetaResultado;
    private javax.swing.JLabel etiquetaUnidadDos;
    private javax.swing.JLabel etiquetaUnidadUno;
    private javax.swing.JLabel etiquetaUno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton resistenciaRadio;
    private javax.swing.JRadioButton voltajeRadio;
    // End of variables declaration//GEN-END:variables
}