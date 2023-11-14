package practice_1411.sentencies;

public class CharCount {
    public static void main(String[] args) {
        String specChar = " !@#$%^&*()_-+{[}]|?/>,<.~`=;:'€₽¥₴₪¢£¤¦§¨©ªº«»¬®¯°‰´µ¶·¸¹¿←↑→↓↔⇒⇐⇔⇑⇓↵♠♣♥♦◊○●◄▼►▲■▪▫♀♂™•";
        String [] specChArr= specChar.split("");
        System.out.println(specChArr.length);
    }
}
