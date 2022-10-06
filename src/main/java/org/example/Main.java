package org.example;


import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);
    private String enlaceFijo = "https://emojihub.herokuapp.com/api/random/group_";
    public String enlaceDinamico;

    public void main(String args[]){
        System.out.println("""
                
                [1] Por categoría
                [2] Por grupo
                [3] Aleatorio
                [4] Salir
                
                """);
        String resp = input.nextLine();

        if (resp == "1"){
            System.out.println("""
                    Todas las categorías:
                    
                    [1] Gente y caras
                    [2] Animales y naturaleza
                    [3] Comida y bebida
                    [4] Viajes y sitios
                    [5] Actividades
                    [6] Objetos
                    [7] Símbolos
                    [8] Banderas
                    
                    
                    """);
            String cate = input.nextLine();
            switch (cate){
                case "1":
                    enlaceDinamico = "smileys_and_people";
                case "2":
                    enlaceDinamico = "animals_and_nature";
                case "3":
                    enlaceDinamico = "food_and_drink";
                case "4":
                    enlaceDinamico = "travel_and_places";
                case "5":
                    enlaceDinamico = "activities";
                case "6":
                    enlaceDinamico = "objects";
                case "7":
                    enlaceDinamico = "symbols";
                case "8":
                    enlaceDinamico = "flags";
                default:
                    break;
            }

        }else if (resp == "2"){
            System.out.println("""
                    Todas los grupos:
                    
                    [1] body
                    [2] cat_face
                    [3] clothing
                    [4] creature_face
                    [5] emotion
                    [6] face_negative
                    [7] face_neutral
                    [8] face_positive
                    [9] face_positive
                    [10] face_role
                    [11] face_sick
                    [12] family
                    [13] monkey_face
                    [14] person
                    [15] person_activity
                    [16] person_gesture
                    [17] person_role
                    [18] skin_tone
                    [19] animal_amphibian
                    [20] animal_bird
                    [21] animal_bug
                    [22] animal_mammal
                    [23] animal_marine
                    [24] animal_reptile
                    [25] plant_flower
                    [26] plant_other
                    [27] travel_and_places
                    [28] activities
                    [29] objects
                    [30] symbols
                    [31] flags
                    
                    
                    """);
            String cate = input.nextLine();
            switch (cate){
                case "1":
                    enlaceDinamico = "body";
                case "2":
                    enlaceDinamico = "cat_face";
                case "3":
                    enlaceDinamico = "clothing";
                case "4":
                    enlaceDinamico = "creature_face";
                case "5":
                    enlaceDinamico = "emotion";
                case "6":
                    enlaceDinamico = "face_negative";
                case "7":
                    enlaceDinamico = "face_neutral";
                case "8":
                    enlaceDinamico = "face_positive";
                case "9":
                    enlaceDinamico = "face_positive";
                case "10":
                    enlaceDinamico = "face_role";
                case "11":
                    enlaceDinamico = "face_sick";
                case "12":
                    enlaceDinamico = "family";
                case "13":
                    enlaceDinamico = "monkey_face";
                case "14":
                    enlaceDinamico = "person";
                case "15":
                    enlaceDinamico = "person_activity";
                case "16":
                    enlaceDinamico = "person_gesture";
                case "17":
                    enlaceDinamico = "person_role";
                case "18":
                    enlaceDinamico = "skin_tone";
                case "19":
                    enlaceDinamico = "animal_amphibian";
                case "20":
                    enlaceDinamico = "animal_bird";
                case "21":
                    enlaceDinamico = "animal_bug";
                case "22":
                    enlaceDinamico = "animal_mammal";
                case "23":
                    enlaceDinamico = "animal_marine";
                case "24":
                    enlaceDinamico = "animal_reptile";
                case "25":
                    enlaceDinamico = "plant_flower";
                case "26":
                    enlaceDinamico = "plant_other";
                case "27":
                    enlaceDinamico = "travel_and_places";
                case "28":
                    enlaceDinamico = "activities";
                case "29":
                    enlaceDinamico = "objects";
                case "30":
                    enlaceDinamico = "symbols";
                case "31":
                    enlaceDinamico = "flags";
                default:
                    break;
            }
        }


    }


    public void metodo1() {
        try {
            URL enlace = new URL(enlaceFijo + enlaceDinamico);
            ObjectMapper mapa = new ObjectMapper();
            Response respuesta = mapa.getResults().stream().forEach(System.out::println);
        }catch (IOException e){
            System.out.println(e);
        }

    }
}