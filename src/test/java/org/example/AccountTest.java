package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AccountTest {

    @Test
    void getState() {
    }
    @Test
    void checkUndo() throws NothingToUndo {

        Account a;
        a = new Account("First Account");
        String oldName = a.getName();
        a.setName("Noname Account");
        a.undo();
        Assertions.assertEquals(oldName, a.getName());
    }
}