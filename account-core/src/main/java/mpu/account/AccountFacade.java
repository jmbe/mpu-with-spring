package mpu.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = false)
@Component
public class AccountFacade {

    @Autowired
    private AccountRepository accountRepository;

    public Account create(final String string) {
        Account account = new Account();
        account.setName(string);
        accountRepository.create(account);
        return account;
    }

}
