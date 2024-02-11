package kh.maryiaskachkova.calcapp._Main;

import kh.maryiaskachkova.calcapp.service.ResultWriterService;
import kh.maryiaskachkova.calcapp.util.Calculator;

public class _Main {
    public static void main(String[] args) {
        int result1 = Calculator.calcSum(5,7);
        System.out.println(result1);
        int result2 = Calculator.calcDifference(8,4);
        System.out.println(result2);
        int result3 = Calculator.calcMultiply(5,3);
        System.out.println(result3);
        int print = ResultWriterService.printResult(5,7,result1,"sum");
        int print2 = ResultWriterService.printResult(8,4,result2,"difference");
        int print3 = ResultWriterService.printResult(5,3,result3,"multiply");



    }
}
