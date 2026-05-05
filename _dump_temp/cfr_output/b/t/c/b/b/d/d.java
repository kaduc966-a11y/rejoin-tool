/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.d;

import b.m;
import b.o.d.fc;
import b.t.c.b.b.d.d$_b;
import b.t.c.b.b.d.f;
import b.t.c.b.b.d.k;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d {
    public static final d$_b String = new d$_b(null);
    private final k \u00d200000;
    private final k o00000;
    private final boolean \u00d300000;

    public d(k k2, k k3, boolean bl) {
        boolean bl2;
        this.\u00d200000 = k2;
        this.o00000 = k3;
        this.\u00d300000 = bl;
        boolean bl3 = bl2 = !this.o00000.\u00d600000();
        if (m.new && !bl2) {
            String string = "Class name must not be root: " + this.\u00d200000 + (this.\u00d300000 ? " (local)" : "");
            throw new AssertionError((Object)string);
        }
    }

    public final k \u00d800000() {
        return this.\u00d200000;
    }

    public final k \u00d400000() {
        return this.o00000;
    }

    public final boolean return() {
        return this.\u00d300000;
    }

    public d(k k2, f f2) {
        this(k2, k.\u00d400000.super(f2), false);
    }

    public final f o00000() {
        return this.o00000.\u00d400000();
    }

    public final d \u00d500000() {
        k k2 = this.o00000.\u00d300000();
        if (!k2.\u00d600000()) {
            return new d(this.\u00d200000, k2, this.\u00d300000);
        }
        return null;
    }

    public final boolean new() {
        return !this.o00000.\u00d300000().\u00d600000();
    }

    public final d o00000(f f2) {
        return new d(this.\u00d200000, this.o00000.\u00d200000(f2), this.\u00d300000);
    }

    public final k \u00f400000() {
        if (this.\u00d200000.\u00d600000()) {
            return this.o00000;
        }
        return new k(this.\u00d200000.super() + '.' + this.o00000.super());
    }

    public final String \u00d300000() {
        StringBuilder stringBuilder;
        if (this.\u00d200000.\u00d600000()) {
            return d.new(this.o00000);
        }
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        stringBuilder.append(b.q.f.super(this.\u00d200000.super(), '.', '/', false, 4, null));
        stringBuilder2.append("/");
        stringBuilder2.append(d.new(this.o00000));
        return stringBuilder.toString();
    }

    public final String toString() {
        if (this.\u00d200000.\u00d600000()) {
            return "/" + this.\u00d300000();
        }
        return this.\u00d300000();
    }

    public final int hashCode() {
        return (this.\u00d200000.hashCode() * 31 + this.o00000.hashCode()) * 31 + Boolean.hashCode(this.\u00d300000);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof d)) {
            return false;
        }
        object = (d)object;
        if (!fc.o00000((Object)this.\u00d200000, (Object)((d)object).\u00d200000)) {
            return false;
        }
        if (!fc.o00000((Object)this.o00000, (Object)((d)object).o00000)) {
            return false;
        }
        return this.\u00d300000 == ((d)object).\u00d300000;
    }

    private static final String new(k object) {
        if (b.q.f.\u00d300000((CharSequence)(object = ((k)object).super()), '/', false, 2, null)) {
            return "`" + (String)object + '`';
        }
        return object;
    }

    public static final d o00000(k k2) {
        return String.o00000(k2);
    }
}

