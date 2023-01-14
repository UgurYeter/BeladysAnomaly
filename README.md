# Example of Belady's Anomaly

[Bélády's Anomaly](https://en.wikipedia.org/wiki/B%C3%A9l%C3%A1dy%27s_anomaly) is the phenomenon in which increasing the number of page frames results in an increase in the number of page faults for certain memory access patterns. This phenomenon is commonly experienced when using the first-in first-out (FIFO) page replacement algorithm. 

## Input Sequence

```
1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5
```

## For Cache Size _3_ 

The cache miss count (X) is **9**
```
------------------------------------------------------------------------------------------------------------
| 1 | X || 2 | X || 3 | X || 4 | X || 1 | X || 2 | X || 5 | X || 1 | ✓ || 2 | ✓ || 3 | X || 4 | X || 5 | ✓ |
------------------------------------------------------------------------------------------------------------
```
## For Cache Size _4_
The cache miss count (X) is **10**
```
------------------------------------------------------------------------------------------------------------
| 1 | X || 2 | X || 3 | X || 4 | X || 1 | ✓ || 2 | ✓ || 5 | X || 1 | X || 2 | X || 3 | X || 4 | X || 5 | X |
------------------------------------------------------------------------------------------------------------
```
