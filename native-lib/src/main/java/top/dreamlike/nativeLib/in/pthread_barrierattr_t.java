// Generated by jextract

package top.dreamlike.nativeLib.in;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;

public class pthread_barrierattr_t {

    static final  GroupLayout $union$LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("__size"),
        Constants$root.C_INT$LAYOUT.withName("__align")
    );
    public static MemoryLayout $LAYOUT() {
        return pthread_barrierattr_t.$union$LAYOUT;
    }
    public static MemorySegment __size$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    static final VarHandle __align$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__align"));
    public static VarHandle __align$VH() {
        return pthread_barrierattr_t.__align$VH;
    }
    public static int __align$get(MemorySegment seg) {
        return (int)pthread_barrierattr_t.__align$VH.get(seg);
    }
    public static void __align$set( MemorySegment seg, int x) {
        pthread_barrierattr_t.__align$VH.set(seg, x);
    }
    public static int __align$get(MemorySegment seg, long index) {
        return (int)pthread_barrierattr_t.__align$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __align$set(MemorySegment seg, long index, int x) {
        pthread_barrierattr_t.__align$VH.set(seg.asSlice(index*sizeof()), x);
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


