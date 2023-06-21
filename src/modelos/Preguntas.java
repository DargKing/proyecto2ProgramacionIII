/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */

public class Preguntas {

    private String url; //ruta relativa del archivo 

    public Preguntas(String url) {
        this.url = url;
    }

    //metodos
    public Question[] obtenerPreguntas() throws IOException {
        String json = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(this.url));

            String linea = "";
            while (null != (linea = br.readLine())) {
                json += linea;
            }
            br.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Preguntas.class.getName()).log(Level.SEVERE, null, ex);
        }

        Gson gson = new Gson();
        Question preguntas[] = gson.fromJson(json, Question[].class);

        return preguntas;
    }

    public Question[] pruebaAleatoria(Question[] array, int len) {
        Question[] temp = new Question[len]; //alamcena las 25 preguntas finales 
        int posicion;  //almacena la posicion de la pregunta aleatoriamente
        int x = 0; //la cantidad de preguntas que se han almacenado hasta ahora en temp

        // Preguntas de 1 respuesta
        for (int i = 0; i < 5; i++) {
            boolean exist = false; //comprueba un valor de emergencia que te avisa si ya existe esa misma pregunta en el array
            posicion = (int) (Math.random() * array.length);
            Question pregunta = array[posicion];

            
            
            if (pregunta.getRespuestasCorrectas().length != 1 || pregunta.getPosiblesRespuestas()[0].equals("Verdadero") || pregunta.getPosiblesRespuestas()[1].equals("Falso")) {
                i--;
                continue;
            }

            for (int j = 0; j < x; j++) { //comprueba si la pregunta existe 
                if (temp[j].equals(pregunta)) { //si las preguntas ya almacenadas es igual a la pregunta nueva entonces 
                    exist = true;                  //descarta la nueva pregunta y crea otra diferente 
                    i--;
                    break;
                }
            }

            if (!exist) {
                temp[i] = pregunta;
                x++;
            }
        }

        // Preguntas de 2 respuesta
        for (int i = x; i < 10; i++) {
            boolean exist = false; //comprueba un valor de emergencia que te avisa si ya existe esa misma pregunta en el array
            posicion = (int) (Math.random() * array.length);
            Question pregunta = array[posicion];
            
            if (pregunta.getRespuestasCorrectas().length != 2) {
                i--;
                continue;
            }

            for (int j = 0; j < x; j++) { //comprueba si la pregunta existe 
                if (temp[j].equals(pregunta)) { //si las preguntas ya almacenadas es igual a la pregunta nueva entonces 
                    exist = true;                  //descarta la nueva pregunta y crea otra diferente 
                    i--;
                    break;
                }
            }

            if (!exist) {
                temp[i] = pregunta;
                x++;
            }
        }

        // Preguntas de 3 respuesta
        for (int i = x; i < 15; i++) {
            boolean exist = false; //comprueba un valor de emergencia que te avisa si ya existe esa misma pregunta en el array
            posicion = (int) (Math.random() * array.length);
            Question pregunta = array[posicion];
            
            if (pregunta.getRespuestasCorrectas().length != 3) {
                i--;
                continue;
            }

            for (int j = 0; j < x; j++) { //comprueba si la pregunta existe 
                if (temp[j].equals(pregunta)) { //si las preguntas ya almacenadas es igual a la pregunta nueva entonces 
                    exist = true;                  //descarta la nueva pregunta y crea otra diferente 
                    i--;
                    break;
                }
            }

            if (!exist) {
                temp[i] = pregunta;
                x++;
            }
        }

        // Preguntas de Verdadero o Falso
        for (int i = x; i < 20; i++) {
            boolean exist = false; //comprueba un valor de emergencia que te avisa si ya existe esa misma pregunta en el array
            posicion = (int) (Math.random() * array.length);
            Question pregunta = array[posicion];
            
            if (pregunta.getRespuestasCorrectas().length != 1 || pregunta.getPosiblesRespuestas().length != 2) {
                i--;
                continue;
            }

            for (int j = 0; j < x; j++) { //comprueba si la pregunta existe 
                if (temp[j].equals(pregunta)) { //si las preguntas ya almacenadas es igual a la pregunta nueva entonces 
                    exist = true;                  //descarta la nueva pregunta y crea otra diferente 
                    i--;
                    break;
                }
            }

            if (!exist) {
                temp[i] = pregunta;
                x++;
            }
        }
        
        // Preguntas de texto
        for (int i = x; i < 25; i++) {
            boolean exist = false; //comprueba un valor de emergencia que te avisa si ya existe esa misma pregunta en el array
            posicion = (int) (Math.random() * array.length);
            Question pregunta = array[posicion];
            
            if (pregunta.getPosiblesRespuestas().length != 1) {
                i--;
                continue;
            }

            for (int j = 0; j < x; j++) { //comprueba si la pregunta existe 
                if (temp[j].equals(pregunta)) { //si las preguntas ya almacenadas es igual a la pregunta nueva entonces 
                    exist = true;                  //descarta la nueva pregunta y crea otra diferente 
                    i--;
                    break;
                }
            }

            if (!exist) {
                temp[i] = pregunta;
                x++;
            }
        }
        
        return temp;
    }
}
