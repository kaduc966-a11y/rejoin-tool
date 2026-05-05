/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.n;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class n$_c
implements Comparable,
Map.Entry {
    private final Comparable new;
    private Object \u00d300000;
    final /* synthetic */ n o00000;

    n$_c(n n2, Map.Entry entry) {
        this(n2, (Comparable)entry.getKey(), entry.getValue());
    }

    n$_c(n n2, Comparable comparable, Object object) {
        this.o00000 = n2;
        this.new = comparable;
        this.\u00d300000 = object;
    }

    public Comparable super() {
        return this.new;
    }

    public Object getValue() {
        return this.\u00d300000;
    }

    public int super(n$_c n$_c) {
        return this.super().compareTo(n$_c.super());
    }

    public Object setValue(Object object) {
        n.\u00d200000(this.o00000);
        Object object2 = this.\u00d300000;
        this.\u00d300000 = object;
        return object2;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        object = (Map.Entry)object;
        n$_c n$_c = this;
        if (n$_c.super(n$_c.new, object.getKey())) {
            n$_c n$_c2 = this;
            if (n$_c2.super(n$_c2.\u00d300000, object.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.new == null ? 0 : this.new.hashCode()) ^ (this.\u00d300000 == null ? 0 : this.\u00d300000.hashCode());
    }

    public String toString() {
        String string = String.valueOf(String.valueOf(this.new));
        String string2 = String.valueOf(String.valueOf(this.\u00d300000));
        return new StringBuilder(1 + string.length() + string2.length()).append(string).append("=").append(string2).toString();
    }

    private boolean super(Object object, Object object2) {
        if (object == null) {
            return object2 == null;
        }
        return object.equals(object2);
    }
}

