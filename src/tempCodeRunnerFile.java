import java.util.HashMap;
import java.util.Map;

class BannerApp {
    public static Map<Character, String[]> buildCharacterMap() {

        Map<Character, String[]> charMap = new HashMap<>();
        charMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });
        charMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });
        charMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return charMap;
    }
    public static void renderBanner(String message, Map<Character, String[]> charMap) {

        int height = 5; 

        for (int row = 0; row < height; row++) {

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);

                if (charMap.containsKey(ch)) {
                    sb.append(charMap.get(ch)[row]).append("  ");
                }
            }

            System.out.println(sb.toString());
        }
    }
    public static void main(String[] args) {

        Map<Character, String[]> characterPatterns = buildCharacterMap();

        String message = "OOPS";

        renderBanner(message, characterPatterns);
    }
}