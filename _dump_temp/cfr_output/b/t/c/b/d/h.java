/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.d;

import b.o.d.w;
import b.s.mc;
import b.s.z;
import b.t.c.b.d.b;
import b.t.c.b.d.e;
import b.t.c.b.d.h$_i;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class h
implements b {
    public static final h$_i for = new h$_i(null);
    private final Member \u00f800000;
    private final Type \u00f500000;
    private final Class \u00f600000;
    private final List null;

    private h(Member object, Type object2, Class object3, Type[] typeArray) {
        Object object4;
        block3: {
            block2: {
                Object object5;
                this.\u00f800000 = object;
                this.\u00f500000 = object2;
                this.\u00f600000 = object3;
                object4 = ((h)(object5 = this)).\u00f600000;
                if (object4 == null) break block2;
                object = object4;
                object3 = object5;
                object2 = new b.o.d.b(2);
                ((b.o.d.b)object2).super(object);
                ((b.o.d.b)object2).\u00d200000(typeArray);
                Object object6 = object2;
                List list = mc.new(((b.o.d.b)object6).super(new Type[((b.o.d.b)object6).super()]));
                object5 = object3;
                object4 = list;
                if (list != null) break block3;
            }
            object4 = z.thisnew(typeArray);
        }
        ((h)object5).null = object4;
    }

    @Override
    public final Member Object() {
        return this.\u00f800000;
    }

    @Override
    public final Type \u00d400000() {
        return this.\u00f500000;
    }

    public final Class float() {
        return this.\u00f600000;
    }

    @Override
    public List \u00d200000() {
        return this.null;
    }

    protected final void o00000(Object object) {
        if (object == null || !this.\u00f800000.getDeclaringClass().isInstance(object)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    public void \u00d500000(Object[] objectArray) {
        this.\u00d400000(objectArray);
    }

    @Override
    public boolean o00000() {
        return this.\u00f600000();
    }

    public /* synthetic */ h(Member member, Type type, Class clazz, Type[] typeArray, w w2) {
        this(member, type, clazz, typeArray);
    }

    public void \u00d400000(Object[] objectArray) {
        if (e.o00000(this) != objectArray.length) {
            throw new IllegalArgumentException("Callable expects " + e.o00000(this) + " arguments, but " + objectArray.length + " were provided.");
        }
    }

    public boolean \u00f600000() {
        return false;
    }
}

