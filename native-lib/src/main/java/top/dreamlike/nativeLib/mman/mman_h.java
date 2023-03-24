// Generated by jextract

package top.dreamlike.nativeLib.mman;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;

public class mman_h {

    public static OfByte C_CHAR = Constants$root.C_CHAR$LAYOUT;
    public static OfShort C_SHORT = Constants$root.C_SHORT$LAYOUT;
    public static OfInt C_INT = Constants$root.C_INT$LAYOUT;
    public static OfLong C_LONG = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong C_LONG_LONG = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfFloat C_FLOAT = Constants$root.C_FLOAT$LAYOUT;
    public static OfDouble C_DOUBLE = Constants$root.C_DOUBLE$LAYOUT;
    public static OfAddress C_POINTER = Constants$root.C_POINTER$LAYOUT;
    public static OfShort __int16_t = Constants$root.C_SHORT$LAYOUT;
    public static OfInt __int32_t = Constants$root.C_INT$LAYOUT;
    public static OfLong __int64_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfShort __int_least16_t = Constants$root.C_SHORT$LAYOUT;
    public static OfInt __int_least32_t = Constants$root.C_INT$LAYOUT;
    public static OfLong __int_least64_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __quad_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __intmax_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __off_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __off64_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfInt __pid_t = Constants$root.C_INT$LAYOUT;
    public static OfLong __clock_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __time_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __suseconds_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfInt __daddr_t = Constants$root.C_INT$LAYOUT;
    public static OfInt __key_t = Constants$root.C_INT$LAYOUT;
    public static OfInt __clockid_t = Constants$root.C_INT$LAYOUT;
    public static OfAddress __timer_t = Constants$root.C_POINTER$LAYOUT;
    public static OfLong __blksize_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __blkcnt_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __blkcnt64_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __fsword_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __ssize_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __syscall_slong_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __loff_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfAddress __caddr_t = Constants$root.C_POINTER$LAYOUT;
    public static OfLong __intptr_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfInt __sig_atomic_t = Constants$root.C_INT$LAYOUT;
    public static OfLong off_t = Constants$root.C_LONG_LONG$LAYOUT;

    /* package-private */ mman_h() {
    }

    public static int _SYS_MMAN_H() {
        return (int) 1L;
    }

    public static int _FEATURES_H() {
        return (int) 1L;
    }

    public static int _DEFAULT_SOURCE() {
        return (int) 1L;
    }

    public static int __GLIBC_USE_ISOC2X() {
        return (int) 0L;
    }

    public static int __USE_ISOC11() {
        return (int) 1L;
    }

    public static int __USE_ISOC99() {
        return (int) 1L;
    }

    public static int __USE_ISOC95() {
        return (int) 1L;
    }

    public static int __USE_POSIX_IMPLICITLY() {
        return (int) 1L;
    }

    public static int _POSIX_SOURCE() {
        return (int) 1L;
    }

    public static int __USE_POSIX() {
        return (int) 1L;
    }

    public static int __USE_POSIX2() {
        return (int) 1L;
    }

    public static int __USE_POSIX199309() {
        return (int) 1L;
    }

    public static int __USE_POSIX199506() {
        return (int) 1L;
    }

    public static int __USE_XOPEN2K() {
        return (int) 1L;
    }

    public static int __USE_XOPEN2K8() {
        return (int) 1L;
    }

    public static int _ATFILE_SOURCE() {
        return (int) 1L;
    }

    public static int __USE_MISC() {
        return (int) 1L;
    }

    public static int __USE_ATFILE() {
        return (int) 1L;
    }

    public static int __USE_FORTIFY_LEVEL() {
        return (int) 0L;
    }

    public static int __GLIBC_USE_DEPRECATED_GETS() {
        return (int) 0L;
    }

    public static int __GLIBC_USE_DEPRECATED_SCANF() {
        return (int) 0L;
    }

    public static int _STDC_PREDEF_H() {
        return (int) 1L;
    }

    public static int __STDC_IEC_559__() {
        return (int) 1L;
    }

    public static int __STDC_IEC_559_COMPLEX__() {
        return (int) 1L;
    }

    public static int __GNU_LIBRARY__() {
        return (int) 6L;
    }

    public static int __GLIBC__() {
        return (int) 2L;
    }

    public static int __GLIBC_MINOR__() {
        return (int) 31L;
    }

    public static int _SYS_CDEFS_H() {
        return (int) 1L;
    }

    public static int __glibc_c99_flexarr_available() {
        return (int) 1L;
    }

    public static int __WORDSIZE() {
        return (int) 64L;
    }

    public static int __WORDSIZE_TIME64_COMPAT32() {
        return (int) 1L;
    }

    public static int __SYSCALL_WORDSIZE() {
        return (int) 64L;
    }

    public static int __LONG_DOUBLE_USES_FLOAT128() {
        return (int) 0L;
    }

    public static int __HAVE_GENERIC_SELECTION() {
        return (int) 1L;
    }

    public static int _BITS_TYPES_H() {
        return (int) 1L;
    }

    public static int _BITS_TYPESIZES_H() {
        return (int) 1L;
    }

    public static int __OFF_T_MATCHES_OFF64_T() {
        return (int) 1L;
    }

    public static int __INO_T_MATCHES_INO64_T() {
        return (int) 1L;
    }

    public static int __RLIM_T_MATCHES_RLIM64_T() {
        return (int) 1L;
    }

    public static int __STATFS_MATCHES_STATFS64() {
        return (int) 1L;
    }

    public static int __FD_SETSIZE() {
        return (int) 1024L;
    }

    public static int _BITS_TIME64_H() {
        return (int) 1L;
    }

    public static int MAP_32BIT() {
        return (int) 64L;
    }

    public static int MAP_GROWSDOWN() {
        return (int) 256L;
    }

    public static int MAP_DENYWRITE() {
        return (int) 2048L;
    }

    public static int MAP_EXECUTABLE() {
        return (int) 4096L;
    }

    public static int MAP_LOCKED() {
        return (int) 8192L;
    }

    public static int MAP_NORESERVE() {
        return (int) 16384L;
    }

    public static int MAP_POPULATE() {
        return (int) 32768L;
    }

    public static int MAP_NONBLOCK() {
        return (int) 65536L;
    }

    public static int MAP_STACK() {
        return (int) 131072L;
    }

    public static int MAP_HUGETLB() {
        return (int) 262144L;
    }

    public static int MAP_SYNC() {
        return (int) 524288L;
    }

    public static int MAP_FIXED_NOREPLACE() {
        return (int) 1048576L;
    }

    public static int PROT_READ() {
        return (int) 1L;
    }

    public static int PROT_WRITE() {
        return (int) 2L;
    }

    public static int PROT_EXEC() {
        return (int) 4L;
    }

    public static int PROT_NONE() {
        return (int) 0L;
    }

    public static int PROT_GROWSDOWN() {
        return (int) 16777216L;
    }

    public static int PROT_GROWSUP() {
        return (int) 33554432L;
    }

    public static int MAP_SHARED() {
        return (int) 1L;
    }

    public static int MAP_PRIVATE() {
        return (int) 2L;
    }

    public static int MAP_SHARED_VALIDATE() {
        return (int) 3L;
    }

    public static int MAP_TYPE() {
        return (int) 15L;
    }

    public static int MAP_FIXED() {
        return (int) 16L;
    }

    public static int MAP_FILE() {
        return (int) 0L;
    }

    public static int MAP_ANONYMOUS() {
        return (int) 32L;
    }

    public static int MAP_HUGE_SHIFT() {
        return (int) 26L;
    }

    public static int MAP_HUGE_MASK() {
        return (int) 63L;
    }

    public static int MS_ASYNC() {
        return (int) 1L;
    }

    public static int MS_SYNC() {
        return (int) 4L;
    }

    public static int MS_INVALIDATE() {
        return (int) 2L;
    }

    public static int MADV_NORMAL() {
        return (int) 0L;
    }

    public static int MADV_RANDOM() {
        return (int) 1L;
    }

    public static int MADV_SEQUENTIAL() {
        return (int) 2L;
    }

    public static int MADV_WILLNEED() {
        return (int) 3L;
    }

    public static int MADV_DONTNEED() {
        return (int) 4L;
    }

    public static int MADV_FREE() {
        return (int) 8L;
    }

    public static int MADV_REMOVE() {
        return (int) 9L;
    }

    public static int MADV_DONTFORK() {
        return (int) 10L;
    }

    public static int MADV_DOFORK() {
        return (int) 11L;
    }

    public static int MADV_MERGEABLE() {
        return (int) 12L;
    }

    public static int MADV_UNMERGEABLE() {
        return (int) 13L;
    }

    public static int MADV_HUGEPAGE() {
        return (int) 14L;
    }

    public static int MADV_NOHUGEPAGE() {
        return (int) 15L;
    }

    public static int MADV_DONTDUMP() {
        return (int) 16L;
    }

    public static int MADV_DODUMP() {
        return (int) 17L;
    }

    public static int MADV_WIPEONFORK() {
        return (int) 18L;
    }

    public static int MADV_KEEPONFORK() {
        return (int) 19L;
    }

    public static int MADV_COLD() {
        return (int) 20L;
    }

    public static int MADV_PAGEOUT() {
        return (int) 21L;
    }

    public static int MADV_HWPOISON() {
        return (int) 100L;
    }

    public static int POSIX_MADV_NORMAL() {
        return (int) 0L;
    }

    public static int POSIX_MADV_RANDOM() {
        return (int) 1L;
    }

    public static int POSIX_MADV_SEQUENTIAL() {
        return (int) 2L;
    }

    public static int POSIX_MADV_WILLNEED() {
        return (int) 3L;
    }

    public static int POSIX_MADV_DONTNEED() {
        return (int) 4L;
    }

    public static int MCL_CURRENT() {
        return (int) 1L;
    }

    public static int MCL_FUTURE() {
        return (int) 2L;
    }

    public static int MCL_ONFAULT() {
        return (int) 4L;
    }

    public static MethodHandle mmap$MH() {
        return RuntimeHelper.requireNonNull(constants$0.mmap$MH, "mmap");
    }

    public static MemorySegment mmap(MemorySegment __addr, long __len, int __prot, int __flags, int __fd, long __offset) {
        var mh$ = mmap$MH();
        try {
            return (java.lang.foreign.MemorySegment) mh$.invokeExact(__addr, __len, __prot, __flags, __fd, __offset);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle munmap$MH() {
        return RuntimeHelper.requireNonNull(constants$0.munmap$MH, "munmap");
    }

    public static int munmap(MemorySegment __addr, long __len) {
        var mh$ = munmap$MH();
        try {
            return (int) mh$.invokeExact(__addr, __len);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle mprotect$MH() {
        return RuntimeHelper.requireNonNull(constants$0.mprotect$MH, "mprotect");
    }

    public static int mprotect(MemorySegment __addr, long __len, int __prot) {
        var mh$ = mprotect$MH();
        try {
            return (int) mh$.invokeExact(__addr, __len, __prot);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle msync$MH() {
        return RuntimeHelper.requireNonNull(constants$0.msync$MH, "msync");
    }

    public static int msync(MemorySegment __addr, long __len, int __flags) {
        var mh$ = msync$MH();
        try {
            return (int) mh$.invokeExact(__addr, __len, __flags);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle madvise$MH() {
        return RuntimeHelper.requireNonNull(constants$0.madvise$MH, "madvise");
    }

    public static int madvise(MemorySegment __addr, long __len, int __advice) {
        var mh$ = madvise$MH();
        try {
            return (int) mh$.invokeExact(__addr, __len, __advice);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle posix_madvise$MH() {
        return RuntimeHelper.requireNonNull(constants$0.posix_madvise$MH, "posix_madvise");
    }

    public static int posix_madvise(MemorySegment __addr, long __len, int __advice) {
        var mh$ = posix_madvise$MH();
        try {
            return (int) mh$.invokeExact(__addr, __len, __advice);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle mlock$MH() {
        return RuntimeHelper.requireNonNull(constants$1.mlock$MH, "mlock");
    }

    public static int mlock(MemorySegment __addr, long __len) {
        var mh$ = mlock$MH();
        try {
            return (int) mh$.invokeExact(__addr, __len);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle munlock$MH() {
        return RuntimeHelper.requireNonNull(constants$1.munlock$MH, "munlock");
    }

    public static int munlock(MemorySegment __addr, long __len) {
        var mh$ = munlock$MH();
        try {
            return (int) mh$.invokeExact(__addr, __len);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle mlockall$MH() {
        return RuntimeHelper.requireNonNull(constants$1.mlockall$MH, "mlockall");
    }

    public static int mlockall(int __flags) {
        var mh$ = mlockall$MH();
        try {
            return (int) mh$.invokeExact(__flags);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle munlockall$MH() {
        return RuntimeHelper.requireNonNull(constants$1.munlockall$MH, "munlockall");
    }

    public static int munlockall() {
        var mh$ = munlockall$MH();
        try {
            return (int) mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle mincore$MH() {
        return RuntimeHelper.requireNonNull(constants$1.mincore$MH, "mincore");
    }

    public static int mincore(MemorySegment __start, long __len, MemorySegment __vec) {
        var mh$ = mincore$MH();
        try {
            return (int) mh$.invokeExact(__start, __len, __vec);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle shm_open$MH() {
        return RuntimeHelper.requireNonNull(constants$1.shm_open$MH, "shm_open");
    }

    public static int shm_open(MemorySegment __name, int __oflag, int __mode) {
        var mh$ = shm_open$MH();
        try {
            return (int) mh$.invokeExact(__name, __oflag, __mode);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle shm_unlink$MH() {
        return RuntimeHelper.requireNonNull(constants$2.shm_unlink$MH, "shm_unlink");
    }

    public static int shm_unlink(MemorySegment __name) {
        var mh$ = shm_unlink$MH();
        try {
            return (int) mh$.invokeExact(__name);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static long _POSIX_C_SOURCE() {
        return 200809L;
    }

    public static long __STDC_ISO_10646__() {
        return 201706L;
    }

    public static int __TIMESIZE() {
        return (int) 64L;
    }

    public static int MAP_ANON() {
        return (int) 32L;
    }

    public static MemorySegment MAP_FAILED() {
        return constants$2.MAP_FAILED$ADDR;
    }
}


