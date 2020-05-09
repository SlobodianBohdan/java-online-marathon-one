// Please, fix the problem with the preloaded implementation of the class MyThread. 
// Test starts both threads with the code:
//         MyThreads.t1.start();
//         MyThreads.t2.start(); 
// The goal of each thread is to update fields m and n and not switch between threads while in the loop. You need to get an output like this:
// Thread1 n = 0
// Thread1 n = 1
// Thread1 n = 2
// Thread1 n = 3
// Thread1 n = 4
// Thread2 m = 0
// Thread2 m = 1
// Thread2 m = 2
// Thread2 m = 3
// Thread2 m = 4
// Thread2 n = 5
// Thread2 n = 6
// Thread2 n = 7
// Thread2 n = 8
// Thread2 n = 9
// Thread2 success!
// Thread1 m = 5
// Thread1 m = 6
// Thread1 m = 7
// Thread1 m = 8
// Thread1 m = 9
// Thread1 success!
// Please, don't change actions that change variables or print output within run methods. Use only thread synchronization assets.


