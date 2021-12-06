package com.akhil.camunda.bpm.demo;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

@Slf4j
public class DelegateDemo implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
      log.info("called delegate class {} ",delegateExecution.getProcessInstanceId());
    }
}
