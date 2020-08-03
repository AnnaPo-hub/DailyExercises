package multi.dimensional.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CinemaTest {
    String[][] array = {
            {"0", "1", "0", "1"},
            {"1", "1", "0", "1"},
            {"1", "0", "0", "1"}
    };

    String[][] array1 = {
            {"0", "1", "0"},
            {"1", "0", "0"},
            {"1", "1", "1"}
    };

    String[][] array2 = {
            {"0", "1", "0", "0", "0", "0", "0", "0", "1"},
            {"1", "1", "1", "0", "0", "0", "1", "0", "1"},
            {"0", "0", "1", "0", "1", "0", "0", "0", "1"},
            {"1", "0", "1", "1", "0", "1", "1", "1", "0"},
    };

    Cinema cinema = new Cinema();

    @Test
    void checkEmptyPlaceIfThereAreOnes() {
        assertEquals(3, cinema.checkEmptyPlace(array, 2, 4));
    }

    @Test
    void checkEmptyPlaceIfThereAreNoOnes() {
        assertEquals(0, cinema.checkEmptyPlace(array1, 3, 3));
    }

    @Test
    void checkEmptyPlaceInBigCinema() {
        assertEquals(0, cinema.checkEmptyPlace(array2, 7, 9));
    }
}
