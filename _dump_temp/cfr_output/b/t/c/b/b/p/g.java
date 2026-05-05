/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.v;
import java.io.IOException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class g
extends IOException {
    private v o00000 = null;

    public g(String string) {
        super(string);
    }

    public g o00000(v v2) {
        this.o00000 = v2;
        return this;
    }

    public v o00000() {
        return this.o00000;
    }

    static g \u00f400000() {
        return new g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static g new() {
        return new g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static g \u00d300000() {
        return new g("CodedInputStream encountered a malformed varint.");
    }

    static g \u00d400000() {
        return new g("Protocol message contained an invalid tag (zero).");
    }

    static g if() {
        return new g("Protocol message end-group tag did not match expected tag.");
    }

    static g \u00f500000() {
        return new g("Protocol message tag had invalid wire type.");
    }

    static g \u00d800000() {
        return new g("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static g return() {
        return new g("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static g \u00d500000() {
        return new g("Protocol message had invalid UTF-8.");
    }
}

