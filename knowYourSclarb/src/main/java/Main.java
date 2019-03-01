public class Main {

    public static void main(String[] args) {
        Prompt prompt = new Prompt();
        ShouldWatch shouldWatch = new ShouldWatch();

        String[] names = prompt.requestName(null);
        boolean adult = prompt.requestAge(0);
        int magiIdentity = prompt.requestMagiIdentity(0);
        int sclarbJorp = prompt.requestBestAsianActress(0);
        //shouldWatch.anime();

    }

}
