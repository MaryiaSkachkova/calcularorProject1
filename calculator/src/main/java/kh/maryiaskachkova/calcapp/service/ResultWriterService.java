package kh.maryiaskachkova.calcapp.service;

public class ResultWriterService {
    public static int printResult (int num1, int num2, int result, String operation){
        System.out.println("Result operation " + operation + " : ");
        System.out.println(num1 + " " + operation + " " + num2 + " =  " + result);
        return num1;
    }


    }

