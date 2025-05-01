package POO.Objecto;

import java.util.Random;

public class ContadorDeChistes {
    private String[] chistes = {
            "¿Por qué el libro de matemáticas estaba triste? Porque tenía demasiados problemas.",
            "¿Cómo se llama el campeón de buceo japonés? Tokofondo. ¿Y el subcampeón? Kasitoko.",
            "¿Qué le dice una impresora a otra? ¿Esa hoja es tuya o es impresión mía?",
            "¿Por qué los pájaros no usan Facebook? Porque ya tienen Twitter."
    };

    // Método para contar y mostrar un chiste al azar
    public void contarChiste() {
        Random random = new Random();
        int indice = random.nextInt(chistes.length);
        System.out.println(chistes[indice]);
    }
}
