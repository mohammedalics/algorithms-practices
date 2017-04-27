package practice.algorithms.codility.uncategorized.battleships;

import java.util.ArrayList;
import java.util.List;

/**
 * BattleShip
 */
public class Solution {

    /**
     * Solution.
     *
     * @param N
     *            the n
     * @param S
     *            the s
     * @param T
     *            the t
     * @return the string
     */
    public String solution(int N, String S, String T) {

        List<Ship> shipList = new ArrayList<Ship>();

        String[] splittedS = S.split(",");

        for (String ship : splittedS) {
            String[] shipLocation = ship.split(" ");
            int startRowCell = Integer.parseInt(shipLocation[0].substring(0, shipLocation[0].length() - 1));
            char startColCell = shipLocation[0].charAt(shipLocation[0].length() - 1);
            int endRowCell = Integer.parseInt(shipLocation[1].substring(0, shipLocation[0].length() - 1));
            char endColCell = shipLocation[1].charAt(shipLocation[1].length() - 1);
            shipList.add(new Ship(startRowCell, startColCell, endRowCell, endColCell));
        }

        String[] splittedT = T.split(" ");
        for (String shot : splittedT) {
            for (Ship ship : shipList) {
                if (inShip(ship, shot)) {
                    ship.setNumberOfHealthyCells(ship.getNumberOfHealthyCells() - 1);
                    break;
                }
            }
        }

        int numberOfSunkShips = 0;
        int numberOfUnhealthyShips = 0;

        for (Ship ship : shipList) {
            if (ship.getNumberOfHealthyCells() == 0) {
                numberOfSunkShips++;
            }
            else if (ship.getNumberOfCells() != ship.getNumberOfHealthyCells()) {
                numberOfUnhealthyShips++;
            }
        }
        return numberOfSunkShips + "," + numberOfUnhealthyShips;
    }

    /**
     * Check if the cell (shot) is within the ship area
     *
     * @param ship
     *            the ship
     * @param cell
     *            the cell
     * @return true, if successful
     */
    private boolean inShip(Ship ship, String cell) {

        int rowCell = Integer.parseInt(cell.substring(0, cell.length() - 1));
        char colCell = cell.charAt(cell.length() - 1);

        return rowCell >= ship.getStartRowCell() && rowCell <= ship.getEndRowCell() && colCell >= ship.getStartColCell()
                && colCell <= ship.getEndColCell();
    }

    /**
     * The Class Ship.
     */
    class Ship {

        /** The number of cells. */
        private int numberOfCells;

        /** The number of healthy cells. */
        private int numberOfHealthyCells;

        /** The start row cell. */
        private int startRowCell;

        /** The start col cell. */
        private char startColCell;

        /** The end row cell. */
        private int endRowCell;

        /** The end col cell. */
        private char endColCell;

        /**
         * Instantiates a new ship.
         *
         * @param startRowCell
         *            the start row cell
         * @param startColCell
         *            the start col cell
         * @param endRowCell
         *            the end row cell
         * @param endColCell
         *            the end col cell
         */
        public Ship(int startRowCell, char startColCell, int endRowCell, char endColCell) {
            super();
            this.startRowCell = startRowCell;
            this.startColCell = startColCell;
            this.endRowCell = endRowCell;
            this.endColCell = endColCell;
            this.numberOfCells = calcNumberOfCells();
            this.numberOfHealthyCells = this.numberOfCells;
        }

        /**
         * Calculate number of cells.
         *
         * @return the number of cells.
         */
        private int calcNumberOfCells() {
            return ((this.endRowCell - this.startRowCell) + 1) * ((this.endColCell - this.startColCell) + 1);
        }

        /**
         * Gets the number of cells.
         *
         * @return the number of cells
         */
        public int getNumberOfCells() {
            return numberOfCells;
        }

        /**
         * Sets the number of cells.
         *
         * @param numberOfCells
         *            the new number of cells
         */
        public void setNumberOfCells(int numberOfCells) {
            this.numberOfCells = numberOfCells;
        }

        /**
         * Gets the number of healthy cells.
         *
         * @return the number of healthy cells
         */
        public int getNumberOfHealthyCells() {
            return numberOfHealthyCells;
        }

        /**
         * Sets the number of healthy cells.
         *
         * @param numberOfHealthyCells
         *            the new number of healthy cells
         */
        public void setNumberOfHealthyCells(int numberOfHealthyCells) {
            this.numberOfHealthyCells = numberOfHealthyCells;
        }

        /**
         * Gets the start row cell.
         *
         * @return the start row cell
         */
        public int getStartRowCell() {
            return startRowCell;
        }

        /**
         * Sets the start row cell.
         *
         * @param startRowCell
         *            the new start row cell
         */
        public void setStartRowCell(int startRowCell) {
            this.startRowCell = startRowCell;
        }

        /**
         * Gets the start column cell.
         *
         * @return the start column cell
         */
        public char getStartColCell() {
            return startColCell;
        }

        /**
         * Sets the start column cell.
         *
         * @param startColCell
         *            the new start column cell
         */
        public void setStartColCell(char startColCell) {
            this.startColCell = startColCell;
        }

        /**
         * Gets the end row cell.
         *
         * @return the end row cell
         */
        public int getEndRowCell() {
            return endRowCell;
        }

        /**
         * Sets the end row cell.
         *
         * @param endRowCell
         *            the new end row cell
         */
        public void setEndRowCell(int endRowCell) {
            this.endRowCell = endRowCell;
        }

        /**
         * Gets the end column cell.
         *
         * @return the end column cell
         */
        public char getEndColCell() {
            return endColCell;
        }

        /**
         * Sets the end column cell.
         *
         * @param endColCell
         *            the new end column cell
         */
        public void setEndColCell(char endColCell) {
            this.endColCell = endColCell;
        }

    }

    public static void main(String[] args) {

        int N = 4;
        String T = "2B 2D 3D 4D 4A";
        String S = "1B 2C,2D 4D";
        System.out.println(new Solution().solution(N, S, T));

        N = 10;
        T = "1A 2A 2B 4D 1B";
        S = "1A 2B,5D 7D";
        System.out.println(new Solution().solution(N, S, T));

        // 0, 0
        N = 10;
        S = "1A 2B,5D 7D";
        T = "3A 7C 2E 4D 8C";
        System.out.println(new Solution().solution(N, S, T));
    }
}
