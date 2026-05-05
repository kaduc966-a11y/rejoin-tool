/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.i;
import b.t.c.b.b.q.pb;
import b.t.c.b.bb;
import b.t.c.b.cb;
import b.t.c.b.e;
import b.t.c.b.gb;
import b.t.c.b.h;
import b.t.c.b.ic;
import b.t.c.b.kc;
import b.t.c.b.ld;
import b.t.c.b.nc;
import b.t.c.b.oc;
import b.t.c.b.wb;
import b.t.c.b.x;
import java.util.Collection;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class nb
extends ld {
    private final h new;

    public nb(h h2) {
        super(h2);
        this.new = h2;
    }

    public gb super(pb pb2, i i2) {
        int n2;
        int n3 = !((Collection)pb2.\u00d4\u00f4o000()).isEmpty() ? -1 : (n2 = (pb2.Stringclasssuper() != null ? 1 : 0) + (pb2.nullclasssuper() != null ? 1 : 0));
        if (pb2.\u00f4\u00f4o000()) {
            switch (n2) {
                default: {
                    return new wb(this.new, pb2, oc.\u00f600000.o00000());
                }
                case 0: {
                    return new nc(this.new, pb2, oc.\u00f600000.o00000());
                }
                case 1: {
                    return new kc(this.new, pb2, oc.\u00f600000.o00000());
                }
                case 2: 
            }
            return new ic(this.new, pb2, oc.\u00f600000.o00000());
        }
        switch (n2) {
            default: {
                return new e(this.new, pb2, oc.\u00f600000.o00000());
            }
            case 0: {
                return new cb(this.new, pb2, oc.\u00f600000.o00000());
            }
            case 1: {
                return new bb(this.new, pb2, oc.\u00f600000.o00000());
            }
            case 2: 
        }
        return new x(this.new, pb2, oc.\u00f600000.o00000());
    }
}

