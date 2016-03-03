Binary decision tree
====================

### boolean functions:
- f: B<sup>n</sup> -> B
    - B = domain
    - n = set of values from B
    - For binary this is the set {0, 1}
    - Number of boolean functions: 2<sup>2<sup>n</sup></sup> 
- i.e: f(x<sub>1</sub>,x<sub>2</sub>,x<sub>3</sub>) = x<sub>1</sub> <=> -x<sub>2</sub>
    - x<sub>3</sub> is not essential.
- functions f=g (are equal) iff for every x f(x) = g(x)
- Order of arguments input in functions matter.
    - i.e.: f(x,y) x => y != g(y,x) = x => y
- Canonicity: exactly one representation of each boolean function

### Normal form:
- `CNF` (Conjunction Normal Form): (X<sub>1</sub> v Y<sub>1</sub>) ^ (X<sub>2</sub> v Y<sub>2</sub>)
    - **Easy** to compute if **tautology**
    - **Hard** to compute if **Satisfiable**
- `DNF` (Disjunction Normal Form): (X<sub>1</sub> ^ Y<sub>1</sub>) v (X<sub>2</sub> ^ Y<sub>2</sub>)
    - **Head** to compute if **tautology**
    - **Easy** to compute if **Satisfiable**
- NP-hard to convert from CNF to DNF and vice versa.

### Binary Decision Diagram (BDD):
- if-then-else boolean operator:
    - x -> y<sub>1</sub>, y<sub>0</sub> = (x ^ y<sub>1</sub>) v (-x ^ y<sub>0</sub>)
        - x -> y<sub>1</sub>, y<sub>0</sub> [1/x] = (1 ^ y<sub>1</sub>) v (0 ^ y<sub>0</sub>) = y<sub>1</sub>
        - x -> y<sub>1</sub>, y<sub>0</sub> [0/x] = (0 ^ y<sub>1</sub>) v (1 ^ y<sub>0</sub>) = y<sub>0</sub>
        - read: If x then y<sub>1</sub> else y<sub>0</sub>
- All propositional logic can be expressed using only `->`
    - Examples: 
        - x = x -> 1,0
        - -x = x -> 0,1
        - x ^ y = x -> (y -> 1, 0), 0
        - x v y = x -> 1, (y-> 1, 0)
        - x => y = x -> (y -> 1,0), 1
            - Notice here that the order matters.
- Shannon expansion is the expansion of a boolean expression t resursively to INF (if-then-else Normal Form).
    - Formally: t = x -> t[1/x], t[0/x]
        - This resursion must terminate in 0 or 1, since the number of variables is finite.
    - Use this expansion to build up a tree (See figure below)
    
![BDD_example.PNG](Images/BDD_example.PNG)
____________
### Figures
- low-son (false) = dashed lines
- high-son (true) = solid lines

![BDD_example.PNG](Images/BDD_example.PNG)

![BDD_reduction_example.PNG](Images/BDD_reduction_example.PNG)

![BDD_ordered_redundant_example.PNG](Images/BDD_ordered_redundant_example.PNG)

![BDD_summary.PNG](Images/BDD_summary.PNG)

