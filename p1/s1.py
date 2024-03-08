# Carlos B
import math 
 

def msuma(lista): 
    mayor = -math.inf 
    for i in range(len(lista)-1): 
        res = lista[i] + lista[i+1] 
        if mayor < res: 
            mayor = res  
    return mayor 

assert msuma([6, 3 , 7, 2, 7, 3, 9, 10, 1, 2, 4]) == 193

print('great!!!')