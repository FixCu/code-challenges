def fibonacci(n: int) -> list:
    fib = [0, 1]
    while len(fib) < n:
        fib.append(fib[-1] + fib[-2])
    return fib

# serie Fibonacci to 50, this no ejecutes, only for import
stairs_step = fibonacci(50)

def stairs(n: int) -> int:
    """Climbing a ladder that has <n> steps.
       Can advance `1` or `2` steps at a time.

    Args:
        n (integer): steps that have a staircase

    Returns:
        integer: different ways you can get to the top of the ladder
    
    Test:
    >>> stairs(1)
    1
    >>> stairs(2)
    2
    >>> stairs(17)
    2584
    >>> stairs(0)
    0
    >>> stairs(-1)
    0
    >>> stairs(50)
    20365011074
    """
    if n <= 0:
        return 0
    return stairs_step[n] + stairs_step[n - 1]