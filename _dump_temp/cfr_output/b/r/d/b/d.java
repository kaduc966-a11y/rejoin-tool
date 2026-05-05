/*
 * Decompiled with CFR 0.152.
 */
package b.r.d.b;

import b.pc;
import b.r.b;
import b.r.d.b.l;
import b.r.d.b.o;

public final class d
extends o {
    private final String \u00d5\u00f50000;
    private final String thisvoid;
    private final String \u00f4\u00f50000;
    private final int \u00d4\u00f50000;
    private final Object[] \u00d8\u00f50000;
    private final b \u00d3\u00f50000;

    public d(String string, String string2, String string3, int n2, Object[] objectArray, b b2) {
        super(b2);
        this.\u00d5\u00f50000 = string;
        this.thisvoid = string2;
        this.\u00f4\u00f50000 = string3;
        this.\u00d4\u00f50000 = n2;
        this.\u00d8\u00f50000 = objectArray;
        this.\u00d3\u00f50000 = b2;
    }

    public final String \u00f8\u00d80000() {
        return this.\u00d5\u00f50000;
    }

    public final String \u00f4\u00d80000() {
        return this.thisvoid;
    }

    public final String \u00f5\u00d80000() {
        return this.\u00f4\u00f50000;
    }

    public final int privateclass() {
        return this.\u00d4\u00f50000;
    }

    public final Object[] O\u00f40000() {
        return this.\u00d8\u00f50000;
    }

    @Override
    protected final Object \u00d800000(Object object) {
        pc.o00000(object);
        return object;
    }

    @Override
    public final StackTraceElement \u00d3\u00d80000() {
        String string = l.\u00d300000.\u00d200000(this);
        string = string == null ? this.\u00d5\u00f50000 : string + '/' + this.\u00d5\u00f50000;
        return new StackTraceElement(string, this.thisvoid, this.\u00f4\u00f50000, this.\u00d4\u00f50000);
    }

    @Override
    public final b.r.l O\u00d80000() {
        return this.\u00d3\u00f50000.O\u00d80000();
    }
}

