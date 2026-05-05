/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.b;

import b.t.c.b.b.q.d.b.b$_b;
import java.lang.reflect.Method;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b {
    public static final b o00000 = new b();
    private static b$_b \u00d200000;

    private b() {
    }

    private final b$_b o00000() {
        Object object = Class.class;
        try {
            object = new b$_b(((Class)object).getMethod("isSealed", new Class[0]), ((Class)object).getMethod("getPermittedSubclasses", new Class[0]), ((Class)object).getMethod("isRecord", new Class[0]), ((Class)object).getMethod("getRecordComponents", new Class[0]));
        }
        catch (NoSuchMethodException noSuchMethodException) {
            object = new b$_b(null, null, null, null);
        }
        return object;
    }

    private final b$_b new() {
        b$_b b$_b = \u00d200000;
        if (b$_b == null) {
            \u00d200000 = b$_b = this.o00000();
        }
        return b$_b;
    }

    public final Boolean new(Class clazz) {
        Method method = this.new().\u00d200000();
        if (method == null) {
            return null;
        }
        return (Boolean)method.invoke((Object)clazz, new Object[0]);
    }

    public final Class[] o00000(Class clazz) {
        Method method = this.new().\u00d300000();
        if (method == null) {
            return null;
        }
        return (Class[])method.invoke((Object)clazz, new Object[0]);
    }

    public final Boolean \u00d300000(Class clazz) {
        Method method = this.new().super();
        if (method == null) {
            return null;
        }
        return (Boolean)method.invoke((Object)clazz, new Object[0]);
    }

    public final Object[] \u00d400000(Class clazz) {
        Method method = this.new().\u00d400000();
        if (method == null) {
            return null;
        }
        return (Object[])method.invoke((Object)clazz, new Object[0]);
    }
}

