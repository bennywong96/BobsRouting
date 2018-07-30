package org.bob.cxfrs.beans;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.bob.cxfrs.beans.constants.Constants;

public class DataBaseProcessor implements Processor {
    public void process(Exchange exchange) throws Exception {
        User user = exchange.getIn().getBody(User.class);
        String query = "INSERT INTO user(user_Name) VALUES ('" + user.getName() + "')?dataSource=#myDataSource";
        exchange.getOut().setBody(query);
    }
}
