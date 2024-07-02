//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Массив с набором слов, включая повторяющиеся
        String[] wordsArray = {"black", "white", "green", "blue", "blue", "blue", "white", "black", "black", "blue"};

        // Использование HashMap для подсчета количества повторений каждого слова
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : wordsArray) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Вывод списка уникальных слов и количества их повторений
        System.out.println("Уникальные слова и число их повторений:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}