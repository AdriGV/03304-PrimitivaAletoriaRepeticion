/* 
 * Copyright 2019 AdrianGV  adrian.gimeno.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;


import java.util.Random;

/**
 *
 * @author AdrianGV adrian.gimeno.alum@iescamp.es
 */
public final class Main {

    public static final Random RND = new Random();


    public static void main(String[] args) {
        
        //Constantes
        int NUMERO_MIN = 1;
        int NUMERO_MAX = 49;        
        int CUENTA_FIN = 6;
        
        //Variables
        int numero = 1;
        int numeroRND;
               
       
    while ( numero <= CUENTA_FIN){
        
            numeroRND = RND.nextInt(NUMERO_MAX - NUMERO_MIN + 1) + NUMERO_MIN;
        
            System.out.printf("Número %d ...: %d%n",numero + 1, numeroRND);
            
        
        //Actualización
        numero++;
    }
    
    }
    
}
