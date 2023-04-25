package com.promineotech.jeep.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;

public class JeepSalesControllerImpl implements JeepSalesController {
  
  @GetMapping("/jeeps")
  @ResponseStatus(code = HttpStatus.OK)
  public List<Jeep> fetchJeeps(@RequestParam JeepModel model, @RequestParam String trim) {
    // Your code to fetch Jeeps goes here
  }
  
}
