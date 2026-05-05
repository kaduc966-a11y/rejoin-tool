/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.d;

import b.o.d.fc;
import b.t.b.h;
import b.t.c.b.d.b;
import b.t.c.b.d.e;
import b.t.c.b.d.f;
import b.t.c.b.hd;
import b.t.c.b.lb;
import b.t.c.b.md;
import b.t.c.b.o;
import b.t.c.b.r;
import b.t.c.b.s;
import b.t.m$_d;
import b.t.p;
import b.t.p$_b;
import b.t.u;
import b.t.v;
import b.t.z;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d {
    private static final void o00000(b b2, int n2, o o2, boolean bl) {
        if (e.o00000(b2) != n2) {
            throw new lb("Inconsistent number of parameters in the descriptor and Java reflection object: " + e.o00000(b2) + " != " + n2 + "\nCalling: " + o2 + "\nParameter types: " + b2.\u00d200000() + ")\nDefault: " + bl);
        }
    }

    /*
     * Unable to fully structure code
     */
    private static final List new(o var0, Member var1_1) {
        var1_1 = new ArrayList<E>();
        var2_2 = var0.o\u00d8O000();
        if (!md.o00000((o)var0) && var2_2 instanceof z && ((z)var2_2).\u00d3\u00d4O000()) {
            var1_1.add(h.\u00d3O0000((z)var2_2));
        }
        if (!md.o00000((o)var0)) ** GOTO lbl-1000
        v0 = var2_2 instanceof z != false ? (z)var2_2 : null;
        v1 = v0 != null ? v0.newfor() : false;
        if (v1) {
            v2 = true;
        } else lbl-1000:
        // 2 sources

        {
            v2 = false;
        }
        var2_3 = v2;
        for (p var3_4 : var0.\u00f8\u00d6O000()) {
            if (var3_4.\u00f5\u00f50000() == p$_b.\u00d400000 && !var2_3) continue;
            var1_1.add(var3_4.\u00f8\u00f50000());
        }
        return var1_1;
    }

    private static final boolean new(Member member) {
        Class<?> clazz = member.getDeclaringClass();
        if (clazz == null) {
            return false;
        }
        return !b.o.r.o00000(clazz).\u00d3\u00d4O000();
    }

    public static final b o00000(b b2, o o2, boolean bl, List list) {
        boolean bl2;
        Object object = o2.\u00d8\u00d5O000();
        if (!(object instanceof Collection) || !((Collection)object).isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                if (!hd.\u00d400000(((p)object.next()).\u00f8\u00f50000())) continue;
                bl2 = true;
                break;
            }
        } else {
            bl2 = false;
        }
        if (bl2 || hd.\u00d400000(o2.\u00d5\u00d5O000())) {
            return new f(o2, b2, bl, list);
        }
        return b2;
    }

    public static final Method new(Class clazz, o o2) {
        Method method;
        try {
            method = clazz.getDeclaredMethod("unbox-impl", new Class[0]);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new lb("No unbox method found in inline class: " + clazz + " (calling " + o2 + ')');
        }
        return method;
    }

    private static final Method \u00d300000(Class clazz, o o2) {
        Object object;
        try {
            Class[] classArray = new Class[1];
            object = classArray;
            classArray[0] = d.new(clazz, o2).getReturnType();
            object = clazz.getDeclaredMethod("box-impl", (Class<?>)object);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new lb("No box method found in inline class: " + clazz + " (calling " + o2 + ')');
        }
        return object;
    }

    public static final Class new(u u2) {
        u u3 = u2;
        v v2 = u3 != null ? u3.privatevoid() : null;
        z z2 = v2 instanceof z ? (z)v2 : null;
        if (z2 == null) {
            return null;
        }
        v2 = z2;
        if (!z2.\u00d3\u00d4O000()) {
            return null;
        }
        if (!hd.super(u2)) {
            return b.o.r.\u00d300000((z)v2);
        }
        u u4 = hd.\u00d200000(u2);
        if (u4 == null) {
            return null;
        }
        u2 = u4;
        if (!hd.super(u4) && !d.\u00d300000(u2)) {
            return b.o.r.\u00d300000((z)v2);
        }
        return null;
    }

    private static final boolean o00000(o o2) {
        return o2 instanceof m$_d && d.o00000((s)((m$_d)((Object)o2)).\u00f5\u00f4O000());
    }

    public static final boolean o00000(s object) {
        boolean bl;
        Object object2 = object.\u00f8\u00d6O000();
        if (!(object2 instanceof Collection) || !((Collection)object2).isEmpty()) {
            object2 = object2.iterator();
            while (object2.hasNext()) {
                if (((p)object2.next()).\u00f5\u00f50000() == p$_b.\u00d400000) continue;
                bl = false;
                break;
            }
        } else {
            bl = true;
        }
        if (bl) {
            String string = object.\u00f5\u00d5O000();
            r r2 = (object = object.o\u00d8O000()) instanceof r ? (r)object : null;
            if (fc.o00000((Object)string, (Object)(r2 != null ? r2.privatesupersuper() : null))) {
                return true;
            }
        }
        return false;
    }

    private static final boolean \u00d300000(u clazz) {
        if (clazz.\u00f4\u00f60000()) {
            return false;
        }
        z z2 = (clazz = clazz.privatevoid()) instanceof z ? (z)((Object)clazz) : null;
        clazz = z2 != null ? b.o.r.\u00d400000(z2) : null;
        return clazz != null && !fc.o00000((Object)clazz, Void.TYPE);
    }

    public static final /* synthetic */ boolean o00000(u u2) {
        return d.\u00d300000(u2);
    }

    public static final /* synthetic */ Method o00000(Class clazz, o o2) {
        return d.\u00d300000(clazz, o2);
    }

    public static final /* synthetic */ boolean new(o o2) {
        return d.o00000(o2);
    }

    public static final /* synthetic */ List o00000(o o2, Member member) {
        return d.new(o2, member);
    }

    public static final /* synthetic */ void new(b b2, int n2, o o2, boolean bl) {
        d.o00000(b2, n2, o2, bl);
    }

    public static final /* synthetic */ boolean o00000(Member member) {
        return d.new(member);
    }
}

