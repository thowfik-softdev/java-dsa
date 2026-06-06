# src/problem-solving/ — 🧩 Solved problems (runnable code)

**Why this folder exists:** keeps *problem-solving* code separate from *language-learning* code.
`src/phase0-java-basics/` is for learning Java itself (one file per concept); this folder is for
actual problems I solve, organized so I can always find and re-solve them in order.

## Structure
```
problem-solving/
  01-arrays/            ← CATEGORY, numbered by topic order (matches ROADMAP)
    P01_MaxInArray.java ← PROBLEM, numbered within the category (P01, P02, …)
    P02_...
  02-strings/
  03-two-pointers/
  ...
```
- **Category = numbered folder** (`01-arrays`, `02-strings`, …) — ordered by roadmap topic.
- **Problem = `P0x_Name.java`** — ordered within its category.

## Naming rule (Java constraint)
A `.java` file's **public class name cannot start with a digit**, so the ordering numbers live on
the **folders**, and each problem file uses a `P0x_` prefix (starts with a letter → valid class name,
e.g. `class P01_MaxInArray`). Same idea as the `T0x_` learning files.

## Relationship to other folders
- `02-problems/` (repo root) → the **markdown write-up** of each problem (approach, lesson, next-step).
- This folder → the **runnable `.java`** for the same problem. The two mirror each other.
