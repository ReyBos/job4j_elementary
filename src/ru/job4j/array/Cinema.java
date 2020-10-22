package ru.job4j.array;

import java.util.Objects;

public class Cinema {
    public static Place checkEmptyPlace(Place[][] places) {
        for (int row = 0; row < places.length; row++) {
            for (int cell = 0; cell < places[row].length; cell++) {
                if (places[row][cell] == null && checkSeats(row, cell, places)) {
                    return new Place(row, cell);
                }
            }
        }
        return null;
    }

    private static boolean checkSeats(int row, int cell, Place[][] places) {
        for (int i = -1; i < 2; i++) {
            int column = cell + i;
            int line = row + i;
            if (column < 0 || column >= places.length || line < 0 || line >= places.length || i == 0) {
                continue;
            }
            if (places[row][column] != null || places[line][cell] != null) {
                return false;
            }
        }
        return true;
    }

    public static class Place {
        private int row;

        private int cell;

        public Place(int row, int cell) {
            this.row = row;
            this.cell = cell;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Place place = (Place) o;
            return row == place.row &&
                    cell == place.cell;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, cell);
        }
    }
}