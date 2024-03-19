def firstCharacterNoRepeat(string: str) -> str:
    """_summary_
        Find the first character with cero ocurrenci
    Args:
        string (str): string letters lowercase

    Returns:
        str: The first character with cero ocurrenci
        
    Test:
    >>> firstCharacterNoRepeat("abacabad")
    "c"
    >>> firstCharacterNoRepeat("ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof")
    "g"
    >>> firstCharacterNoRepeat("abacabaabacaba")
    "_"
    """
    # created an array to cant for same position than insert letters 
    cant: list = []
    letter: list = []
    
    # each letter if find sum 1 in position at cant if not find add letter en letter y add with one in cant
    for char in string:

        try:
            # this is max O(25)
            pos = letter.index(char)
        except:
            pos = -1

        if pos == -1:
            # all append is O(1)
            cant.append(1)
            letter.append(char)
        else:
            cant[pos] += 1
    
    # search the first letter with 1 repeat
    try:
        # this is max O(25)
        posf = cant.index(1)
        return letter[posf]
    except:
        return "_"