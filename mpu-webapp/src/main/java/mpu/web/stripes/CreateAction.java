package mpu.web.stripes;

import mpu.account.Account;
import mpu.account.AccountFacade;
import mpu.translation.Translation;
import mpu.translation.TranslationFacade;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.HandlesEvent;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import net.sourceforge.stripes.integration.spring.SpringBean;

@UrlBinding("/test/create/{$event}")
public class CreateAction extends AbstractActionBean {

    @SpringBean("accountFacade")
    private AccountFacade accountFacade;

    @SpringBean("translationFacade")
    private TranslationFacade translationFacade;

    private Resolution root = new RedirectResolution("/");

    @DefaultHandler
    public Resolution index() {
        return root;
    }

    @HandlesEvent("account")
    public Resolution account() {

        Account account = accountFacade.create(Long.toString(System
                .currentTimeMillis()));

        System.out.println(String.format("Account %s has id %s", account
                .getName(), account.getId()));

        return root;

    }

    @HandlesEvent("translation")
    public Resolution translation() {

        Translation translation = translationFacade.create(Long.toString(System
                .currentTimeMillis()));

        System.out.println(String.format("Translation %s has id %s",
                translation.getPhrase(), translation.getId()));

        return root;

    }

}
