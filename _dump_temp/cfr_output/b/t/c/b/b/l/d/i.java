/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.d;

import b.hd;
import b.qd;
import b.s.mc;
import b.t.c.b.b.l.b$_fb;
import b.t.c.b.b.l.b$_pb;
import b.t.c.b.b.l.b$_pb$_c;
import b.t.c.b.b.l.d.e;
import b.t.c.b.b.l.d.i$_b;
import java.util.LinkedList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class i
implements e {
    private final b$_fb o00000;
    private final b$_pb new;

    public i(b$_fb b$_fb, b$_pb b$_pb) {
        this.o00000 = b$_fb;
        this.new = b$_pb;
    }

    @Override
    public final String new(int n2) {
        return this.o00000.voidsuper(n2);
    }

    @Override
    public final String \u00d300000(int n2) {
        Object object = this.\u00d400000(n2);
        List list = (List)((hd)object).\u00d600000();
        object = mc.o00000((List)((hd)object).\u00d500000(), ".", null, null, 0, null, null, 62, null);
        if (list.isEmpty()) {
            return object;
        }
        return mc.o00000(list, "/", null, null, 0, null, null, 62, null) + '/' + (String)object;
    }

    @Override
    public final boolean o00000(int n2) {
        return (Boolean)this.\u00d400000(n2).\u00d200000();
    }

    private final hd \u00d400000(int n2) {
        LinkedList<String> linkedList = new LinkedList<String>();
        LinkedList<String> linkedList2 = new LinkedList<String>();
        boolean bl = false;
        while (n2 != -1) {
            b$_pb$_c b$_pb$_c = this.new.\u00d4\u00d20000(n2);
            String string = this.o00000.voidsuper(b$_pb$_c.\u00f4\u00d4o000());
            switch (i$_b.super[b$_pb$_c.interfacenewsuper().ordinal()]) {
                case 1: {
                    linkedList2.addFirst(string);
                    break;
                }
                case 2: {
                    linkedList.addFirst(string);
                    break;
                }
                case 3: {
                    linkedList2.addFirst(string);
                    bl = true;
                    break;
                }
                default: {
                    throw new qd();
                }
            }
            n2 = b$_pb$_c.\u00d2\u00d4o000();
        }
        return new hd(linkedList, linkedList2, bl);
    }
}

