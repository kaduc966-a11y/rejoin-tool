/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.b;
import b.t.c.b.b.p.h;
import b.t.c.b.b.p.i$_b;
import b.t.c.b.b.p.i$_c;
import b.t.c.b.b.p.n;
import b.t.c.b.b.p.r;
import b.t.c.b.b.p.r$_c;
import b.t.c.b.b.p.t$_c;
import b.t.c.b.b.p.v;
import b.t.c.b.b.p.z$_b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class z {
    private final n o00000;
    private boolean \u00d200000;
    private boolean \u00d300000 = false;
    private static final z String = new z(true);

    private z() {
        this.o00000 = n.super(16);
    }

    private z(boolean bl) {
        this.o00000 = n.super(0);
        this.new();
    }

    public static z \u00d500000() {
        return new z();
    }

    public static z \u00d400000() {
        return String;
    }

    public final void new() {
        if (this.\u00d200000) {
            return;
        }
        this.o00000.\u00d200000();
        this.\u00d200000 = true;
    }

    public final z \u00d800000() {
        z$_b z$_b;
        z z2 = z.\u00d500000();
        for (int i2 = 0; i2 < this.o00000.\u00d800000(); ++i2) {
            Map.Entry entry = this.o00000.\u00d300000(i2);
            z$_b = (z$_b)entry.getKey();
            z2.new(z$_b, entry.getValue());
        }
        for (Map.Entry entry : this.o00000.class()) {
            z$_b = (z$_b)entry.getKey();
            z2.new(z$_b, entry.getValue());
        }
        z2.\u00d300000 = this.\u00d300000;
        return z2;
    }

    public final Iterator \u00d300000() {
        if (this.\u00d300000) {
            return new r$_c(this.o00000.entrySet().iterator());
        }
        return this.o00000.entrySet().iterator();
    }

    public final boolean o00000(z$_b z$_b) {
        if (z$_b.\u00d200000()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.o00000.get(z$_b) != null;
    }

    public final Object \u00d300000(z$_b object) {
        if ((object = this.o00000.get(object)) instanceof r) {
            return ((r)object).\u00d200000();
        }
        return object;
    }

    public final void new(z$_b z$_b, Object object) {
        if (z$_b.\u00d200000()) {
            if (!(object instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List)object);
            for (Object e2 : arrayList) {
                z.o00000(z$_b.\u00d500000(), e2);
            }
            object = arrayList;
        } else {
            z.o00000(z$_b.\u00d500000(), object);
        }
        if (object instanceof r) {
            this.\u00d300000 = true;
        }
        this.o00000.super(z$_b, object);
    }

    public final int new(z$_b object) {
        if (!object.\u00d200000()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        if ((object = this.\u00d300000((z$_b)object)) == null) {
            return 0;
        }
        return ((List)object).size();
    }

    public final Object o00000(z$_b object, int n2) {
        if (!object.\u00d200000()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        if ((object = this.\u00d300000((z$_b)object)) == null) {
            throw new IndexOutOfBoundsException();
        }
        return ((List)object).get(n2);
    }

    public final void \u00d300000(z$_b z$_b, Object object) {
        if (!z$_b.\u00d200000()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        z.o00000(z$_b.\u00d500000(), object);
        ArrayList<Object> arrayList = this.\u00d300000(z$_b);
        if (arrayList == null) {
            arrayList = new ArrayList<Object>();
            this.o00000.super(z$_b, arrayList);
        } else {
            arrayList = arrayList;
        }
        arrayList.add(object);
    }

    private static void o00000(i$_b i$_b, Object object) {
        if (object == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        switch (i$_b.\u00d200000()) {
            case \u00d200000: {
                boolean bl2 = object instanceof Integer;
                break;
            }
            case Object: {
                boolean bl2 = object instanceof Long;
                break;
            }
            case float: {
                boolean bl2 = object instanceof Float;
                break;
            }
            case \u00f600000: {
                boolean bl2 = object instanceof Double;
                break;
            }
            case \u00d600000: {
                boolean bl2 = object instanceof Boolean;
                break;
            }
            case \u00f500000: {
                boolean bl2 = object instanceof String;
                break;
            }
            case \u00d500000: {
                bl = object instanceof b || object instanceof byte[];
                break;
            }
            case o00000: {
                bl = object instanceof Integer || object instanceof t$_c;
                break;
            }
            case \u00f400000: {
                boolean bl2 = bl = object instanceof v || object instanceof r;
            }
        }
        if (!bl) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public final boolean return() {
        for (int i2 = 0; i2 < this.o00000.\u00d800000(); ++i2) {
            z z2 = this;
            if (z2.o00000(z2.o00000.\u00d300000(i2))) continue;
            return false;
        }
        for (Map.Entry entry : this.o00000.class()) {
            if (this.o00000(entry)) continue;
            return false;
        }
        return true;
    }

    private boolean o00000(Map.Entry object) {
        z$_b z$_b = (z$_b)object.getKey();
        if (z$_b.o00000() == i$_c.\u00f400000) {
            if (z$_b.\u00d200000()) {
                object = ((List)object.getValue()).iterator();
                while (object.hasNext()) {
                    if (((v)object.next()).\u00d200000()) continue;
                    return false;
                }
            } else if ((object = object.getValue()) instanceof v) {
                if (!((v)object).\u00d200000()) {
                    return false;
                }
            } else {
                if (object instanceof r) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    static int o00000(i$_b i$_b, boolean bl) {
        if (bl) {
            return 2;
        }
        return i$_b.\u00d300000();
    }

    public final void o00000(z object2) {
        for (int i2 = 0; i2 < ((z)object2).o00000.\u00d800000(); ++i2) {
            this.new(((z)object2).o00000.\u00d300000(i2));
        }
        for (Object object2 : ((z)object2).o00000.class()) {
            this.new((Map.Entry)object2);
        }
    }

    private Object o00000(Object object) {
        if (object instanceof byte[]) {
            byte[] byArray = (byte[])object;
            object = byArray;
            byte[] byArray2 = new byte[byArray.length];
            System.arraycopy(object, 0, byArray2, 0, ((Object)object).length);
            return byArray2;
        }
        return object;
    }

    private void new(Map.Entry iterator) {
        z$_b z$_b = (z$_b)iterator.getKey();
        if ((iterator = iterator.getValue()) instanceof r) {
            iterator = ((r)((Object)iterator)).\u00d200000();
        }
        if (z$_b.\u00d200000()) {
            ArrayList arrayList = this.\u00d300000(z$_b);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object e2 : (List)((Object)iterator)) {
                ((List)arrayList).add(this.o00000(e2));
            }
            this.o00000.super(z$_b, arrayList);
            return;
        }
        if (z$_b.o00000() == i$_c.\u00f400000) {
            Object object = this.\u00d300000(z$_b);
            if (object == null) {
                this.o00000.super(z$_b, this.o00000(iterator));
                return;
            }
            object = z$_b.o00000(((v)object).int(), (v)((Object)iterator)).\u00d300000();
            this.o00000.super(z$_b, object);
            return;
        }
        this.o00000.super(z$_b, this.o00000(iterator));
    }

    public static Object o00000(ab ab2, i$_b i$_b, boolean bl) throws IOException {
        switch (i$_b) {
            case \u00f5O0000: {
                return ab2.String();
            }
            case \u00f500000: {
                return Float.valueOf(ab2.\u00d6O0000());
            }
            case Object: {
                return ab2.\u00d2o0000();
            }
            case OO0000: {
                return ab2.\u00f600000();
            }
            case \u00d400000: {
                return ab2.\u00d3o0000();
            }
            case \u00d4O0000: {
                return ab2.\u00d600000();
            }
            case \u00d5O0000: {
                return ab2.\u00d800000();
            }
            case \u00d6O0000: {
                return ab2.for();
            }
            case \u00f400000: {
                if (bl) {
                    return ab2.private();
                }
                return ab2.ifsuper();
            }
            case \u00d200000: {
                return ab2.\u00d300000();
            }
            case oO0000: {
                return ab2.\u00f800000();
            }
            case float: {
                return ab2.returnsuper();
            }
            case \u00f600000: {
                return ab2.\u00f8O0000();
            }
            case void: {
                return ab2.\u00d2O0000();
            }
            case \u00d500000: {
                return ab2.oO0000();
            }
            case \u00f4O0000: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            }
            case o00000: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            }
            case \u00d2O0000: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            }
        }
        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
    }

    private static void o00000(h h2, i$_b i$_b, int n2, Object object) throws IOException {
        if (i$_b == i$_b.\u00f4O0000) {
            h2.new(n2, (v)object);
            return;
        }
        h2.\u00d400000(n2, z.o00000(i$_b, false));
        z.o00000(h2, i$_b, object);
    }

    private static void o00000(h h2, i$_b i$_b, Object object) throws IOException {
        switch (i$_b) {
            case \u00f5O0000: {
                h2.o00000((Double)object);
                return;
            }
            case \u00f500000: {
                h2.new(((Float)object).floatValue());
                return;
            }
            case Object: {
                h2.\u00d300000((Long)object);
                return;
            }
            case OO0000: {
                h2.oO0000((Long)object);
                return;
            }
            case \u00d400000: {
                h2.o00000((Integer)object);
                return;
            }
            case \u00d4O0000: {
                h2.\u00d800000((Long)object);
                return;
            }
            case \u00d5O0000: {
                h2.\u00f400000((Integer)object);
                return;
            }
            case \u00d6O0000: {
                h2.o00000((Boolean)object);
                return;
            }
            case \u00f400000: {
                h2.o00000((String)object);
                return;
            }
            case \u00f4O0000: {
                h2.\u00d300000((v)object);
                return;
            }
            case o00000: {
                h2.o00000((v)object);
                return;
            }
            case \u00d200000: {
                if (object instanceof b) {
                    h2.o00000((b)object);
                    return;
                }
                h2.\u00d300000((byte[])object);
                return;
            }
            case oO0000: {
                h2.if((Integer)object);
                return;
            }
            case float: {
                h2.thissuper((Integer)object);
                return;
            }
            case \u00f600000: {
                h2.new((Long)object);
                return;
            }
            case void: {
                h2.\u00d800000((Integer)object);
                return;
            }
            case \u00d500000: {
                h2.if((Long)object);
                return;
            }
            case \u00d2O0000: {
                if (object instanceof t$_c) {
                    h2.\u00f800000(((t$_c)object).super());
                    return;
                }
                h2.\u00f800000((Integer)object);
            }
        }
    }

    public static void o00000(z$_b object, Object object2, h h2) throws IOException {
        i$_b i$_b = object.\u00d500000();
        int n2 = object.Object();
        if (object.\u00d200000()) {
            object2 = (List)object2;
            if (object.\u00d400000()) {
                h2.\u00d400000(n2, 2);
                int n3 = 0;
                Iterator iterator = object2.iterator();
                while (iterator.hasNext()) {
                    Object e2 = iterator.next();
                    n3 += z.new(i$_b, e2);
                }
                h2.oO0000(n3);
                iterator = object2.iterator();
                while (iterator.hasNext()) {
                    Object e3 = iterator.next();
                    z.o00000(h2, i$_b, e3);
                }
                return;
            }
            object = object2.iterator();
            while (object.hasNext()) {
                Object e4 = object.next();
                z.o00000(h2, i$_b, n2, e4);
            }
            return;
        }
        if (object2 instanceof r) {
            z.o00000(h2, i$_b, n2, ((r)object2).\u00d200000());
            return;
        }
        z.o00000(h2, i$_b, n2, object2);
    }

    public final int o00000() {
        int n2 = 0;
        for (int i2 = 0; i2 < this.o00000.\u00d800000(); ++i2) {
            Map.Entry entry = this.o00000.\u00d300000(i2);
            n2 += z.o00000((z$_b)entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry : this.o00000.class()) {
            n2 += z.o00000((z$_b)entry.getKey(), entry.getValue());
        }
        return n2;
    }

    private static int o00000(i$_b i$_b, int n2, Object object) {
        n2 = h.\u00d3O0000(n2);
        if (i$_b == i$_b.\u00f4O0000) {
            n2 *= 2;
        }
        return n2 + z.new(i$_b, object);
    }

    private static int new(i$_b i$_b, Object object) {
        switch (i$_b) {
            case \u00f5O0000: {
                return h.new((Double)object);
            }
            case \u00f500000: {
                return h.o00000(((Float)object).floatValue());
            }
            case Object: {
                return h.return((Long)object);
            }
            case OO0000: {
                return h.\u00d500000((Long)object);
            }
            case \u00d400000: {
                return h.\u00f500000((Integer)object);
            }
            case \u00d4O0000: {
                return h.\u00f800000((Long)object);
            }
            case \u00d5O0000: {
                return h.OO0000((Integer)object);
            }
            case \u00d6O0000: {
                return h.new((Boolean)object);
            }
            case \u00f400000: {
                return h.new((String)object);
            }
            case \u00f4O0000: {
                return h.\u00d400000((v)object);
            }
            case \u00d200000: {
                if (object instanceof b) {
                    return h.new((b)object);
                }
                return h.o00000((byte[])object);
            }
            case oO0000: {
                return h.\u00d300000((Integer)object);
            }
            case float: {
                return h.while((Integer)object);
            }
            case \u00f600000: {
                return h.OO0000((Long)object);
            }
            case void: {
                return h.\u00d4O0000((Integer)object);
            }
            case \u00d500000: {
                return h.while((Long)object);
            }
            case o00000: {
                if (object instanceof r) {
                    return h.o00000((r)object);
                }
                return h.new((v)object);
            }
            case \u00d2O0000: {
                if (object instanceof t$_c) {
                    return h.\u00d5O0000(((t$_c)object).super());
                }
                return h.\u00d5O0000((Integer)object);
            }
        }
        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
    }

    public static int o00000(z$_b z$_b, Object iterator) {
        i$_b i$_b = z$_b.\u00d500000();
        int n2 = z$_b.Object();
        if (z$_b.\u00d200000()) {
            if (z$_b.\u00d400000()) {
                int n3 = 0;
                for (Object e2 : (List)((Object)iterator)) {
                    n3 += z.new(i$_b, e2);
                }
                return n3 + h.\u00d3O0000(n2) + h.new(n3);
            }
            int n4 = 0;
            for (Object e3 : (List)((Object)iterator)) {
                n4 += z.o00000(i$_b, n2, e3);
            }
            return n4;
        }
        return z.o00000(i$_b, n2, (Object)iterator);
    }
}

