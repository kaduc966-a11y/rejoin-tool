/*
 * Decompiled with CFR 0.152.
 */
package b.n;

import b.n.e$_b$1;
import b.o.e.g;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class e {
    private static final TimerTask super(Timer timer, long l2, g object) {
        object = new e$_b$1((g)object);
        timer.schedule((TimerTask)object, l2);
        return object;
    }

    private static final TimerTask super(Timer timer, Date date, g object) {
        object = new e$_b$1((g)object);
        timer.schedule((TimerTask)object, date);
        return object;
    }

    private static final TimerTask \u00d200000(Timer timer, long l2, long l3, g object) {
        object = new e$_b$1((g)object);
        timer.schedule((TimerTask)object, l2, l3);
        return object;
    }

    private static final TimerTask \u00d200000(Timer timer, Date date, long l2, g object) {
        object = new e$_b$1((g)object);
        timer.schedule((TimerTask)object, date, l2);
        return object;
    }

    private static final TimerTask super(Timer timer, long l2, long l3, g object) {
        object = new e$_b$1((g)object);
        timer.scheduleAtFixedRate((TimerTask)object, l2, l3);
        return object;
    }

    private static final TimerTask super(Timer timer, Date date, long l2, g object) {
        object = new e$_b$1((g)object);
        timer.scheduleAtFixedRate((TimerTask)object, date, l2);
        return object;
    }

    public static final Timer super(String string, boolean bl) {
        if (string == null) {
            return new Timer(bl);
        }
        return new Timer(string, bl);
    }

    private static final Timer \u00d200000(String object, boolean bl, long l2, long l3, g object2) {
        object = e.super((String)object, bl);
        Timer timer = object;
        object2 = new e$_b$1((g)object2);
        timer.schedule((TimerTask)object2, l2, l3);
        return object;
    }

    static /* synthetic */ Timer super(String object, boolean bl, long l2, long l3, g g2, int n2, Object object2) {
        if ((n2 & 1) != 0) {
            object = null;
        }
        if ((n2 & 2) != 0) {
            bl = false;
        }
        if ((n2 & 4) != 0) {
            l2 = 0L;
        }
        Timer timer = e.super((String)object, bl);
        object2 = timer;
        object = new e$_b$1(g2);
        ((Timer)object2).schedule((TimerTask)object, l2, l3);
        return timer;
    }

    private static final Timer \u00d200000(String object, boolean bl, Date date, long l2, g object2) {
        object = e.super((String)object, bl);
        Timer timer = object;
        object2 = new e$_b$1((g)object2);
        timer.schedule((TimerTask)object2, date, l2);
        return object;
    }

    static /* synthetic */ Timer super(String object, boolean bl, Date date, long l2, g g2, int n2, Object object2) {
        if ((n2 & 1) != 0) {
            object = null;
        }
        if ((n2 & 2) != 0) {
            bl = false;
        }
        Timer timer = e.super((String)object, bl);
        object2 = timer;
        object = new e$_b$1(g2);
        ((Timer)object2).schedule((TimerTask)object, date, l2);
        return timer;
    }

    private static final Timer super(String object, boolean bl, long l2, long l3, g object2) {
        object = e.super((String)object, bl);
        Timer timer = object;
        object2 = new e$_b$1((g)object2);
        timer.scheduleAtFixedRate((TimerTask)object2, l2, l3);
        return object;
    }

    static /* synthetic */ Timer \u00d200000(String object, boolean bl, long l2, long l3, g g2, int n2, Object object2) {
        if ((n2 & 1) != 0) {
            object = null;
        }
        if ((n2 & 2) != 0) {
            bl = false;
        }
        if ((n2 & 4) != 0) {
            l2 = 0L;
        }
        Timer timer = e.super((String)object, bl);
        object2 = timer;
        object = new e$_b$1(g2);
        ((Timer)object2).scheduleAtFixedRate((TimerTask)object, l2, l3);
        return timer;
    }

    private static final Timer super(String object, boolean bl, Date date, long l2, g object2) {
        object = e.super((String)object, bl);
        Timer timer = object;
        object2 = new e$_b$1((g)object2);
        timer.scheduleAtFixedRate((TimerTask)object2, date, l2);
        return object;
    }

    static /* synthetic */ Timer \u00d200000(String object, boolean bl, Date date, long l2, g g2, int n2, Object object2) {
        if ((n2 & 1) != 0) {
            object = null;
        }
        if ((n2 & 2) != 0) {
            bl = false;
        }
        Timer timer = e.super((String)object, bl);
        object2 = timer;
        object = new e$_b$1(g2);
        ((Timer)object2).scheduleAtFixedRate((TimerTask)object, date, l2);
        return timer;
    }

    private static final TimerTask super(g g2) {
        return new e$_b$1(g2);
    }
}

