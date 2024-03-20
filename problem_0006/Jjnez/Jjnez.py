def firstCharacterUnique(string:str) -> str:

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

    dicc = {}
    # Count occurrences of each character in the input string
    for char in string:
        if char in dicc:
            dicc[char] += 1
        else:
            dicc[char] = 1
    # Find the first character with a single occurrence
    for i in dicc:
        if(dicc[i] == 1):
            return i
    return "_"

string = "aacssdcdds"
print(firstCharacterUnique(string))
