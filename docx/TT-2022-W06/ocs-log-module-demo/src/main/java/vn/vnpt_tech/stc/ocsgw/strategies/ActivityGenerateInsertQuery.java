package vn.vnpt_tech.stc.ocsgw.strategies;

import vn.vnpt_tech.stc.ocsgw.entities.Activity;
import vn.vnpt_tech.stc.ocsgw.IGenerateInsertQuery;

import java.util.List;

public class ActivityGenerateInsertQuery implements IGenerateInsertQuery<Activity> {
    @Override
    public String generateInsertQuery(List<Activity> list) {
        /*
        * Tạo ra câu query natvie để insert vào trong DB
        * (Mỗi lần cho phép insert nhiều hơn 1 record)
        * */
        return null;
    }
}
