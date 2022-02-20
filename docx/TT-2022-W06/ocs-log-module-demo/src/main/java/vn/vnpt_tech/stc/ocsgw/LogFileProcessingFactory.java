package vn.vnpt_tech.stc.ocsgw;

import vn.vnpt_tech.stc.ocsgw.strategies.*;

import java.io.File;

public class LogFileProcessingFactory {
    private ILogFileParser iLogFileParser = null;
    private IGenerateInsertQuery iGenerateInsertQuery = null;

    public LogFileProcessingFactory(File file) {
        String fileName = file.getName();
        if (fileName.startsWith("in_trans")) {
            iLogFileParser = new InTransLogFileParser();
            iGenerateInsertQuery = new InTransGenerateInsertQuery();
        } else if (fileName.startsWith("activity")) {
            iLogFileParser = new ActivityLogFileParser();
            iGenerateInsertQuery = new ActivityGenerateInsertQuery();
        } else if (fileName.startsWith("out_trans")) {
            iLogFileParser = new OutTransLogFileParser();
            iGenerateInsertQuery = new OutTransGenerateInsertQuery();
        }
    }

    public ILogFileParser getLogFileParser() {
        return iLogFileParser;
    }

    public IGenerateInsertQuery getGenerateInsertQuery() {
        return iGenerateInsertQuery;
    }
}
