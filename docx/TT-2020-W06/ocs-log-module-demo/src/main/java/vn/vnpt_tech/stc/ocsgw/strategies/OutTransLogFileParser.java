package vn.vnpt_tech.stc.ocsgw.strategies;

import vn.vnpt_tech.stc.ocsgw.ILogFileParser;
import vn.vnpt_tech.stc.ocsgw.entities.OutTrans;

import java.io.File;
import java.util.List;

public class OutTransLogFileParser implements ILogFileParser<OutTrans> {
    @Override
    public List<OutTrans> parser(File file) {
        //TODO: file out-trans phải đọc như nào, để tạo ra được list
        return null;
    }
}
