package oops.Encapsulation.AnotherBank;

import oops.Encapsulation.Bank.BankClass;

public class BankNonSubClass {
    public static void main(String[] args) {
        BankClass bankClass = new BankClass();

    //    System.out.println(bankClass.defaultBankName);    //can't access
    //    System.out.println(bankClass.privatenBankName);   //can't access
    //    System.out.println(bankClass.protectedBankName);  //can't access

        System.out.println(bankClass.publicBankName);
    }
}