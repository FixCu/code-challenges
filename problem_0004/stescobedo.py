# This is the implemntation using a set data structure
def firstDuplicate(numbers: list) -> int:
    """
    Finds the first duplicate element in the given list.

    >>> firstDuplicate([1, 2, 3, 4])
    -1
    >>> firstDuplicate([])
    -1
    >>> firstDuplicate([6, 3, 7, 2, 7, 3, 9, 10, 1, 2, 4])
    7
    """
    seen = set()
    
    for num in numbers:
        if num in seen:
            return num
        seen.add(num)
    
    return -1