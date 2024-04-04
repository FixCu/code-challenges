def amountSI(n) -> int:
    """Climbing a ladder that has <n> steps.
       Can advance `1` or `2` steps at a time.

    Args:
        n (integer): steps that have a staircase

    Returns:
        integer: different ways you can get to the top of the ladder
    
    Test:
    >>> amountSI(1)
    1
    >>> amountSI(2)
    2
    >>> amountSI(17)
    2584
    >>> amountSI(0)
    0
    >>> amountSI(-1)
    0
    >>> amountSI(50)
    20365011074
    """

    if n <= 0:
        return 0
    if n == 1:
        return 1
    if n == 2:
        return 2
    else:
        return (amountSI(n-1) + amountSI(n-2))

print(amountSI(4))


