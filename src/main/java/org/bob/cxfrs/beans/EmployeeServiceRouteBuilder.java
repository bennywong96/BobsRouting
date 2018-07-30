package org.bob.cxfrs.beans;

import org.apache.camel.Exchange;
import org.apache.camel.Expression;
import org.apache.camel.builder.RouteBuilder;



public class EmployeeServiceRouteBuilder extends RouteBuilder {


    public void configure() throws Exception {
        from("cxfrs://bean://restService")
                .process(new UserProcessor())
                .process(new DataBaseProcessor())
                .log("${body}")
                .to("sqlComponent:");


//        from("direct:email")
//                .process(new EMailProcessor())
//                .setHeader("subject", simple("Please Read Me"))
//                .to("smtps:smtp.gmail.com:465?username=QACBWong@gmail.com&password=QACTesting123" +
//                        "&to=benny.wong@academytrainee.com&mail.smtp.auth=true");

    }

}
