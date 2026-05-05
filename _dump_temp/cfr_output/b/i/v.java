/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.i.b;
import b.i.bb;
import b.i.k;
import b.i.m;
import b.i.v$_b;
import b.i.y;
import b.o.d.fc;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class v
implements Serializable,
Comparable {
    public static final v$_b \u00d500000 = new v$_b(null);
    private final long \u00d400000;
    private final int Object;
    private static final v o00000 = new v(-31557014167219200L, 0);
    private static final v \u00d200000 = new v(31556889864403199L, 999999999);

    public v(long l2, int n2) {
        this.\u00d400000 = l2;
        this.Object = n2;
        long l3 = this.\u00d400000;
        if (!(-31557014167219200L <= l3 ? l3 < 31556889864403200L : false)) {
            String string = "Instant exceeds minimum or maximum instant";
            throw new IllegalArgumentException(string.toString());
        }
    }

    public final long \u00d500000() {
        return this.\u00d400000;
    }

    public final int String() {
        return this.Object;
    }

    public final long \u00d600000() {
        long l2;
        long l3;
        if (this.\u00d400000 >= 0L) {
            long l4;
            long l5;
            long l6 = this.\u00d400000;
            if (1000L == 1L) {
                l5 = l6;
            } else if (l6 == 1L) {
                l5 = 1000L;
            } else if (l6 == 0L || 1000L == 0L) {
                l5 = 0L;
            } else {
                l4 = l6 * 1000L;
                if (l4 / 1000L != l6 || l6 == Long.MIN_VALUE && 1000L == -1L || 1000L == Long.MIN_VALUE && l6 == -1L) {
                    return Long.MAX_VALUE;
                }
                l5 = l4;
            }
            l6 = l5;
            long l7 = this.Object / 1000000;
            l4 = l6 + l7;
            if ((l6 ^ l4) < 0L && (l6 ^ l7) >= 0L) {
                return Long.MAX_VALUE;
            }
            return l4;
        }
        long l8 = this.\u00d400000 + 1L;
        if (1000L == 1L) {
            l3 = l8;
        } else if (l8 == 1L) {
            l3 = 1000L;
        } else if (l8 == 0L || 1000L == 0L) {
            l3 = 0L;
        } else {
            l2 = l8 * 1000L;
            if (l2 / 1000L != l8 || l8 == Long.MIN_VALUE && 1000L == -1L || 1000L == Long.MIN_VALUE && l8 == -1L) {
                return Long.MIN_VALUE;
            }
            l3 = l2;
        }
        l8 = l3;
        long l9 = this.Object / 1000000 - 1000;
        l2 = l8 + l9;
        if ((l8 ^ l2) < 0L && (l8 ^ l9) >= 0L) {
            return Long.MIN_VALUE;
        }
        return l2;
    }

    public final v \u00d200000(long l2) {
        long l3 = l2;
        int n2 = b.\u00d6O0000(l3);
        long l4 = b.oo0000(l3);
        if (l4 == 0L && n2 == 0) {
            return this;
        }
        long l5 = this.\u00d400000;
        long l6 = l4;
        long l7 = l5 + l6;
        if ((l5 ^ l7) < 0L && (l5 ^ l6) >= 0L) {
            if (b.private(l2)) {
                return \u00d200000;
            }
            return o00000;
        }
        long l8 = l7;
        int n3 = this.Object + n2;
        return \u00d500000.super(l8, n3);
    }

    public final v o00000(long l2) {
        return this.\u00d200000(b.\u00f600000(l2));
    }

    public final long \u00d200000(v v2) {
        return b.\u00d200000(y.new(this.\u00d400000 - v2.\u00d400000, m.\u00d600000), y.o00000(this.Object - v2.Object, m.\u00d300000));
    }

    public final int o00000(v v2) {
        int n2 = fc.o00000(this.\u00d400000, v2.\u00d400000);
        if (n2 != 0) {
            return n2;
        }
        return fc.o00000(this.Object, v2.Object);
    }

    public final boolean equals(Object object) {
        return this == object || object instanceof v && this.\u00d400000 == ((v)object).\u00d400000 && this.Object == ((v)object).Object;
    }

    public final int hashCode() {
        return Long.hashCode(this.\u00d400000) + 51 * this.Object;
    }

    public final String toString() {
        return k.\u00d500000(this);
    }

    private final Object o00000() {
        return bb.o00000(this);
    }

    private final void o00000(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    public static final /* synthetic */ v \u00d300000() {
        return o00000;
    }

    public static final /* synthetic */ v \u00d200000() {
        return \u00d200000;
    }
}

