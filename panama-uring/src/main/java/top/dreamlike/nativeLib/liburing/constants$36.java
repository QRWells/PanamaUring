// Generated by jextract

package top.dreamlike.nativeLib.liburing;

import top.dreamlike.common.CType;
import top.dreamlike.helper.RuntimeHelper;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
class constants$36 {

    static final FunctionDescriptor io_uring_wait_cqe_nr$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_wait_cqe_nr$MH = RuntimeHelper.downcallHandle(
        "io_uring_wait_cqe_nr",
        constants$36.io_uring_wait_cqe_nr$FUNC
    );
    static final FunctionDescriptor io_uring_peek_cqe$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_peek_cqe$MH = RuntimeHelper.downcallHandle(
        "io_uring_peek_cqe",
            constants$36.io_uring_peek_cqe$FUNC
    );
    static final FunctionDescriptor io_uring_wait_cqe$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
            CType.C_POINTER$LAYOUT,
            CType.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_wait_cqe$MH = RuntimeHelper.downcallHandle(
            "io_uring_wait_cqe",
            constants$36.io_uring_wait_cqe$FUNC
    );
    static final MemorySegment SIG_ERR$ADDR = MemorySegment.ofAddress(-1L);
    static final MemorySegment SIG_DFL$ADDR = MemorySegment.NULL;
    static final MemorySegment SIG_IGN$ADDR = MemorySegment.ofAddress(1L);
}


