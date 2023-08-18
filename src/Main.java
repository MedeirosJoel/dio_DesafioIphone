// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Iphone iphonePessoal = new Iphone();

        iphonePessoal.selectMusic("Medo do Medo - O terno");
        iphonePessoal.playMusic();
        iphonePessoal.stopMusic();

        iphonePessoal.anwser(1212378363462143532L);
        iphonePessoal.call(4536324125245346361L);
        iphonePessoal.voiceMail();

        iphonePessoal.addPage("www.google.com");
        iphonePessoal.refreshPage(0);
        iphonePessoal.showPage(0);

    }
}
