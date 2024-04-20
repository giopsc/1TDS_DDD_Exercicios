package com.example;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML TextField productName;
    @FXML TextField sectorName;
    @FXML TextArea productList;
    
    ArrayList<String> products = new ArrayList<>();
    ArrayList<String> sectors = new ArrayList<>();
    
    @FXML
    private void adicionarProduto(){
        String prodTxt = productName.getText();
        products.add(prodTxt);
        String secTxt = sectorName.getText();
        sectors.add(secTxt);

        products.sort((sectorName, o2) -> sectorName.compareTo(prodTxt));
        mostrarProdutos();
    }

    private void mostrarProdutos() {
        productList.clear();
        for (var product : products){
            productList.appendText(product + "\n");
        }

    }
}
