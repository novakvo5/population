package pro1;

import pro1.data.Muni;

import java.util.Comparator;
import java.util.List;


public class FunFact5 {
    /**
     * @return TODO: Názvy obcí s nejméně obyvateli
     * @param count: počet hledaných obcí
     */
    public static List<String> getFunFact(List<Muni> data, int count) {
        var result = data
                .stream()
                .filter(m-> m.getPopulation() > 0)
                .sorted(Comparator.comparing(m-> m.getPopulation()))
                .limit(count)
                .map(m-> m.getName())
                .toList();

        return result;
    }

    /**
     * @return TODO: Názvy obcí s nejméně obyvateli, oddělené čárkou
     * @param count: počet hledaných obcí
     */
    public static String getFunFactJoined(List<Muni> data, int count) {
        return null;
    }
}