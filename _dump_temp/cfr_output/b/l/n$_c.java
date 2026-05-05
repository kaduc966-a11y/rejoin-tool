/*
 * Decompiled with CFR 0.152.
 */
package b.l;

import b.l.n$_d;
import b.m;
import java.io.File;

abstract class n$_c
extends n$_d {
    public n$_c(File file) {
        super(file);
        if (m.new) {
            boolean bl = file.isDirectory();
            if (m.new && !bl) {
                String string = "rootDir must be verified to be directory beforehand.";
                throw new AssertionError((Object)string);
            }
        }
    }
}

