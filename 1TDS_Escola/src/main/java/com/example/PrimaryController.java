package com.example;

import java.util.ArrayList;

import com.example.models.Aluno;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML TextField txtNome ;
    // @FXMl diz que não sera instanciada um textfield, pois já foi em primary
    // Alt + Shift + O -> organizar imports
    @FXML ListView<Aluno> lista;

    ArrayList<Aluno> nomes = new ArrayList<>();
    
    @FXML
    private void adicionar(){
        String nome = txtNome.getText();
        var aluno = new Aluno(nome, "1J", 23012);
        nomes.add(aluno);
        
        //anonymous class
        //função anonima - lambda expression 
        nomes.sort((o1, o2) -> o1.nome().compareToIgnoreCase(o2.nome()));
        mostrarAlunos();
    }

    public void mostrarAlunos(){
        lista.getItems().clear();
        for(var nome : nomes){
            lista.getItems().add(nome);
        }
    }

    public void apagar(){
        var aluno = lista.getSelectionModel().getSelectedItem();
        nomes.remove(aluno);
        mostrarAlunos();

        Alert msg = new Alert(AlertType.INFORMATION);
        msg.setHeaderText("Sucesso");
        msg.setContentText("Aluno apagado com sucesso");
        msg.show();
    }

}

//inner class
// class ComparadorDeAluno implements Comparator<String>{
//     @Override
//     public int compare(String o1, String o2) {
//         return o1.compareTo(o2);
//     }  
// }
