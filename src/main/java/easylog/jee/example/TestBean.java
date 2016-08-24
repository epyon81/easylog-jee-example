package easylog.jee.example;

import easylog.core.Log;
import easylog.core.LogLevel;
import easylog.core.LogPosition;
import easylog.jee.Easylog;

import javax.inject.Named;

@Easylog
@Named
public class TestBean {

    @Log(detailed = true, level = LogLevel.WARN)
    @Log(position = LogPosition.AFTER, detailed = true)
    public String makeString(int number) {
        return Integer.toHexString(number);
    }
}
