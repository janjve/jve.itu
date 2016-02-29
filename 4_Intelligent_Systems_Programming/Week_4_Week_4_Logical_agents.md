Logical Agents
===============
- Logical agents are capable of reasoning.

##Propositional logic
- The purpose of logic in natural languages.
    - Logics are formal languages for representing information such that conclusions can be drawn.
    - Natural language is too complex.
    - `Sentences` in logic are assertions about a world that are either true or false.
- Syntax and semantics
    - `Syntax`: form of legal sentences in the language.
    - `Semantics`: Define the truth-value of sentences in a world.
    - `World`: Target of logic, ie. the setting or environment.
    - Example: x+2 > y is a sentence, xy+> is not.
        - Is true in a world where x is 4 and y is 6.
- Knowledge base (KB)
    - Conjunction of sentences
- Entailment and inference
    - `Entailment` means that one thing follows from another, ie. KB |= a
    - KB `entails` sentence a if and only if a is true in all worlds where KB is true.
        - e.g. KB containing `the-apple-is-red` and the `the-appple-is-sweet` entails `the-apple-is-sweet`.
        - e.g. KB containing y >=4 y <= 4 `entails` y=4
    - Inference is to decide whether KB |= a
        - That is: "is there an entailment between KB and a.
- Models
    - `model` is a formal dscription of a possible world used to decude truth-value of sentences.
    - example:
        - possible world = state of nuclear power plant
        - mode = state {broken, hot, cold} of pipe A,B and C
    - We say `m` is a model of sentence a if a is true in m.
    - M(a) is the set of al models in a.
    - More knowledge (KB) => less models.
    - Model checking is to explicitly check the relationship.
        - KB |=a if and only if M(KB) is a subset of M(a)

##Efficient Inference Algorithm
- Soundness: i is sound if KB|-<sub>i</sub>a implies KB |=a
- Completeness: ...

- Each `model m` assigns `truth value` (true, false) to each `proposition symbol`(P,Q,R)
- Validity
    - A sentence is valid if it is true in all models
    - tautology.
    - e.g. true, A v -A, A => A and so on.
    - connected to entailment via the Deduction therom: 
        - KB |= a if and only if (KB => a) is valid.
- Satisfiability
    - A sentence is `satisfiable` if it is true in some model.
         e.g. A v B
    - it is `unsatisfiable` if it is true in no models.
        - e.g. A ^ -A
    - KB |= a if and only if (KB ^ -a) is unsatisfiable
- Inference
    - Decide whether KB |= a (KB entails a)
        - Prøver at bevise KB => true
- Logical equivalence
    - sentence s1 and s2 are equevalent iff they are true in the same models
- CNF (conjunction normal form)
    - only contains literals and clauses. (remove <=> and =>)
- horn form clause:
    - Horn clause: clause with at most one positive literal
    - definit clause: exactly one positive literal
- Forward chaining inference
    - SAT-checking
    - DPLL algorithm.
    - WalkSAT.
    - phase transition
        - if: m  = number of clauses, n = number of symbols
        - Hard problems seems to cluster near m/n = 4.3


## Deloitte Hackathon

## Exercises


Keywords:
- Inference rule
- Resolution rule
- Conjunctive normal form (CNF)
- Horn clauses and definite clauses
- Satisfiablity
- Validity
- Set of clauses
- Unit clause
- model set
- literal


max_action(minvalue(result(state,a)))