/*
 * Decompiled with CFR 0.152.
 */
package b.m;

import b.b.f;
import b.b.j;
import b.i.e;
import b.m.d$_b;
import b.q.t;
import b.s.mc;
import b.s.z;
import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.MatchResult;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class d {
    public void o00000(Throwable objectArray, Throwable throwable) {
        Method method = d$_b.Object;
        if (method != null) {
            Object[] objectArray2 = objectArray;
            Object[] objectArray3 = new Object[1];
            objectArray = objectArray3;
            objectArray3[0] = throwable;
            method.invoke((Object)objectArray2, objectArray);
            return;
        }
    }

    public List o00000(Throwable throwable) {
        Object object = d$_b.o00000;
        if (object == null || (object = ((Method)object).invoke((Object)throwable, new Object[0])) == null || (object = z.\u00d500000((Throwable[])object)) == null) {
            object = mc.\u00d500000();
        }
        return object;
    }

    public t o00000(MatchResult matchResult, String string) {
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    public f o00000() {
        return new j();
    }

    public e new() {
        throw new UnsupportedOperationException("getSystemClock should not be called on the base PlatformImplementations.");
    }
}

