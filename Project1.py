import time
import random

class Algorithms:
    
    @staticmethod
    def arraySum(array):
        return sum(array)
    
    @staticmethod
    def scalarMatMult(matrix, constant):
        n = len(matrix)
        return [[matrix[r][c] * constant for c in range(n)] for r in range(n)]
    
    @staticmethod
    def matrixMult(m1, m2):
        n = len(m1)
        result = [[0 for _ in range(n)] for _ in range(n)]
        for i in range(n):
            for j in range(n):
                for k in range(n):
                    result[i][j] += m1[i][k] * m2[k][j]
        return result

def generate_random_array(n):
    return [random.randint(0, 100) for _ in range(n)]

def generate_random_matrix(n):
    return [[random.randint(0, 100) for _ in range(n)] for _ in range(n)]

def test_algorithms():
    input_sizes = [10, 100, 500, 1000]
    for n in input_sizes:
        array = generate_random_array(n)
        matrix1 = generate_random_matrix(n)
        matrix2 = generate_random_matrix(n)
        
        start = time.time()
        sum_result = Algorithms.arraySum(array)
        print(f"Sum of {n} elements: {sum_result}, Time: {(time.time() - start) * 1000:.3f} ms")
        
        start = time.time()
        scalar_mult_result = Algorithms.scalarMatMult(matrix1, 2)
        print(f"Scalar multiplication of {n}x{n} matrix, Time: {(time.time() - start) * 1000:.3f} ms")
        
        start = time.time()
        matrix_mult_result = Algorithms.matrixMult(matrix1, matrix2)
        print(f"Matrix multiplication of {n}x{n}, Time: {(time.time() - start) * 1000:.3f} ms")

if __name__ == "__main__":
    test_algorithms()
