# 🗺️ ROADMAP — Zero to FAANG (Java)

**Progress is gated on mastery, not dates.** A box is checked only when a topic reaches **≥ `practiced`** in [05-progress/PROGRESS.md](05-progress/PROGRESS.md) (real recall, not "I read it"). Falling behind a target week is fine and expected. Faking a checkbox is not.

`[ ]` not started · `[~]` in progress · `[x]` practiced+ · each item ≈ one 2-hour day (harder topics take several).

> **I do not know Java at all.** So Phase 0 teaches the *language itself* from scratch — variables, types, conditionals, loops, references, methods, classes & objects — with **no DSA yet**. Only once I can write and run basic Java do we touch complexity (Phase 1) and then patterns. I know **JavaScript/Node**, so every Java concept is taught by comparison to JS.

---

## Phase 0 — Java language from zero (NO DSA yet) · ~weeks 1–3
The goal: write, compile, and run real Java comfortably. We do not solve algorithm problems here — we learn the language. Each item ends with a tiny "make it print the right thing" exercise, not a LeetCode problem.

- [ ] **0.1** Run Java: `main`, compile (`javac`) → run (`java`), `println` (JS: `node file.js` → `java File`, `console.log` → `System.out.println`)
- [ ] **0.2** **Variables & data types**: `int`, `long`, `double`, `boolean`, `char`, `String` — and *why types exist* (JS `let x` has no type; Java `int x` does)
- [ ] **0.3** **Conditional statements**: `if / else if / else`, comparison & logical operators, `switch` (vs JS — nearly identical, `===` quirk doesn't exist)
- [ ] **0.4** **Loops**: `for`, `while`, `do-while`, `break`/`continue` (vs JS — same shapes)
- [ ] **0.5** **Methods**: declaring, parameters, return types, `static` vs not, `void` (JS functions vs Java methods — types on params/return)
- [ ] **0.6** **References vs values**: primitives copy, objects share a reference; `==` vs `.equals()` (this trips up JS devs — JS objects are also references, but `==` behaves differently)
- [ ] **0.7** **Classes & objects**: fields, constructors, `new`, instance methods, `this` (JS `class`/`constructor` map closely — good bridge)
- [ ] **0.8** Mini-build: combine all of the above into one small program (e.g. a `BankAccount` class) — proves Phase 0 mastery

## Phase 1 — Complexity + first data structures · ~weeks 4–6
Now we reason about *cost* and learn the built-in containers DSA relies on.
- [ ] **1.1** **Big-O intuition**: O(1)/O(n)/O(n²)/O(log n) by counting work — *feel* it, don't memorize
- [ ] **1.2** **Arrays**: fixed-size `int[]`, `.length`, iterate, 1-D problems (JS arrays are dynamic — key difference)
- [ ] **1.3** **Matrix / Grid**: 2-D arrays `int[][]`, row/col traversal
- [ ] **1.4** **Strings**: immutability, `charAt`, `substring`, `StringBuilder` (why `+` in a loop is a trap)
- [ ] **1.5** **Collections**: `ArrayList` (≈ JS array), `HashMap` (≈ JS `Map`), `HashSet` (≈ JS `Set`), `ArrayDeque` (stack/queue)

## Phase 2 — Recursion & linear structures · ~weeks 7–11
- [ ] **2.1** [[Recursion]] — base case, recursive case, the call stack (the mental model everything later needs)
- [ ] **2.2** [[Stack]] — LIFO, valid parens, monotonic stack intro
- [ ] **2.3** [[Queue]] — FIFO, `ArrayDeque` as a queue
- [ ] **2.4** [[Linked List]] — traversal, reversal, fast/slow pointers
- [ ] **2.5** [[Sorting]] — built-in sort + merge/quick intuition, custom comparators
- [ ] **2.6** [[Searching]] — linear search → [[Binary Search]] (on arrays, then on answer space)

## Phase 3 — Core patterns · ~weeks 12–16
- [ ] **3.1** [[Two Pointers]] — converging & same-direction
- [ ] **3.2** [[Sliding Window]] — fixed & variable size
- [ ] **3.3** [[Hashing]] — frequency maps, seen-sets, complement trick
- [ ] **3.4** [[Prefix Sum]]

## Phase 4 — Trees, heaps & graphs · ~weeks 17–24
- [ ] **4.1** [[Tree]] / Binary Tree — DFS (pre/in/post) + BFS traversals
- [ ] **4.2** Binary Search Tree
- [ ] **4.3** [[Heap]] / PriorityQueue — top-K
- [ ] **4.4** [[Graph]] representations — adjacency list/matrix
- [ ] **4.5** [[BFS]] — shortest path in unweighted graphs
- [ ] **4.6** [[DFS]] — connectivity, cycle detection
- [ ] **4.7** Union Find (DSU)

## Phase 5 — Algorithms & advanced · ~weeks 25–32
- [ ] **5.1** [[Backtracking]] — subsets, permutations, combinations
- [ ] **5.2** [[Greedy]] algorithms
- [ ] **5.3** [[Dynamic Programming]] 1D — climbing stairs, house robber
- [ ] **5.4** DP 2D — grid paths, edit distance
- [ ] **5.5** DP knapsack family
- [ ] **5.6** Intervals, Tries, advanced graphs (Dijkstra, topological sort)

## Phase 6 — Interview readiness · ~weeks 33+
- [ ] **6.1** Timed solves (Mentor runs the clock — 30-min mediums)
- [ ] **6.2** Mixed-pattern blind sets (interleaved)
- [ ] **6.3** Talk-out-loud explanations + complexity on demand
- [ ] **6.4** Behavioral prep + a System Design starter track
- [ ] **6.5** Spaced re-solve of every "struggled" problem until `mastered`

---

## Honest FAANG note
This is ~8–12 months at 2 hrs/day, *consistently*. Expect ~300–500 problems total by the end. Phase 0 (pure Java) adds ~2–3 weeks up front *because I'm starting from zero* — that time is non-negotiable; skipping it makes everything after harder. The DSA topics match the standard interview syllabus (NeetCode 150 / Blind 75). System design + the job-hunt side come in Phase 6 — deliberately not front-loaded.

## This week's headline goal
> **Week 1:** Pure Java — run a program, then variables, types, conditionals, loops (items 0.1–0.4). **No DSA yet.** Goal is comfort writing and running basic Java, not speed.
