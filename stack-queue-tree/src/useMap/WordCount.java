package useMap;

import java.util.Map;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        String text = "Học lập trình Java rất vui và Java là một ngôn ngữ lập trình mạnh mẽ.";
        Map<String,Integer> wordMap = new TreeMap<>();

        String cleanText = text.toLowerCase().replaceAll("[.,#!$%&;:{}=_`~()]", "");
        String[] words = cleanText.split("\\s+");

        for (String word : words) {
            if (word.isEmpty()) {
             continue;
            }
            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            }else {
                wordMap.put(word, 1);
            }
        }
        System.out.println("--- Kết quả đếm từ (đã sắp xếp theo bảng chữ cái) ---");
        for(Map.Entry<String,Integer> entry : wordMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
