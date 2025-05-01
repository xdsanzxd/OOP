package POO.Objecto;

public class Objecto {
    public static void main(String[] args) {
        // Creación de un objeto Persona
        Persona persona1 = new Persona("Fernando", 30);
        persona1.mostrarInformacion();

        // Creación del objeto ContadorDeChistes
        ContadorDeChistes contadorDeChistes = new ContadorDeChistes();
        contadorDeChistes.contarChiste();
    }
}
