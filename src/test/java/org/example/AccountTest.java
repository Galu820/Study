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
    @Test
    void checkSave() throws NothingToUndo {

        Account a;
        a = new Account("First Account");
        String oldName1 = a.getName();
        Loadable Save1 = a.Save();
        a.setName("Second Account");
        String oldName2 = a.getName();
        Loadable Save2 = a.Save();
        a.setName("Third Account");
        Save2.load();
        Assertions.assertEquals(oldName2, a.getName());
        Save1.load();
        Assertions.assertEquals(oldName1, a.getName());
    }
}