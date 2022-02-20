package vn.vnpt_tech.stc.ocsgw;

import java.io.File;
import java.util.List;

public class LogFileScanner {

    /**
     * 1. Định kì 10s đọc file mới 1 lần
     * 2. parser file để lấy list entity
     * 3. generate native query
     * 4. insert vào DB
     * **/
    public void scanner() {
        File file = new File(""); //giả sử file mới đọc đc là file này
        LogFileProcessingFactory fileProcessingFactory = new LogFileProcessingFactory(file);
        List list = fileProcessingFactory.getLogFileParser().parser(file);
        String nativeQuery = fileProcessingFactory.getGenerateInsertQuery().generateInsertQuery(list);

        //cuối cùng đơn giản là dùng connection DB để insert native Query vào DB
    }
}
