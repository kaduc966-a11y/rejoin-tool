/*
 * Decompiled with CFR 0.152.
 */
package b.r.d.b;

import b.pc;
import b.r.b;
import b.r.d.b.q;
import b.r.d.b.r;
import b.xd;
import java.io.Serializable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class o
implements Serializable,
b,
b.r.d.b.b {
    private final b whilereturn;

    public o(b b2) {
        this.whilereturn = b2;
    }

    public final b \u00d8\u00d80000() {
        return this.whilereturn;
    }

    @Override
    public final void return(Object object) {
        b b2;
        b b3 = this;
        while (true) {
            q.o00000(b3);
            b2 = b3.whilereturn;
            try {
                object = b3.\u00d800000(object);
                if (object == b.r.c.b.\u00d200000()) {
                    return;
                }
                object = xd.String(object);
            }
            catch (Throwable throwable) {
                object = xd.String(pc.o00000(throwable));
            }
            b3.forclass();
            if (!(b2 instanceof o)) break;
            b3 = b2;
        }
        b2.return(object);
    }

    protected abstract Object \u00d800000(Object var1);

    protected void forclass() {
    }

    public b o00000(b b2) {
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public b new(Object object, b b2) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Continuation at ");
        Object object = this.\u00d3\u00d80000();
        if (object == null) {
            object = this.getClass().getName();
        }
        return stringBuilder.append(object).toString();
    }

    @Override
    public b.r.d.b.b \u00d4\u00d80000() {
        b b2 = this.whilereturn;
        if (b2 instanceof b.r.d.b.b) {
            return (b.r.d.b.b)((Object)b2);
        }
        return null;
    }

    @Override
    public StackTraceElement \u00d3\u00d80000() {
        return r.\u00d500000(this);
    }
}

