/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.e;

import b.o.d.fc;
import b.o.d.w;
import b.s.mc;
import b.t.c.b.b.o.e.g;
import b.t.c.b.b.o.e.j$_b;
import b.t.c.b.b.o.e.j$_b$_b;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class j {
    public static final j$_b \u00d6O0000;
    private final List \u00d200000;
    private final int OO0000;
    private static int do;
    private static final int int;
    private static final int Objectsuper;
    private static final int \u00d3O0000;
    private static final int super;
    private static final int \u00d300000;
    private static final int \u00f600000;
    private static final int \u00f400000;
    private static final int \u00d2o0000;
    private static final int \u00f4O0000;
    private static final int \u00f8O0000;
    public static final j class;
    public static final j \u00d400000;
    public static final j \u00d800000;
    public static final j \u00f800000;
    public static final j voidsuper;
    public static final j Oo0000;
    public static final j \u00d600000;
    public static final j \u00f6O0000;
    public static final j \u00d2O0000;
    public static final j \u00d4O0000;
    private static final List interface;
    private static final List \u00d8O0000;

    public j(int n2, List object) {
        this.\u00d200000 = object;
        for (g g2 : (Iterable)this.\u00d200000) {
            n2 &= ~g2.o00000();
        }
        this.OO0000 = n2;
    }

    public /* synthetic */ j(int n2, List list, int n3, w w2) {
        if ((n3 & 2) != 0) {
            list = mc.\u00d500000();
        }
        this(n2, list);
    }

    public final List new() {
        return this.\u00d200000;
    }

    public final int \u00f400000() {
        return this.OO0000;
    }

    public final boolean new(int n2) {
        return (this.OO0000 & n2) != 0;
    }

    public final j o00000(int n2) {
        if ((n2 = this.OO0000 & n2) == 0) {
            return null;
        }
        return new j(n2, this.\u00d200000);
    }

    public final String toString() {
        Iterator iterator;
        Object v0;
        block3: {
            for (Object object : (Iterable)interface) {
                if (!(((j$_b$_b)object).o00000() == this.OO0000)) continue;
                v0 = object;
                break block3;
            }
            v0 = null;
        }
        j$_b$_b j$_b$_b = v0;
        String string = j$_b$_b != null ? j$_b$_b.\u00d200000() : null;
        if (string == null) {
            Object object;
            iterator = \u00d8O0000;
            object = new ArrayList();
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                Object object2 = (j$_b$_b)iterator.next();
                String string2 = this.new(((j$_b$_b)object2).o00000()) ? ((j$_b$_b)object2).\u00d200000() : null;
                if (string2 == null) continue;
                object2 = string2;
                object.add((Object)object2);
            }
            string = mc.o00000((List)object, " | ", null, null, 0, null, null, 62, null);
        }
        iterator = string;
        return "DescriptorKindFilter(" + (String)((Object)iterator) + ", " + this.\u00d200000 + ')';
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        Object object2 = object;
        if (!fc.o00000(this.getClass(), object2 != null ? object2.getClass() : null)) {
            return false;
        }
        j cfr_ignored_0 = (j)object;
        if (!fc.o00000((Object)this.\u00d200000, (Object)((j)object).\u00d200000)) {
            return false;
        }
        return this.OO0000 == ((j)object).OO0000;
    }

    public final int hashCode() {
        int n2 = ((Object)this.\u00d200000).hashCode();
        return 31 * n2 + this.OO0000;
    }

    public static final /* synthetic */ int o00000() {
        return do;
    }

    public static final /* synthetic */ void \u00d300000(int n2) {
        do = n2;
    }

    public static final /* synthetic */ int \u00f800000() {
        return int;
    }

    public static final /* synthetic */ int \u00d400000() {
        return Objectsuper;
    }

    public static final /* synthetic */ int \u00d500000() {
        return \u00d3O0000;
    }

    public static final /* synthetic */ int return() {
        return super;
    }

    public static final /* synthetic */ int \u00d800000() {
        return \u00d300000;
    }

    public static final /* synthetic */ int \u00d300000() {
        return \u00f600000;
    }

    public static final /* synthetic */ int if() {
        return \u00f400000;
    }

    public static final /* synthetic */ int \u00f500000() {
        return \u00d2o0000;
    }

    static {
        Object object3;
        \u00d6O0000 = new j$_b(null);
        do = 1;
        int = j$_b.o00000(\u00d6O0000);
        Objectsuper = j$_b.o00000(\u00d6O0000);
        \u00d3O0000 = j$_b.o00000(\u00d6O0000);
        super = j$_b.o00000(\u00d6O0000);
        \u00d300000 = j$_b.o00000(\u00d6O0000);
        \u00f600000 = j$_b.o00000(\u00d6O0000);
        \u00f400000 = j$_b.o00000(\u00d6O0000) - 1;
        \u00d2o0000 = int | Objectsuper | \u00d3O0000;
        \u00f4O0000 = Objectsuper | \u00d300000 | \u00f600000;
        \u00f8O0000 = \u00d300000 | \u00f600000;
        j.class = new j(\u00f400000, null, 2, null);
        \u00d400000 = new j(\u00f8O0000, null, 2, null);
        \u00d800000 = new j(int, null, 2, null);
        \u00f800000 = new j(Objectsuper, null, 2, null);
        voidsuper = new j(\u00d3O0000, null, 2, null);
        Oo0000 = new j(\u00d2o0000, null, 2, null);
        \u00d600000 = new j(super, null, 2, null);
        \u00f6O0000 = new j(\u00d300000, null, 2, null);
        \u00d2O0000 = new j(\u00f600000, null, 2, null);
        \u00d4O0000 = new j(\u00f4O0000, null, 2, null);
        Object[] object22 = j.class.getFields();
        Object object2 = new ArrayList();
        for (Object object3 : object22) {
            if (!Modifier.isStatic(((Field)object3).getModifiers())) continue;
            object2.add(object3);
        }
        Iterable iterable = (List)object2;
        object3 = new ArrayList();
        for (Field field : iterable) {
            j$_b$_b j$_b$_b;
            object2 = field.get(null);
            j j2 = object2 instanceof j ? (j)object2 : null;
            if ((j2 != null ? new j$_b$_b(j2.OO0000, field.getName()) : null) == null) continue;
            j$_b$_b = j$_b$_b;
            object3.add(j$_b$_b);
        }
        interface = (List)object3;
        Object[] objectArray = j.class.getFields();
        object2 = new ArrayList();
        for (Object object3 : objectArray) {
            if (!Modifier.isStatic(((Field)object3).getModifiers())) continue;
            object2.add(object3);
        }
        Iterable iterable2 = (List)object2;
        object3 = new ArrayList();
        for (Object t2 : iterable2) {
            if (!fc.o00000(((Field)t2).getType(), Integer.TYPE)) continue;
            object3.add(t2);
        }
        Iterable iterable3 = (List)object3;
        object3 = new ArrayList();
        for (Field field : iterable3) {
            j$_b$_b j$_b$_b;
            int n2 = (Integer)field.get(null);
            if ((n2 == (n2 & -n2) ? new j$_b$_b(n2, field.getName()) : null) == null) continue;
            j$_b$_b = j$_b$_b;
            object3.add(j$_b$_b);
        }
        \u00d8O0000 = (List)object3;
    }
}

