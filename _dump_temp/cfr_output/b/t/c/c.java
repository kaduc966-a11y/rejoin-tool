/*
 * Decompiled with CFR 0.152.
 */
package b.t.c;

import b.t.c.b.hd;
import b.t.c.h;
import b.t.db;
import b.t.g;
import b.t.g$_b;
import b.t.k;
import b.t.m;
import b.t.m$_d;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class c {
    public static final boolean super(db db2) {
        Object object = db2;
        if (object instanceof g) {
            Field field = h.o00000((m)db2);
            if (field != null ? field.isAccessible() : true) {
                Method method = h.\u00d200000((m)db2);
                if (method != null ? method.isAccessible() : true) {
                    Method method2 = h.o00000((g)db2);
                    if (method2 != null ? method2.isAccessible() : true) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (object instanceof m) {
            Field field = h.o00000((m)db2);
            if (field != null ? field.isAccessible() : true) {
                Method method = h.\u00d200000((m)db2);
                if (method != null ? method.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (object instanceof m$_d) {
            Field field = h.o00000(((m$_d)db2).\u00f5\u00f4O000());
            if (field != null ? field.isAccessible() : true) {
                Method method = h.\u00d200000((k)db2);
                if (method != null ? method.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (object instanceof g$_b) {
            Field field = h.o00000(((g$_b)db2).\u00f5\u00f4O000());
            if (field != null ? field.isAccessible() : true) {
                Method method = h.\u00d200000((k)db2);
                if (method != null ? method.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (object instanceof k) {
            Method method = h.\u00d200000((k)db2);
            if (method != null ? method.isAccessible() : true) {
                Object object2 = hd.super(db2);
                object = object2 != null && (object2 = object2.\u00d3\u00d8O000()) != null ? object2.Object() : null;
                AccessibleObject accessibleObject = object instanceof AccessibleObject ? (AccessibleObject)object : null;
                if (accessibleObject != null ? accessibleObject.isAccessible() : true) {
                    Constructor constructor = h.o00000((k)db2);
                    if (constructor != null ? constructor.isAccessible() : true) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw new UnsupportedOperationException("Unknown callable: " + db2 + " (" + db2.getClass() + ')');
    }

    public static final void super(db db2, boolean bl) {
        Object object = db2;
        if (object instanceof g) {
            Field field = h.o00000((m)db2);
            if (field != null) {
                field.setAccessible(bl);
            }
            Method method = h.\u00d200000((m)db2);
            if (method != null) {
                method.setAccessible(bl);
            }
            Method method2 = h.o00000((g)db2);
            if (method2 != null) {
                method2.setAccessible(bl);
                return;
            }
            return;
        }
        if (object instanceof m) {
            Field field = h.o00000((m)db2);
            if (field != null) {
                field.setAccessible(bl);
            }
            Method method = h.\u00d200000((m)db2);
            if (method != null) {
                method.setAccessible(bl);
                return;
            }
            return;
        }
        if (object instanceof m$_d) {
            Field field = h.o00000(((m$_d)db2).\u00f5\u00f4O000());
            if (field != null) {
                field.setAccessible(bl);
            }
            Method method = h.\u00d200000((k)db2);
            if (method != null) {
                method.setAccessible(bl);
                return;
            }
            return;
        }
        if (object instanceof g$_b) {
            Field field = h.o00000(((g$_b)db2).\u00f5\u00f4O000());
            if (field != null) {
                field.setAccessible(bl);
            }
            Method method = h.\u00d200000((k)db2);
            if (method != null) {
                method.setAccessible(bl);
                return;
            }
            return;
        }
        if (object instanceof k) {
            Object object2;
            Method method = h.\u00d200000((k)db2);
            if (method != null) {
                method.setAccessible(bl);
            }
            object = (object2 = hd.super(db2)) != null && (object2 = object2.\u00d3\u00d8O000()) != null ? object2.Object() : null;
            AccessibleObject accessibleObject = object instanceof AccessibleObject ? (AccessibleObject)object : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(true);
            }
            Constructor constructor = h.o00000((k)db2);
            if (constructor != null) {
                constructor.setAccessible(bl);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Unknown callable: " + db2 + " (" + db2.getClass() + ')');
    }
}

