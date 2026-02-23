import java.util.HashMap;
import java.util.Map;
class BannerApp {
    private Map<Character, String[]> patternMap;
    public BannerApp() {
        patternMap = new HashMap<>();
        initializePatterns();
    }
    private void initializePatterns() {
        patternMap.put('O',new String []{
              " *** ",
              "*   *",
              "*   *",
              "*   *",
              " *** ",
        }); 
        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });
        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });
        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }
    public void printBanner(String text) {

        text = text.toUpperCase();

        for (int row = 0; row < 5; row++) {
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);

                if (patternMap.containsKey(ch)) {
                    System.out.print(patternMap.get(ch)[row] + "  ");
                } else {
                    System.out.print("     ");
                }
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BannerApp bannerApp = new BannerApp();
        bannerApp.printBanner("OOPS");
    }
}