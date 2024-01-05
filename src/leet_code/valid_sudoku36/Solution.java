package leet_code.valid_sudoku36;

public class Solution {
    public static boolean isValidSudoku(char[][] board) {


        for (char[] element : board) {

            int iterCount = 0;
            int elementsValue = 0;

            for (char element2 : element) {

                elementsValue+= element2;
                iterCount++;
                if(iterCount==9){
                    elementsValue=elementsValue/9;
                    if(elementsValue!=5){
                        return false;
                    }else {
                        elementsValue=0;
                    }
                }

            }

        }return true;
    }
}
