package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HomeController {

    private static final String template = "Welcome, %s!";

    private final DummyConfiguration dummyConfiguration;

    @Autowired
    public HomeController(DummyConfiguration dummyConfiguration) {
        this.dummyConfiguration = dummyConfiguration;
    }

    @RequestMapping("/")
    public String home() {
        return String.format(template, dummyConfiguration.getName());
    }

}
