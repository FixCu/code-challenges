def ispalindrome(numero):
    """
    >>> ispalindrome(121)
    True
    >>> ispalindrome(321)
    False
    >>> ispalindrome(32123)
    True
    """
    return str(numero) == str(numero)[::-1]