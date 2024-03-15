def firstDuplicate(listv: tuple) -> int:
    """
    >>> firstDuplicate([1, 2, 3, 4])
    -1
    >>> firstDuplicate([])
    -1
    >>> firstDuplicate([6, 3, 7, 2, 7, 3, 9, 10, 1, 2, 4])
    7
    """
   
    # i create new colect where i save the no duplicate
    collection: list = []
    
    # foreach to list arg
    for i in listv:
        # if number is in the collection of no repeats is it
        if i in collection:
            return i
        else:
            # else it add to the collection
            collection.append(i)
    
    # i say than not exist duple else no return before
    return -1