/*
 * Decompiled with CFR 0.152.
 */
package b.r.d.b;

import b.r.b;
import b.r.d.b.m;
import b.r.d.b.o;
import b.r.e;
import b.r.l;

public abstract class s
extends o {
    private final l \u00f5\u00f50000;
    private transient b Stringvoid;

    public s(b b2, l l2) {
        super(b2);
        this.\u00f5\u00f50000 = l2;
    }

    public s(b b2) {
        b b3 = b2;
        this(b3, b3 != null ? b3.O\u00d80000() : null);
    }

    @Override
    public l O\u00d80000() {
        return this.\u00f5\u00f50000;
    }

    public final b o\u00f40000() {
        Object object = this.Stringvoid;
        if (object == null) {
            Object object2;
            Object object3 = (e)this.O\u00d80000().\u00d200000(e.Object);
            if (object3 == null || (object3 = object3.\u00d200000(this)) == null) {
                object3 = this;
            }
            Object object4 = object3;
            this.Stringvoid = object2 = object3;
            object = object4;
        }
        return object;
    }

    @Override
    protected void forclass() {
        b b2 = this.Stringvoid;
        if (b2 != null && b2 != this) {
            ((e)this.O\u00d80000().\u00d200000(e.Object)).super(b2);
        }
        this.Stringvoid = m.\u00f5\u00f40000;
    }
}

