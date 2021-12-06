package com.akhil.camunda.bpm.demo;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.spring.annotations.ProcessEngineComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/controller")
@Slf4j
public class Controller {

    @Autowired
    private ProcessEngine processEngine;

    @GetMapping
    public void controllerCall(){
      log.info("called controller class ");
    }

    @PostMapping
    public void sendMessage(@RequestParam("processId") String processInstanceId){
        processEngine.getRuntimeService().createMessageCorrelation("message").processInstanceId(processInstanceId).correlate();
    }
}
