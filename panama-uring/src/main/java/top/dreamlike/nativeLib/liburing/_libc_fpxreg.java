// Generated by jextract

package top.dreamlike.nativeLib.liburing;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;

public class _libc_fpxreg {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(4, Constants$root.C_SHORT$LAYOUT).withName("__significand"),
        Constants$root.C_SHORT$LAYOUT.withName("__exponent"),
        MemoryLayout.sequenceLayout(3, Constants$root.C_SHORT$LAYOUT).withName("__glibc_reserved1")
    ).withName("_libc_fpxreg");
    public static MemoryLayout $LAYOUT() {
        return _libc_fpxreg.$struct$LAYOUT;
    }
    public static MemorySegment __significand$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle __exponent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__exponent"));
    public static VarHandle __exponent$VH() {
        return _libc_fpxreg.__exponent$VH;
    }
    public static short __exponent$get(MemorySegment seg) {
        return (short)_libc_fpxreg.__exponent$VH.get(seg);
    }
    public static void __exponent$set( MemorySegment seg, short x) {
        _libc_fpxreg.__exponent$VH.set(seg, x);
    }
    public static short __exponent$get(MemorySegment seg, long index) {
        return (short)_libc_fpxreg.__exponent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __exponent$set(MemorySegment seg, long index, short x) {
        _libc_fpxreg.__exponent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __glibc_reserved1$slice(MemorySegment seg) {
        return seg.asSlice(10, 6);
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


