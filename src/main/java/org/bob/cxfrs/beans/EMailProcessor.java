package org.bob.cxfrs.beans;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.bob.cxfrs.beans.constants.Constants;

public class EMailProcessor implements Processor {
    public void process(Exchange exchange) throws Exception {

        User user = new User();
        long user_ID = user.getId();
        String name = user.getName();

        String msg = exchange.getIn().getBody(String.class);
        exchange.getOut().setBody(Constants.HELLO + " " + name + "\n \n" + Constants.CONGRATS_MESSAGE +
                Constants.FIVE_SPACES + Constants.FOOTER + "YOUR ID IS " + user_ID);


    }

}
