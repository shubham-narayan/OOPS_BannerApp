public class BannerApp{
     static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        public char getCharacter() {
            return character;
        }
        public String[] getPattern() {
            return pattern;
        }
    }
    public static void printBanner(String word, CharacterPatternMap[] patterns) {

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                for (CharacterPatternMap cp : patterns) {
                    if (cp.getCharacter() == ch) {
                        line.append(cp.getPattern()[row]).append("  ");
                    }
                }
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        String[] oPattern = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        String[] pPattern = {
                " ****** ",
                "*      *",
                "*      *",
                " ****** ",
                "*       ",
                "*       ",
                "*       "
        };

        String[] sPattern = {
                " ****** ",
                "*       ",
                "*       ",
                " *****  ",
                "       *",
                "       *",
                " ****** "
        };
        CharacterPatternMap[] patternArray = {
                new CharacterPatternMap('O', oPattern),
                new CharacterPatternMap('P', pPattern),
                new CharacterPatternMap('S', sPattern)
        };

        printBanner("OOPS", patternArray);
    }
}