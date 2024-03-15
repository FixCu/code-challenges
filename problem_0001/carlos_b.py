# Carlos B 

def msuma(lista):
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
    
    if len(lista) == 0:
        return 0
    if len(lista) == 1:
        return lista[0]
    
    mayor = lista[0] + lista[1] 
    for i in range(1,len(lista)-1): 
        suma = lista[i] + lista[i+1] 
        mayor = max(mayor, suma)
    return mayor