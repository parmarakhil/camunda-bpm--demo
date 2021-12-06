package com.akhil.camunda.bpm.demo;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;

@Named
@Slf4j
public class DelegateExpressionDemo implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        delegateExecution.setVariable("called", true);
        log.info("Called delegate execution with PID , {}", delegateExecution.getProcessInstanceId());
    }
}
