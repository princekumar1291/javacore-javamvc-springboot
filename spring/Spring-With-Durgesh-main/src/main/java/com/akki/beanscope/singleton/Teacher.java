package com.akki.beanscope.singleton;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")   // actually this is optional. by default spring returns singleton objects.
public class Teacher {
}
