package file_loader;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.io.*;
import javax.swing.*;

import mainframe_material.cart_panel;
import mainframe_material.cart_sub_panel;
import src.order.Menu_panel_box;

import java.awt.image.BufferedImage;
import java.awt.*;
import java.nio.charset.StandardCharsets;

public class file_reader_cart {

    public void menu_reader_for_panel_add(String filePath, JPanel panelForAdd) {
        panelForAdd.setLayout(new BoxLayout(panelForAdd, BoxLayout.Y_AXIS));
        System.out.println("file reader call by " + filePath);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"))) {
            String data;
            while ((data = br.readLine()) != null) {
                String[] arrOfStr = data.split(",");

                if (arrOfStr.length == 4) {
                    String catalog = arrOfStr[0];
                    String name = arrOfStr[1];
                    double price = Double.parseDouble(arrOfStr[2]);
                    int quatity = Integer.parseInt(arrOfStr[3]);
                    panelForAdd.add(new cart_sub_panel(name, price, quatity, catalog));
                } else {
                    System.err.println("Invalid data format: " + data);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("load eror " + filePath);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format: " + e.getMessage());
        }
    }

    public void mewnu_add() {
    };

}