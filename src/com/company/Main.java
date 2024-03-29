package com.company;

import com.company.operation.ShopOp;
import com.company.operation.operation;
import com.company.state.CentralBank;
import com.company.state.State;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        State state = new State(); // государство

        List<Citizen> citizens = new LinkedList<>();

        for (int i = 0; i < 10000; i++) {
            citizens.add(new Citizen("vasili" + i,
                                    (i+1) * 10 % 7,
                                        Integer.toString(i+10),
                                    10000,
                                        CentralBank.createAccount("vasili" + i, false, 100000)));
        }


        for (Citizen c: citizens) {
            System.out.println(CentralBank.getAccount(c.getAccountNumber()));
        }


        List<operation> operationList = new LinkedList<>();


        /*
        operationList.add(new operation(123, citizens.get(0), citizens.get(1), 500));
        operationList.add(new operation(123, citizens.get(2), citizens.get(1), 500));
        operationList.add(new ShopOp( 123, citizens.get(0), citizens.get(2), 100, state));*/


       /* //System.out.println(CentralBank.createAccount("dsfds", true));
        //System.out.println(CentralBank.createAccount("dsfаds", true, 100000));

        for (CentralBank c: CentralBank.getAccountList()) {
            System.out.println(c);
        }

        Company company = new Company("Программист Вася");
        Company company1 = new Company("VIVT", 1000000);
        CentralBank.accountMoneyAppend(company1, 1000000);


        CentralBank.transaction(company1.getAccountNumber(), company.getAccountNumber(), 500000);

        System.out.println(CentralBank.getAccount(company.getAccountNumber()).getAccountMoney());
        System.out.println(CentralBank.getAccount(company1.getAccountNumber()).getAccountMoney());
        System.out.print(CentralBank.getTransaction().get(0)[0] + " ");
        System.out.print(CentralBank.getTransaction().get(0)[1] + " ");
        System.out.println(CentralBank.getTransaction().get(0)[2]);*/
    }

}
