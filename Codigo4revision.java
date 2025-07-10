/**
 * Este odigo lee el string ingresado por dos jugadores, primero el jugador numero 1
 * despues pide el string del jugador 2  en este caso piedra, papel o tijeras
 * lee los datos de cada uno y  en primera instancia  lo compara con una codicion usando equals para comparar strings
 * y despues se evaluan los datos de los jugadores con un switch tomando como parametro al j1
 * y evalua con 3 case "piedra", "papel", "tijeras" y se compara con in if y .equals cada 1 finalmente con el default se muestra
 * si el usuario ingreso una palabra no validao diferente que "piedra", "papel", "tijeras"
 * y hasta fuera del switch se imprime un que jugador gano.
 * */


package org.generation.revision4;


import java.util.Scanner; // se importo la utilidad de scanner

public class Codigo4revision {
    public static void main(String[] args) {//se creo el metodo main para usar el SOUT


    Scanner s = new Scanner(System.in); //se inserto el System.in para recibir los datos de entrada


    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.next(); //se quito el line despues del next y se dejo solo next()

    System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");

    String j2 = s.next();//se quito el line despues del next y se dejo solo next()

    if (j1.equals(j2)) {//se usa equals para comparar string y no ==
        System.out.println("Empate");
    } else {
        int g = 2;
        switch(j1) {
            case "piedra":
                if (j2.equals( "tijeras")) {//se usa equals para comparar string y no ==
                    g = 1;
                }
                break;
            case "papel":
                if (j2.equals("piedra")) {//se usa equals para comparar string y no ==
                    g = 1;
                }
                break;
                case "tijeras": //el valor de tijeras era incorrecto
                        if (j2.equals("papel")) {//se usa equals para comparar string y no ==
                            g = 1;
                        }
                        break;
                    default:
                        System.out.println("Opción inválida"); // se asigno un resultado para default en caso de que no se ingresara un valor correcto
                        return;
                }

                System.out.println("Ganaste jugador " + g+" Felicidades");
        }
}
    }

