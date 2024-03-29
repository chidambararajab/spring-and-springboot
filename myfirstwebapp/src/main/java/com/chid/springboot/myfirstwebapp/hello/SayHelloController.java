package com.chid.springboot.myfirstwebapp.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello There";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>First Spring Web App</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("First HTML - Spring Web App");
        sb.append("</body>");
        sb.append("</html");

        return sb.toString();
    }

    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {
        logger.debug("Debugging Logs");
        logger.info("Information Logs");
        logger.warn("Warning Logs");
        logger.trace("Trace Logs");

        return "sayHello";
    }

}
