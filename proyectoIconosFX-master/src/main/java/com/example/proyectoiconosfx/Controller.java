package com.example.proyectoiconosfx;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.fasterxml.jackson.databind.ObjectMapper;


public class Controller implements Initializable {



    private String enlaceFijo = "https://emojihub.herokuapp.com/api/";

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void aleatorio(ActionEvent actionEvent ) {
        try {
            URL enlace = new URL(enlaceFijo + "/random");
            ObjectMapper mapa = new ObjectMapper();
            Response respuesta = mapa.readValue(enlace, Response.class);
            respuesta.getUnicode().stream().forEach(System.out::println);
        }catch (IOException e){
            System.out.println(e);
        }

    }



}
