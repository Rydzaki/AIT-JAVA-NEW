package homework;

import practice.map.WordFreqApl;

import java.util.*;

public class Tolstoy {
    public static void main(String[] args) {

        String sentence = "\n" +
                "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками, ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, - в те наивные времена, когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге и верили в пожарские котлеты, в валдайские колокольчики и бублики, - когда в длинные осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков, когда прелестные дамы-камелии прятались от дневного света, - в наивные времена масонских лож, мартинистов, тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, - в губернском городе К. был съезд помещиков, и кончались дворянские выборы.";

        String[] sentenceSplit = sentence.split("");
        List<String> arrSentSpl = new ArrayList<>();
        for (int i = 0; i < sentenceSplit.length; i++) {
            String str = sentenceSplit[i];
            if (str.matches((".*[а-яА-Я].*"))) {
                arrSentSpl.add(str);
            }
        }
        for (String s : arrSentSpl) {
            System.out.print(s + " | ");
        }
        System.out.println();
        System.out.println("Total words: " + arrSentSpl.size());

        Set<String> sentSet = new HashSet<>();
        for (String s : arrSentSpl) {
            sentSet.add(s);
        }
        System.out.println("Unique letters: " + sentSet.size());
        for (String s : sentSet) {
            System.out.print("[" + s + "]");
        }

        System.out.println();
        System.out.println("===========================================");
        Map<String, Integer> resLetters = new TreeMap<>();
        for (String str : arrSentSpl) {
            if (!resLetters.containsKey(str)) {
                resLetters.put(str, 1);
            } else {
                resLetters.put(str, resLetters.get(str) + 1);
            }
        }
        System.out.println(resLetters);

        Set<Map.Entry<String, Integer>> lettersMap = resLetters.entrySet();
        System.out.println();
        for (Map.Entry<String, Integer> entry : lettersMap) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        int count = 0;
        for (Map.Entry<String, Integer> stringIntegerEntry : lettersMap) {
            count += stringIntegerEntry.getValue();
        }
        System.out.println("Total lettersMap: " +  count);
    }
}
