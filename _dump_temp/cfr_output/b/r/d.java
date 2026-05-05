/*
 * Decompiled with CFR 0.152.
 */
package b.r;

import b.o.d.fc;
import b.o.d.sb$_i;
import b.o.e.f;
import b.r.d$_b;
import b.r.i;
import b.r.l;
import b.r.l$_b;
import b.r.l$_c;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d
implements Serializable,
l {
    private final l \u00d600000;
    private final l$_c \u00d500000;

    public d(l l2, l$_c _c2) {
        this.\u00d600000 = l2;
        this.\u00d500000 = _c2;
    }

    @Override
    public final l$_c \u00d200000(l$_b _b2) {
        l l2;
        d d2 = this;
        while (true) {
            if ((l2 = d2.\u00d500000.\u00d200000(_b2)) != null) {
                return l2;
            }
            l2 = d2.\u00d600000;
            if (!(l2 instanceof d)) break;
            d2 = (d)l2;
        }
        return l2.\u00d200000(_b2);
    }

    @Override
    public final Object super(Object object, f f2) {
        return f2.o00000(this.\u00d600000.super(object, f2), this.\u00d500000);
    }

    @Override
    public final l super(l$_b object) {
        if (this.\u00d500000.\u00d200000((l$_b)object) != null) {
            return this.\u00d600000;
        }
        if ((object = this.\u00d600000.super((l$_b)object)) == this.\u00d600000) {
            return this;
        }
        if (object == i.o00000) {
            return this.\u00d500000;
        }
        return new d((l)object, this.\u00d500000);
    }

    private final int \u00d400000() {
        l l2 = this;
        int n2 = 2;
        while (true) {
            l l3 = (l2 = ((d)l2).\u00d600000) instanceof d ? l2 : null;
            if (l3 == null) {
                return n2;
            }
            l2 = l3;
            ++n2;
        }
    }

    private final boolean super(l$_c l$_c) {
        return fc.o00000((Object)this.\u00d200000(l$_c.\u00d200000()), (Object)l$_c);
    }

    private final boolean super(d l2) {
        do {
            if (this.super(l2.\u00d500000)) continue;
            return false;
        } while ((l2 = l2.\u00d600000) instanceof d);
        return this.super((l$_c)l2);
    }

    public final boolean equals(Object object) {
        return this == object || object instanceof d && ((d)object).\u00d400000() == this.\u00d400000() && ((d)object).super(this);
    }

    public final int hashCode() {
        return this.\u00d600000.hashCode() + this.\u00d500000.hashCode();
    }

    public final String toString() {
        return "[" + (String)this.super("", d::super) + ']';
    }

    private final Object \u00d300000() {
        int n2 = this.\u00d400000();
        l[] lArray = new l[n2];
        sb$_i sb$_i = new sb$_i();
        this.super(b.i.o00000, (arg_0, arg_1) -> d.super(lArray, sb$_i, arg_0, arg_1));
        if (!(sb$_i.o00000 == n2)) {
            throw new IllegalStateException("Check failed.");
        }
        return new d$_b(lArray);
    }

    private final void super(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private static final String super(String string, l$_c l$_c) {
        if (((CharSequence)string).length() == 0) {
            return l$_c.toString();
        }
        return string + ", " + l$_c;
    }

    private static final b.i super(l[] lArray, sb$_i sb$_i, b.i i2, l$_c l$_c) {
        int n2 = sb$_i.o00000;
        sb$_i.o00000 = n2 + 1;
        lArray[n2] = l$_c;
        return b.i.o00000;
    }
}

