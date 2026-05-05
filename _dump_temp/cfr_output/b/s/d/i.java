/*
 * Decompiled with CFR 0.152.
 */
package b.s.d;

import b.e.bb;
import b.o.d.fc;
import b.s.d.c;
import b.s.d.d;
import b.s.d.e;
import b.s.d.g;
import b.s.d.h;
import b.s.d.i$_b;
import b.s.d.i$_d;
import b.s.d.i$_f;
import b.s.d.i$_g;
import b.s.kb;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class i
implements Serializable,
Map,
b.o.d.c.c {
    public static final i$_g \u00d4\u00d2\u00f5000 = new i$_g(null);
    private Object[] \u00f4\u00d2\u00f5000;
    private Object[] \u00f4o\u00f5000;
    private int[] ifprivateString;
    private int[] \u00d8o\u00f5000;
    private int \u00d4o\u00f5000;
    private int \u00d5o\u00f5000;
    private int \u00d8\u00d2\u00f5000;
    private int whileprivateString;
    private int \u00d3\u00d2\u00f5000;
    private c O\u00d2\u00f5000;
    private e \u00f5o\u00f5000;
    private d StringinterfaceString;
    private boolean o\u00d2\u00f5000;
    private static final int \u00f5\u00d2\u00f5000 = -1640531527;
    private static final int thisinterfaceString = 8;
    private static final int \u00f8o\u00f5000 = 2;
    private static final int returnprivateString = -1;
    private static final i \u00d5\u00d2\u00f5000;

    private i(Object[] objectArray, Object[] objectArray2, int[] nArray, int[] nArray2, int n2, int n3) {
        this.\u00f4\u00d2\u00f5000 = objectArray;
        this.\u00f4o\u00f5000 = objectArray2;
        this.ifprivateString = nArray;
        this.\u00d8o\u00f5000 = nArray2;
        this.\u00d4o\u00f5000 = n2;
        this.\u00d5o\u00f5000 = n3;
        this.\u00d8\u00d2\u00f5000 = i$_g.\u00d200000(\u00d4\u00d2\u00f5000, this.thisinterfacesuper());
    }

    public final int \u00f4\u00f8\u00d2000() {
        return this.\u00d3\u00d2\u00f5000;
    }

    public final boolean \u00d8\u00f8\u00d2000() {
        return this.o\u00d2\u00f5000;
    }

    public i() {
        this(8);
    }

    public i(int n2) {
        this(g.o00000(n2), null, new int[n2], new int[i$_g.o00000(\u00d4\u00d2\u00f5000, n2)], 2, 0);
    }

    public final Map \u00d80\u00d3000() {
        this.\u00d40\u00d3000();
        this.o\u00d2\u00f5000 = true;
        if (this.size() > 0) {
            return this;
        }
        return \u00d5\u00d2\u00f5000;
    }

    private final Object \u00d30\u00d3000() {
        if (this.o\u00d2\u00f5000) {
            return new h(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    private final void new(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    @Override
    public final boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public final boolean containsKey(Object object) {
        return this.nullsuper(object) >= 0;
    }

    @Override
    public final boolean containsValue(Object object) {
        return this.forsuper(object) >= 0;
    }

    public final Object get(Object object) {
        int n2 = this.nullsuper(object);
        if (n2 < 0) {
            return null;
        }
        return this.\u00f4o\u00f5000[n2];
    }

    public final Object put(Object object, Object object2) {
        this.\u00d40\u00d3000();
        int n2 = this.\u00d5o0000(object);
        Object[] objectArray = this.\u00f5\u00f8\u00d2000();
        if (n2 < 0) {
            Object object3 = objectArray[-n2 - 1];
            objectArray[-n2 - 1] = object2;
            return object3;
        }
        objectArray[n2] = object2;
        return null;
    }

    public final void putAll(Map map) {
        this.\u00d40\u00d3000();
        this.\u00d300000(map.entrySet());
    }

    public final Object remove(Object object) {
        this.\u00d40\u00d3000();
        int n2 = this.nullsuper(object);
        if (n2 < 0) {
            return null;
        }
        Object object2 = this.\u00f4o\u00f5000[n2];
        this.Stringclass(n2);
        return object2;
    }

    @Override
    public final void clear() {
        this.\u00d40\u00d3000();
        int n2 = 0;
        int n3 = this.\u00d5o\u00f5000 - 1;
        if (n3 >= 0) {
            while (true) {
                int n4;
                if ((n4 = this.ifprivateString[n2]) >= 0) {
                    this.\u00d8o\u00f5000[n4] = 0;
                    this.ifprivateString[n2] = -1;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        g.Object(this.\u00f4\u00d2\u00f5000, 0, this.\u00d5o\u00f5000);
        if (this.\u00f4o\u00f5000 != null) {
            g.Object(this.\u00f4o\u00f5000, 0, this.\u00d5o\u00f5000);
        }
        this.\u00d3\u00d2\u00f5000 = 0;
        this.\u00d5o\u00f5000 = 0;
        this.\u00f40\u00d3000();
    }

    public final Set \u00d50\u00d3000() {
        c c2 = this.O\u00d2\u00f5000;
        if (c2 == null) {
            this.O\u00d2\u00f5000 = c2 = new c(this);
            return c2;
        }
        return c2;
    }

    public final Collection ifprivatesuper() {
        e e2 = this.\u00f5o\u00f5000;
        if (e2 == null) {
            this.\u00f5o\u00f5000 = e2 = new e(this);
            return e2;
        }
        return e2;
    }

    public final Set O0\u00d3000() {
        d d2 = this.StringinterfaceString;
        if (d2 == null) {
            this.StringinterfaceString = d2 = new d(this);
            return d2;
        }
        return d2;
    }

    @Override
    public final boolean equals(Object object) {
        return object == this || object instanceof Map && this.\u00d300000((Map)object);
    }

    @Override
    public final int hashCode() {
        int n2 = 0;
        i$_b i$_b = this.returnprivatesuper();
        while (i$_b.hasNext()) {
            n2 += i$_b.O\u00f8\u00d2000();
        }
        return n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(2 + this.size() * 3);
        stringBuilder.append("{");
        int n2 = 0;
        i$_b i$_b = this.returnprivatesuper();
        while (i$_b.hasNext()) {
            if (n2 > 0) {
                stringBuilder.append(", ");
            }
            i$_b.o00000(stringBuilder);
            ++n2;
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final int \u00f8\u00f8\u00d2000() {
        return this.\u00f4\u00d2\u00f5000.length;
    }

    private final int thisinterfacesuper() {
        return this.\u00d8o\u00f5000.length;
    }

    private final void \u00f40\u00d3000() {
        ++this.whileprivateString;
    }

    public final void \u00d40\u00d3000() {
        if (this.o\u00d2\u00f5000) {
            throw new UnsupportedOperationException();
        }
    }

    private final void \u00f4\u00d60000(int n2) {
        if (this.\u00d4\u00d60000(n2)) {
            this.\u00f8o0000(true);
            return;
        }
        i i2 = this;
        i2.\u00d8\u00d60000(i2.\u00d5o\u00f5000 + n2);
    }

    private final boolean \u00d4\u00d60000(int n2) {
        int n3 = this.\u00f8\u00f8\u00d2000() - this.\u00d5o\u00f5000;
        int n4 = this.\u00d5o\u00f5000 - this.size();
        return n3 < n2 && n4 + n3 >= n2 && n4 >= this.\u00f8\u00f8\u00d2000() / 4;
    }

    private final void \u00d8\u00d60000(int n2) {
        if (n2 < 0) {
            throw new OutOfMemoryError();
        }
        if (n2 > this.\u00f8\u00f8\u00d2000()) {
            Object[] objectArray;
            n2 = kb.return.o00000(this.\u00f8\u00f8\u00d2000(), n2);
            this.\u00f4\u00d2\u00f5000 = g.\u00d200000(this.\u00f4\u00d2\u00f5000, n2);
            i i2 = this;
            if (i2.\u00f4o\u00f5000 != null) {
                objectArray = g.\u00d200000(i2.\u00f4o\u00f5000, n2);
            } else {
                Object[] cfr_ignored_0 = i2.\u00f4o\u00f5000;
                objectArray = null;
            }
            i2.\u00f4o\u00f5000 = objectArray;
            this.ifprivateString = Arrays.copyOf(this.ifprivateString, n2);
            n2 = i$_g.o00000(\u00d4\u00d2\u00f5000, n2);
            if (n2 > this.thisinterfacesuper()) {
                this.\u00f5\u00d60000(n2);
            }
        }
    }

    private final Object[] \u00f5\u00f8\u00d2000() {
        Object[] objectArray = this.\u00f4o\u00f5000;
        if (this.\u00f4o\u00f5000 != null) {
            return objectArray;
        }
        objectArray = g.o00000(this.\u00f8\u00f8\u00d2000());
        this.\u00f4o\u00f5000 = objectArray;
        return objectArray;
    }

    private final int \u00d3o0000(Object object) {
        Object object2 = object;
        return (object2 != null ? object2.hashCode() : 0) * -1640531527 >>> this.\u00d8\u00d2\u00f5000;
    }

    private final void \u00f8o0000(boolean bl) {
        int n2 = 0;
        Object[] objectArray = this.\u00f4o\u00f5000;
        for (int i2 = 0; i2 < this.\u00d5o\u00f5000; ++i2) {
            int n3 = this.ifprivateString[i2];
            if (n3 < 0) continue;
            this.\u00f4\u00d2\u00f5000[n2] = this.\u00f4\u00d2\u00f5000[i2];
            if (objectArray != null) {
                objectArray[n2] = objectArray[i2];
            }
            if (bl) {
                this.ifprivateString[n2] = n3;
                this.\u00d8o\u00f5000[n3] = n2 + 1;
            }
            ++n2;
        }
        g.Object(this.\u00f4\u00d2\u00f5000, n2, this.\u00d5o\u00f5000);
        if (objectArray != null) {
            g.Object(objectArray, n2, this.\u00d5o\u00f5000);
        }
        this.\u00d5o\u00f5000 = n2;
    }

    private final void \u00f5\u00d60000(int n2) {
        this.\u00f40\u00d3000();
        if (this.\u00d5o\u00f5000 > this.size()) {
            this.\u00f8o0000(false);
        }
        this.\u00d8o\u00f5000 = new int[n2];
        this.\u00d8\u00d2\u00f5000 = i$_g.\u00d200000(\u00d4\u00d2\u00f5000, n2);
        n2 = 0;
        while (n2 < this.\u00d5o\u00f5000) {
            if (this.\u00d5\u00d60000(n2++)) continue;
            throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
        }
    }

    private final boolean \u00d5\u00d60000(int n2) {
        i i2 = this;
        int n3 = i2.\u00d3o0000(i2.\u00f4\u00d2\u00f5000[n2]);
        int n4 = this.\u00d4o\u00f5000;
        while (true) {
            if (this.\u00d8o\u00f5000[n3] == 0) {
                this.\u00d8o\u00f5000[n3] = n2 + 1;
                this.ifprivateString[n2] = n3;
                return true;
            }
            if (--n4 < 0) {
                return false;
            }
            if (n3-- != 0) continue;
            n3 = this.thisinterfacesuper() - 1;
        }
    }

    private final int nullsuper(Object object) {
        int n2 = this.\u00d3o0000(object);
        int n3 = this.\u00d4o\u00f5000;
        int n4;
        while ((n4 = this.\u00d8o\u00f5000[n2]) != 0) {
            if (fc.o00000(this.\u00f4\u00d2\u00f5000[n4 - 1], object)) {
                return n4 - 1;
            }
            if (--n3 < 0) {
                return -1;
            }
            if (n2-- != 0) continue;
            n2 = this.thisinterfacesuper() - 1;
        }
        return -1;
    }

    private final int forsuper(Object object) {
        int n2 = this.\u00d5o\u00f5000;
        while (--n2 >= 0) {
            if (this.ifprivateString[n2] < 0 || !fc.o00000(this.\u00f4o\u00f5000[n2], object)) continue;
            return n2;
        }
        return -1;
    }

    public final int \u00d5o0000(Object object) {
        this.\u00d40\u00d3000();
        block0: while (true) {
            int n2 = this.\u00d3o0000(object);
            int n3 = bb.Object(this.\u00d4o\u00f5000 * 2, this.thisinterfacesuper() / 2);
            int n4 = 0;
            while (true) {
                int n5;
                if ((n5 = this.\u00d8o\u00f5000[n2]) == 0) {
                    if (this.\u00d5o\u00f5000 >= this.\u00f8\u00f8\u00d2000()) {
                        this.\u00f4\u00d60000(1);
                        continue block0;
                    }
                    n5 = this.\u00d5o\u00f5000;
                    this.\u00d5o\u00f5000 = n5 + 1;
                    n3 = n5;
                    this.\u00f4\u00d2\u00f5000[n3] = object;
                    this.ifprivateString[n3] = n2;
                    this.\u00d8o\u00f5000[n2] = n3 + 1;
                    n5 = this.size();
                    this.\u00d3\u00d2\u00f5000 = n5 + 1;
                    this.\u00f40\u00d3000();
                    if (n4 > this.\u00d4o\u00f5000) {
                        this.\u00d4o\u00f5000 = n4;
                    }
                    return n3;
                }
                if (fc.o00000(this.\u00f4\u00d2\u00f5000[n5 - 1], object)) {
                    return -n5;
                }
                if (++n4 > n3) {
                    i i2 = this;
                    i2.\u00f5\u00d60000(i2.thisinterfacesuper() * 2);
                    continue block0;
                }
                if (n2-- != 0) continue;
                n2 = this.thisinterfacesuper() - 1;
            }
            break;
        }
    }

    public final boolean \u00d8o0000(Object object) {
        this.\u00d40\u00d3000();
        int n2 = this.nullsuper(object);
        if (n2 < 0) {
            return false;
        }
        this.Stringclass(n2);
        return true;
    }

    private final void Stringclass(int n2) {
        g.o00000(this.\u00f4\u00d2\u00f5000, n2);
        if (this.\u00f4o\u00f5000 != null) {
            g.o00000(this.\u00f4o\u00f5000, n2);
        }
        i i2 = this;
        i2.thisclass(i2.ifprivateString[n2]);
        this.ifprivateString[n2] = -1;
        n2 = this.size();
        this.\u00d3\u00d2\u00f5000 = n2 + -1;
        this.\u00f40\u00d3000();
    }

    private final void thisclass(int n2) {
        int n3 = n2;
        int n4 = 0;
        while (true) {
            if (n3-- == 0) {
                n3 = this.thisinterfacesuper() - 1;
            }
            int n5 = this.\u00d8o\u00f5000[n3];
            if (++n4 > this.\u00d4o\u00f5000) {
                this.\u00d8o\u00f5000[n2] = 0;
                return;
            }
            if (n5 == 0) {
                this.\u00d8o\u00f5000[n2] = 0;
                return;
            }
            i i2 = this;
            if ((i2.\u00d3o0000(i2.\u00f4\u00d2\u00f5000[n5 - 1]) - n3 & this.thisinterfacesuper() - 1) < n4) continue;
            this.\u00d8o\u00f5000[n2] = n5;
            this.ifprivateString[n5 - 1] = n2;
            n2 = n3;
            n4 = 0;
        }
    }

    public final boolean \u00d300000(Map.Entry entry) {
        int n2 = this.nullsuper(entry.getKey());
        if (n2 < 0) {
            return false;
        }
        return fc.o00000(this.\u00f4o\u00f5000[n2], entry.getValue());
    }

    private final boolean \u00d300000(Map map) {
        return this.size() == map.size() && this.new(map.entrySet());
    }

    public final boolean new(Collection object) {
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            try {
                if (e2 != null && this.\u00d300000((Map.Entry)e2)) continue;
                return false;
            }
            catch (ClassCastException classCastException) {
                return false;
            }
        }
        return true;
    }

    private final boolean o00000(Map.Entry entry) {
        int n2 = this.\u00d5o0000(entry.getKey());
        Object[] objectArray = this.\u00f5\u00f8\u00d2000();
        if (n2 >= 0) {
            objectArray[n2] = entry.getValue();
            return true;
        }
        Object object = objectArray[-n2 - 1];
        if (!fc.o00000(entry.getValue(), object)) {
            objectArray[-n2 - 1] = entry.getValue();
            return true;
        }
        return false;
    }

    private final boolean \u00d300000(Collection object) {
        if (object.isEmpty()) {
            return false;
        }
        this.\u00f4\u00d60000(object.size());
        object = object.iterator();
        boolean bl = false;
        while (object.hasNext()) {
            if (!this.o00000((Map.Entry)object.next())) continue;
            bl = true;
        }
        return bl;
    }

    public final boolean new(Map.Entry entry) {
        this.\u00d40\u00d3000();
        int n2 = this.nullsuper(entry.getKey());
        if (n2 < 0) {
            return false;
        }
        if (!fc.o00000(this.\u00f4o\u00f5000[n2], entry.getValue())) {
            return false;
        }
        this.Stringclass(n2);
        return true;
    }

    public final boolean \u00d4o0000(Object object) {
        this.\u00d40\u00d3000();
        int n2 = this.forsuper(object);
        if (n2 < 0) {
            return false;
        }
        this.Stringclass(n2);
        return true;
    }

    public final i$_d whileprivatesuper() {
        return new i$_d(this);
    }

    public final i$_f \u00d5\u00f8\u00d2000() {
        return new i$_f(this);
    }

    public final i$_b returnprivatesuper() {
        return new i$_b(this);
    }

    @Override
    public final int size() {
        return this.\u00f4\u00f8\u00d2000();
    }

    public final Set keySet() {
        return this.\u00d50\u00d3000();
    }

    public final Collection values() {
        return this.ifprivatesuper();
    }

    public final Set entrySet() {
        return this.O0\u00d3000();
    }

    public static final /* synthetic */ i o0\u00d3000() {
        return \u00d5\u00d2\u00f5000;
    }

    public static final /* synthetic */ int \u00d400000(i i2) {
        return i2.whileprivateString;
    }

    public static final /* synthetic */ int return(i i2) {
        return i2.\u00d5o\u00f5000;
    }

    public static final /* synthetic */ int[] \u00d300000(i i2) {
        return i2.ifprivateString;
    }

    public static final /* synthetic */ void o00000(i i2, int n2) {
        i2.Stringclass(n2);
    }

    public static final /* synthetic */ Object[] o00000(i i2) {
        return i2.\u00f4\u00d2\u00f5000;
    }

    public static final /* synthetic */ Object[] \u00d500000(i i2) {
        return i2.\u00f4o\u00f5000;
    }

    public static final /* synthetic */ Object[] new(i i2) {
        return i2.\u00f5\u00f8\u00d2000();
    }

    static {
        i i2 = new i(0);
        new i(0).o\u00d2\u00f5000 = true;
        \u00d5\u00d2\u00f5000 = i2;
    }
}

