/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.c;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class mb
extends AbstractMap
implements Map,
c {
    protected mb() {
    }

    public abstract Object put(Object var1, Object var2);

    public Set \u00f50\u00d3000() {
        return super.keySet();
    }

    public final Set keySet() {
        return this.\u00f50\u00d3000();
    }

    public Collection Stringinterfacesuper() {
        return super.values();
    }

    public final Collection values() {
        return this.Stringinterfacesuper();
    }

    public abstract Set OO\u00d3000();

    public final Set entrySet() {
        return this.OO\u00d3000();
    }

    public int \u00f80\u00d3000() {
        return super.size();
    }

    @Override
    public final int size() {
        return this.\u00f80\u00d3000();
    }
}

