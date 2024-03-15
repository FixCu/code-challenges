# Clear comments help you understand the code, but some comments may be redundant or unnecessary.
# For example, explanatory comments about obvious parts of the code could be omitted.

def firstDuplicate(listv: tuple) -> int:
    """
    >>> firstDuplicate([1, 2, 3, 4])
    -1
    >>> firstDuplicate([])
    -1
    >>> firstDuplicate([6, 3, 7, 2, 7, 3, 9, 10, 1, 2, 4])
    7
    """
   
    # Using an additional list (collection) to store non-duplicated numbers is not necessary. 
    # You could use a set to improve efficiency, since the search operation on a set is faster 
    # than on a list.
    collection: list = []
    
    # The listv variable name could be more descriptive, for example nums or numbers.
    for i in listv:
        # if number is in the collection of no repeats is it
        if i in collection:
            return i
        else:
            # else it add to the collection
            collection.append(i)
    
    # i say than not exist duple else no return before
    return -1