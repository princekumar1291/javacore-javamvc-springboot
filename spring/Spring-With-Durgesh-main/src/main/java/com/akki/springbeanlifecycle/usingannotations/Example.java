package com.akki.springbeanlifecycle.usingannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }

    /* to enable these annotations we need to add <context:annotation-config /> in config.xml */
    @PostConstruct  // for init-method
    public void start() {
        System.out.println("starting method: init");
    }

    @PreDestroy     // for destroy-method
    public void end() {
        System.out.println("Ending method: destroy");
    }
}
