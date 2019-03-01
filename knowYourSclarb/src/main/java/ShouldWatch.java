public class ShouldWatch {

    public static String animu(boolean adult, int identity, int actress) {
        String animu;
        if (adult == true && identity == 1 && (actress == 1 || actress == 2)) {
            animu ="Perfect blue";
            System.out.println("Perfect blue");
        } else if (adult == false && identity == 1 && (actress == 1 || actress == 2)){
            animu="Puella magi madoka magica";
            System.out.println(animu);
        } else if (adult == true && identity == 2 && (actress == 1||actress==2)) {
            animu="akira";
            System.out.println(animu);
        } else if (adult == false && identity == 2 && (actress == 1 || actress==2)) {
            animu="Hyouka";
            System.out.println(animu);
        } else if (adult == true && identity == 3 && (actress == 3||actress==4)) {
            animu="Byousoku 5 Centimeter";
            System.out.println(animu);
        }
        else {
            animu ="Monogatari series";
            System.out.println(animu);
        }
        return animu;
    }

    public static String pelis(boolean adult, int identity, int actress){
        String peli;
         if (adult == true && identity == 1 && (actress == 1 || actress == 2)) {
             peli ="Spotlight";
        System.out.println(peli);
    } else if (adult == false && identity == 1 && (actress == 1 || actress == 2)){
             peli ="the room";
        System.out.println(peli);
    } else if (adult == true && identity == 2 && (actress == 1||actress==2)) {
             peli ="Batman returns";
        System.out.println(peli);
    } else if (adult == false && identity == 2 && (actress == 1 || actress==2)) {
             peli ="Irreversible";
        System.out.println(peli);
    } else if (adult == true && identity == 3 && (actress == 3||actress==4)) {
             peli = "the Revenant";
        System.out.println(peli);
    }
        else{
            peli = "Blade runner";
            System.out.println(peli);
         }
        return peli;
}

    public static String series(boolean adult, int identity, int actress){
        String serie;
        if (adult == true && identity == 1 && (actress == 1 || actress == 2)) {
            serie="How i met your mother";
            System.out.println(serie);
        } else if (adult == false && identity == 1 && (actress == 1 || actress == 2)){
            serie="the umbrella academy";
            System.out.println(serie);
        } else if (adult == true && identity == 2 && (actress == 1||actress==2)) {
            serie="house of cards";
            System.out.println(serie);
        } else if (adult == false && identity == 2 && (actress == 1 || actress==2)) {
            serie = "Russian doll";
            System.out.println(serie);
        } else if (adult == true && identity == 3 && (actress == 3||actress==4)) {
            serie ="Game of thrones";
            System.out.println(serie);
        }
        else {
            serie="Twin Peaks";
            System.out.println(serie);
        }
        return serie;
    }

}