package practace.string_builder;

public class stringBuilderAppl {

    public static void main(String[] args) {
        // stringBuilder это классс в нем есть полезные методы для работы со строками

        String str = "Java";
        // str = str + "_" + 11
        str = str.concat("_"); // склеивание слов
        str = str.concat(""+11); // к строке добавляем примитив
        System.out.println(str);

        //stringBuilder - он mutable

        StringBuilder sb = new StringBuilder("Java");
        sb.append("_").append(11); // append добавить
        System.out.println(sb);
        sb.reverse(); // сtрока задом на перед


        System.out.println(sb);


        str = sb.toString(); // возвращаем в string
        System.out.println(str);





    }
}
