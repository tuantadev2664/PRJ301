package model;


import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FPTSHOP
 */
public class Math implements Serializable{
    private String num1;
    private String num2;
    private String operator;

    public Math() {
    }

    public Math(String num1, String num2, String operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
    
    public String getResult(){
        double result=0;
        int n1;
        int n2;
        try {
            n1 = Integer.parseInt(num1);
            n2 = Integer.parseInt(num2);
            
            switch (operator){
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                if(n2 == 0)
                    return "không chia được cho 0";
                else {
                    result = n1*1.0 / n2;
                    break;
                }
            }
            
        } catch (NumberFormatException numberFormatException) {
            String er = "khong phai la so";
            return er;
        }
        return result + "";
    }
}
