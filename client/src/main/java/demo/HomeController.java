package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HomeController {

  private static final String template = "Welcome, %s!";

  @Value("${name:Spring}")
  private String name;


  @RequestMapping("/")
  public String home() {
    return String.format(template, name);
  }

}
