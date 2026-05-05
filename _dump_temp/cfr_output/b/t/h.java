/*
 * Decompiled with CFR 0.152.
 */
package b.t;

import b.o.d.fc;
import b.t.c;
import b.t.d;
import b.t.h$_b;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class h
implements WildcardType,
c {
    public static final h$_b \u00d400000 = new h$_b(null);
    private final Type \u00d200000;
    private final Type Object;
    private static final h o00000 = new h(null, null);

    public h(Type type, Type type2) {
        this.\u00d200000 = type;
        this.Object = type2;
    }

    @Override
    public final Type[] getUpperBounds() {
        Type[] typeArray;
        Type[] typeArray2 = typeArray = new Type[1];
        Type type = this.\u00d200000;
        if (type == null) {
            type = (Type)((Object)Object.class);
        }
        typeArray2[0] = type;
        return typeArray;
    }

    @Override
    public final Type[] getLowerBounds() {
        if (this.Object == null) {
            return new Type[0];
        }
        Type[] typeArray = new Type[1];
        Type[] typeArray2 = typeArray;
        typeArray[0] = this.Object;
        return typeArray2;
    }

    @Override
    public final String getTypeName() {
        if (this.Object != null) {
            return "? super " + d.o00000(this.Object);
        }
        if (this.\u00d200000 != null && !fc.o00000((Object)this.\u00d200000, Object.class)) {
            return "? extends " + d.o00000(this.\u00d200000);
        }
        return "?";
    }

    public final boolean equals(Object object) {
        return object instanceof WildcardType && Arrays.equals(this.getUpperBounds(), ((WildcardType)object).getUpperBounds()) && Arrays.equals(this.getLowerBounds(), ((WildcardType)object).getLowerBounds());
    }

    public final int hashCode() {
        return Arrays.hashCode(this.getUpperBounds()) ^ Arrays.hashCode(this.getLowerBounds());
    }

    public final String toString() {
        return this.getTypeName();
    }

    public static final /* synthetic */ h super() {
        return o00000;
    }
}

