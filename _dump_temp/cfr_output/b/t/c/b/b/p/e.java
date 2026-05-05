/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.b;
import b.t.c.b.b.p.b$_c;
import b.t.c.b.b.p.e$1;
import b.t.c.b.b.p.e$_b;
import b.t.c.b.b.p.e$_c;
import b.t.c.b.b.p.e$_d;
import b.t.c.b.b.p.e$_e;
import b.t.c.b.b.p.y;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class e
extends b {
    private static final int[] \u00d400000;
    private final int \u00f500000;
    private final b \u00f400000;
    private final b return;
    private final int \u00d500000;
    private final int \u00d300000;
    private int \u00d800000 = 0;

    private e(b b2, b b3) {
        this.\u00f400000 = b2;
        this.return = b3;
        this.\u00d500000 = b2.\u00f400000();
        this.\u00f500000 = this.\u00d500000 + b3.\u00f400000();
        this.\u00d300000 = Math.max(b2.Object(), b3.Object()) + 1;
    }

    static b o00000(b b2, b b3) {
        e e2;
        e e3 = e2 = b2 instanceof e ? (e)b2 : null;
        if (b3.\u00f400000() != 0) {
            if (b2.\u00f400000() == 0) {
                b2 = b3;
            } else {
                int n2 = b2.\u00f400000() + b3.\u00f400000();
                if (n2 < 128) {
                    b2 = e.\u00d200000(b2, b3);
                } else if (e2 != null && e2.return.\u00f400000() + b3.\u00f400000() < 128) {
                    y y2 = e.\u00d200000(e2.return, b3);
                    b2 = new e(e2.\u00f400000, y2);
                } else if (e2 != null && e2.\u00f400000.Object() > e2.return.Object() && e2.Object() > b3.Object()) {
                    e e4 = new e(e2.return, b3);
                    b2 = new e(e2.\u00f400000, e4);
                } else {
                    int n3 = Math.max(b2.Object(), b3.Object()) + 1;
                    b2 = n2 >= \u00d400000[n3] ? new e(b2, b3) : e$_e.super(new e$_e(null), b2, b3);
                }
            }
        }
        return b2;
    }

    private static y \u00d200000(b b2, b b3) {
        int n2 = b2.\u00f400000();
        int n3 = b3.\u00f400000();
        byte[] byArray = new byte[n2 + n3];
        b2.\u00d200000(byArray, 0, 0, n2);
        b3.\u00d200000(byArray, 0, n2, n3);
        return new y(byArray);
    }

    @Override
    public int \u00f400000() {
        return this.\u00f500000;
    }

    @Override
    protected int Object() {
        return this.\u00d300000;
    }

    @Override
    protected boolean \u00f600000() {
        return this.\u00f500000 >= \u00d400000[this.\u00d300000];
    }

    @Override
    protected void o00000(byte[] byArray, int n2, int n3, int n4) {
        if (n2 + n4 <= this.\u00d500000) {
            this.\u00f400000.o00000(byArray, n2, n3, n4);
            return;
        }
        if (n2 >= this.\u00d500000) {
            this.return.o00000(byArray, n2 - this.\u00d500000, n3, n4);
            return;
        }
        int n5 = this.\u00d500000 - n2;
        this.\u00f400000.o00000(byArray, n2, n3, n5);
        this.return.o00000(byArray, 0, n3 + n5, n4 - n5);
    }

    @Override
    void o00000(OutputStream outputStream, int n2, int n3) throws IOException {
        if (n2 + n3 <= this.\u00d500000) {
            this.\u00f400000.o00000(outputStream, n2, n3);
            return;
        }
        if (n2 >= this.\u00d500000) {
            this.return.o00000(outputStream, n2 - this.\u00d500000, n3);
            return;
        }
        int n4 = this.\u00d500000 - n2;
        this.\u00f400000.o00000(outputStream, n2, n4);
        this.return.o00000(outputStream, 0, n3 - n4);
    }

    @Override
    public String o00000(String string) throws UnsupportedEncodingException {
        return new String(this.float(), string);
    }

    @Override
    public boolean o00000() {
        int n2 = this.\u00f400000.o00000(0, 0, this.\u00d500000);
        return this.return.o00000(n2, 0, this.return.\u00f400000()) == 0;
    }

    @Override
    protected int o00000(int n2, int n3, int n4) {
        if (n3 + n4 <= this.\u00d500000) {
            return this.\u00f400000.o00000(n2, n3, n4);
        }
        if (n3 >= this.\u00d500000) {
            return this.return.o00000(n2, n3 - this.\u00d500000, n4);
        }
        int n5 = this.\u00d500000 - n3;
        n2 = this.\u00f400000.o00000(n2, n3, n5);
        return this.return.o00000(n2, 0, n4 - n5);
    }

    public boolean equals(Object object) {
        int n2;
        if (object == this) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        if (this.\u00f500000 != ((b)(object = (b)object)).\u00f400000()) {
            return false;
        }
        if (this.\u00f500000 == 0) {
            return true;
        }
        if (this.\u00d800000 != 0 && (n2 = ((b)object).\u00f500000()) != 0 && this.\u00d800000 != n2) {
            return false;
        }
        return this.\u00d200000((b)object);
    }

    private boolean \u00d200000(b object) {
        int n2 = 0;
        e$_b e$_b = new e$_b(this, null);
        y y2 = (y)e$_b.next();
        int n3 = 0;
        object = new e$_b((b)object, null);
        y y3 = (y)object.next();
        int n4 = 0;
        while (true) {
            int n5 = ((b)y2).\u00f400000() - n2;
            int n6 = ((b)y3).\u00f400000() - n3;
            int n7 = Math.min(n5, n6);
            if (!(n2 == 0 ? y2.o00000(y3, n3, n7) : y3.o00000(y2, n2, n7))) {
                return false;
            }
            if ((n4 += n7) >= this.\u00f500000) {
                if (n4 == this.\u00f500000) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (n7 == n5) {
                n2 = 0;
                y2 = (y)e$_b.next();
            } else {
                n2 += n7;
            }
            if (n7 == n6) {
                n3 = 0;
                y3 = (y)object.next();
                continue;
            }
            n3 += n7;
        }
    }

    public int hashCode() {
        int n2 = this.\u00d800000;
        if (n2 == 0) {
            n2 = this.\u00f500000;
            if ((n2 = this.\u00d200000(n2, 0, this.\u00f500000)) == 0) {
                n2 = 1;
            }
            this.\u00d800000 = n2;
        }
        return n2;
    }

    @Override
    protected int \u00f500000() {
        return this.\u00d800000;
    }

    @Override
    protected int \u00d200000(int n2, int n3, int n4) {
        if (n3 + n4 <= this.\u00d500000) {
            return this.\u00f400000.\u00d200000(n2, n3, n4);
        }
        if (n3 >= this.\u00d500000) {
            return this.return.\u00d200000(n2, n3 - this.\u00d500000, n4);
        }
        int n5 = this.\u00d500000 - n3;
        n2 = this.\u00f400000.\u00d200000(n2, n3, n5);
        return this.return.\u00d200000(n2, 0, n4 - n5);
    }

    @Override
    public ab \u00d500000() {
        return ab.o00000(new e$_c(this));
    }

    @Override
    public b$_c \u00d400000() {
        return new e$_d(this, null);
    }

    /* synthetic */ e(b b2, b b3, e$1 e$1) {
        this(b2, b3);
    }

    static /* synthetic */ b o00000(e e2) {
        return e2.\u00f400000;
    }

    static /* synthetic */ b \u00d200000(e e2) {
        return e2.return;
    }

    static /* synthetic */ int[] OO0000() {
        return \u00d400000;
    }

    static {
        int n2;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n3 = 1;
        int n4 = 1;
        while (n4 > 0) {
            arrayList.add(n4);
            n2 = n3 + n4;
            n3 = n4;
            n4 = n2;
        }
        arrayList.add(Integer.MAX_VALUE);
        \u00d400000 = new int[arrayList.size()];
        for (n2 = 0; n2 < \u00d400000.length; ++n2) {
            e.\u00d400000[n2] = (Integer)arrayList.get(n2);
        }
    }
}

