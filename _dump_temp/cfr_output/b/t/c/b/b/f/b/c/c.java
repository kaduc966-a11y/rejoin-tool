/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b.c;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public final class c {
    public final InputStream o00000(String object) {
        ClassLoader classLoader = this.getClass().getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream((String)object);
        }
        URL uRL = classLoader.getResource((String)object);
        if (uRL == null) {
            return null;
        }
        object = uRL.openConnection();
        ((URLConnection)object).setUseCaches(false);
        return ((URLConnection)object).getInputStream();
    }
}

