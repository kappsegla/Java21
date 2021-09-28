package se.iths.java21.streams;

import java.time.LocalDate;

public class Guard {
   static class Against {
        public static void NullOrEmpty(String object) {
            if( object == null || object.isEmpty())
                throw new IllegalArgumentException();
        }

        public static <T> void Null(T object) {
            if( object == null )
                throw new IllegalArgumentException();
        }

        public static void ZeroOrLess(int value) {
            if( value <= 0)
                throw new IllegalArgumentException();
        }

        public static void YearOutsideValidRange(int year) {
            if( year < 1880 || year > LocalDate.now().getYear())
                throw new IllegalArgumentException();
        }
    }
}


