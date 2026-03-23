package pro1;

import pro1.data.Muni;

import java.util.List;

public class FunFact1 {
    /**
     * @return TODO: Počet obcí, které mají více než 10 000 obyvatel
     */
    public static long getFunFact(List<Muni> data) {
       var result = data
               .stream()
               .filter(m->m.getPopulation() > 10_000)
               .count();
       return result;
    }
}