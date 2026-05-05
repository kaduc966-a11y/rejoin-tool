/*
 * Decompiled with CFR 0.152.
 */
package b.l.c;

import java.nio.file.FileSystemException;
import java.nio.file.Path;

public final class n
extends FileSystemException {
    public n(Path path, Path path2, String string) {
        Path path3 = path2;
        super(((Object)path).toString(), path3 != null ? ((Object)path3).toString() : null, string);
    }

    public n(Path path) {
        this(path, null, null);
    }
}

