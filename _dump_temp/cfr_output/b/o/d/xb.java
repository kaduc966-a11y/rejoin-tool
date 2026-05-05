/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.o.d.fc;
import b.o.d.xb$_b;
import b.o.d.xb$_c;
import b.o.r;
import b.qd;
import b.s.mc;
import b.t.q;
import b.t.u;
import b.t.v;
import b.t.z;
import java.util.List;

public final class xb
implements u {
    public static final xb$_c \u00d8\u00d6o000 = new xb$_c(null);
    private final v \u00d5\u00d6o000;
    private final List \u00d4\u00d6o000;
    private final u \u00d3\u00d6o000;
    private final int o\u00d6o000;
    public static final int O\u00d6o000 = 1;
    public static final int returnStringsuper = 2;
    public static final int newStringsuper = 4;

    public xb(v v2, List list, u u2, int n2) {
        this.\u00d5\u00d6o000 = v2;
        this.\u00d4\u00d6o000 = list;
        this.\u00d3\u00d6o000 = u2;
        this.o\u00d6o000 = n2;
    }

    @Override
    public final v privatevoid() {
        return this.\u00d5\u00d6o000;
    }

    @Override
    public final List \u00f5\u00f60000() {
        return this.\u00d4\u00d6o000;
    }

    public final u o\u00f80000() {
        return this.\u00d3\u00d6o000;
    }

    public static /* synthetic */ void O\u00f80000() {
    }

    public final int \u00f8\u00f60000() {
        return this.o\u00d6o000;
    }

    public static /* synthetic */ void newnull() {
    }

    public xb(v v2, List list, boolean bl) {
        this(v2, list, null, bl ? 1 : 0);
    }

    @Override
    public final List \u00d8\u00f50000() {
        return mc.\u00d500000();
    }

    @Override
    public final boolean \u00f4\u00f60000() {
        return (this.o\u00d6o000 & 1) != 0;
    }

    public final boolean equals(Object object) {
        return object instanceof xb && fc.o00000((Object)this.privatevoid(), (Object)((xb)object).privatevoid()) && fc.o00000((Object)this.\u00f5\u00f60000(), (Object)((xb)object).\u00f5\u00f60000()) && fc.o00000((Object)this.\u00d3\u00d6o000, (Object)((xb)object).\u00d3\u00d6o000) && this.o\u00d6o000 == ((xb)object).o\u00d6o000;
    }

    public final int hashCode() {
        return (this.privatevoid().hashCode() * 31 + ((Object)this.\u00f5\u00f60000()).hashCode()) * 31 + Integer.hashCode(this.o\u00d6o000);
    }

    public final String toString() {
        return this.\u00d500000(false) + " (Kotlin reflection is not available)";
    }

    private final String \u00d500000(boolean bl) {
        Class clazz = this.privatevoid();
        z z2 = clazz instanceof z ? (z)((Object)clazz) : null;
        clazz = z2 != null ? r.\u00d300000(z2) : null;
        String string = clazz == null ? this.privatevoid().toString() : ((this.o\u00d6o000 & 4) != 0 ? "kotlin.Nothing" : (clazz.isArray() ? this.o00000(clazz) : (bl && clazz.isPrimitive() ? r.new((z)this.privatevoid()).getName() : clazz.getName())));
        clazz = this.\u00f5\u00f60000().isEmpty() ? "" : mc.o00000(this.\u00f5\u00f60000(), ", ", "<", ">", 0, null, arg_0 -> xb.o00000(this, arg_0), 24, null);
        String string2 = this.\u00f4\u00f60000() ? "?" : "";
        string = string + (String)((Object)clazz) + string2;
        clazz = this.\u00d3\u00d6o000;
        if (clazz instanceof xb && !fc.o00000((Object)(clazz = ((xb)((Object)clazz)).\u00d500000(true)), (Object)string)) {
            if (fc.o00000((Object)clazz, (Object)(string + '?'))) {
                return string + '!';
            }
            return "(" + string + ".." + (String)((Object)clazz) + ')';
        }
        return string;
    }

    private final String o00000(Class clazz) {
        if (fc.o00000((Object)clazz, boolean[].class)) {
            return "kotlin.BooleanArray";
        }
        if (fc.o00000((Object)clazz, char[].class)) {
            return "kotlin.CharArray";
        }
        if (fc.o00000((Object)clazz, byte[].class)) {
            return "kotlin.ByteArray";
        }
        if (fc.o00000((Object)clazz, short[].class)) {
            return "kotlin.ShortArray";
        }
        if (fc.o00000((Object)clazz, int[].class)) {
            return "kotlin.IntArray";
        }
        if (fc.o00000((Object)clazz, float[].class)) {
            return "kotlin.FloatArray";
        }
        if (fc.o00000((Object)clazz, long[].class)) {
            return "kotlin.LongArray";
        }
        if (fc.o00000((Object)clazz, double[].class)) {
            return "kotlin.DoubleArray";
        }
        return "kotlin.Array";
    }

    private final String o00000(q q2) {
        if (q2.new() == null) {
            return "*";
        }
        Object object = q2.o00000();
        Object object2 = object instanceof xb ? (xb)object : null;
        if (object2 == null || (object2 = ((xb)object2).\u00d500000(true)) == null) {
            object2 = String.valueOf(q2.o00000());
        }
        object = object2;
        switch (xb$_b.super[q2.new().ordinal()]) {
            case 1: {
                return object;
            }
            case 2: {
                return "in ".concat(String.valueOf(object));
            }
            case 3: {
                return "out ".concat(String.valueOf(object));
            }
        }
        throw new qd();
    }

    private static final CharSequence o00000(xb xb2, q q2) {
        return xb2.o00000(q2);
    }
}

