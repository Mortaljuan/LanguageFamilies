import Language.*;

public class Main {
    public static void main(String[] args) {
        Language myLang = new Language("Chibchombano", 5000000,"South America", "Sujeto - Verbo - Predicado" );
        myLang.getInfo();

        Mayan akatek = new Mayan("Akatek",45430);
        akatek.getInfo();

        SinoTibetan mandarin = new SinoTibetan("Chinese Mandatin",1140000000);
        mandarin.getInfo();
        SinoTibetan burmese = new SinoTibetan("Burmese", 42900000);
        burmese.getInfo();
    }
}
