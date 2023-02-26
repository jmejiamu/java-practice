/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package open.bootcamp;

/**
 *
 * @author josemejia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        int numberIf = 0;

        if (numberIf > 0) {
            System.out.println("This is a positive number");
        } else if (numberIf < 0) {
            System.out.println("This is a negative number");
        }

        //- Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        int numberWhile = 0;

        while (numberWhile < 3) {
            System.out.println(numberWhile);
            numberWhile++;

        }

        //- Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        do {
            System.out.println(numberWhile);
            numberWhile++;
        } while (numberWhile < 1);

        //- Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
        for (int numberFor = 0; numberFor <= 3; numberFor++) {
            System.out.println("Output: " + numberFor);
        }

        // -Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
        String season = "SUMMER";
        switch(season){
            case "SPRING":
                System.out.println("Spring");
                break;
            case "SUMMER":
                System.out.println("Summer");
                break;
            case "AUTUMN":
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid season");
        }
    }

}
