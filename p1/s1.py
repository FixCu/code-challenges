# Carlos B
import math 
 

def msuma(lista):
    if len(lista) == 0:
        return 0
    if len(lista) == 1:
        return lista[0]
    mayor = -math.inf 
    for i in range(len(lista)-1): 
        res = lista[i] + lista[i+1] 
        if mayor < res: 
            mayor = res  
    return mayor 

assert msuma([6, 3 , 7, 2, 7, 3, 9, 10, 1, 2, 4]) == 19
assert msuma([]) == 0
assert msuma([6, 3 , 7, 2, 7, 3, 9, 10, 1, 2, 4, 10, 10]) == 20
assert msuma([10, 10 , 7, 2, 7, 3, 9, 10, 1, 2, 4]) == 20
assert msuma([10]) == 10
assert msuma([10, 10]) == 20

print('great!!!')