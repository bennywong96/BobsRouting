package org.bob.cxfrs.beans;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.bob.cxfrs.beans.constants.Constants;

public class EmployeeServiceProcessor implements Processor {
    public void process(Exchange exchange) throws Exception {
        String msg = exchange.getIn().getBody(String.class);
        exchange.getOut().setBody(Constants.HELLO + " " + msg + "\n \n" + Constants.CONGRATS_MESSAGE +
                Constants.FIVE_SPACES + Constants.FOOTER);
    }
}
