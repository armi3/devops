public class Main {

    public static void main(String[] args) {
        Prompt prompt = new Prompt();
        ShouldWatch shouldWatch = new ShouldWatch();

        prompt.requestName(null);
        prompt.requestAge(null);
        int magiIdentity = prompt.requestMagiIdentity(null);
        int sclarbJorp = prompt.requestBestAsianActress(null);
        //shouldWatch.anime();

    }

}
