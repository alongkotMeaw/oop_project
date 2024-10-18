/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mainframe_material;

/**
 *
 * @author meama
 */
public class cart_sub_panel extends javax.swing.JPanel {

    /**
     * Creates new form cart_sub_panel
     */
    public cart_sub_panel(String name, double prince, int quatity, String catalog) {
        initComponents(name, prince, quatity, catalog);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents(String name, double prince, int quatity, String catalog) {

        quatity_label = new javax.swing.JLabel();
        menu_neme_label = new javax.swing.JLabel();
        total_label = new javax.swing.JLabel();
        remove_button = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(996, 120));

        quatity_label.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 16)); // NOI18N
        quatity_label.setText("" + quatity);

        menu_neme_label.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 16)); // NOI18N
        menu_neme_label.setText(name);

        total_label.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 16)); // NOI18N
        total_label.setText("ราคารวม " + (prince * quatity));

        remove_button.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        remove_button.setForeground(new java.awt.Color(255, 51, 51));
        remove_button.setText("-");
        remove_button.putClientProperty("JButton.buttonType", "roundRect");
        remove_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(quatity_label)
                                .addGap(126, 126, 126)
                                .addComponent(menu_neme_label)
                                .addGap(155, 155, 155)
                                .addComponent(total_label)
                                .addGap(122, 122, 122)
                                .addComponent(remove_button)
                                .addContainerGap(76, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(quatity_label)
                                        .addComponent(menu_neme_label)
                                        .addComponent(remove_button)
                                        .addComponent(total_label))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
    }// </editor-fold>//GEN-END:initComponents

    private void remove_buttonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_remove_buttonActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_remove_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel menu_neme_label;
    private javax.swing.JLabel quatity_label;
    private javax.swing.JButton remove_button;
    private javax.swing.JLabel total_label;
    // End of variables declaration//GEN-END:variables
}
