package org.example;

public class Main {
    public static void main(String[] args) throws NothingToUndo {

        System.out.println("******************");
        System.out.println("Hello and welcome!");

        Account Acc1;
        Acc1 = new Account("Иван Иванов");
        Acc1.setBalances(CurTypes.RUR,100);
        Acc1.printBalances();
        Acc1.setName("Вася Пупкин");
        Acc1.setBalances(CurTypes.EUR,25);
        Acc1.setBalances(CurTypes.RUR,170);
        Acc1.printBalances();
        Acc1.setName("Конь Впальто");
        Acc1.setBalances(CurTypes.CNY,99);
        Acc1.printBalances();
        Acc1.undo().undo();
        Acc1.printBalances();
    }
}