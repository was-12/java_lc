package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class NeedleInHaystack {

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;

        Map<Integer, Integer> map = new LinkedHashMap<>();

        char[] needleArray = needle.toCharArray();
        char[] haystackArray = haystack.toCharArray();

        int jTracker = 0;

        for (int i = 0; i < needleArray.length; i++) {

            for (int j = jTracker; j < haystackArray.length; j++) {

                if (needleArray[i] == haystackArray[j]) {

                    map.put(i, j);
                    jTracker = j + 1;

                    if (i == needleArray.length - 1) {

                        Integer firstValue = map.get(0);

                        if (firstValue != null) {
                            return firstValue;
                        }
                    }
                    break;
                }
                else {
                    if (!map.isEmpty()) {
                        jTracker = map.get(0) + 1;
                        map.clear();
                    } else {
                        jTracker = j + 1;
                    }
                    i = -1;
                    break;
                }
            }
        }

        return -1;
    }
}