package ss13_search_algorithm.bai_tap.chuoi_lien_tiep_co_do_dai_lon_nhat;

public class StringSearch {
    public static String stringSearch(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder maxString = new StringBuilder();
        stringBuilder.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) > stringBuilder.charAt(stringBuilder.length() - 1)) {
                stringBuilder.append(s.charAt(i));
                if (stringBuilder.length() > maxString.length()) {
                    maxString.delete(0, maxString.length());
                    maxString.append(stringBuilder);
                }
            } else {
                stringBuilder.delete(0, stringBuilder.length());
                stringBuilder.append(s.charAt(i));
            }
        }
        return maxString.toString();
    }
}
