package vn.vnpt_tech.stc.ocsgw;

import vn.vnpt_tech.stc.ocsgw.entities.IdEntity;

import java.util.List;

public interface IGenerateInsertQuery<T extends IdEntity> {
    String generateInsertQuery(List<T> list);
}
