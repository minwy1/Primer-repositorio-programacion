public class Entrada {

    //aqui explicas algo Brevemente para aclararte las ideas
    //en esta linea hago una aclaracion diferente
    /*
    Este comentario admite unas cuantas lineas
    esta es la segunda linea...
     */
    //TODO esta tarea la dejo pendiente para el lunes

    /**
     * @autor
     * @version1.0
     * @param arg explica el parametro
     * @return explica el retorno
     */

// mod_acceso retorno nombre (args) { funcionalidad }

    public static void main(String[] args){

        // variables:
        //segun el dato que guara: string, char, byte/shot/int/long, double/float, boolean

        //tipo nombre=valor
        String nombreLegal = "Alvaro";
        nombreLegal = "Alvaro2"; //Esto sobreescribe el valor dado previamente a la variable
        char letra = 'a';
        int edad = 27;
        double altura = 1.76;
        float alturaFloat = 1.76f;
        boolean acierto = true;

    //ordenes a ejecutar
        System.out.println("Hola mundo");
        System.out.println("segunda linea");
        System.out.print("tercera");
        System.out.print("tercera aun \n cuarta");
        System.out.println(9);
        System.out.println(9.75);
        System.out.println(9+5);
        System.out.println(9*7);
        System.out.println('a');
        System.out.println("La suma de "+9+" y "+6+" tiene como resultado "+ (9+6));
        System.out.println("Mi nombre es "+nombreLegal);
        System.out.println("el resultado de la evaluacion es "+acierto);
    }



}