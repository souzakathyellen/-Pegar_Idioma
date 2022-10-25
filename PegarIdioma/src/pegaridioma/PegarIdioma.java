package pegaridioma;

import java.util.Locale;

public class PegarIdioma {
    
    public static void main(String[] args) {
        
        Locale idioma = Locale.getDefault();

        System.out.println("Seu idioma é: " + idioma.getDisplayLanguage());

    }
    
}
