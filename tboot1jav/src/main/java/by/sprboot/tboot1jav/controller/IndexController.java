package by.sprboot.tboot1jav.controller;

import by.sprboot.tboot1jav.service.CalcServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/*")
public class IndexController {
  private final CalcServ calcServ;

  @Autowired
  public IndexController(CalcServ calcServ) {
    this.calcServ = calcServ;
  }

  @GetMapping(path = "{num1}/{num2}")
  public int index(@PathVariable("num1") String a,
                   @PathVariable("num2") String b) {
    return calcServ.sum(Integer.valueOf(a), Integer.valueOf(b));
  }
}
