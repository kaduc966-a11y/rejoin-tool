/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.g;

import b.s.mc;
import b.t.c.b.b.g.b;
import b.t.c.b.b.g.f;
import b.t.c.b.b.g.i;
import b.t.c.b.b.g.n;
import b.t.c.b.b.g.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class j
extends b {
    private n \u00f4O\u00f6000;

    protected j(n n2) {
        this.\u00f4O\u00f6000 = n2;
    }

    @Override
    protected final n \u00f8\u00d8\u00d3000() {
        return this.\u00f4O\u00f6000;
    }

    public j() {
        this(f.\u00f8O\u00f6000);
    }

    @Override
    protected final void o00000(String string, Object object) {
        int n2 = this.\u00f5\u00d8\u00d3000().o00000(string);
        switch (this.\u00f4O\u00f6000.whileStringnew()) {
            case 0: {
                n n3 = this.\u00f4O\u00f6000;
                if (!(n3 instanceof f)) {
                    throw new IllegalStateException(this.o00000(n3, 0, "EmptyArrayMap"));
                }
                this.\u00f4O\u00f6000 = new q(object, n2);
                return;
            }
            case 1: {
                n n4;
                n n5 = this.\u00f4O\u00f6000;
                try {
                    n4 = (q)n5;
                }
                catch (ClassCastException classCastException) {
                    throw new IllegalStateException(this.o00000(n5, 1, "OneElementArrayMap"), classCastException);
                }
                n5 = n4;
                if (((q)n5).\u00d4\u00f4\u00d3000() == n2) {
                    this.\u00f4O\u00f6000 = new q(object, n2);
                    return;
                }
                n4 = new i();
                ((n)n4).\u00d300000(((q)n5).\u00d4\u00f4\u00d3000(), ((q)n5).\u00d3\u00f4\u00d3000());
                this.\u00f4O\u00f6000 = n4;
            }
        }
        this.\u00f4O\u00f6000.\u00d300000(n2, object);
    }

    private final String o00000(n object, int n2, String charSequence) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        stringBuilder.append("Race condition happened, the size of ArrayMap is " + n2 + " but it isn't an `" + (String)charSequence + '`').append('\n');
        stringBuilder2.append("Type: " + object.getClass()).append('\n');
        StringBuilder stringBuilder3 = new StringBuilder();
        charSequence = stringBuilder3;
        Map map = this.\u00f5\u00d8\u00d3000().o00000();
        ((StringBuilder)charSequence).append("[\n");
        Object object2 = object = (Iterable)object;
        object = new ArrayList(mc.o00000((Iterable)object, 10));
        int n3 = 0;
        object2 = object2.iterator();
        while (object2.hasNext()) {
            Object v0;
            Iterable iterable;
            int n4;
            Object e2;
            block3: {
                e2 = object2.next();
                if ((n4 = n3++) < 0) {
                    mc.\u00d800000();
                }
                iterable = object;
                for (Object t2 : (Iterable)map.entrySet()) {
                    if (!(((Number)((Map.Entry)t2).getValue()).intValue() == n4)) continue;
                    v0 = t2;
                    break block3;
                }
                v0 = null;
            }
            Map.Entry entry = v0;
            iterable.add(((StringBuilder)charSequence).append("  " + entry + '[' + n4 + "]: " + e2).append('\n'));
        }
        List cfr_ignored_0 = (List)object;
        ((StringBuilder)charSequence).append("]\n");
        object = stringBuilder3.toString();
        stringBuilder2.append("Content: ".concat(String.valueOf(object))).append('\n');
        return stringBuilder.toString();
    }
}

