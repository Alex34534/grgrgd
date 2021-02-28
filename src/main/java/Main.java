package com.company;
public class Main {
    public static void main(String[] args) {

        String phone="+734583";

        String[] result = checkPhone(phone);

        for (int i=0;i<result.length;i++){
            if(i!=0)
                System.out.print(";");
            System.out.print(result[i]);
        }
    }



    public static String[] checkPhone(String phone) {
        String[] tel;
        String proverka = null;

        if(phone.isEmpty())
            return tel = new String[]{"Введен пустой номер"};




        if(phone.substring(0,2).equals("+7")) {
            phone = phone.replace("+7", "8");
            proverka = "Замена +7 на 8";
        }


        if(phone.indexOf("(")!=-1 || phone.indexOf(")")!=-1 || phone.indexOf(" ")!=-1) {

            phone = phone.replace("(", "").replace(")", "").replace(" ", "");

            if(proverka == null)
                proverka = "Удалены скобки и/или пробелы";
            else
                proverka = proverka + ";"+"Удалены скобки и/или пробелы";
        }

        if(phone.length()>11 )
            return tel = new String[]{"Введен некорректный номер","Чет длинноват"};

        if(proverka.isEmpty())
            tel = new String[]{phone};
        else
            tel = new String[]{phone, proverka};
        return tel;
    }
}