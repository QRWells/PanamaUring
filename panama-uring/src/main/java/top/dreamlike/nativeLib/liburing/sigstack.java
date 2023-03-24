// Generated by jextract

package top.dreamlike.nativeLib.liburing;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;

public class sigstack {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ss_sp"),
            Constants$root.C_INT$LAYOUT.withName("ss_onstack"),
            MemoryLayout.paddingLayout(32)
    ).withName("sigstack");

    public static MemoryLayout $LAYOUT() {
        return sigstack.$struct$LAYOUT;
    }

    static final VarHandle ss_sp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ss_sp"));

    public static VarHandle ss_sp$VH() {
        return sigstack.ss_sp$VH;
    }

    public static MemorySegment ss_sp$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) sigstack.ss_sp$VH.get(seg);
    }

    public static void ss_sp$set(MemorySegment seg, MemorySegment x) {
        sigstack.ss_sp$VH.set(seg, x);
    }

    public static MemorySegment ss_sp$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) sigstack.ss_sp$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void ss_sp$set(MemorySegment seg, long index, MemorySegment x) {
        sigstack.ss_sp$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle ss_onstack$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ss_onstack"));

    public static VarHandle ss_onstack$VH() {
        return sigstack.ss_onstack$VH;
    }

    public static int ss_onstack$get(MemorySegment seg) {
        return (int) sigstack.ss_onstack$VH.get(seg);
    }
    public static void ss_onstack$set( MemorySegment seg, int x) {
        sigstack.ss_onstack$VH.set(seg, x);
    }
    public static int ss_onstack$get(MemorySegment seg, long index) {
        return (int)sigstack.ss_onstack$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ss_onstack$set(MemorySegment seg, long index, int x) {
        sigstack.ss_onstack$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }

    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }

    public static MemorySegment ofAddress(MemorySegment addr, Arena session) {
        return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session);
    }
}


