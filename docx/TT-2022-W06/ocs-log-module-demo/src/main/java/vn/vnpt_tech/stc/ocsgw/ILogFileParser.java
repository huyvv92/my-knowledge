package vn.vnpt_tech.stc.ocsgw;

import vn.vnpt_tech.stc.ocsgw.entities.IdEntity;

import java.io.File;
import java.util.List;

public interface ILogFileParser<T extends IdEntity> {
    List<T> parser(File file);
}
