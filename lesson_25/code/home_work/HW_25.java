package home_work;

public class HW_25 {
    public static void main(String[] args) {
        String str = "I'm proud to learn Java! Java is the most famous programming language!!!";
        System.out.println(str);

        System.out.println("----------------------------------------------------------------");
        System.out.println(str.charAt(str.length() - 1)); // последний символ
        System.out.println("----------------------------------------------------------------");
        System.out.println(str.indexOf("Java")); //позиция в строке
        System.out.println("----------------------------------------------------------------");

        String str1 = "Java";
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            int tru = 0;
            if (words[i].equals(str1)) {
                tru++;
                if (tru > 0) {
                    System.out.println("TRUE");
                } else {
                    System.out.println("FALSE");
                }
            }
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println(str.replace('o', 'a'));
        System.out.println("----------------------------------------------------------------");
        System.out.println(str.toUpperCase());
        System.out.println("----------------------------------------------------------------");
        System.out.println(str.toLowerCase());
        System.out.println("----------------------------------------------------------------");
        int start = str.indexOf("Java");
        int end = str.indexOf("is");
        System.out.println(str.substring(0, start) + str.substring(end, str.length()));
        System.out.println("----------------------------------------------------------------");

        int indexOf = str.indexOf("!!!");
        int index = str.length();
        int result = index - indexOf;
        if (result == 3) {
            System.out.println("TRUE");
        } else System.out.println("FALSE");
        System.out.println("----------------------------------------------------------------");
        String phraseStart = "I'm proud";
        if(str.indexOf(phraseStart)>=0){
        System.out.println("TRUE");}
        else System.out.println("FALSE");
    }
}