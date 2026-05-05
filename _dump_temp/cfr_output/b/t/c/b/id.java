/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.m;
import b.o.d.fc;
import b.qd;
import b.s.mc;
import b.t.c.b.b.f.b.b.j;
import b.t.c.b.b.h.o;
import b.t.c.b.b.l.c.b$_f;
import b.t.c.b.b.l.c.b$_i;
import b.t.c.b.b.l.c.b.e;
import b.t.c.b.b.o.n;
import b.t.c.b.b.q.eb;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.pb;
import b.t.c.b.b.q.wb;
import b.t.c.b.d.b;
import b.t.c.b.d.c;
import b.t.c.b.d.d;
import b.t.c.b.d.g;
import b.t.c.b.d.g$_b;
import b.t.c.b.d.g$_c;
import b.t.c.b.d.h;
import b.t.c.b.d.h$_d$_b;
import b.t.c.b.d.h$_d$_c;
import b.t.c.b.d.h$_d$_d;
import b.t.c.b.d.h$_d$_e;
import b.t.c.b.d.h$_d$_f;
import b.t.c.b.d.h$_e;
import b.t.c.b.d.h$_e$_b;
import b.t.c.b.d.h$_e$_c;
import b.t.c.b.d.h$_e$_d;
import b.t.c.b.d.h$_e$_e;
import b.t.c.b.d.h$_e$_f;
import b.t.c.b.d.h$_h;
import b.t.c.b.d.h$_h$_b;
import b.t.c.b.d.h$_h$_c;
import b.t.c.b.d.h$_h$_d;
import b.t.c.b.d.h$_h$_e;
import b.t.c.b.d.h$_h$_f;
import b.t.c.b.d.h$_h$_g;
import b.t.c.b.hd;
import b.t.c.b.lb;
import b.t.c.b.mb$_b;
import b.t.c.b.mb$_c;
import b.t.c.b.mb$_d;
import b.t.c.b.mb$_e;
import b.t.c.b.md;
import b.t.c.b.w$_c;
import b.t.c.b.yb$_f;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class id {
    public static final Object \u00d300000(w$_c w$_c) {
        return md.\u00d400000(w$_c.o\u00f5O000());
    }

    private static final b super(w$_c w$_c, boolean bl) {
        b b2;
        Object object;
        if (b.t.c.b.h.nullvoidsuper.\u00d200000(w$_c.o\u00f5O000().\u00f5\u00f6O000())) {
            return c.o00000;
        }
        Object object2 = object = b.t.c.b.ib.super.super(w$_c.o\u00f5O000().\u00f4\u00f8O000());
        if (object instanceof mb$_d) {
            Object object3;
            object2 = ((mb$_d)object).\u00d600000();
            b$_f b$_f = bl ? (((b$_i)object2).\u00d6\u00d60000() ? ((b$_i)object2).\u00d4\u00d60000() : null) : (((b$_i)object2).\u00d2\u00d60000() ? ((b$_i)object2).\u00f4\u00d50000() : null);
            if (b$_f != null) {
                object2 = b$_f;
                object3 = w$_c.o\u00f5O000().o\u00d8O000().\u00d400000(((mb$_d)object).int().new(((b$_f)object2).\u00f8\u00d20000()), ((mb$_d)object).int().new(((b$_f)object2).classnew()));
            } else {
                object3 = object = null;
            }
            if (object3 == null) {
                if (b.t.c.b.b.o.b.o00000(w$_c.o\u00f5O000().\u00f4\u00f8O000()) && fc.o00000((Object)w$_c.o\u00f5O000().\u00f4\u00f8O000().\u00d50O000(), (Object)eb.\u00f500000)) {
                    GenericDeclaration genericDeclaration = id.super(w$_c.o\u00f5O000().\u00f4\u00f8O000().\u00d8\u00f80000());
                    if (genericDeclaration == null || (genericDeclaration = d.new(genericDeclaration, w$_c.o\u00f5O000())) == null) {
                        throw new lb("Underlying property of inline class " + w$_c.o\u00f5O000() + " should have a field");
                    }
                    object2 = genericDeclaration;
                    b2 = md.\u00d300000(w$_c) ? (g)new g$_b((Method)object2, id.\u00d300000(w$_c)) : (g)new g$_c((Method)object2);
                } else {
                    Field field = w$_c.o\u00f5O000().\u00f4\u00f6O000();
                    if (field == null) {
                        throw new lb("No accessors or field is found for property " + w$_c.o\u00f5O000());
                    }
                    object2 = field;
                    b2 = id.super(w$_c, bl, (Field)object2);
                }
            } else {
                b2 = !Modifier.isStatic(((Method)object).getModifiers()) ? (b)(md.\u00d300000(w$_c) ? (h$_h)new h$_h$_e((Method)object, id.\u00d300000(w$_c)) : (h$_h)new h$_h$_c((Method)object)) : (id.super(w$_c) ? (b)(md.\u00d300000(w$_c) ? (h$_h)new h$_h$_g((Method)object) : (h$_h)new h$_h$_d((Method)object)) : (b)(md.\u00d300000(w$_c) ? (h$_h)new h$_h$_b((Method)object, false, id.\u00d300000(w$_c)) : (h$_h)new h$_h$_f((Method)object)));
            }
        } else if (object2 instanceof mb$_b) {
            b2 = id.super(w$_c, bl, ((mb$_b)object).OO0000());
        } else if (object2 instanceof mb$_c) {
            Method method;
            if (bl) {
                method = ((mb$_c)object).\u00d300000();
            } else {
                method = ((mb$_c)object).\u00d200000();
                if (method == null) {
                    throw new lb("No source found for setter of Java method property: " + ((mb$_c)object).\u00d300000());
                }
            }
            object2 = method;
            b2 = md.\u00d300000(w$_c) ? (h$_h)new h$_h$_e((Method)object2, id.\u00d300000(w$_c)) : (h$_h)new h$_h$_c((Method)object2);
        } else {
            if (object2 instanceof mb$_e) {
                boolean bl2;
                yb$_f yb$_f;
                if (bl) {
                    yb$_f = ((mb$_e)object).\u00f600000();
                } else {
                    yb$_f = ((mb$_e)object).\u00f800000();
                    if (yb$_f == null) {
                        throw new lb("No setter found for property " + w$_c.o\u00f5O000());
                    }
                }
                object2 = yb$_f;
                Method method = w$_c.o\u00f5O000().o\u00d8O000().\u00d400000(((yb$_f)object2).class(), ((yb$_f)object2).\u00d600000());
                if (method == null) {
                    throw new lb("No accessor found for property " + w$_c.o\u00f5O000());
                }
                object = method;
                boolean bl3 = bl2 = !Modifier.isStatic(method.getModifiers());
                if (m.new && !bl2) {
                    String string = "Mapped property cannot have a static accessor: " + w$_c.o\u00f5O000();
                    throw new AssertionError((Object)string);
                }
                if (md.\u00d300000(w$_c)) {
                    return new h$_h$_e((Method)object, id.\u00d300000(w$_c));
                }
                return new h$_h$_c((Method)object);
            }
            throw new qd();
        }
        return d.o00000(b2, w$_c, false, mc.\u00d500000());
    }

    private static final Class super(wb wb2) {
        Class clazz;
        if (wb2 instanceof ib && b.t.c.b.b.o.b.\u00d300000(wb2)) {
            clazz = hd.super((ib)wb2);
            if (clazz == null) {
                throw new lb("Class object for the class " + ((ib)wb2).\u00d5\u00f80000() + " cannot be found (classId=" + b.t.c.b.b.o.f.b.o00000((kb)wb2) + ')');
            }
        } else {
            clazz = null;
        }
        return clazz;
    }

    private static final boolean super(pb pb2) {
        wb wb2 = pb2.\u00d8\u00f80000();
        if (!n.\u00d2O0000(wb2)) {
            return false;
        }
        return !n.\u00d4O0000(wb2 = wb2.\u00d8\u00f80000()) && !n.\u00d200000(wb2) || pb2 instanceof j && e.super(((j)pb2).\u00d50\u00d2000());
    }

    private static final boolean super(w$_c w$_c) {
        return w$_c.o\u00f5O000().\u00f4\u00f8O000().\u00d4\u00f80000().\u00d300000(hd.super());
    }

    private static final boolean \u00d200000(w$_c w$_c) {
        return !o.\u00d600000(w$_c.o\u00f5O000().\u00f4\u00f8O000().forclasssuper());
    }

    private static final h super(w$_c w$_c, boolean bl, Field field) {
        if (id.super(w$_c.o\u00f5O000().\u00f4\u00f8O000()) || !Modifier.isStatic(field.getModifiers())) {
            if (bl) {
                return md.\u00d300000(w$_c) ? (h$_e)new h$_e$_d(field, id.\u00d300000(w$_c)) : (h$_e)new h$_e$_b(field);
            }
            if (md.\u00d300000(w$_c)) {
                return new h$_d$_d(field, id.\u00d200000(w$_c), id.\u00d300000(w$_c));
            }
            return new h$_d$_b(field, id.\u00d200000(w$_c));
        }
        if (id.super(w$_c)) {
            if (bl) {
                return md.\u00d300000(w$_c) ? (h$_e)new h$_e$_f(field) : (h$_e)new h$_e$_c(field);
            }
            if (md.\u00d300000(w$_c)) {
                return new h$_d$_f(field, id.\u00d200000(w$_c));
            }
            return new h$_d$_c(field, id.\u00d200000(w$_c));
        }
        if (bl) {
            return new h$_e$_e(field);
        }
        return new h$_d$_e(field, id.\u00d200000(w$_c));
    }

    public static final /* synthetic */ b \u00d200000(w$_c w$_c, boolean bl) {
        return id.super(w$_c, bl);
    }
}

