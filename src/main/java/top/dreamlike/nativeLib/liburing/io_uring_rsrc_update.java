// Generated by jextract

package top.dreamlike.nativeLib.liburing;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

public class io_uring_rsrc_update {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("offset"),
        Constants$root.C_INT$LAYOUT.withName("resv"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("data")
    ).withName("io_uring_rsrc_update");
    public static MemoryLayout $LAYOUT() {
        return io_uring_rsrc_update.$struct$LAYOUT;
    }
    static final VarHandle offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("offset"));
    public static VarHandle offset$VH() {
        return io_uring_rsrc_update.offset$VH;
    }
    public static int offset$get(MemorySegment seg) {
        return (int)io_uring_rsrc_update.offset$VH.get(seg);
    }
    public static void offset$set( MemorySegment seg, int x) {
        io_uring_rsrc_update.offset$VH.set(seg, x);
    }
    public static int offset$get(MemorySegment seg, long index) {
        return (int)io_uring_rsrc_update.offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offset$set(MemorySegment seg, long index, int x) {
        io_uring_rsrc_update.offset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle resv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("resv"));
    public static VarHandle resv$VH() {
        return io_uring_rsrc_update.resv$VH;
    }
    public static int resv$get(MemorySegment seg) {
        return (int)io_uring_rsrc_update.resv$VH.get(seg);
    }
    public static void resv$set( MemorySegment seg, int x) {
        io_uring_rsrc_update.resv$VH.set(seg, x);
    }
    public static int resv$get(MemorySegment seg, long index) {
        return (int)io_uring_rsrc_update.resv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void resv$set(MemorySegment seg, long index, int x) {
        io_uring_rsrc_update.resv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("data"));
    public static VarHandle data$VH() {
        return io_uring_rsrc_update.data$VH;
    }
    public static long data$get(MemorySegment seg) {
        return (long)io_uring_rsrc_update.data$VH.get(seg);
    }
    public static void data$set( MemorySegment seg, long x) {
        io_uring_rsrc_update.data$VH.set(seg, x);
    }
    public static long data$get(MemorySegment seg, long index) {
        return (long)io_uring_rsrc_update.data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void data$set(MemorySegment seg, long index, long x) {
        io_uring_rsrc_update.data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

