// Generated by jextract

package top.dreamlike.nativeLib.inet;

import top.dreamlike.common.CType;

import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public class ip_opts {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            CType.C_INT$LAYOUT.withName("s_addr")
        ).withName("ip_dst"),
        MemoryLayout.sequenceLayout(40, CType.C_CHAR$LAYOUT).withName("ip_opts")
    ).withName("ip_opts");
    public static MemoryLayout $LAYOUT() {
        return ip_opts.$struct$LAYOUT;
    }
    public static MemorySegment ip_dst$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    public static MemorySegment ip_opts$slice(MemorySegment seg) {
        return seg.asSlice(4, 40);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }

}


