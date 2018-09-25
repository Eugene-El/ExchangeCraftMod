package lv.eugene.lomashonok.exchangecraft.utils;

import lv.eugene.lomashonok.exchangecraft.Reference;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Util {

    private static Logger logger;

    public static Logger getLogger() {
        if (logger == null)
            logger = LogManager.getFormatterLogger(Reference.MODID);
        return logger;
    }

}
