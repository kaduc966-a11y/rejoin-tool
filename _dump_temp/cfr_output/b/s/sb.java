/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.s.hb;
import b.s.kb;
import b.s.sb$_b$1;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class sb
extends kb {
    private final List \u00d3o0000;

    public sb(List list) {
        this.\u00d3o0000 = list;
    }

    @Override
    public int o00000() {
        return this.\u00d3o0000.size();
    }

    @Override
    public Object get(int n2) {
        return this.\u00d3o0000.get(hb.return(this, n2));
    }

    @Override
    public Iterator iterator() {
        return ((kb)this).listIterator(0);
    }

    @Override
    public ListIterator listIterator() {
        return ((kb)this).listIterator(0);
    }

    @Override
    public ListIterator listIterator(int n2) {
        return new sb$_b$1(this, n2);
    }

    public static final /* synthetic */ List o00000(sb sb2) {
        return sb2.\u00d3o0000;
    }
}

