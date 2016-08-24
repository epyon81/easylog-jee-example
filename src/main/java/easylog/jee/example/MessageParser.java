package easylog.jee.example;

import easylog.core.LogMessageParser;
import easylog.core.Scope;
import easylog.el.messageparser.ElMessageParser;

import javax.inject.Named;

@Named
public class MessageParser implements LogMessageParser {

    private LogMessageParser delegate = new ElMessageParser();

    @Override
    public String parse(Scope scope, String message) {
        return delegate.parse(scope, message);
    }
}
