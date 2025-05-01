package POO;

import java.util.Random;

public class Objecto {

    public class Persona{
        String nombre;
        int edad;
        //Constructor de la clase
        Persona(String nombre, int edad){
            this.nombre=nombre;
            this.edad=edad;
        }
        //Metodo para mostrar información
        public void mostrarInformacion(){
            System.out.println("Nombre:"+nombre);
            System.out.print("Edad:"+edad);
        }
    }

    public class ContadorDeChistes{
        private String[] chistes ={
                "¿Por qué el libro de matemáticas estaba triste? Porque tenía demasiados problemas.",
                "¿Cómo se llama el campeón de buceo japonés? Tokofondo. ¿Y el subcampeón? Kasitoko.",
                "¿Qué le dice una impresora a otra? ¿Esa hoja es tuya o es impresión mía?",
                "¿Por qué los pájaros no usan Facebook? Porque ya tienen Twitter."
        };
        //Metodo para contar y mostrar un chiste al azar
        void contarchiste(){
            Random random = new Random();
            int indice = random.nextInt(chistes.length);
            System.out.println(chistes[indice]);
        }
    }
    public void main(String args[]){
        //Creación de un objecto Persona
        Persona persona1 = new Persona("Fernando",30);
        persona1.mostrarInformacion();

        //Creación del objecto chiste
        ContadorDeChistes contadorDeChistes = new ContadorDeChistes();
        contadorDeChistes.contarchiste();

    }
}
