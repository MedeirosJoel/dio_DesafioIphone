import Functions.Browser;
import Functions.Dialer;
import Functions.MusicPlayer;

import java.util.ArrayList;

public class Iphone implements Dialer, Browser, MusicPlayer{

    ArrayList<String> pages = new ArrayList<>();
    private String actualSong;
    @Override
    public void showPage(int numberPage) {
        System.out.println("Mostrando a pagina: "+ pages.get(numberPage));
    }

    @Override
    public void addPage(String urlPage) {
        pages.add(urlPage);
        int nPage = pages.indexOf(urlPage);
        System.out.printf("Adicionando aba %s com a seguinte url: %s \n", nPage, urlPage);

    }

    @Override
    public void refreshPage(int numberPage) {
        System.out.println("Recarregando a pagina: " + pages.get(numberPage));
    }

    @Override
    public void anwser(long incommingNumber) {
        System.out.println("Atendendo chamada de: "+ incommingNumber);
    }

    @Override
    public void call(long callNumber) {
        System.out.println("Ligando para: " + callNumber);
    }

    @Override
    public void voiceMail() {
        System.out.println("Abrindo correio de voz...");
    }

    @Override
    public void selectMusic(String Music) {
        actualSong = Music;
        System.out.printf("Selecionando %s como musica para tocar \n", Music);
    }

    @Override
    public void playMusic() {
        System.out.println("Tocando agora: " +actualSong);
    }

    @Override
    public void stopMusic() {
        System.out.println("Pausando musica: " +actualSong);
    }
}
