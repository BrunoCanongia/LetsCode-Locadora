package utils;

import java.time.LocalDate;
import java.time.Period;

public class Utils {
    public static int periodoEmDias(LocalDate d1, LocalDate d2) {
        Period p = Period.between(d1, d2);
        return p.getDays();
    }
}
