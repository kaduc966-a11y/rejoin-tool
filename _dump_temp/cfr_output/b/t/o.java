/*
 * Decompiled with CFR 0.152.
 */
package b.t;

import b.o.d.fc;
import b.o.e.g;
import b.s.z;
import b.t.c;
import b.t.d;
import b.t.o$_b$1$1;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class o
implements ParameterizedType,
c {
    private final Class void;
    private final Type \u00d600000;
    private final Type[] \u00d500000;

    public o(Class clazz, Type type, List list) {
        this.void = clazz;
        this.\u00d600000 = type;
        this.\u00d500000 = ((Collection)list).toArray(new Type[0]);
    }

    @Override
    public final Type getRawType() {
        return this.void;
    }

    @Override
    public final Type getOwnerType() {
        return this.\u00d600000;
    }

    @Override
    public final Type[] getActualTypeArguments() {
        return this.\u00d500000;
    }

    @Override
    public final String getTypeName() {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        if (this.\u00d600000 != null) {
            stringBuilder2.append(d.o00000(this.\u00d600000));
            stringBuilder2.append("$");
            stringBuilder2.append(this.void.getSimpleName());
        } else {
            stringBuilder2.append(d.o00000(this.void));
        }
        if (!(this.\u00d500000.length == 0)) {
            z.o00000(this.\u00d500000, (Appendable)stringBuilder2, null, (CharSequence)"<", (CharSequence)">", 0, null, (g)o$_b$1$1.\u00d5\u00f5\u00d3000, 50, null);
        }
        return stringBuilder.toString();
    }

    public final boolean equals(Object object) {
        return object instanceof ParameterizedType && fc.o00000((Object)this.void, (Object)((ParameterizedType)object).getRawType()) && fc.o00000((Object)this.\u00d600000, (Object)((ParameterizedType)object).getOwnerType()) && Arrays.equals(this.getActualTypeArguments(), ((ParameterizedType)object).getActualTypeArguments());
    }

    public final int hashCode() {
        Type type = this.\u00d600000;
        return this.void.hashCode() ^ (type != null ? type.hashCode() : 0) ^ Arrays.hashCode(this.getActualTypeArguments());
    }

    public final String toString() {
        return this.getTypeName();
    }
}

