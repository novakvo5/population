package pro1;

import pro1.data.Muni;

import java.util.List;

public class FunFact2 {
    /**
     * @return TODO: Celkový počet obyvatel ve všech obcích
     */
    public static int getFunFact(List<Muni> data) {
        var result = data
                .stream()
                .map(m->m.getPopulation())
                .mapToInt(population->population)
                .sum();
        return result;
    }
}