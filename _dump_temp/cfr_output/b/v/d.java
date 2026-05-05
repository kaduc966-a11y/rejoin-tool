/*
 * Decompiled with CFR 0.152.
 */
package b.v;

import b.f;
import b.o.d.w;
import b.s;
import b.v.d$_b;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d
implements Serializable,
Comparable {
    public static final d$_b \u00d600000 = new d$_b(null);
    private final long String;
    private final long \u00d200000;
    private static final d \u00d500000 = new d(0L, 0L);
    public static final int \u00d300000 = 16;
    public static final int o00000 = 128;

    private d(long l2, long l3) {
        this.String = l2;
        this.\u00d200000 = l3;
    }

    public final long \u00d500000() {
        return this.String;
    }

    public static /* synthetic */ void \u00d400000() {
    }

    public final long void() {
        return this.\u00d200000;
    }

    public static /* synthetic */ void \u00f500000() {
    }

    private final Object o00000(b.o.e.f f2) {
        return f2.o00000(this.\u00d500000(), this.void());
    }

    private final Object \u00d200000(b.o.e.f f2) {
        return f2.o00000(f.\u00d4O0000(f.super(this.\u00d500000())), f.\u00d4O0000(f.super(this.void())));
    }

    public final String toString() {
        return this.Object();
    }

    public final String Object() {
        byte[] byArray = new byte[36];
        b.v.f.o00000(this.String, byArray, 0, 0, 4);
        byArray[8] = 45;
        b.v.f.o00000(this.String, byArray, 9, 4, 6);
        byArray[13] = 45;
        b.v.f.o00000(this.String, byArray, 14, 6, 8);
        byArray[18] = 45;
        b.v.f.o00000(this.\u00d200000, byArray, 19, 0, 2);
        byArray[23] = 45;
        b.v.f.o00000(this.\u00d200000, byArray, 24, 2, 8);
        return b.q.f.super(byArray);
    }

    public final String o00000() {
        byte[] byArray = new byte[32];
        b.v.f.o00000(this.String, byArray, 0, 0, 8);
        b.v.f.o00000(this.\u00d200000, byArray, 16, 0, 8);
        return b.q.f.super(byArray);
    }

    public final byte[] \u00f600000() {
        byte[] byArray = new byte[16];
        b.v.f.o00000(byArray, 0, this.String);
        b.v.f.o00000(byArray, 8, this.\u00d200000);
        return byArray;
    }

    public final byte[] \u00d600000() {
        return s.return(this.\u00f600000());
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof d)) {
            return false;
        }
        return this.String == ((d)object).String && this.\u00d200000 == ((d)object).\u00d200000;
    }

    public final int o00000(d d2) {
        if (this.String != d2.String) {
            return Long.compareUnsigned(f.super(this.String), f.super(d2.String));
        }
        return Long.compareUnsigned(f.super(this.\u00d200000), f.super(d2.\u00d200000));
    }

    public final int hashCode() {
        return Long.hashCode(this.String ^ this.\u00d200000);
    }

    private final Object \u00d200000() {
        return b.v.f.\u00d200000(this);
    }

    private final void o00000(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    public static final /* synthetic */ d \u00f400000() {
        return \u00d500000;
    }

    public /* synthetic */ d(long l2, long l3, w w2) {
        this(l2, l3);
    }
}

