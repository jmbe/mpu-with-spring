package mpu.web.stripes;


import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

public class AbstractActionBean implements ActionBean {

    private ActionBeanContext context;

    public ActionBeanContext getContext() {
        return context;
    }

    public void setContext(final ActionBeanContext context) {
        this.context = context;
    }

}
