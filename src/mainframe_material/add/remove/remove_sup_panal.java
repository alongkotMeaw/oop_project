package mainframe_material.add.remove;

import java.awt.Dimension;
import java.nio.charset.StandardCharsets;
import main.main;
import java.io.*;

/**
 *
 * @author meama
 */
public class remove_sup_panal extends javax.swing.JPanel {

    /**
     * Creates new form remove_sup_panal
     */
    public remove_sup_panal(String menu_name, double menu_price, int menu_status, int menu_index,
            add_remove_panel main, String menu_type, String image_path) {
        this.menu_name = menu_name;
        this.menu_price = menu_price;
        this.menu_status = menu_status;
        this.menu_index = menu_index;
        this.main = main;
        this.menu_type = menu_type;
        this.image_paht = image_path;
        initComponents(menu_name, menu_status);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents(String menu_name, int menu_status) {

        menu_name_label = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        setBackground(new java.awt.Color(255, 255, 255));

        setPreferredSize(new java.awt.Dimension(436, 100));
        menu_name_label.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18));
        menu_name_label.setText(menu_name);
        jButton3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18));
        jButton2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18));
        jButton2.setText("ลบ");
        jButton3.setText("ปิด");

        jButton2.setPreferredSize(new Dimension(10, 10));
        jButton3.setPreferredSize(new Dimension(10, 10));
        if (menu_status == 0) {
            jButton3.setText("เปิด");
        }
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        // fix layout for add remove supanel here
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(menu_name_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223,
                                        Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addGap(59, 59, 59)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(19, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(menu_name_label)
                                        .addComponent(jButton2)
                                        .addComponent(jButton3))
                                .addGap(17, 17, 17)));

    }// </editor-fold>

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // main.action_button_of_suppanel(menu_type, menu_index);
        String inputFilePath = "";
        String outputFilePath = "src\\restaurant_log\\menu_list\\temp.txt";
        if (menu_type == "Desert") {
            inputFilePath = "src\\restaurant_log\\menu_list\\desert_menu.txt";
        } else if (menu_type == "Snack") {
            inputFilePath = "src\\restaurant_log\\menu_list\\snack_menu.txt";
        } else if (menu_type == "Maincourse") {
            inputFilePath = "src\\restaurant_log\\menu_list\\maincourse_menu.txt";
        } else if (menu_type == "Onedish") {
            inputFilePath = "src\\restaurant_log\\menu_list\\one_dish_menu.txt";
        } else if (menu_type == "Drinks") {
            inputFilePath = "src\\restaurant_log\\menu_list\\drinks.txt";
        } else {
            System.out.println("Invalid menu type: " + menu_type);

        }
        System.out
                .println("file path " + inputFilePath + "menu status " + menu_status + "menu index " + menu_index + 1);
        if (menu_status == 1) {
            menu_status = 0;
            jButton3.setText("ปิด");
        } else {
            menu_status = 1;
            jButton3.setText("เปิด");
        }

        int lineToEdit = menu_index + 1;
        String newContent = menu_name + ',' + menu_price + ',' + menu_status + ',' + image_paht;
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(inputFilePath), StandardCharsets.UTF_8));
                BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(new FileOutputStream(outputFilePath), StandardCharsets.UTF_8))) {

            String line;
            int currentLine = 1;
            // write to temp
            while ((line = reader.readLine()) != null) {
                if (currentLine == lineToEdit) {
                    writer.write(newContent);
                } else {
                    writer.write(line);
                }
                writer.newLine();
                currentLine++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(outputFilePath), StandardCharsets.UTF_8));
                BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(new FileOutputStream(inputFilePath, false), StandardCharsets.UTF_8))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        String inputFilePath = "";
        String outputFilePath = "src\\restaurant_log\\menu_list\\temp.txt";
        if (menu_type == "Desert") {
            inputFilePath = "src\\restaurant_log\\menu_list\\desert_menu.txt";
        } else if (menu_type == "Snack") {
            inputFilePath = "src\\restaurant_log\\menu_list\\snack_menu.txt";
        } else if (menu_type == "Maincourse") {
            inputFilePath = "src\\restaurant_log\\menu_list\\maincourse_menu.txt";
        } else if (menu_type == "Onedish") {
            inputFilePath = "src\\restaurant_log\\menu_list\\one_dish_menu.txt";
        } else if (menu_type == "Drinks") {
            inputFilePath = "src\\restaurant_log\\menu_list\\drinks.txt";
        } else {
            System.out.println("Invalid menu type: " + menu_type);

        }
        int lineToEdit = menu_index + 1;
        String newContent = menu_name + ',' + menu_price + ',' + menu_status + ',' + image_paht;
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(inputFilePath), StandardCharsets.UTF_8));
                BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(new FileOutputStream(outputFilePath), StandardCharsets.UTF_8))) {

            String line;
            int currentLine = 1;
            // write to temp
            while ((line = reader.readLine()) != null) {
                if (currentLine == lineToEdit) {
                    System.out.println("delete sucess");
                } else {
                    writer.write(line);
                }
                writer.newLine();
                currentLine++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(outputFilePath), StandardCharsets.UTF_8));
                BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(new FileOutputStream(inputFilePath, false), StandardCharsets.UTF_8))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel menu_name_label;
    private String menu_name;
    private double menu_price;
    private int menu_status;
    private int menu_index;
    private add_remove_panel main;
    private String menu_type;
    private String image_paht;

    public int get_index() {
        return menu_index;
    }

    // End of variables declaration
}