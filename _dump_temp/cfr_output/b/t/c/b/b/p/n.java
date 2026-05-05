/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.n$1;
import b.t.c.b.b.p.n$_c;
import b.t.c.b.b.p.n$_d;
import b.t.c.b.b.p.n$_e;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class n
extends AbstractMap {
    private final int String;
    private List \u00d500000;
    private Map \u00d300000;
    private boolean o00000;
    private volatile n$_d \u00d200000;

    static n super(int n2) {
        return new n$1(n2);
    }

    private n(int n2) {
        this.String = n2;
        this.\u00d500000 = Collections.emptyList();
        this.\u00d300000 = Collections.emptyMap();
    }

    public void \u00d200000() {
        if (!this.o00000) {
            this.\u00d300000 = this.\u00d300000.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.\u00d300000);
            this.o00000 = true;
        }
    }

    public boolean \u00d300000() {
        return this.o00000;
    }

    public int \u00d800000() {
        return this.\u00d500000.size();
    }

    public Map.Entry \u00d300000(int n2) {
        return (Map.Entry)this.\u00d500000.get(n2);
    }

    public Iterable class() {
        if (this.\u00d300000.isEmpty()) {
            return n$_e.\u00d200000();
        }
        return this.\u00d300000.entrySet();
    }

    @Override
    public int size() {
        return this.\u00d500000.size() + this.\u00d300000.size();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.super((Comparable)(object = (Comparable)object)) >= 0 || this.\u00d300000.containsKey(object);
    }

    @Override
    public Object get(Object object) {
        int n2 = this.super((Comparable)(object = (Comparable)object));
        if (n2 >= 0) {
            return ((n$_c)this.\u00d500000.get(n2)).getValue();
        }
        return this.\u00d300000.get(object);
    }

    public Object super(Comparable comparable, Object object) {
        this.\u00d600000();
        int n2 = this.super(comparable);
        if (n2 >= 0) {
            return ((n$_c)this.\u00d500000.get(n2)).setValue(object);
        }
        this.super();
        n2 = -(n2 + 1);
        if (n2 >= this.String) {
            return this.\u00d400000().put(comparable, object);
        }
        if (this.\u00d500000.size() == this.String) {
            n$_c n$_c = (n$_c)this.\u00d500000.remove(this.String - 1);
            this.\u00d400000().put(n$_c.super(), n$_c.getValue());
        }
        this.\u00d500000.add(n2, new n$_c(this, comparable, object));
        return null;
    }

    @Override
    public void clear() {
        this.\u00d600000();
        if (!this.\u00d500000.isEmpty()) {
            this.\u00d500000.clear();
        }
        if (!this.\u00d300000.isEmpty()) {
            this.\u00d300000.clear();
        }
    }

    @Override
    public Object remove(Object object) {
        this.\u00d600000();
        object = (Comparable)object;
        int n2 = this.super((Comparable)object);
        if (n2 >= 0) {
            return this.\u00d200000(n2);
        }
        if (this.\u00d300000.isEmpty()) {
            return null;
        }
        return this.\u00d300000.remove(object);
    }

    private Object \u00d200000(int n2) {
        this.\u00d600000();
        Object object = ((n$_c)this.\u00d500000.remove(n2)).getValue();
        if (!this.\u00d300000.isEmpty()) {
            Iterator iterator = this.\u00d400000().entrySet().iterator();
            this.\u00d500000.add(new n$_c(this, iterator.next()));
            iterator.remove();
        }
        return object;
    }

    private int super(Comparable comparable) {
        int n2;
        int n3 = 0;
        int n4 = this.\u00d500000.size() - 1;
        if (n4 >= 0) {
            n2 = comparable.compareTo(((n$_c)this.\u00d500000.get(n4)).super());
            if (n2 > 0) {
                return -(n4 + 2);
            }
            if (n2 == 0) {
                return n4;
            }
        }
        while (n3 <= n4) {
            n2 = (n3 + n4) / 2;
            int n5 = comparable.compareTo(((n$_c)this.\u00d500000.get(n2)).super());
            if (n5 < 0) {
                n4 = n2 - 1;
                continue;
            }
            if (n5 > 0) {
                n3 = n2 + 1;
                continue;
            }
            return n2;
        }
        return -(n3 + 1);
    }

    @Override
    public Set entrySet() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new n$_d(this, null);
        }
        return this.\u00d200000;
    }

    private void \u00d600000() {
        if (this.o00000) {
            throw new UnsupportedOperationException();
        }
    }

    private SortedMap \u00d400000() {
        this.\u00d600000();
        if (this.\u00d300000.isEmpty() && !(this.\u00d300000 instanceof TreeMap)) {
            this.\u00d300000 = new TreeMap();
        }
        return (SortedMap)this.\u00d300000;
    }

    private void super() {
        this.\u00d600000();
        if (this.\u00d500000.isEmpty() && !(this.\u00d500000 instanceof ArrayList)) {
            this.\u00d500000 = new ArrayList(this.String);
        }
    }

    /* synthetic */ n(int n2, n$1 n$1) {
        this(n2);
    }

    static /* synthetic */ void \u00d200000(n n2) {
        n2.\u00d600000();
    }

    static /* synthetic */ List \u00d300000(n n2) {
        return n2.\u00d500000;
    }

    static /* synthetic */ Object super(n n2, int n3) {
        return n2.\u00d200000(n3);
    }

    static /* synthetic */ Map super(n n2) {
        return n2.\u00d300000;
    }
}

