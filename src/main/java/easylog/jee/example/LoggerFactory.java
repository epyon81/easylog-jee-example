package easylog.jee.example;

import easylog.core.Logger;
import easylog.slf4j.Slf4jLoggerFactory;

import javax.inject.Named;

@Named
public class LoggerFactory implements easylog.core.LoggerFactory {

    private easylog.core.LoggerFactory delegate = new Slf4jLoggerFactory();

    @Override
    public Logger getLogger(Class<?> clazz) {
        return delegate.getLogger(clazz);
    }
}
