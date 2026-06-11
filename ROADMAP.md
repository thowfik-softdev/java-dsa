# 🗺️ ROADMAP — Zero to FAANG (Java)

**Progress is gated on mastery, not dates.** A box is checked only when a topic reaches **≥ `practiced`** in [05-progress/PROGRESS.md](05-progress/PROGRESS.md) (real recall, not "I read it"). Falling behind a target week is fine and expected. Faking a checkbox is not.

`[ ]` not started · `[~]` in progress · `[x]` practiced+ · 🟢 fast (I likely know the *concept*, just need Java syntax) · 🟡 steady (new but manageable) · 🔴 hard — **budget extra deep-dive days**.

> **My profile:** 2+ years professional dev (JavaScript, Nest.js, React, Next.js) — but **basically zero DSA**. So I am NOT a beginner programmer; I'm a beginner at *Java syntax* and at *algorithmic thinking*. Pacing reflects this: I'll move **fast** through things I already understand as a developer (most of Phase 0, basic arrays/strings — I know loops/conditions/functions/objects conceptually, just need the Java mapping), and go **slow & deep** on genuinely new algorithmic concepts (recursion, complexity analysis, trees, graphs, DP, backtracking). Topics are unchanged — only the *pace* is calibrated. Steady one-topic-per-session; 🔴 topics get multiple days.

### How my experience maps to the plan (what I'll fly through vs. grind)
- **Fly through 🟢:** Java syntax basics — variables, conditionals, loops, methods, classes/objects (I do this daily in JS/TS, just learning Java's spelling + strict types). Likely 1 light session each, sometimes 2 items/session.
- **Steady 🟡:** Arrays/matrix/strings in Java, collections, sorting/searching usage, two pointers, sliding window, hashing — new as *techniques* but my dev logic transfers.
- **Grind 🔴 (give me more time):** Big-O analysis, **recursion** (the mental model), stacks/queues *as problem tools*, linked lists, **trees, graphs, BFS/DFS**, **dynamic programming**, **backtracking**, greedy. These are where DSA is genuinely hard and where I have no prior exposure — budget 2–4 deep days each, lots of hand-written practice.

---

## ✅ Coverage vs the "30 DSA Patterns" chart
Cross-checked against the popular 30-pattern catalog: **all 30 covered.** The DP variants
(LCS/LIS subsequences, DP-on-intervals, DP-on-trees) are learned *inside* the DP items (5.3–5.5)
as you do problems, not as separate line items. The 3 distinct ones — **Cyclic Sort (2.7),
Monotonic Deque (3.3), K-way Merge (4.3b)** — are now explicit. Fast/slow pointers live in
Linked List (2.4), monotonic stack in Stack (2.2), binary-search-on-answer in Searching (2.6).

## 🧩 Phase Consolidation Block (after each phase, before advancing)
> When a phase's concepts are learned, consolidate its patterns with a focused problem set **before** moving on. Goal: make every pattern in the phase feel *routine* — NOT to solve "all" problems (that's infinite, with sharp diminishing returns, and over-grinding one phase starves the harder later phases).

Per **major pattern** in the phase, solve a tiered set:
- 🟢 **2–3 easy** — nail the mechanics
- 🟡 **5–7 medium** — real interview level (the bulk)
- 🔴 **1–2 hard** — stretch / expose gaps

→ **~8–12 problems per pattern.** **Mastery-gated, not count-gated:** the block is *done* when a **brand-new** problem of that pattern is routine within time — not when a number is hit. Log each in `problem-solving/NN-pattern/` (Test-First Drill); re-solve struggled ones on the spacing schedule. *(Phase 0 is language-learning — only light warm-ups apply; real consolidation blocks start at Phase 1.)*

---

## Phase 0 — Java language from zero (NO DSA yet) · 🟢 FAST for me · ~1–1.5 weeks (was 1–3)
> I know all these concepts from JS/TS — I just need Java's syntax + strict types. Expect to combine items and move quickly. (Already done 0.1 + 0.2 in one day.)
The goal: write, compile, and run real Java comfortably. We do not solve algorithm problems here — we learn the language. Each item ends with a tiny "make it print the right thing" exercise, not a LeetCode problem.

- [x] **0.1** Run Java: `main`, compile (`javac`) → run (`java`), `println` (JS: `node file.js` → `java File`, `console.log` → `System.out.println`)
- [x] **0.2** **Variables & data types**: `int`, `long`, `double`, `boolean`, `char`, `String` — and *why types exist* (JS `let x` has no type; Java `int x` does)
- [x] **0.3** **Conditional statements**: `if / else if / else`, comparison & logical operators, `switch` (vs JS — nearly identical, `===` quirk doesn't exist)
- [x] **0.4** **Loops**: `for`, `while`, `do-while`, `break`/`continue` (vs JS — same shapes)
- [x] **0.5** **Methods**: declaring, parameters, return types, `static` vs not, `void` (JS functions vs Java methods — types on params/return)
- [x] **0.6** **References vs values**: primitives copy, objects share a reference; `==` vs `.equals()` (this trips up JS devs — JS objects are also references, but `==` behaves differently)
- [x] **0.7** **Classes & objects** (DSA-minimal — I'm weak here, only saw OOP in college): fields, constructor, `new`, instance methods, `this` — just enough to write a `ListNode`/`TreeNode` and a "design this structure" class. NOT deep OOP (skip inheritance/polymorphism/patterns). Bridge from JS `class`/`constructor`/`this`.
- [x] **0.8** Mini-build: combine all of the above into one small program (e.g. a `BankAccount` class) — proves Phase 0 mastery ✅ **PHASE 0 COMPLETE 2026-06-10**

## Phase 1 — Complexity + first data structures · 🟡 mixed (Big-O is 🔴 for me) · ~weeks 2–4
> Arrays/strings/collections are 🟢–🟡 (dev logic transfers). **Big-O analysis is 🔴 genuinely new — go deep, multiple days.**
Now we reason about *cost* and learn the built-in containers DSA relies on.
- [ ] **1.1** **Big-O intuition**: O(1)/O(n)/O(n²)/O(log n) by counting work — *feel* it, don't memorize
- [ ] **1.2** **Arrays**: fixed-size `int[]`, `.length`, iterate, 1-D problems (JS arrays are dynamic — key difference)
- [ ] **1.3** **Matrix / Grid**: 2-D arrays `int[][]`, row/col traversal
- [ ] **1.4** **Strings**: immutability, `charAt`, `substring`, `StringBuilder` (why `+` in a loop is a trap)
- [ ] **1.5** **Collections**: `ArrayList` (≈ JS array), `HashMap` (≈ JS `Map`), `HashSet` (≈ JS `Set`), `ArrayDeque` (stack/queue)

## Phase 2 — Recursion & linear structures · 🔴 HARD — slow down here · ~weeks 5–10
> This is the first big DSA wall. **Recursion especially needs deep time** (2–4 days, lots of hand-tracing the call stack). Linked lists & stacks/queues *as problem tools* are new too. No rushing.
- [ ] **2.1** [[Recursion]] — base case, recursive case, the call stack (the mental model everything later needs)
- [ ] **2.2** [[Stack]] — LIFO, valid parens, monotonic stack intro
- [ ] **2.3** [[Queue]] — FIFO, `ArrayDeque` as a queue
- [ ] **2.4** [[Linked List]] — traversal, reversal, fast/slow pointers
- [ ] **2.5** [[Sorting]] — built-in sort + merge/quick intuition, custom comparators
- [ ] **2.6** [[Searching]] — linear search → [[Binary Search]] (on arrays, then on answer space)
- [ ] **2.7** [[Cyclic Sort]] — for "numbers 1..n in an array" problems (find missing/duplicate in O(n)/O(1))

## Phase 3 — Core patterns · 🟡 steady · ~weeks 11–15
> These patterns are learnable once recursion/complexity click. Two pointers & sliding window feel intuitive to a dev; hashing leans on Map skills you already have. Steady pace, lots of problems.
- [ ] **3.1** [[Two Pointers]] — converging & same-direction
- [ ] **3.2** [[Sliding Window]] — fixed & variable size
- [ ] **3.3** [[Monotonic Deque]] — sliding-window maximum/minimum in O(n) (extends sliding window + ArrayDeque)
- [ ] **3.4** [[Hashing]] — frequency maps, seen-sets, complement trick
- [ ] **3.5** [[Prefix Sum]]

## Phase 4 — Trees, heaps & graphs · 🔴 HARD — deep time · ~weeks 16–24
> Heavily recursion-dependent. **Trees and graphs (BFS/DFS) need multiple deep days each** — these are core FAANG topics and brand new to me. Expect to revisit.
- [ ] **4.1** [[Tree]] / Binary Tree — DFS (pre/in/post) + BFS traversals
- [ ] **4.2** Binary Search Tree
- [ ] **4.3** [[Heap]] / PriorityQueue — top-K
- [ ] **4.3b** [[K-way Merge]] — merge K sorted lists/arrays using a min-heap (builds on Heap)
- [ ] **4.4** [[Graph]] representations — adjacency list/matrix
- [ ] **4.5** [[BFS]] — shortest path in unweighted graphs
- [ ] **4.6** [[DFS]] — connectivity, cycle detection
- [ ] **4.7** Union Find (DSU)

## Phase 5 — Algorithms & advanced · 🔴 HARDEST — most deep time · ~weeks 25–34
> **Dynamic programming and backtracking are the hardest topics in DSA** — budget the most time here (DP especially: many days, many problems, expect to feel lost before it clicks). This is where FAANG separates candidates.
- [ ] **5.1** [[Backtracking]] — subsets, permutations, combinations
- [ ] **5.2** [[Greedy]] algorithms
- [ ] **5.3** [[Dynamic Programming]] 1D — climbing stairs, house robber
- [ ] **5.4** DP 2D — grid paths, edit distance
- [ ] **5.5** DP knapsack family
- [ ] **5.6** [[Intervals]] + [[Tries]]
- [ ] **5.7** Named graph algorithms — Dijkstra & topological sort (shortest path / ordering)
- [ ] **5.8** 🔴 **Minimum Spanning Tree** — Kruskal's & Prim's (uses Union Find); + Floyd–Warshall (all-pairs shortest path)
- [ ] **5.9** **Bit Manipulation** — AND/OR/XOR/shifts, the XOR "single number" trick, bitmasks, power-of-two checks (FAANG staple; JS bitwise ≈ Java)
- [ ] **5.10** **Math & Number Theory** — GCD/LCM (Euclid), prime sieve, modular arithmetic, fast power, overflow awareness

## Phase 6 — Interview readiness · 🟡 steady · ~weeks 35+
> Your communication/whiteboarding likely benefits from 2+ yrs of real work. Behavioral & system-design starter will feel familiar. Main work: timed practice + retaining everything.
- [ ] **6.1** Timed solves (Mentor runs the clock — 30-min mediums)
- [ ] **6.2** Mixed-pattern blind sets (interleaved)
- [ ] **6.3** Talk-out-loud explanations + complexity on demand
- [ ] **6.4** Behavioral prep + a System Design starter track
- [ ] **6.5** Spaced re-solve of every "struggled" problem until `mastered`

---

## Honest FAANG note (calibrated to my profile)
Because I'm an experienced dev (2+ yrs) with **zero DSA**, the curve is lopsided:
- **Java basics fly by** — Phase 0 is ~1–1.5 weeks, not 3. My dev experience is a real head start on syntax, debugging, and reading errors.
- **But DSA can't be rushed** — the 🔴 phases (recursion, trees, graphs, DP, backtracking) are hard *regardless* of dev experience. Experience does NOT shortcut algorithmic thinking; it's a separate muscle.
- **Realistic total: ~6–10 months at 2 hrs/day consistently** (faster Java offsets some, but the 🔴 DSA grind dominates the timeline). ~300–500 problems. The time saved in Phase 0 gets *reinvested* into deeper 🔴 work — not into finishing sooner.

The DSA topics match the standard interview syllabus (NeetCode 150 / Blind 75). System design + job-hunt come in Phase 6.

## This week's headline goal
> **Week 1:** Pure Java — run a program, then variables, types, conditionals, loops (items 0.1–0.4). **No DSA yet.** Goal is comfort writing and running basic Java, not speed.
