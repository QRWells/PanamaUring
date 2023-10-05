// Generated by jextract

package top.dreamlike.nativeLib.liburing;

import top.dreamlike.common.CType;

import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;

public class io_uring_params {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        CType.C_INT$LAYOUT.withName("sq_entries"),
        CType.C_INT$LAYOUT.withName("cq_entries"),
        CType.C_INT$LAYOUT.withName("flags"),
        CType.C_INT$LAYOUT.withName("sq_thread_cpu"),
        CType.C_INT$LAYOUT.withName("sq_thread_idle"),
        CType.C_INT$LAYOUT.withName("features"),
        CType.C_INT$LAYOUT.withName("wq_fd"),
        MemoryLayout.sequenceLayout(3, CType.C_INT$LAYOUT).withName("resv"),
        MemoryLayout.structLayout(
            CType.C_INT$LAYOUT.withName("head"),
            CType.C_INT$LAYOUT.withName("tail"),
            CType.C_INT$LAYOUT.withName("ring_mask"),
            CType.C_INT$LAYOUT.withName("ring_entries"),
            CType.C_INT$LAYOUT.withName("flags"),
            CType.C_INT$LAYOUT.withName("dropped"),
            CType.C_INT$LAYOUT.withName("array"),
            CType.C_INT$LAYOUT.withName("resv1"),
            CType.C_LONG_LONG$LAYOUT.withName("resv2")
        ).withName("sq_off"),
        MemoryLayout.structLayout(
            CType.C_INT$LAYOUT.withName("head"),
            CType.C_INT$LAYOUT.withName("tail"),
            CType.C_INT$LAYOUT.withName("ring_mask"),
            CType.C_INT$LAYOUT.withName("ring_entries"),
            CType.C_INT$LAYOUT.withName("overflow"),
            CType.C_INT$LAYOUT.withName("cqes"),
            CType.C_INT$LAYOUT.withName("flags"),
            CType.C_INT$LAYOUT.withName("resv1"),
            CType.C_LONG_LONG$LAYOUT.withName("resv2")
        ).withName("cq_off")
    ).withName("io_uring_params");
    public static MemoryLayout $LAYOUT() {
        return io_uring_params.$struct$LAYOUT;
    }
    static final VarHandle sq_entries$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sq_entries"));
    public static VarHandle sq_entries$VH() {
        return io_uring_params.sq_entries$VH;
    }
    public static int sq_entries$get(MemorySegment seg) {
        return (int)io_uring_params.sq_entries$VH.get(seg);
    }
    public static void sq_entries$set( MemorySegment seg, int x) {
        io_uring_params.sq_entries$VH.set(seg, x);
    }
    public static int sq_entries$get(MemorySegment seg, long index) {
        return (int)io_uring_params.sq_entries$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sq_entries$set(MemorySegment seg, long index, int x) {
        io_uring_params.sq_entries$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cq_entries$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cq_entries"));
    public static VarHandle cq_entries$VH() {
        return io_uring_params.cq_entries$VH;
    }
    public static int cq_entries$get(MemorySegment seg) {
        return (int)io_uring_params.cq_entries$VH.get(seg);
    }
    public static void cq_entries$set( MemorySegment seg, int x) {
        io_uring_params.cq_entries$VH.set(seg, x);
    }
    public static int cq_entries$get(MemorySegment seg, long index) {
        return (int)io_uring_params.cq_entries$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cq_entries$set(MemorySegment seg, long index, int x) {
        io_uring_params.cq_entries$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return io_uring_params.flags$VH;
    }
    public static int flags$get(MemorySegment seg) {
        return (int)io_uring_params.flags$VH.get(seg);
    }
    public static void flags$set( MemorySegment seg, int x) {
        io_uring_params.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)io_uring_params.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        io_uring_params.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sq_thread_cpu$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sq_thread_cpu"));
    public static VarHandle sq_thread_cpu$VH() {
        return io_uring_params.sq_thread_cpu$VH;
    }
    public static int sq_thread_cpu$get(MemorySegment seg) {
        return (int)io_uring_params.sq_thread_cpu$VH.get(seg);
    }
    public static void sq_thread_cpu$set( MemorySegment seg, int x) {
        io_uring_params.sq_thread_cpu$VH.set(seg, x);
    }
    public static int sq_thread_cpu$get(MemorySegment seg, long index) {
        return (int)io_uring_params.sq_thread_cpu$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sq_thread_cpu$set(MemorySegment seg, long index, int x) {
        io_uring_params.sq_thread_cpu$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sq_thread_idle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sq_thread_idle"));
    public static VarHandle sq_thread_idle$VH() {
        return io_uring_params.sq_thread_idle$VH;
    }
    public static int sq_thread_idle$get(MemorySegment seg) {
        return (int)io_uring_params.sq_thread_idle$VH.get(seg);
    }
    public static void sq_thread_idle$set( MemorySegment seg, int x) {
        io_uring_params.sq_thread_idle$VH.set(seg, x);
    }
    public static int sq_thread_idle$get(MemorySegment seg, long index) {
        return (int)io_uring_params.sq_thread_idle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sq_thread_idle$set(MemorySegment seg, long index, int x) {
        io_uring_params.sq_thread_idle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle features$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("features"));
    public static VarHandle features$VH() {
        return io_uring_params.features$VH;
    }
    public static int features$get(MemorySegment seg) {
        return (int)io_uring_params.features$VH.get(seg);
    }
    public static void features$set( MemorySegment seg, int x) {
        io_uring_params.features$VH.set(seg, x);
    }
    public static int features$get(MemorySegment seg, long index) {
        return (int)io_uring_params.features$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void features$set(MemorySegment seg, long index, int x) {
        io_uring_params.features$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wq_fd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wq_fd"));
    public static VarHandle wq_fd$VH() {
        return io_uring_params.wq_fd$VH;
    }
    public static int wq_fd$get(MemorySegment seg) {
        return (int)io_uring_params.wq_fd$VH.get(seg);
    }
    public static void wq_fd$set( MemorySegment seg, int x) {
        io_uring_params.wq_fd$VH.set(seg, x);
    }
    public static int wq_fd$get(MemorySegment seg, long index) {
        return (int)io_uring_params.wq_fd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wq_fd$set(MemorySegment seg, long index, int x) {
        io_uring_params.wq_fd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment resv$slice(MemorySegment seg) {
        return seg.asSlice(28, 12);
    }
    public static MemorySegment sq_off$slice(MemorySegment seg) {
        return seg.asSlice(40, 40);
    }
    public static MemorySegment cq_off$slice(MemorySegment seg) {
        return seg.asSlice(80, 40);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }

}


