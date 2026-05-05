/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.b$_b;
import b.t.c.b.b.p.b$_c;
import b.t.c.b.b.p.e;
import b.t.c.b.b.p.t;
import b.t.c.b.b.p.y;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class b
implements Iterable {
    public static final b o00000 = new y(new byte[0]);

    b() {
    }

    public abstract b$_c \u00d400000();

    public abstract int \u00f400000();

    public boolean void() {
        return this.\u00f400000() == 0;
    }

    public static b o00000(byte[] byArray, int n2, int n3) {
        byte[] byArray2 = new byte[n3];
        System.arraycopy(byArray, n2, byArray2, 0, n3);
        return new y(byArray2);
    }

    public static b o00000(byte[] byArray) {
        return b.o00000(byArray, 0, byArray.length);
    }

    public static b \u00d200000(String string) {
        try {
            return new y(string.getBytes("UTF-8"));
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException("UTF-8 not supported?", unsupportedEncodingException);
        }
    }

    public b o00000(b b2) {
        int n2;
        int n3 = this.\u00f400000();
        if ((long)n3 + (long)(n2 = b2.\u00f400000()) >= Integer.MAX_VALUE) {
            int n4 = n3;
            n3 = n2;
            throw new IllegalArgumentException(new StringBuilder(53).append("ByteString would be too long: ").append(n4).append("+").append(n3).toString());
        }
        return e.o00000(this, b2);
    }

    public static b o00000(Iterable object) {
        ArrayList<b> arrayList;
        if (!(object instanceof Collection)) {
            arrayList = new ArrayList<b>();
            object = object.iterator();
            while (object.hasNext()) {
                b b2 = (b)object.next();
                arrayList.add(b2);
            }
        } else {
            arrayList = (ArrayList<b>)object;
        }
        object = arrayList.isEmpty() ? o00000 : b.o00000(arrayList.iterator(), arrayList.size());
        return object;
    }

    private static b o00000(Iterator object, int n2) {
        assert (n2 > 0);
        if (n2 == 1) {
            object = (b)object.next();
        } else {
            int n3 = n2 >>> 1;
            b b2 = b.o00000((Iterator)object, n3);
            object = b.o00000((Iterator)object, n2 - n3);
            object = b2.o00000((b)object);
        }
        return object;
    }

    public void \u00d200000(byte[] byArray, int n2, int n3, int n4) {
        if (n2 < 0) {
            int n5 = n2;
            throw new IndexOutOfBoundsException(new StringBuilder(30).append("Source offset < 0: ").append(n5).toString());
        }
        if (n3 < 0) {
            int n6 = n3;
            throw new IndexOutOfBoundsException(new StringBuilder(30).append("Target offset < 0: ").append(n6).toString());
        }
        if (n4 < 0) {
            int n7 = n4;
            throw new IndexOutOfBoundsException(new StringBuilder(23).append("Length < 0: ").append(n7).toString());
        }
        if (n2 + n4 > this.\u00f400000()) {
            int n8 = n2 + n4;
            throw new IndexOutOfBoundsException(new StringBuilder(34).append("Source end offset < 0: ").append(n8).toString());
        }
        if (n3 + n4 > byArray.length) {
            int n9 = n3 + n4;
            throw new IndexOutOfBoundsException(new StringBuilder(34).append("Target end offset < 0: ").append(n9).toString());
        }
        if (n4 > 0) {
            this.o00000(byArray, n2, n3, n4);
        }
    }

    protected abstract void o00000(byte[] var1, int var2, int var3, int var4);

    public byte[] float() {
        int n2 = this.\u00f400000();
        if (n2 == 0) {
            return t.o00000;
        }
        byte[] byArray = new byte[n2];
        this.o00000(byArray, 0, 0, n2);
        return byArray;
    }

    void \u00d200000(OutputStream outputStream, int n2, int n3) throws IOException {
        if (n2 < 0) {
            int n4 = n2;
            throw new IndexOutOfBoundsException(new StringBuilder(30).append("Source offset < 0: ").append(n4).toString());
        }
        if (n3 < 0) {
            int n5 = n3;
            throw new IndexOutOfBoundsException(new StringBuilder(23).append("Length < 0: ").append(n5).toString());
        }
        if (n2 + n3 > this.\u00f400000()) {
            int n6 = n2 + n3;
            throw new IndexOutOfBoundsException(new StringBuilder(39).append("Source end offset exceeded: ").append(n6).toString());
        }
        if (n3 > 0) {
            this.o00000(outputStream, n2, n3);
        }
    }

    abstract void o00000(OutputStream var1, int var2, int var3) throws IOException;

    public abstract String o00000(String var1) throws UnsupportedEncodingException;

    public String \u00d200000() {
        try {
            return this.o00000("UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException("UTF-8 not supported?", unsupportedEncodingException);
        }
    }

    public abstract boolean o00000();

    protected abstract int o00000(int var1, int var2, int var3);

    public abstract ab \u00d500000();

    public static b$_b \u00d600000() {
        return new b$_b(128);
    }

    protected abstract int Object();

    protected abstract boolean \u00f600000();

    protected abstract int \u00f500000();

    protected abstract int \u00d200000(int var1, int var2, int var3);

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), this.\u00f400000());
    }
}

