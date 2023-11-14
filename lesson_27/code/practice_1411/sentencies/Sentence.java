package practice_1411.sentencies;

public class Sentence {
    // Count words in Sentence
    public static int countWords(String str) {
        String[] words = str.split(" ");
        int n = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("—") || words[i].equals("-")|| words[i].equals("–") || words[i].equals(",")) {
                n++;
            }
        }
//        System.out.println(words.length);
//        System.out.println(n);
        return words.length - n;
    }
        // Count symbols  in Sentence

    public int countSimbols(String str) {
        String[] letters = str.split("");
        String specChar = " !@#$%^&*()_-+{[}]|?/>,<.~`=;:'€₽¥₴₪¢£¤¦§¨©ªº«»¬®¯°‰´µ¶·¸¹¿←↑→↓↔⇒⇐⇔⇑⇓↵♠♣♥♦◊○●◄▼►▲■▪▫♀♂™•";
        String [] specChArr= specChar.split("");
        int n = 0;
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < specChArr.length; j++) {
            if (specChArr[j].equals(letters[i])) {
                n++;
            }
            }
        }
        return letters.length - n;
        // todo исключить пробелы из результата метода
        // !@#$%^&*()_-+{[}]|?/>,<.~`=;:'€₽¥₴₪
    }
}
// (letters[i].equals(" ") || letters[i].equals("!")|| letters[i].equals("@")|| letters[i].equals("#")|| letters[i].equals("$")|| letters[i].equals("%")|| letters[i].equals("^")|| letters[i].equals("&")|| letters[i].equals("*")|| letters[i].equals("(")|| letters[i].equals(")")|| letters[i].equals("_")|| letters[i].equals("-")|| letters[i].equals("+")|| letters[i].equals("{")|| letters[i].equals("[")|| letters[i].equals("]")|| letters[i].equals("}")|| letters[i].equals("|")|| letters[i].equals("?")|| letters[i].equals("/")|| letters[i].equals(">")|| letters[i].equals("<")|| letters[i].equals(",")|| letters[i].equals(".")|| letters[i].equals("~")|| letters[i].equals("`")|| letters[i].equals("=")|| letters[i].equals(";")|| letters[i].equals(":")|| letters[i].equals("'")|| letters[i].equals("€")|| letters[i].equals("₽")|| letters[i].equals("¥")|| letters[i].equals("₴")|| letters[i].equals("₪"))