package map_set_tree.bai_tap.map.dem_lan_xuat_hien_cua_tu;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "java code java map code java";
        String[] strArr = str.split(" ");
        Map<String,Integer> wordCount = new HashMap<>();
        for (String word :strArr){
            word = word.toLowerCase();
            if (wordCount.containsKey(word)){
                wordCount.put(word, wordCount.get(word)+1);
            }else wordCount.put(word,1);
        }
        for (Map.Entry<String,Integer>entry: wordCount.entrySet()){
            System.out.println(entry.getKey()+" appears "+entry.getValue()+" times");
        }
    }
}
