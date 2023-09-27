package top.dreamlike.nativeLib.syscall;


public class SyscallNo {

    public static final int SYS_read = 0;
    public static final int SYS_write = 1;
    public static final int SYS_open = 2;
    public static final int SYS_close = 3;
    public static final int SYS_stat = 4;
    public static final int SYS_fstat = 5;
    public static final int SYS_lstat = 6;
    public static final int SYS_poll = 7;
    public static final int SYS_lseek = 8;
    public static final int SYS_mmap = 9;
    public static final int SYS_mprotect = 10;
    public static final int SYS_munmap = 11;
    public static final int SYS_brk = 12;
    public static final int SYS_rt_sigaction = 13;
    public static final int SYS_rt_sigprocmask = 14;
    public static final int SYS_rt_sigreturn = 15;
    public static final int SYS_ioctl = 16;
    public static final int SYS_pread64 = 17;
    public static final int SYS_pwrite64 = 18;
    public static final int SYS_readv = 19;
    public static final int SYS_writev = 20;
    public static final int SYS_access = 21;
    public static final int SYS_pipe = 22;
    public static final int SYS_select = 23;
    public static final int SYS_sched_yield = 24;
    public static final int SYS_mremap = 25;
    public static final int SYS_msync = 26;
    public static final int SYS_mincore = 27;
    public static final int SYS_madvise = 28;
    public static final int SYS_shmget = 29;
    public static final int SYS_shmat = 30;
    public static final int SYS_shmctl = 31;
    public static final int SYS_dup = 32;
    public static final int SYS_dup2 = 33;
    public static final int SYS_pause = 34;
    public static final int SYS_nanosleep = 35;
    public static final int SYS_getitimer = 36;
    public static final int SYS_alarm = 37;
    public static final int SYS_setitimer = 38;
    public static final int SYS_getpid = 39;
    public static final int SYS_sendfile = 40;
    public static final int SYS_socket = 41;
    public static final int SYS_connect = 42;
    public static final int SYS_accept = 43;
    public static final int SYS_sendto = 44;
    public static final int SYS_recvfrom = 45;
    public static final int SYS_sendmsg = 46;
    public static final int SYS_recvmsg = 47;
    public static final int SYS_shutdown = 48;
    public static final int SYS_bind = 49;
    public static final int SYS_listen = 50;
    public static final int SYS_getsockname = 51;
    public static final int SYS_getpeername = 52;
    public static final int SYS_socketpair = 53;
    public static final int SYS_setsockopt = 54;
    public static final int SYS_getsockopt = 55;
    public static final int SYS_clone = 56;
    public static final int SYS_fork = 57;
    public static final int SYS_vfork = 58;
    public static final int SYS_execve = 59;
    public static final int SYS_exit = 60;
    public static final int SYS_wait4 = 61;
    public static final int SYS_kill = 62;
    public static final int SYS_uname = 63;
    public static final int SYS_semget = 64;
    public static final int SYS_semop = 65;
    public static final int SYS_semctl = 66;
    public static final int SYS_shmdt = 67;
    public static final int SYS_msgget = 68;
    public static final int SYS_msgsnd = 69;
    public static final int SYS_msgrcv = 70;
    public static final int SYS_msgctl = 71;
    public static final int SYS_fcntl = 72;
    public static final int SYS_flock = 73;
    public static final int SYS_fsync = 74;
    public static final int SYS_fdatasync = 75;
    public static final int SYS_truncate = 76;
    public static final int SYS_ftruncate = 77;
    public static final int SYS_getdents = 78;
    public static final int SYS_getcwd = 79;
    public static final int SYS_chdir = 80;
    public static final int SYS_fchdir = 81;
    public static final int SYS_rename = 82;
    public static final int SYS_mkdir = 83;
    public static final int SYS_rmdir = 84;
    public static final int SYS_creat = 85;
    public static final int SYS_link = 86;
    public static final int SYS_unlink = 87;
    public static final int SYS_symlink = 88;
    public static final int SYS_readlink = 89;
    public static final int SYS_chmod = 90;
    public static final int SYS_fchmod = 91;
    public static final int SYS_chown = 92;
    public static final int SYS_fchown = 93;
    public static final int SYS_lchown = 94;
    public static final int SYS_umask = 95;
    public static final int SYS_gettimeofday = 96;
    public static final int SYS_getrlimit = 97;
    public static final int SYS_getrusage = 98;
    public static final int SYS_sysinfo = 99;
    public static final int SYS_times = 100;
    public static final int SYS_ptrace = 101;
    public static final int SYS_getuid = 102;
    public static final int SYS_syslog = 103;
    public static final int SYS_getgid = 104;
    public static final int SYS_setuid = 105;
    public static final int SYS_setgid = 106;
    public static final int SYS_geteuid = 107;
    public static final int SYS_getegid = 108;
    public static final int SYS_setpgid = 109;
    public static final int SYS_getppid = 110;
    public static final int SYS_getpgrp = 111;
    public static final int SYS_setsid = 112;
    public static final int SYS_setreuid = 113;
    public static final int SYS_setregid = 114;
    public static final int SYS_getgroups = 115;
    public static final int SYS_setgroups = 116;
    public static final int SYS_setresuid = 117;
    public static final int SYS_getresuid = 118;
    public static final int SYS_setresgid = 119;
    public static final int SYS_getresgid = 120;
    public static final int SYS_getpgid = 121;
    public static final int SYS_setfsuid = 122;
    public static final int SYS_setfsgid = 123;
    public static final int SYS_getsid = 124;
    public static final int SYS_capget = 125;
    public static final int SYS_capset = 126;
    public static final int SYS_rt_sigpending = 127;
    public static final int SYS_rt_sigtimedwait = 128;
    public static final int SYS_rt_sigqueueinfo = 129;
    public static final int SYS_rt_sigsuspend = 130;
    public static final int SYS_sigaltstack = 131;
    public static final int SYS_utime = 132;
    public static final int SYS_mknod = 133;
    public static final int SYS_uselib = 134;
    public static final int SYS_personality = 135;
    public static final int SYS_ustat = 136;
    public static final int SYS_statfs = 137;
    public static final int SYS_fstatfs = 138;
    public static final int SYS_sysfs = 139;
    public static final int SYS_getpriority = 140;
    public static final int SYS_setpriority = 141;
    public static final int SYS_sched_setparam = 142;
    public static final int SYS_sched_getparam = 143;
    public static final int SYS_sched_setscheduler = 144;
    public static final int SYS_sched_getscheduler = 145;
    public static final int SYS_sched_get_priority_max = 146;
    public static final int SYS_sched_get_priority_min = 147;
    public static final int SYS_sched_rr_get_interval = 148;
    public static final int SYS_mlock = 149;
    public static final int SYS_munlock = 150;
    public static final int SYS_mlockall = 151;
    public static final int SYS_munlockall = 152;
    public static final int SYS_vhangup = 153;
    public static final int SYS_modify_ldt = 154;
    public static final int SYS_pivot_root = 155;
    public static final int SYS__sysctl = 156;
    public static final int SYS_prctl = 157;
    public static final int SYS_arch_prctl = 158;
    public static final int SYS_adjtimex = 159;
    public static final int SYS_setrlimit = 160;
    public static final int SYS_chroot = 161;
    public static final int SYS_sync = 162;
    public static final int SYS_acct = 163;
    public static final int SYS_settimeofday = 164;
    public static final int SYS_mount = 165;
    public static final int SYS_umount2 = 166;
    public static final int SYS_swapon = 167;
    public static final int SYS_swapoff = 168;
    public static final int SYS_reboot = 169;
    public static final int SYS_sethostname = 170;
    public static final int SYS_setdomainname = 171;
    public static final int SYS_iopl = 172;
    public static final int SYS_ioperm = 173;
    public static final int SYS_create_module = 174;
    public static final int SYS_init_module = 175;
    public static final int SYS_delete_module = 176;
    public static final int SYS_get_kernel_syms = 177;
    public static final int SYS_query_module = 178;
    public static final int SYS_quotactl = 179;
    public static final int SYS_nfsservctl = 180;
    public static final int SYS_getpmsg = 181;
    public static final int SYS_putpmsg = 182;
    public static final int SYS_afs_syscall = 183;
    public static final int SYS_tuxcall = 184;
    public static final int SYS_security = 185;
    public static final int SYS_gettid = 186;
    public static final int SYS_readahead = 187;
    public static final int SYS_setxattr = 188;
    public static final int SYS_lsetxattr = 189;
    public static final int SYS_fsetxattr = 190;
    public static final int SYS_getxattr = 191;
    public static final int SYS_lgetxattr = 192;
    public static final int SYS_fgetxattr = 193;
    public static final int SYS_listxattr = 194;
    public static final int SYS_llistxattr = 195;
    public static final int SYS_flistxattr = 196;
    public static final int SYS_removexattr = 197;
    public static final int SYS_lremovexattr = 198;
    public static final int SYS_fremovexattr = 199;
    public static final int SYS_tkill = 200;
    public static final int SYS_time = 201;
    public static final int SYS_futex = 202;
    public static final int SYS_sched_setaffinity = 203;
    public static final int SYS_sched_getaffinity = 204;
    public static final int SYS_set_thread_area = 205;
    public static final int SYS_io_setup = 206;
    public static final int SYS_io_destroy = 207;
    public static final int SYS_io_getevents = 208;
    public static final int SYS_io_submit = 209;
    public static final int SYS_io_cancel = 210;
    public static final int SYS_get_thread_area = 211;
    public static final int SYS_lookup_dcookie = 212;
    public static final int SYS_epoll_create = 213;
    public static final int SYS_epoll_ctl_old = 214;
    public static final int SYS_epoll_wait_old = 215;
    public static final int SYS_remap_file_pages = 216;
    public static final int SYS_getdents64 = 217;
    public static final int SYS_set_tid_address = 218;
    public static final int SYS_restart_syscall = 219;
    public static final int SYS_semtimedop = 220;
    public static final int SYS_fadvise64 = 221;
    public static final int SYS_timer_create = 222;
    public static final int SYS_timer_settime = 223;
    public static final int SYS_timer_gettime = 224;
    public static final int SYS_timer_getoverrun = 225;
    public static final int SYS_timer_delete = 226;
    public static final int SYS_clock_settime = 227;
    public static final int SYS_clock_gettime = 228;
    public static final int SYS_clock_getres = 229;
    public static final int SYS_clock_nanosleep = 230;
    public static final int SYS_exit_group = 231;
    public static final int SYS_epoll_wait = 232;
    public static final int SYS_epoll_ctl = 233;
    public static final int SYS_tgkill = 234;
    public static final int SYS_utimes = 235;
    public static final int SYS_vserver = 236;
    public static final int SYS_mbind = 237;
    public static final int SYS_set_mempolicy = 238;
    public static final int SYS_get_mempolicy = 239;
    public static final int SYS_mq_open = 240;
    public static final int SYS_mq_unlink = 241;
    public static final int SYS_mq_timedsend = 242;
    public static final int SYS_mq_timedreceive = 243;
    public static final int SYS_mq_notify = 244;
    public static final int SYS_mq_getsetattr = 245;
    public static final int SYS_kexec_load = 246;
    public static final int SYS_waitid = 247;
    public static final int SYS_add_key = 248;
    public static final int SYS_request_key = 249;
    public static final int SYS_keyctl = 250;
    public static final int SYS_ioprio_set = 251;
    public static final int SYS_ioprio_get = 252;
    public static final int SYS_inotify_init = 253;
    public static final int SYS_inotify_add_watch = 254;
    public static final int SYS_inotify_rm_watch = 255;
    public static final int SYS_migrate_pages = 256;
    public static final int SYS_openat = 257;
    public static final int SYS_mkdirat = 258;
    public static final int SYS_mknodat = 259;
    public static final int SYS_fchownat = 260;
    public static final int SYS_futimesat = 261;
    public static final int SYS_newfstatat = 262;
    public static final int SYS_unlinkat = 263;
    public static final int SYS_renameat = 264;
    public static final int SYS_linkat = 265;
    public static final int SYS_symlinkat = 266;
    public static final int SYS_readlinkat = 267;
    public static final int SYS_fchmodat = 268;
    public static final int SYS_faccessat = 269;
    public static final int SYS_pselect6 = 270;
    public static final int SYS_ppoll = 271;
    public static final int SYS_unshare = 272;
    public static final int SYS_set_robust_list = 273;
    public static final int SYS_get_robust_list = 274;
    public static final int SYS_splice = 275;
    public static final int SYS_tee = 276;
    public static final int SYS_sync_file_range = 277;
    public static final int SYS_vmsplice = 278;
    public static final int SYS_move_pages = 279;
    public static final int SYS_utimensat = 280;
    public static final int SYS_epoll_pwait = 281;
    public static final int SYS_signalfd = 282;
    public static final int SYS_timerfd_create = 283;
    public static final int SYS_eventfd = 284;
    public static final int SYS_fallocate = 285;
    public static final int SYS_timerfd_settime = 286;
    public static final int SYS_timerfd_gettime = 287;
    public static final int SYS_accept4 = 288;
    public static final int SYS_signalfd4 = 289;
    public static final int SYS_eventfd2 = 290;
    public static final int SYS_epoll_create1 = 291;
    public static final int SYS_dup3 = 292;
    public static final int SYS_pipe2 = 293;
    public static final int SYS_inotify_init1 = 294;
    public static final int SYS_preadv = 295;
    public static final int SYS_pwritev = 296;
    public static final int SYS_rt_tgsigqueueinfo = 297;
    public static final int SYS_perf_event_open = 298;
    public static final int SYS_recvmmsg = 299;
    public static final int SYS_fanotify_init = 300;
    public static final int SYS_fanotify_mark = 301;
    public static final int SYS_prlimit64 = 302;
    public static final int SYS_name_to_handle_at = 303;
    public static final int SYS_open_by_handle_at = 304;
    public static final int SYS_clock_adjtime = 305;
    public static final int SYS_syncfs = 306;
    public static final int SYS_sendmmsg = 307;
    public static final int SYS_setns = 308;
    public static final int SYS_getcpu = 309;
    public static final int SYS_process_vm_readv = 310;
    public static final int SYS_process_vm_writev = 311;
    public static final int SYS_kcmp = 312;
    public static final int SYS_finit_module = 313;
    public static final int SYS_sched_setattr = 314;
    public static final int SYS_sched_getattr = 315;
    public static final int SYS_renameat2 = 316;
    public static final int SYS_seccomp = 317;
    public static final int SYS_getrandom = 318;
    public static final int SYS_memfd_create = 319;
    public static final int SYS_kexec_file_load = 320;
    public static final int SYS_bpf = 321;
    public static final int SYS_execveat = 322;
    public static final int SYS_userfaultfd = 323;
    public static final int SYS_membarrier = 324;
    public static final int SYS_mlock2 = 325;
    public static final int SYS_copy_file_range = 326;
    public static final int SYS_preadv2 = 327;
    public static final int SYS_pwritev2 = 328;
    public static final int SYS_pkey_mprotect = 329;
    public static final int SYS_pkey_alloc = 330;
    public static final int SYS_pkey_free = 331;
    public static final int SYS_statx = 332;
    public static final int SYS_io_pgetevents = 333;
    public static final int SYS_rseq = 334;
    public static final int SYS_pidfd_send_signal = 424;
    public static final int SYS_io_uring_setup = 425;
    public static final int SYS_io_uring_enter = 426;
    public static final int SYS_io_uring_register = 427;
    public static final int SYS_open_tree = 428;
    public static final int SYS_move_mount = 429;
    public static final int SYS_fsopen = 430;
    public static final int SYS_fsconfig = 431;
    public static final int SYS_fsmount = 432;
    public static final int SYS_fspick = 433;
    public static final int SYS_pidfd_open = 434;
    public static final int SYS_clone3 = 435;
    public static final int SYS_close_range = 436;
    public static final int SYS_openat2 = 437;
    public static final int SYS_pidfd_getfd = 438;
    public static final int SYS_faccessat2 = 439;
    public static final int SYS_process_madvise = 440;
    public static final int SYS_epoll_pwait2 = 441;
    public static final int SYS_mount_setattr = 442;
    public static final int SYS_quotactl_fd = 443;
    public static final int SYS_landlock_create_ruleset = 444;
    public static final int SYS_landlock_add_rule = 445;
    public static final int SYS_landlock_restrict_self = 446;
    public static final int SYS_memfd_secret = 447;
    public static final int SYS_process_mrelease = 448;
    public static final int SYS_futex_waitv = 449;
    public static final int SYS_set_mempolicy_home_node = 450;


}
