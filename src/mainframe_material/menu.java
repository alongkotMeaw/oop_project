/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mainframe_material;

import file_loader.file_reader_for_add;

/**
 *
 * @author meama
 */
public class menu extends javax.swing.JPanel {

        /**
         * Creates new form menu
         */
        public menu() {
                initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                main_menu_panel = new javax.swing.JPanel();
                Menu_panel = new javax.swing.JTabbedPane();
                snacks_panel2 = new javax.swing.JPanel();
                snacks_jScrollPane = new javax.swing.JScrollPane();
                snacks_panel_for_add = new javax.swing.JPanel();
                panel_test = new javax.swing.JPanel();
                menu_panel3 = new javax.swing.JPanel();
                maincourse_jScrollPane = new javax.swing.JScrollPane();
                maincourse_panel_for_add = new javax.swing.JPanel();
                menu_panel4 = new javax.swing.JPanel();
                one_dish_jScrollPane = new javax.swing.JScrollPane();
                one_dish_panel_for_add = new javax.swing.JPanel();
                menu_panel5 = new javax.swing.JPanel();
                drinks_jScrollPane = new javax.swing.JScrollPane();
                drinks_panel_for_add = new javax.swing.JPanel();
                menu_panel6 = new javax.swing.JPanel();
                desert_jScrollPane = new javax.swing.JScrollPane();
                dessert_panel_for_add1 = new javax.swing.JPanel();
                add_Reader_adapter = new file_reader_for_add();

                Menu_panel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 16)); // NOI18N

                snacks_jScrollPane.setHorizontalScrollBar(null);

                snacks_panel_for_add.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 16)); // NOI18N

                javax.swing.GroupLayout panel_testLayout = new javax.swing.GroupLayout(panel_test);
                panel_test.setLayout(panel_testLayout);
                panel_testLayout.setHorizontalGroup(
                                panel_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 666, Short.MAX_VALUE));
                panel_testLayout.setVerticalGroup(
                                panel_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 100, Short.MAX_VALUE));

                snacks_jScrollPane.setViewportView(snacks_panel_for_add);

                javax.swing.GroupLayout snacks_panel2Layout = new javax.swing.GroupLayout(snacks_panel2);
                snacks_panel2.setLayout(snacks_panel2Layout);
                snacks_panel2Layout.setHorizontalGroup(
                                snacks_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                snacks_panel2Layout.createSequentialGroup()
                                                                                .addContainerGap()
                                                                                .addComponent(snacks_jScrollPane)
                                                                                .addContainerGap()));
                snacks_panel2Layout.setVerticalGroup(
                                snacks_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(snacks_jScrollPane,
                                                                javax.swing.GroupLayout.Alignment.TRAILING));

                Menu_panel.addTab("ของว่าง", snacks_panel2);

                maincourse_jScrollPane.setHorizontalScrollBar(null);

                maincourse_jScrollPane.setViewportView(maincourse_panel_for_add);

                javax.swing.GroupLayout menu_panel3Layout = new javax.swing.GroupLayout(menu_panel3);
                menu_panel3.setLayout(menu_panel3Layout);
                menu_panel3Layout.setHorizontalGroup(
                                menu_panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_panel3Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(maincourse_jScrollPane,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                668,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                menu_panel3Layout.setVerticalGroup(
                                menu_panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(maincourse_jScrollPane));

                Menu_panel.addTab("อาหารจานหลัก", menu_panel3);

                one_dish_jScrollPane.setHorizontalScrollBar(null);

                one_dish_jScrollPane.setViewportView(one_dish_panel_for_add);

                javax.swing.GroupLayout menu_panel4Layout = new javax.swing.GroupLayout(menu_panel4);
                menu_panel4.setLayout(menu_panel4Layout);
                menu_panel4Layout.setHorizontalGroup(
                                menu_panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_panel4Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(one_dish_jScrollPane,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                668,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                menu_panel4Layout.setVerticalGroup(
                                menu_panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(one_dish_jScrollPane));

                Menu_panel.addTab("อาหารจานเดียว", menu_panel4);

                drinks_jScrollPane.setHorizontalScrollBar(null);

                drinks_jScrollPane.setViewportView(drinks_panel_for_add);

                javax.swing.GroupLayout menu_panel5Layout = new javax.swing.GroupLayout(menu_panel5);
                menu_panel5.setLayout(menu_panel5Layout);
                menu_panel5Layout.setHorizontalGroup(
                                menu_panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_panel5Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(drinks_jScrollPane,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                668,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                menu_panel5Layout.setVerticalGroup(
                                menu_panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(drinks_jScrollPane));

                Menu_panel.addTab("เครื่องดืม", menu_panel5);

                desert_jScrollPane.setHorizontalScrollBar(null);

                desert_jScrollPane.setViewportView(dessert_panel_for_add1);

                javax.swing.GroupLayout menu_panel6Layout = new javax.swing.GroupLayout(menu_panel6);
                menu_panel6.setLayout(menu_panel6Layout);
                menu_panel6Layout.setHorizontalGroup(
                                menu_panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_panel6Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(desert_jScrollPane,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                668,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                menu_panel6Layout.setVerticalGroup(
                                menu_panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_panel6Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(desert_jScrollPane,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                382,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));

                Menu_panel.addTab("ของหวาน", menu_panel6);

                javax.swing.GroupLayout main_menu_panelLayout = new javax.swing.GroupLayout(main_menu_panel);
                main_menu_panel.setLayout(main_menu_panelLayout);
                main_menu_panelLayout.setHorizontalGroup(
                                main_menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(main_menu_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(Menu_panel)
                                                                .addContainerGap()));
                main_menu_panelLayout.setVerticalGroup(
                                main_menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Menu_panel, javax.swing.GroupLayout.Alignment.TRAILING));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 692, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                .addComponent(main_menu_panel,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, Short.MAX_VALUE))));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 429, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                .addComponent(main_menu_panel,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, Short.MAX_VALUE))));
                // call reader for add all menu
                add_Reader_adapter.menu_reader_for_panel_add("src\\restaurant_log\\menu_list\\drinks.txt",
                                drinks_panel_for_add, "drinks");

                add_Reader_adapter.menu_reader_for_panel_add("src\\restaurant_log\\menu_list\\maincourse_menu.txt",
                                maincourse_panel_for_add,
                                "maincourse");

                add_Reader_adapter.menu_reader_for_panel_add("src/restaurant_log/menu_list/snack_menu.txt",
                                snacks_panel_for_add, "snack");

                add_Reader_adapter.menu_reader_for_panel_add("src\\restaurant_log\\menu_list\\desert_menu.txt",
                                dessert_panel_for_add1, "desert");
                add_Reader_adapter.menu_reader_for_panel_add("src\\restaurant_log\\menu_list\\one_dish_menu.txt",
                                one_dish_panel_for_add, "one_dish");
        }// </editor-fold>//GEN-END:initComponents

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private file_reader_for_add add_Reader_adapter;
        private javax.swing.JTabbedPane Menu_panel;
        private javax.swing.JScrollPane desert_jScrollPane;
        private javax.swing.JPanel dessert_panel_for_add1;
        private javax.swing.JScrollPane drinks_jScrollPane;
        private javax.swing.JPanel drinks_panel_for_add;
        private javax.swing.JPanel main_menu_panel;
        private javax.swing.JScrollPane maincourse_jScrollPane;
        private javax.swing.JPanel maincourse_panel_for_add;
        private javax.swing.JPanel menu_panel3;
        private javax.swing.JPanel menu_panel4;
        private javax.swing.JPanel menu_panel5;
        private javax.swing.JPanel menu_panel6;
        private javax.swing.JScrollPane one_dish_jScrollPane;
        private javax.swing.JPanel one_dish_panel_for_add;
        private javax.swing.JPanel panel_test;
        private javax.swing.JScrollPane snacks_jScrollPane;
        private javax.swing.JPanel snacks_panel2;
        private javax.swing.JPanel snacks_panel_for_add;
        // End of variables declaration//GEN-END:variables
}
