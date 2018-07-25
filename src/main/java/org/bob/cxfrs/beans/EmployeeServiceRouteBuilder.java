package org.bob.cxfrs.beans;

import org.apache.camel.builder.RouteBuilder;

public class EmployeeServiceRouteBuilder extends RouteBuilder {
    public void configure() throws Exception {
        from("cxfrs://bean://restService")
                .process(new EmployeeServiceProcessor())
                .to("file:/home/benny/Documents/Messages/?fileName=NewLog.txt")
                .setHeader("subject", simple("Please Read Me"))
                .to("smtps:smtp.gmail.com:465?username=QACBWong@gmail.com&password=QACTesting123" +
                        "&to=benny.wong@academytrainee.com&mail.smtp.auth=true")
                    ;



    }
}
