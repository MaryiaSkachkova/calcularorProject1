package kh.maryiaskachkova.calcapp._main;

import kh.maryiaskachkova.calcapp.service.ResultWriterService;
import kh.maryiaskachkova.calcapp.util.Calculator;

public class _Main {
    public static void main(String[] args) {
        int result1 = Calculator.calcSum(5, 7);
        int result2 = Calculator.calcDifference(8, 4);
        int result3 = Calculator.calcProduct(5, 3);
        ResultWriterService.printResult(5, 7, result1, "sum");
        ResultWriterService.printResult(8, 4, result2, "difference");
        ResultWriterService.printResult(5, 3, result3, "product");
    }
}
