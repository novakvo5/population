package pro1;

import pro1.data.Muni;

import java.util.List;

public class FunFact3 {
    /**
     * @return TODO: Celkový počet obyvatel v obcích, které mají více než 10_000 obyvatel
     */
    public static long getFunFact(List<Muni> data) {
        var result = data
                .stream()
                .filter(m->m.getPopulation() > 10_000)
                .mapToInt(population->population)
                .sum();
        return result