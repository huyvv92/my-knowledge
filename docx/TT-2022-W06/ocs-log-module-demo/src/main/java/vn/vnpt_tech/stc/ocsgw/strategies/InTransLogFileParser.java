package vn.vnpt_tech.stc.ocsgw.strategies;

import vn.vnpt_tech.stc.ocsgw.entities.InTrans;
import vn.vnpt_tech.stc.ocsgw.ILogFileParser;

import java.io.File;
import java.util.List;

public class InTransLogFileParser implements ILogFileParser<InTrans> {

    @Override
    public List<InTrans> parser(File file) {
        /*
        * Read log file and return list InTrans
        * */
        return null;
    }
}
