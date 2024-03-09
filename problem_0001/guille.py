def msuma(list):
    """
    >>> msuma([6, 3 , 7, 2, 7, 3, 9, 10, 1, 2, 4])
    19
    >>> msuma([])
    0
    >>> msuma([6, 3 , 7, 2, 7, 3, 9, 10, 1, 2, 4, 10, 10])
    20
    >>> msuma([10, 10 , 7, 2, 7, 3, 9, 10, 1, 2, 4])
    20
    >>> msuma([10])
    10
    >>> msuma([10, 10])
    20
    """

    if len(list) == 0:
        return 0
    if len(list) == 1:
        return list[0]

    result = list[0] + list[1]
    for i in range(len(list) - 1):
        result = max(list[i] + list[i + 1], result)

    return result
