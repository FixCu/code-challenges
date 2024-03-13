def duplicated(list):
    """
    >>> duplicated([6, 3 , 7, 2, 7, 3, 9, 10, 1, 2, 4])
    7
    >>> duplicated([])
    -1
    >>> duplicated([6, 3 , 7, 2, 3, 9, 10, 1, 2, 4, 10, 10])
    3
    >>> duplicated([10, 1 , 7, 2, 5, 3, 9, 6, 8, 4, 10])
    10
    >>> duplicated([10, 10 , 7, 2, 7, 3, 9, 10, 1, 2, 4])
    10
    >>> duplicated([1])
    -1
    >>> duplicated([1, 1])
    1
    """

    if len(list) == 0 or len(list) == 1:
        return -1

    mark = [False] * len(list)
    for i in range(len(list)):
        if mark[list[i] - 1]:
            return list[i]
        mark[list[i] - 1] = True

    return -1
