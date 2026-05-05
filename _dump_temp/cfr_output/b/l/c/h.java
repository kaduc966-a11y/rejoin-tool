/*
 * Decompiled with CFR 0.152.
 */
package b.l.c;

import b.o.d.fc;
import b.o.d.w;
import java.nio.file.FileSystemException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class h {
    private final int super;
    private int \u00d200000;
    private final List \u00d400000;
    private Path \u00d300000;

    public h(int n2) {
        this.super = n2;
        this.\u00d400000 = new ArrayList();
    }

    public /* synthetic */ h(int n2, int n3, w w2) {
        if ((n3 & 1) != 0) {
            n2 = 64;
        }
        this(n2);
    }

    public final int o00000() {
        return this.\u00d200000;
    }

    public final List Object() {
        return this.\u00d400000;
    }

    public final Path \u00d200000() {
        return this.\u00d300000;
    }

    public final void Object(Path path) {
        this.\u00d300000 = path;
    }

    public final void o00000(Path path) {
        Path path2 = this.\u00d300000;
        this.\u00d300000 = path2 != null ? path2.resolve(path) : null;
    }

    public final void \u00d200000(Path object) {
        Path path = this.\u00d300000;
        if (!fc.o00000(object, (Object)(path != null ? path.getFileName() : null))) {
            object = "Failed requirement.";
            throw new IllegalArgumentException(object.toString());
        }
        Path path2 = this.\u00d300000;
        this.\u00d300000 = path2 != null ? path2.getParent() : null;
    }

    public final void o00000(Exception exception) {
        ++this.\u00d200000;
        if (this.\u00d400000.size() < this.super) {
            exception = this.\u00d300000 != null ? (Exception)((FileSystemException)new FileSystemException(String.valueOf(this.\u00d300000)).initCause(exception)) : exception;
            this.\u00d400000.add(exception);
        }
    }

    public h() {
        this(0, 1, null);
    }
}

