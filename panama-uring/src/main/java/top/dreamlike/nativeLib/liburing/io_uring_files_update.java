// Generated by jextract

package top.dreamlike.nativeLib.liburing;

import top.dreamlike.common.CType;

import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;

public class io_uring_files_update {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        CType.C_INT$LAYOUT.withName("offset"),
        CType.C_INT$LAYOUT.withName("resv"),
        CType.C_LONG_LONG$LAYOUT.withName("fds")
    ).withName("io_uring_files_update");
    public static MemoryLayout $LAYOUT() {
        return io_uring_files_update.$struct$LAYOUT;
    }
    static final VarHandle offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("offset"));
    public static VarHandle offset$VH() {
        return io_uring_files_update.offset$VH;
    }
    public static int offset$get(MemorySegment seg) {
        return (int)io_uring_files_update.offset$VH.get(seg);
    }
    public static void offset$set( MemorySegment seg, int x) {
        io_uring_files_update.offset$VH.set(seg, x);
    }
    public static int offset$get(MemorySegment seg, long index) {
        return (int)io_uring_files_update.offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offset$set(MemorySegment seg, long index, int x) {
        io_uring_files_update.offset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle resv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("resv"));
    public static VarHandle resv$VH() {
        return io_uring_files_update.resv$VH;
    }
    public static int resv$get(MemorySegment seg) {
        return (int)io_uring_files_update.resv$VH.get(seg);
    }
    public static void resv$set( MemorySegment seg, int x) {
        io_uring_files_update.resv$VH.set(seg, x);
    }
    public static int resv$get(MemorySegment seg, long index) {
        return (int)io_uring_files_update.resv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void resv$set(MemorySegment seg, long index, int x) {
        io_uring_files_update.resv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fds$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fds"));
    public static VarHandle fds$VH() {
        return io_uring_files_update.fds$VH;
    }
    public static long fds$get(MemorySegment seg) {
        return (long)io_uring_files_update.fds$VH.get(seg);
    }
    public static void fds$set( MemorySegment seg, long x) {
        io_uring_files_update.fds$VH.set(seg, x);
    }
    public static long fds$get(MemorySegment seg, long index) {
        return (long)io_uring_files_update.fds$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fds$set(MemorySegment seg, long index, long x) {
        io_uring_files_update.fds$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }


}


