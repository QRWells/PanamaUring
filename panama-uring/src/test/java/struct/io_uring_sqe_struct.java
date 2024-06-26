package struct;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.*;
// Generated by jextract
public class io_uring_sqe_struct {
    public static StructLayout layout = MemoryLayout.structLayout(
            JAVA_BYTE.withName("opcode"),
            JAVA_BYTE.withName("flags"),
            JAVA_SHORT.withName("ioprio"),
            JAVA_INT.withName("fd"),
            MemoryLayout.unionLayout(
                    JAVA_LONG.withName("off"),
                    JAVA_LONG.withName("addr2"),
                    MemoryLayout.structLayout(
                            JAVA_INT.withName("cmd_op"),
                            JAVA_INT.withName("__pad1")
                    ).withName("cmdOp")
            ).withName("offsetUnion"),
            MemoryLayout.unionLayout(
                    JAVA_LONG.withName("addr"),
                    JAVA_LONG.withName("splice_off_in"),
                    MemoryLayout.structLayout(
                            JAVA_INT.withName("level"),
                            JAVA_INT.withName("optname")
                    ).withName("level")
            ).withName("bufferUnion"),
            JAVA_INT.withName("len"),
            MemoryLayout.unionLayout(
                    JAVA_INT.withName("rw_flags"),
                    JAVA_INT.withName("fsync_flags"),
                    JAVA_SHORT.withName("poll_events"),
                    JAVA_INT.withName("poll32_events"),
                    JAVA_INT.withName("sync_range_flags"),
                    JAVA_INT.withName("msg_flags"),
                    JAVA_INT.withName("timeout_flags"),
                    JAVA_INT.withName("accept_flags"),
                    JAVA_INT.withName("cancel_flags"),
                    JAVA_INT.withName("open_flags"),
                    JAVA_INT.withName("statx_flags"),
                    JAVA_INT.withName("fadvise_advice"),
                    JAVA_INT.withName("splice_flags"),
                    JAVA_INT.withName("rename_flags"),
                    JAVA_INT.withName("unlink_flags"),
                    JAVA_INT.withName("hardlink_flags"),
                    JAVA_INT.withName("xattr_flags"),
                    JAVA_INT.withName("msg_ring_flags"),
                    JAVA_INT.withName("uring_cmd_flags"),
                    JAVA_INT.withName("waitid_flags"),
                    JAVA_INT.withName("futex_flags"),
                    JAVA_INT.withName("install_fd_flags")
            ).withName("flagsUnion"),
            JAVA_LONG.withName("user_data"),
            MemoryLayout.unionLayout(
                    JAVA_SHORT.withByteAlignment(1).withName("buf_index"),
                    JAVA_SHORT.withByteAlignment(1).withName("buf_group")
            ).withName("fixeBuffer"),
            JAVA_SHORT.withName("personality"),
            MemoryLayout.unionLayout(
                    JAVA_INT.withName("splice_fd_in"),
                    JAVA_INT.withName("file_index"),
                    JAVA_INT.withName("optlen"),
                    MemoryLayout.structLayout(
                            JAVA_SHORT.withName("addr_len"),
                            MemoryLayout.sequenceLayout(1, JAVA_SHORT).withName("__pad3")
                    ).withName("len")
            ).withName("spliceUnion"),
            MemoryLayout.unionLayout(
                    MemoryLayout.structLayout(
                            JAVA_LONG.withName("addr3"),
                            MemoryLayout.sequenceLayout(1, JAVA_LONG).withName("__pad2")
                    ).withName("addr3"),
                    JAVA_LONG.withName("optval"),
                    MemoryLayout.sequenceLayout(0, JAVA_BYTE).withName("cmd")
            ).withName("addr3Union")
    ).withName("io_uring_sqe");
}
