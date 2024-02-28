# Imports
import time
import random

# Class that defines all the algorithms
class Algorithms:
    
# Array Sum Algorithm
    @staticmethod
    def arraySum(array):
        basic_operations = len(array) - 1
        return sum(array), basic_operations
    
# Scalar multiplier Algorithm
    @staticmethod
    def scalarMatMult(matrix, constant):
        n = len(matrix)
        basic_operations = n ** 2
        return [[matrix[r][c] * constant for c in range(n)] for r in range(n)], basic_operations
    
# Matrix multiplication algorithm
    @staticmethod
    def matrixMult(m1, m2):
        n = len(m1)
        result = [[0 for _ in range(n)] for _ in range(n)]
        for i in range(n):
            for j in range(n):
                for k in range(n):
                    result[i][j] += m1[i][k] * m2[k][j]
        return result
    

# Function that generates a random array
def generate_random_array(n):
    return [random.randint(0, 100) for _ in range(n)]

# Function that generates a random 2D array (matrix)
def generate_random_matrix(n):
    return [[random.randint(0, 100) for _ in range(n)] for _ in range(n)]

# Function for testing the algorithms
def test_algorithms():
    
# Sample input sizes
    input_sizes = [10, 100, 500, 1000]
    
# For loop to run input sizes through all matricies
    for n in input_sizes:
        
# Creates a random array, a random matrix, and another random matrix
        array = generate_random_array(n)
        matrix1 = generate_random_matrix(n)
        matrix2 = generate_random_matrix(n)
        
# Each of the three chunks below will create a start time variable,
#    call the correlated function, run the algorithm and then print
#        the final result of the algorithm and the time elapsed
        start = time.time()
        sum_result, basic_operations_total = Algorithms.arraySum(array)
        print(f"Sum of {n} elements: {sum_result}, Time: {(time.time() - start) * 1000:.3f} ms")
        print("# of basic operations: ",basic_operations_total)
        
        start = time.time()
        scalar_mult_result, basic_operations_total = Algorithms.scalarMatMult(matrix1, 2)
        print(f"Scalar multiplication of {n}x{n} matrix, Time: {(time.time() - start) * 1000:.3f} ms")
        print("# of basic operations: ", basic_operations_total)

        start = time.time()
        matrix_mult_result = Algorithms.count_operations(Algorithms.matrixMult,matrix1, matrix2)
        print(f"Matrix multiplication of {n}x{n}, Time: {(time.time() - start) * 1000:.3f} ms")

# Calls the algorithm testing function and begins the process
if __name__ == "__main__":
    test_algorithms()
