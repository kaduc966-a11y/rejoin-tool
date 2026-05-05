/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.b;
import b.t.c.b.b.p.s;
import b.t.c.b.b.p.v;
import java.io.IOException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class m {
    private b o00000;
    private s new;
    private volatile boolean \u00d400000;
    protected volatile v \u00d300000;

    public v \u00d300000(v v2) {
        this.super(v2);
        return this.\u00d300000;
    }

    public v \u00d200000(v v2) {
        v v3 = this.\u00d300000;
        this.\u00d300000 = v2;
        this.o00000 = null;
        this.\u00d400000 = true;
        return v3;
    }

    public int super() {
        if (this.\u00d400000) {
            return this.\u00d300000.\u00f800000();
        }
        return this.o00000.\u00f400000();
    }

    protected void super(v v2) {
        if (this.\u00d300000 != null) {
            return;
        }
        m m2 = this;
        synchronized (m2) {
            if (this.\u00d300000 != null) {
                return;
            }
            try {
                this.\u00d300000 = this.o00000 != null ? (v)v2.\u00f600000().o00000(this.o00000, this.new) : v2;
            }
            catch (IOException iOException) {}
            return;
        }
    }
}

