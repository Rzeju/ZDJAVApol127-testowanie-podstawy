package assertJ;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {

    public static List<String> getReveredList(List<String> listToRevered) {

        List<String> result = new ArrayList();

        for (int i = listToRevered.size() - 1; i >= 0; i--) {
            result.add(listToRevered.get(i));
        }

        return result;
    }
}
