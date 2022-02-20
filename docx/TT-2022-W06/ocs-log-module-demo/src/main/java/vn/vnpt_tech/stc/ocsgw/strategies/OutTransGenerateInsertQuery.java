package vn.vnpt_tech.stc.ocsgw.strategies;

import vn.vnpt_tech.stc.ocsgw.IGenerateInsertQuery;
import vn.vnpt_tech.stc.ocsgw.entities.OutTrans;

import java.util.List;

public class OutTransGenerateInsertQuery implements IGenerateInsertQuery<OutTrans> {

    @Override
    public String generateInsertQuery(List<OutTrans> list) {
        // tạo file native sqwl từ list
        return null;
    }
}
