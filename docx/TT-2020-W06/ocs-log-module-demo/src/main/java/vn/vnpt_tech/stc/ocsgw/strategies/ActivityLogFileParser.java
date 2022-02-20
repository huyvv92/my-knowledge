package vn.vnpt_tech.stc.ocsgw.strategies;

import vn.vnpt_tech.stc.ocsgw.entities.Activity;
import vn.vnpt_tech.stc.ocsgw.ILogFileParser;

import java.io.File;
import java.util.List;

public class ActivityLogFileParser implements ILogFileParser<Activity> {

    @Override
    public List<Activity> parser(File file) {
        /*
        * Read log file and return list InTrans
        * */
        return null;
    }
}
