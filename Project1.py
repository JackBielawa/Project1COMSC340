import time
import random

class Algorithms:
    
    @staticmethod
    def arraySum(array):
        start = time.time()
        result = sum(array)
        print(f"Sum of {len(array)} elements, Time: {(time.time() - start) * 1000:.3f} ms")
        return result
    
    @staticmethod
    def scalarMatMult(matrix, constant):
        start = time.time()
        n = len(matrix)
        result = [[matrix[r][c] * constant for c in range(n)] for r in range(n)]
        print(f"Scalar multiplication of {n}x{n} matrix, Time: {(time.time() - start) * 1000:.3f} ms")
        return result       

    
    @staticmethod
    def matrixMult(m1, m2):
        start = time.time()
        n = len(m1)
        result = [[0 for _ in range(n)] for _ in range(n)]
        for i in range(n):
            for j in range(n):
                for k in range(n):
                    result[i][j] += m1[i][k] * m2[k][j]
        print(f"Matrix multiplication of {n}x{n}, Time: {(time.time() - start) * 1000:.3f} ms")
        return result

def generate_random_array(n):
    return [random.randint(0, 100) for _ in range(n)] # Generates random integers between 0 and 100

def generate_random_matrix(n):
    return [[random.randint(0, 100) for _ in range(n)] for _ in range(n)] # Generates random matrix with values between 0 and 100

def test_algorithms():
    # defines input sizes for testing
    input_sizes = [10, 100, 500, 1000]
    for n in input_sizes:
        array = generate_random_array(n)
        matrix1 = generate_random_matrix(n)
        matrix2 = generate_random_matrix(n)
        
        sum_result = Algorithms.arraySum(array)
        
        scalar_mult_result = Algorithms.scalarMatMult(matrix1, 2)
        
        matrix_mult_result = Algorithms.matrixMult(matrix1, matrix2)


test_algorithms()
