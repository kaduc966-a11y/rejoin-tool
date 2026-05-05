/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.g;
import b.o.d.fc;
import b.s.mc;
import b.s.tc$_b$1;
import b.s.tc$_c$1;
import b.s.tc$_d;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class tc
implements Map,
g {
    public static final tc$_d returnreturnclass = new tc$_d(null);
    private volatile Set \u00d4O\u00f6000;
    private volatile Collection \u00d5O\u00f6000;

    protected tc() {
    }

    @Override
    public boolean containsKey(Object object) {
        return this.O\u00d20000(object) != null;
    }

    @Override
    public boolean containsValue(Object object) {
        Object object2 = this.entrySet();
        if (!(object2 instanceof Collection) || !((Collection)object2).isEmpty()) {
            object2 = object2.iterator();
            while (object2.hasNext()) {
                if (!fc.o00000(((Map.Entry)object2.next()).getValue(), object)) continue;
                return true;
            }
        }
        return false;
    }

    public final boolean \u00f500000(Map.Entry entry) {
        Object v2;
        if (entry == null) {
            return false;
        }
        Object k2 = entry.getKey();
        if (!fc.o00000((Object)(entry = entry.getValue()), v2 = ((Map)this).get(k2))) {
            return false;
        }
        return v2 != null || ((Map)this).containsKey(k2);
    }

    @Override
    public boolean equals(Object iterator) {
        if (iterator == this) {
            return true;
        }
        if (!(iterator instanceof Map)) {
            return false;
        }
        if (this.size() != ((Map)((Object)iterator)).size()) {
            return false;
        }
        if (!((iterator = (Iterable)((Map)((Object)iterator)).entrySet()) instanceof Collection) || !((Collection)((Object)iterator)).isEmpty()) {
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry)iterator.next();
                if (this.\u00f500000(entry)) continue;
                return false;
            }
        }
        return true;
    }

    public Object get(Object object) {
        Map.Entry entry = this.O\u00d20000(object);
        if (entry != null) {
            return entry.getValue();
        }
        return null;
    }

    @Override
    public int hashCode() {
        return ((Object)this.entrySet()).hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    public int returnStringnew() {
        return this.entrySet().size();
    }

    public Set \u00d8\u00d8\u00d3000() {
        if (this.\u00d4O\u00f6000 == null) {
            this.\u00d4O\u00f6000 = new tc$_c$1(this);
        }
        return this.\u00d4O\u00f6000;
    }

    public String toString() {
        return mc.o00000(this.entrySet(), ", ", "{", "}", 0, null, arg_0 -> tc.o00000(this, arg_0), 24, null);
    }

    private final String \u00f400000(Map.Entry entry) {
        return this.o\u00d20000(entry.getKey()) + '=' + this.o\u00d20000(entry.getValue());
    }

    private final String o\u00d20000(Object object) {
        if (object == this) {
            return "(this Map)";
        }
        return String.valueOf(object);
    }

    public Collection \u00d5\u00d8\u00d3000() {
        if (this.\u00d5O\u00f6000 == null) {
            this.\u00d5O\u00f6000 = new tc$_b$1(this);
        }
        return this.\u00d5O\u00f6000;
    }

    private final Map.Entry O\u00d20000(Object object) {
        Object v0;
        block1: {
            for (Object t2 : (Iterable)this.entrySet()) {
                if (!fc.o00000(((Map.Entry)t2).getKey(), object)) continue;
                v0 = t2;
                break block1;
            }
            v0 = null;
        }
        return v0;
    }

    public Object put(Object object, Object object2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private static final CharSequence o00000(tc tc2, Map.Entry entry) {
        return tc2.\u00f400000(entry);
    }

    @Override
    public final int size() {
        return this.returnStringnew();
    }

    public final Set keySet() {
        return this.\u00d8\u00d8\u00d3000();
    }

    public final Collection values() {
        return this.\u00d5\u00d8\u00d3000();
    }

    public abstract Set \u00d4\u00d8\u00d3000();

    public final Set entrySet() {
        return this.\u00d4\u00d8\u00d3000();
    }
}

