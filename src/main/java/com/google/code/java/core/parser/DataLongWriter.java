package com.google.code.java.core.parser;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DataLongWriter implements LongWriter {
    private final DataOutputStream out;

    public DataLongWriter(OutputStream os) {
        this.out = new DataOutputStream(new BufferedOutputStream(os));
    }

    @Override
    public void write(long num) throws IOException {
        out.writeLong(num);
    }

    @Override
    public void close() {
        ParserUtils.close(out);
    }
}