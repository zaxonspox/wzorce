package Wzorce;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AccountService {

    private List<Account> accounts = new ArrayList<>();
    public void saveUser(String name, String lastName, Integer pin, String phoneNo, boolean active){
        accounts.add(new Account(name, lastName, pin, phoneNo, active));
    }

    public void listEm()
    {
        for (Iterator<Account> it = accounts.iterator(); it.hasNext(); ) {
            Account acc = it.next();
            System.out.println(acc.toString());
        }
    }

    public int count()
    {
        return accounts.size();
    }
}
